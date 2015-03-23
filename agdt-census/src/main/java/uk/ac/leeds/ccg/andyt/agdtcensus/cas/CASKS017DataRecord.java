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
 * For representing CAS KS017 Records and providing safe access to the data.
 */
public class CASKS017DataRecord extends AbstractCASDataRecord {

    /**
     * Table KS017 Cars or vans: All households Footnotes and Comments for Table
     * KS017 1. Includes any company car or van if available for private use. 2.
     * 'All cars or vans in the area' includes only those cars and vans owned
     * by, or available for use by, households. This count is not exact as
     * households with more than 10 cars or vans are counted as having 10 cars
     * or vans.
     */
    /**
     * KS0170001 = allHouseholds
     */
    protected int allHouseholds;
    /**
     * KS0170002 = householdsWith0CarsOrVans
     */
    protected int householdsWith0CarsOrVans;
    /**
     * KS0170003 = householdsWith1CarOrVan
     */
    protected int householdsWith1CarOrVan;
    /**
     * KS0170004 = householdsWith2CarsOrVans
     */
    protected int householdsWith2CarsOrVans;
    /**
     * KS0170005 = householdsWith3CarsOrVans
     */
    protected int householdsWith3CarsOrVans;
    /**
     * KS0170006 = householdsWith4OrMoreCarsOrVans
     */
    protected int householdsWith4OrMoreCarsOrVans;
    /**
     * KS0170007 = allCarsOrVansInTheArea
     */
    protected int allCarsOrVansInTheArea;

    /** Creates a new CASKS017Record */
    public CASKS017DataRecord() {
        _Init();
    }

    /**
     * Creates a new CASKS017Record cloned from aCASKS017Record
     *
     * @param aCASKS017Record
     *            The CASKS017Record from which this is cloned.
     */
    public CASKS017DataRecord(CASKS017DataRecord aCASKS017Record) {
        init(aCASKS017Record);
    }

    /**
     * Creates a new CASKS017DataRecord
     *
     * @param RecordID
     *            The RecordID to be assigned to this
     * @param line
     *            The Comma Seperated Value <code>String</code>
     * @throws java.io.IOException
     */
    public CASKS017DataRecord(long RecordID, String line) throws IOException {
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[8];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        this._RecordID = RecordID;
        this.Zone_Code = fields[0].substring(1, 11).toCharArray();
        // From Table KS017
        this.allHouseholds = StaticConverter.to_int(fields[1]);
        this.householdsWith0CarsOrVans = StaticConverter.to_int(fields[2]);
        this.householdsWith1CarOrVan = StaticConverter.to_int(fields[3]);
        this.householdsWith2CarsOrVans = StaticConverter.to_int(fields[4]);
        this.householdsWith3CarsOrVans = StaticConverter.to_int(fields[5]);
        this.householdsWith4OrMoreCarsOrVans = StaticConverter.to_int(fields[6]);
        this.allCarsOrVansInTheArea = StaticConverter.to_int(fields[7]);
    }

    /**
     * Creates a new CASKS017Record
     *
     * @param aRandomAccessFile
     * @throws java.io.IOException
     */
    public CASKS017DataRecord(RandomAccessFile aRandomAccessFile)
            throws IOException {
        try {
            this._RecordID = aRandomAccessFile.readLong();
            this.Zone_Code = new char[10];
            for (int i = 0; i < this.Zone_Code.length; i++) {
                Zone_Code[i] = aRandomAccessFile.readChar();
            }
            this.allHouseholds = aRandomAccessFile.readInt();
            this.householdsWith0CarsOrVans = aRandomAccessFile.readInt();
            this.householdsWith1CarOrVan = aRandomAccessFile.readInt();
            this.householdsWith2CarsOrVans = aRandomAccessFile.readInt();
            this.householdsWith3CarsOrVans = aRandomAccessFile.readInt();
            this.householdsWith4OrMoreCarsOrVans = aRandomAccessFile.readInt();
            this.allCarsOrVansInTheArea = aRandomAccessFile.readInt();
        } catch (IOException ioe0) {
            // ioe0.printStackTrace();
            throw ioe0;
        }
    }

    /**
     * Initialise.
     */
    protected void _Init() {
        super._Init();
        this.allHouseholds = Integer.MIN_VALUE;
        this.householdsWith0CarsOrVans = Integer.MIN_VALUE;
        this.householdsWith1CarOrVan = Integer.MIN_VALUE;
        this.householdsWith2CarsOrVans = Integer.MIN_VALUE;
        this.householdsWith3CarsOrVans = Integer.MIN_VALUE;
        this.householdsWith4OrMoreCarsOrVans = Integer.MIN_VALUE;
        this.allCarsOrVansInTheArea = Integer.MIN_VALUE;
    }

