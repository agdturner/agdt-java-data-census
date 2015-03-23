/**
 * A component of a library for
 * <a href="http://www.geog.leeds.ac.uk/people/a.turner/projects/MoSeS">MoSeS</a>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 */
package uk.ac.leeds.ccg.andyt.agdtcensus.cas;

import java.io.IOException;
import java.io.RandomAccessFile;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_ErrorAndExceptionHandler;
import uk.ac.leeds.ccg.andyt.generic.math.StaticConverter;

/**
 * For representing CAS UV003 Records and providing safe access to the data.
 */
public class CASUV003DataRecord extends AbstractCASDataRecord {

    /*
     * Sex: All people NB: This table contains counts of Persons
     */
    /**
     * KS0050001 = allPersons (allPeople)
     */
    protected int allPeople;
    /**
     * KS0050002 = males
     */
    protected int males;
    /**
     * KS0050003 = females
     */
    protected int females;

    /** Creates a new CASUV003Record */
    public CASUV003DataRecord() {
        _Init();
    }

    /**
     * Creates a new CASUV003Record cloned from aCASUV003Record
     *
     * @param aCASUV003Record
     *            The CASUV003Record from which this is cloned.
     */
    public CASUV003DataRecord(CASUV003DataRecord aCASUV003Record) {
        init(aCASUV003Record);
    }

    /**
     * Creates a new CASUV003DataRecord
     *
     * @param RecordID
     *            The RecordID to be assigned to this
     * @param line
     *            The Comma Seperated Value <code>String</code>
     * @throws java.io.IOException
     */
    public CASUV003DataRecord(long RecordID, String line) throws IOException {
        String[] fields = line.split(",");
        this._RecordID = RecordID;
        this.Zone_Code = fields[0].substring(1, 11).toCharArray();
        // From Table UV003
        this.allPeople = StaticConverter.to_int(fields[1]);
        this.males = StaticConverter.to_int(fields[2]);
        this.females = StaticConverter.to_int(fields[3]);
    }

    /**
     * Creates a new CASUV003Record
     *
     * @param aRandomAccessFile
     */
    public CASUV003DataRecord(RandomAccessFile aRandomAccessFile) {
        try {
            this._RecordID = aRandomAccessFile.readLong();
            this.Zone_Code = new char[10];
            for (int i = 0; i < this.Zone_Code.length; i++) {
                Zone_Code[i] = aRandomAccessFile.readChar();
            }
            this.allPeople = aRandomAccessFile.readInt();
            this.males = aRandomAccessFile.readInt();
            this.females = aRandomAccessFile.readInt();
        } catch (IOException ioe0) {
            ioe0.printStackTrace();
        }
    }

    /**
     * Initialise.
     */
    protected void _Init() {
        super._Init();
        this.allPeople = Integer.MIN_VALUE;
        this.males = Integer.MIN_VALUE;
        this.females = Integer.MIN_VALUE;
    }

    /**
     * Initialises all fields from those in aCASUV003Record.
     *
     * @param aCASUV003Record
     *            The CASUV003DataRecord thats fields are used to initialise
     *            this.
     */
    protected void init(CASUV003DataRecord aCASUV003Record) {
        super._Init();
        this.allPeople = aCASUV003Record.allPeople;
        this.males = aCASUV003Record.males;
        this.females = aCASUV003Record.females;
    }