    /**
     * Initialise to zero.
     */
    protected void initZero() {
        super._Init();
        this.allHouseholds = 0;
        this.householdsWith0CarsOrVans = 0;
        this.householdsWith1CarOrVan = 0;
        this.householdsWith2CarsOrVans = 0;
        this.householdsWith3CarsOrVans = 0;
        this.householdsWith4OrMoreCarsOrVans = 0;
        this.allCarsOrVansInTheArea = 0;
    }

    /**
     * Initialises all fields from those in cASKS017Record.
     *
     * @param cASKS017Record
     *            The CASKS017Record thats fields are used to initialise this.
     */
    protected void init(CASKS017DataRecord cASKS017Record) {
        super.init(cASKS017Record);
        this.allHouseholds = cASKS017Record.allHouseholds;
        this.householdsWith0CarsOrVans = cASKS017Record.householdsWith0CarsOrVans;
        this.householdsWith1CarOrVan = cASKS017Record.householdsWith1CarOrVan;
        this.householdsWith2CarsOrVans = cASKS017Record.householdsWith2CarsOrVans;
        this.householdsWith3CarsOrVans = cASKS017Record.householdsWith3CarsOrVans;
        this.householdsWith4OrMoreCarsOrVans = cASKS017Record.householdsWith4OrMoreCarsOrVans;
        this.allCarsOrVansInTheArea = cASKS017Record.allCarsOrVansInTheArea;
    }

    /**
     * Returns a string description of this;
     * @return 
     */
    public String toString() {
        return super.toString() + ", allHouseholds " + allHouseholds + ", householdsWith0CarsOrVans " + householdsWith0CarsOrVans + ", householdsWith1CarOrVan " + householdsWith1CarOrVan + ", householdsWith2CarsOrVans " + householdsWith2CarsOrVans + ", householdsWith3CarsOrVans " + householdsWith3CarsOrVans + ", householdsWith4OrMoreCarsOrVans " + householdsWith4OrMoreCarsOrVans + ", allCarsOrVansInTheArea " + allCarsOrVansInTheArea;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the values
     *         of the <code>Fields</code> of <code>this</code>.
     */
    @Override
    public String toCSVString() {
        return super.toCSVString() + "," + allHouseholds + "," + householdsWith0CarsOrVans + "," + householdsWith1CarOrVan + "," + householdsWith2CarsOrVans + "," + householdsWith3CarsOrVans + "," + householdsWith4OrMoreCarsOrVans + "," + allCarsOrVansInTheArea;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the names
     *         of the <code>Fields</code> of <code>this</code>
     */
    @Override
    public String toCSVStringFields() {
        return super.toCSVStringFields() + ",allHouseholds" + ",householdsWith0CarsOrVans" + ",householdsWith1CarOrVan" + ",householdsWith2CarsOrVans" + ",householdsWith3CarsOrVans" + ",householdsWith4OrMoreCarsOrVans" + ",allCarsOrVansInTheArea";
    }

    /**
     * Returns a copy of this.allHouseholds
     * @return 
     */
    public int getAllHouseholds() {
        return this.allHouseholds;
    }

    /**
     * Returns a copy of this.householdsWith0CarsOrVans
     * @return 
     */
    public int getHouseholdsWith0CarsOrVans() {
        return this.householdsWith0CarsOrVans;
    }

    /**
     * Returns a copy of this.householdsWith1CarOrVan
     * @return 
     */
    public int getHouseholdsWith1CarOrVan() {
        return this.householdsWith1CarOrVan;
    }

    /**
     * Returns a copy of this.householdsWith2CarsOrVans
     * @return 
     */
    public int getHouseholdsWith2CarsOrVans() {
        return this.householdsWith2CarsOrVans;
    }

    /**
     * Returns a copy of this.householdsWith3CarsOrVans
     * @return 
     */
    public int getHouseholdsWith3CarsOrVans() {
        return this.householdsWith3CarsOrVans;
    }

    /**
     * Returns a copy of this.householdsWith4OrMoreCarsOrVans
     * @return 
     */
    public int getHouseholdsWith4OrMoreCarsOrVans() {
        return this.householdsWith4OrMoreCarsOrVans;
    }

    /**
     * Returns a copy of this.allCarsOrVansInTheArea
     * @return 
     */
    public int getAllCarsOrVansInTheArea() {
        return this.allCarsOrVansInTheArea;
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
                aRandomAccessFile.writeInt(allHouseholds);
                aRandomAccessFile.writeInt(householdsWith0CarsOrVans);
                aRandomAccessFile.writeInt(householdsWith1CarOrVan);
                aRandomAccessFile.writeInt(householdsWith2CarsOrVans);
                aRandomAccessFile.writeInt(householdsWith3CarsOrVans);
                aRandomAccessFile.writeInt(householdsWith4OrMoreCarsOrVans);
                aRandomAccessFile.writeInt(allCarsOrVansInTheArea);
            } catch (IOException aIOException) {
                System.err.println(aIOException.getLocalizedMessage());
                System.exit(Generic_ErrorAndExceptionHandler.IOException);
            }
        } else {
            write(aRandomAccessFile);
        }
    }

    /**
     * @return An aggregated <code>CASKS017DataRecord</code> where:
     *         <code>RecordID = this.RecordID</code>
     *         <code>Zone_Code = this.Zone_Code</code> For aggregating
     *         <code>CASKS017DataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASKS017DataRecord
     *            The <code>CASKS017DataRecord</code> to be aggregated with
     *            <code>this</code>.
     */
    public CASKS017DataRecord aggregate(CASKS017DataRecord aCASKS017DataRecord) {
        CASKS017DataRecord newCASKS017DataRecord = new CASKS017DataRecord(
                aCASKS017DataRecord);
        newCASKS017DataRecord.allHouseholds += getAllHouseholds();
        newCASKS017DataRecord.householdsWith0CarsOrVans += getHouseholdsWith0CarsOrVans();
        newCASKS017DataRecord.householdsWith1CarOrVan += getHouseholdsWith1CarOrVan();
        newCASKS017DataRecord.householdsWith2CarsOrVans += getHouseholdsWith2CarsOrVans();
        newCASKS017DataRecord.householdsWith3CarsOrVans += getHouseholdsWith3CarsOrVans();
        newCASKS017DataRecord.householdsWith4OrMoreCarsOrVans += getHouseholdsWith4OrMoreCarsOrVans();
        newCASKS017DataRecord.allCarsOrVansInTheArea += getAllCarsOrVansInTheArea();
        return newCASKS017DataRecord;
    }

    /**
     * @return An aggregated <code>CASKS017DataRecord</code> where:
     *         <code>RecordID = newRecordID</code>
     *         <code>Zone_Code = newZone_Code</code> For aggregating
     *         <code>CASKS017DataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASKS017DataRecord
     *            The <code>CASKS017DataRecord</code> to be aggregated with
     *            <code>this</code>.
     * @param newRecordID
     *            The <code>RecordID</code> assigned to result.
     * @param newZone_Code
     *            The <code>Zone_Code</code> assigned to result.
     */
    public CASKS017DataRecord aggregate(CASKS017DataRecord aCASKS017DataRecord,
            long newRecordID, char[] newZone_Code) {
        CASKS017DataRecord newCASKS017DataRecord = new CASKS017DataRecord(this);
        newCASKS017DataRecord._RecordID = newRecordID;
        // newCASKS017DataRecord.Zone_Code = aCASKS017DataRecord.Zone_Code;
        int aZone_CodeID = 0;
        for (int Zone_CodeID = 0; Zone_CodeID < newZone_Code.length; Zone_CodeID++) {
            newCASKS017DataRecord.Zone_Code[Zone_CodeID] = newZone_Code[Zone_CodeID];
            aZone_CodeID = Zone_CodeID;
        }
        for (int Zone_CodeID = aZone_CodeID; Zone_CodeID < Zone_Code.length; Zone_CodeID++) {
            newCASKS017DataRecord.Zone_Code[Zone_CodeID] = ' ';
        }
        newCASKS017DataRecord.allHouseholds += getAllHouseholds();
        newCASKS017DataRecord.householdsWith0CarsOrVans += getHouseholdsWith0CarsOrVans();
        newCASKS017DataRecord.householdsWith1CarOrVan += getHouseholdsWith1CarOrVan();
        newCASKS017DataRecord.householdsWith2CarsOrVans += getHouseholdsWith2CarsOrVans();
        newCASKS017DataRecord.householdsWith3CarsOrVans += getHouseholdsWith3CarsOrVans();
        newCASKS017DataRecord.householdsWith4OrMoreCarsOrVans += getHouseholdsWith4OrMoreCarsOrVans();
        newCASKS017DataRecord.allCarsOrVansInTheArea += getAllCarsOrVansInTheArea();
        return newCASKS017DataRecord;
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
        result += (7L * (long) Integer.SIZE) / getNumberOfBitsInByte();
        return result;
    }
}