    /**
     * Returns a string description of this;
     * @return 
     */
    public String toString() {
        return super.toString() + ", allPeople " + allPeople + ", males " + males + ", females " + females;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the values
     *         of the <code>Fields</code> of <code>this</code>.
     */
    @Override
    public String toCSVString() {
        return super.toCSVString() + "," + allPeople + "," + males + "," + females;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the names
     *         of the <code>Fields</code> of <code>this</code>
     */
    @Override
    public String toCSVStringFields() {
        return super.toCSVStringFields() + ",allPeople" + ",males" + ",females";
    }

    /**
     * Returns a copy of this.allPeople
     * @return 
     */
    public int getAllPeople() {
        return this.allPeople;
    }

    /**
     * Returns a copy of this.males
     * @return 
     */
    public int getMales() {
        return this.males;
    }

    /**
     * Returns a copy of this.females
     * @return 
     */
    public int getFemales() {
        return this.females;
    }

    /**
     * Writes <code>this</code> to <code>aRandomAccessFile</code> at the current
     * position.
     *
     * @param aRandomAccessFile
     *            The <code>RandomAccessFile</code> this is written to.
     */
    @Override
    public void write(RandomAccessFile aRandomAccessFile) {
        super.write(aRandomAccessFile);
        write(aRandomAccessFile, true);
    }

    /**
     * Writes <code>this</code> to <code>aRandomAccessFile</code> at the current
     * position.
     *
     * @param aRandomAccessFile
     *            The <code>RandomAccessFile</code> this is written to.
     * @param avoidCallToSuper
     *            If true super.write() is not called
     */
    public void write(RandomAccessFile aRandomAccessFile,
            boolean avoidCallToSuper) {
        if (avoidCallToSuper) {
            try {
                aRandomAccessFile.writeInt(allPeople);
                aRandomAccessFile.writeInt(males);
                aRandomAccessFile.writeInt(females);
            } catch (IOException aIOException) {
                System.err.println(aIOException.getLocalizedMessage());
                System.exit(Generic_ErrorAndExceptionHandler.IOException);
            }
        } else {
            write(aRandomAccessFile);
        }
    }

    /**
     * @return An aggregated <code>CASUV003DataRecord</code> where:
     *         <code>RecordID = this.RecordID</code>
     *         <code>Zone_Code = this.Zone_Code</code> For aggregating
     *         <code>CASUV003DataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASUV003DataRecord
     *            The <code>CASUV003DataRecord</code> to be aggregated with
     *            <code>this</code>.
     */
    public CASUV003DataRecord aggregate(CASUV003DataRecord aCASUV003DataRecord) {
        CASUV003DataRecord newCASUV003DataRecord = new CASUV003DataRecord(
                aCASUV003DataRecord);
        newCASUV003DataRecord.allPeople += getAllPeople();
        newCASUV003DataRecord.males += getMales();
        newCASUV003DataRecord.females += getFemales();
        return newCASUV003DataRecord;
    }

    /**
     * @return An aggregated <code>CASUV003DataRecord</code> where:
     *         <code>RecordID = newRecordID</code>
     *         <code>Zone_Code = newZone_Code</code> For aggregating
     *         <code>CASUV003DataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASUV003DataRecord
     *            The <code>CASUV003DataRecord</code> to be aggregated with
     *            <code>this</code>.
     * @param newRecordID
     *            The <code>RecordID</code> assigned to result.
     * @param newZone_Code
     *            The <code>Zone_Code</code> assigned to result.
     */
    public CASUV003DataRecord aggregate(CASUV003DataRecord aCASUV003DataRecord,
            long newRecordID, char[] newZone_Code) {
        CASUV003DataRecord newCASUV003DataRecord = new CASUV003DataRecord(this);
        newCASUV003DataRecord._RecordID = newRecordID;
        // newCASUV003DataRecord.Zone_Code = aCASUV003DataRecord.Zone_Code;
        int aZone_CodeID = 0;
        for (int Zone_CodeID = 0; Zone_CodeID < newZone_Code.length; Zone_CodeID++) {
            newCASUV003DataRecord.Zone_Code[Zone_CodeID] = newZone_Code[Zone_CodeID];
            aZone_CodeID = Zone_CodeID;
        }
        for (int Zone_CodeID = aZone_CodeID; Zone_CodeID < Zone_Code.length; Zone_CodeID++) {
            newCASUV003DataRecord.Zone_Code[Zone_CodeID] = ' ';
        }
        newCASUV003DataRecord.allPeople += getAllPeople();
        newCASUV003DataRecord.males += getMales();
        newCASUV003DataRecord.females += getFemales();
        return newCASUV003DataRecord;
    }

    /**
     * Returns the size of this Record in bytes as a long. This does not account
     * for serialVersionUID. A boolean is assumed to be the same size as an int
     * in bytes.
     * @return 
     */
    @Override
    public long getSizeInBytes() {
        long result = super.getSizeInBytes();
        result += (3L * (long) Integer.SIZE) / this.getNumberOfBitsInByte();
        return result;
    }
}