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
package uk.ac.leeds.ccg.andyt.census.cas.ks;

import java.io.IOException;
import java.io.RandomAccessFile;
import uk.ac.leeds.ccg.andyt.census.core.Census_AbstractDataRecord;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_ErrorAndExceptionHandler;
import uk.ac.leeds.ccg.andyt.generic.math.StaticConverter;

/**
 * For representing CAS KS14b Records and providing safe access to the data.
 */
public class Census_CASKS14bDataRecord extends Census_AbstractDataRecord {

    /**
     * Table KS014b National Statistics - Socio Economic Classification - males
     * aged 16-74 Footnotes and Comments for Table KS014b 1. For long-term
     * unemployed year last worked is 1999 or earlier. 2. In the NS-SeC
     * classification, all full-time students are recorded in the 'full-time
     * students' category regardless of whether they are economically active or
     * not. 3. Not classifiable for other reasons' includes people whose
     * occupation has not been coded.
     */
    /**
     * KS014b0001 = malesAged16to74
     */
    protected int malesAged16to74;
    /**
     * KS014b0002 = malesAged16to74LargeEmployersAndHigherManagerialOccupations
     */
    protected int malesAged16to74LargeEmployersAndHigherManagerialOccupations;
    /**
     * KS014b0003 = malesAged16to74HigherProfessionalOccupations
     */
    protected int malesAged16to74HigherProfessionalOccupations;
    /**
     * KS014b0004 =
     * malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate
     */
    protected int malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate;
    /**
     * KS014b0005 = malesAged16to74IntermediateOccupations
     */
    protected int malesAged16to74IntermediateOccupations;
    /**
     * KS014b0006 = malesAged16to74SmallEmployersAndOwnAccountWorkers
     */
    protected int malesAged16to74SmallEmployersAndOwnAccountWorkers;
    /**
     * KS014b0007 = malesAged16to74LowerSupervisoryAndTechnicalOccupations
     */
    protected int malesAged16to74LowerSupervisoryAndTechnicalOccupations;
    /**
     * KS014b014b = malesAged16to74SemiRoutineOccupations
     */
    protected int malesAged16to74SemiRoutineOccupations;
    /**
     * KS014b0009 = malesAged16to74RoutineOccupations
     */
    protected int malesAged16to74RoutineOccupations;
    /**
     * KS014b0010 = malesAged16to74NeverWorked
     */
    protected int malesAged16to74NeverWorked;
    /**
     * KS014b0011 = malesAged16to74LongTermUnemployed
     */
    protected int malesAged16to74LongTermUnemployed;
    /**
     * KS014b0012 = malesAged16to74FullTimeStudents
     */
    protected int malesAged16to74FullTimeStudents;

    // Taken out as not in Northern Ireland
    // /**
    // * KS014b0013 = malesAged16to74NotClassifiableForOtherReasons
    // */
    // protected int malesAged16to74NotClassifiableForOtherReasons;
    /** Creates a new CASKS14bRecord */
    public Census_CASKS14bDataRecord() {
        _Init();
    }

    /**
     * Creates a new CASKS14bRecord cloned from cASKS14bRecord
     *
     * @param cASKS14bRecord
     *            The CASKS14bRecord from which this is cloned.
     */
    public Census_CASKS14bDataRecord(Census_CASKS14bDataRecord cASKS14bRecord) {
        init(cASKS14bRecord);
    }

    /**
     * Creates a new CASKS14bDataRecord
     *
     * @param RecordID
     *            The RecordID to be assigned to this
     * @param line
     *            The Comma Seperated Value <code>String</code>
     * @throws java.io.IOException
     */
    public Census_CASKS14bDataRecord(long RecordID, String line) throws IOException {
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[13];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        this._RecordID = RecordID;
        this.Zone_Code = fields[0].substring(1, 11).toCharArray();
        // From Table KS14b
        this.malesAged16to74 = StaticConverter.to_int(fields[1]);
        this.malesAged16to74LargeEmployersAndHigherManagerialOccupations = StaticConverter.to_int(fields[2]);
        this.malesAged16to74HigherProfessionalOccupations = StaticConverter.to_int(fields[3]);
        this.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate = StaticConverter.to_int(fields[4]);
        this.malesAged16to74IntermediateOccupations = StaticConverter.to_int(fields[5]);
        this.malesAged16to74SmallEmployersAndOwnAccountWorkers = StaticConverter.to_int(fields[6]);
        this.malesAged16to74LowerSupervisoryAndTechnicalOccupations = StaticConverter.to_int(fields[7]);
        this.malesAged16to74SemiRoutineOccupations = StaticConverter.to_int(fields[8]);
        this.malesAged16to74RoutineOccupations = StaticConverter.to_int(fields[9]);
        this.malesAged16to74NeverWorked = StaticConverter.to_int(fields[10]);
        this.malesAged16to74LongTermUnemployed = StaticConverter.to_int(fields[11]);
        this.malesAged16to74FullTimeStudents = StaticConverter.to_int(fields[12]);
    }

    /**
     * Creates a new CASKS14bRecord
     *
     * @param aRandomAccessFile
     * @throws java.io.IOException
     */
    public Census_CASKS14bDataRecord(RandomAccessFile aRandomAccessFile)
            throws IOException {
        try {
            this._RecordID = aRandomAccessFile.readLong();
            this.Zone_Code = new char[10];
            for (int i = 0; i < this.Zone_Code.length; i++) {
                Zone_Code[i] = aRandomAccessFile.readChar();
            }
            this.malesAged16to74 = aRandomAccessFile.readInt();
            this.malesAged16to74LargeEmployersAndHigherManagerialOccupations = aRandomAccessFile.readInt();
            this.malesAged16to74HigherProfessionalOccupations = aRandomAccessFile.readInt();
            this.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate = aRandomAccessFile.readInt();
            this.malesAged16to74IntermediateOccupations = aRandomAccessFile.readInt();
            this.malesAged16to74SmallEmployersAndOwnAccountWorkers = aRandomAccessFile.readInt();
            this.malesAged16to74LowerSupervisoryAndTechnicalOccupations = aRandomAccessFile.readInt();
            this.malesAged16to74SemiRoutineOccupations = aRandomAccessFile.readInt();
            this.malesAged16to74RoutineOccupations = aRandomAccessFile.readInt();
            this.malesAged16to74NeverWorked = aRandomAccessFile.readInt();
            this.malesAged16to74LongTermUnemployed = aRandomAccessFile.readInt();
            this.malesAged16to74FullTimeStudents = aRandomAccessFile.readInt();
        } catch (IOException ioe0) {
            // ioe0.printStackTrace();
            throw ioe0;
        }
    }

    /**
     * Initialises all fields.
     */
    protected void _Init() {
        super._Init();
        this.malesAged16to74 = Integer.MIN_VALUE;
        this.malesAged16to74LargeEmployersAndHigherManagerialOccupations = Integer.MIN_VALUE;
        this.malesAged16to74HigherProfessionalOccupations = Integer.MIN_VALUE;
        this.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate = Integer.MIN_VALUE;
        this.malesAged16to74IntermediateOccupations = Integer.MIN_VALUE;
        this.malesAged16to74SmallEmployersAndOwnAccountWorkers = Integer.MIN_VALUE;
        this.malesAged16to74LowerSupervisoryAndTechnicalOccupations = Integer.MIN_VALUE;
        this.malesAged16to74SemiRoutineOccupations = Integer.MIN_VALUE;
        this.malesAged16to74RoutineOccupations = Integer.MIN_VALUE;
        this.malesAged16to74NeverWorked = Integer.MIN_VALUE;
        this.malesAged16to74LongTermUnemployed = Integer.MIN_VALUE;
        this.malesAged16to74FullTimeStudents = Integer.MIN_VALUE;
    }

    /**
     * Initialises all fields from those in cASKS14bRecord.
     *
     * @param cASKS14bRecord
     *            The CASKS14bRecord thats fields are used to initialise this.
     */
    protected void init(Census_CASKS14bDataRecord cASKS14bRecord) {
        super.init(cASKS14bRecord);
        this.malesAged16to74 = cASKS14bRecord.malesAged16to74;
        this.malesAged16to74LargeEmployersAndHigherManagerialOccupations = cASKS14bRecord.malesAged16to74LargeEmployersAndHigherManagerialOccupations;
        this.malesAged16to74HigherProfessionalOccupations = cASKS14bRecord.malesAged16to74HigherProfessionalOccupations;
        this.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate = cASKS14bRecord.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate;
        this.malesAged16to74IntermediateOccupations = cASKS14bRecord.malesAged16to74IntermediateOccupations;
        this.malesAged16to74SmallEmployersAndOwnAccountWorkers = cASKS14bRecord.malesAged16to74SmallEmployersAndOwnAccountWorkers;
        this.malesAged16to74LowerSupervisoryAndTechnicalOccupations = cASKS14bRecord.malesAged16to74LowerSupervisoryAndTechnicalOccupations;
        this.malesAged16to74SemiRoutineOccupations = cASKS14bRecord.malesAged16to74SemiRoutineOccupations;
        this.malesAged16to74RoutineOccupations = cASKS14bRecord.malesAged16to74RoutineOccupations;
        this.malesAged16to74NeverWorked = cASKS14bRecord.malesAged16to74NeverWorked;
        this.malesAged16to74LongTermUnemployed = cASKS14bRecord.malesAged16to74LongTermUnemployed;
        this.malesAged16to74FullTimeStudents = cASKS14bRecord.malesAged16to74FullTimeStudents;
    }

    /**
     * Returns a string description of this;
     * @return 
     */
    public String toString() {
        return super.toString() + ", malesAged16to74 " + malesAged16to74 + ", malesAged16to74LargeEmployersAndHigherManagerialOccupations " + malesAged16to74LargeEmployersAndHigherManagerialOccupations + ", malesAged16to74HigherProfessionalOccupations " + malesAged16to74HigherProfessionalOccupations + ", malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate " + malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate + ", malesAged16to74IntermediateOccupations " + malesAged16to74IntermediateOccupations + ", malesAged16to74SmallEmployersAndOwnAccountWorkers " + malesAged16to74SmallEmployersAndOwnAccountWorkers + ", malesAged16to74LowerSupervisoryAndTechnicalOccupations" + malesAged16to74LowerSupervisoryAndTechnicalOccupations + ", malesAged16to74SemiRoutineOccupations " + malesAged16to74SemiRoutineOccupations + ", malesAged16to74RoutineOccupations " + malesAged16to74RoutineOccupations + ", malesAged16to74NeverWorked " + malesAged16to74NeverWorked + ", malesAged16to74LongTermUnemployed " + malesAged16to74LongTermUnemployed + ", malesAged16to74FullTimeStudents " + malesAged16to74FullTimeStudents;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the values
     *         of the <code>Fields</code> of <code>this</code>.
     */
    @Override
    public String toCSVString() {
        return super.toCSVString() + "," + malesAged16to74 + "," + malesAged16to74LargeEmployersAndHigherManagerialOccupations + "," + malesAged16to74HigherProfessionalOccupations + "," + malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate + "," + malesAged16to74IntermediateOccupations + "," + malesAged16to74SmallEmployersAndOwnAccountWorkers + "," + malesAged16to74LowerSupervisoryAndTechnicalOccupations + "," + malesAged16to74SemiRoutineOccupations + "," + malesAged16to74RoutineOccupations + "," + malesAged16to74NeverWorked + "," + malesAged16to74LongTermUnemployed + "," + malesAged16to74FullTimeStudents;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the names
     *         of the <code>Fields</code> of <code>this</code>
     */
    @Override
    public String toCSVStringFields() {
        return super.toCSVStringFields() + ",malesAged16to74" + ",malesAged16to74LargeEmployersAndHigherManagerialOccupations" + ",malesAged16to74HigherProfessionalOccupations" + ",malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate" + ",malesAged16to74IntermediateOccupations" + ",malesAged16to74SmallEmployersAndOwnAccountWorkers" + ",malesAged16to74LowerSupervisoryAndTechnicalOccupations" + ",malesAged16to74SemiRoutineOccupations" + ",malesAged16to74RoutineOccupations" + ",malesAged16to74NeverWorked" + ",malesAged16to74LongTermUnemployed" + ",malesAged16to74FullTimeStudents";
    }

    /**
     * Returns a copy of this.malesAged16to74
     * @return 
     */
    public int getMalesAged16to74() {
        return this.malesAged16to74;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74LargeEmployersAndHigherManagerialOccupations
     * @return 
     */
    public int getMalesAged16to74LargeEmployersAndHigherManagerialOccupations() {
        return this.malesAged16to74LargeEmployersAndHigherManagerialOccupations;
    }

    /**
     * Returns a copy of this.malesAged16to74HigherProfessionalOccupations
     * @return 
     */
    public int getMalesAged16to74HigherProfessionalOccupations() {
        return this.malesAged16to74HigherProfessionalOccupations;
    }

    /**
     * Returns a copy of this.
     * malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate
     * @return 
     */
    public int getMalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate() {
        return this.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate;
    }

    /**
     * Returns a copy of this.malesAged16to74IntermediateOccupations
     * @return 
     */
    public int getMalesAged16to74IntermediateOccupations() {
        return this.malesAged16to74IntermediateOccupations;
    }

    /**
     * Returns a copy of this.malesAged16to74SmallEmployersAndOwnAccountWorkers
     * @return 
     */
    public int getMalesAged16to74SmallEmployersAndOwnAccountWorkers() {
        return this.malesAged16to74SmallEmployersAndOwnAccountWorkers;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74LowerSupervisoryAndTechnicalOccupations
     * @return 
     */
    public int getMalesAged16to74LowerSupervisoryAndTechnicalOccupations() {
        return this.malesAged16to74LowerSupervisoryAndTechnicalOccupations;
    }

    /**
     * Returns a copy of this.malesAged16to74SemiRoutineOccupations
     * @return 
     */
    public int getMalesAged16to74SemiRoutineOccupations() {
        return this.malesAged16to74SemiRoutineOccupations;
    }

    /**
     * Returns a copy of this.malesAged16to74RoutineOccupations
     * @return 
     */
    public int getMalesAged16to74RoutineOccupations() {
        return this.malesAged16to74RoutineOccupations;
    }

    /**
     * Returns a copy of this.malesAged16to74NeverWorked
     * @return 
     */
    public int getMalesAged16to74NeverWorked() {
        return this.malesAged16to74NeverWorked;
    }

    /**
     * Returns a copy of this.malesAged16to74LongTermUnemployed
     * @return 
     */
    public int getMalesAged16to74LongTermUnemployed() {
        return this.malesAged16to74LongTermUnemployed;
    }

    /**
     * Returns a copy of this.malesAged16to74FullTimeStudents
     * @return 
     */
    public int getMalesAged16to74FullTimeStudents() {
        return this.malesAged16to74FullTimeStudents;
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
                aRandomAccessFile.writeInt(malesAged16to74);
                aRandomAccessFile.writeInt(malesAged16to74LargeEmployersAndHigherManagerialOccupations);
                aRandomAccessFile.writeInt(malesAged16to74HigherProfessionalOccupations);
                aRandomAccessFile.writeInt(malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate);
                aRandomAccessFile.writeInt(malesAged16to74IntermediateOccupations);
                aRandomAccessFile.writeInt(malesAged16to74SmallEmployersAndOwnAccountWorkers);
                aRandomAccessFile.writeInt(malesAged16to74LowerSupervisoryAndTechnicalOccupations);
                aRandomAccessFile.writeInt(malesAged16to74SemiRoutineOccupations);
                aRandomAccessFile.writeInt(malesAged16to74RoutineOccupations);
                aRandomAccessFile.writeInt(malesAged16to74NeverWorked);
                aRandomAccessFile.writeInt(malesAged16to74LongTermUnemployed);
                aRandomAccessFile.writeInt(malesAged16to74FullTimeStudents);
            // aRandomAccessFile.writeInt(
            // malesAged16to74NotClassifiableForOtherReasons );
            } catch (IOException aIOException) {
                System.err.println(aIOException.getLocalizedMessage());
                System.exit(Generic_ErrorAndExceptionHandler.IOException);
            }
        } else {
            write(aRandomAccessFile);
        }
    }

    /**
     * @return An aggregated <code>Census_CASKS14bDataRecord</code> where:
     *         <code>RecordID = this.RecordID</code>
     *         <code>Zone_Code = this.Zone_Code</code> For aggregating
     *         <code>CASKS14bDataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASKS14bDataRecord
     *            The <code>Census_CASKS14bDataRecord</code> to be aggregated with
     *            <code>this</code>.
     */
    public Census_CASKS14bDataRecord aggregate(Census_CASKS14bDataRecord aCASKS14bDataRecord) {
        Census_CASKS14bDataRecord newCASKS14bDataRecord = new Census_CASKS14bDataRecord(
                aCASKS14bDataRecord);
        newCASKS14bDataRecord.malesAged16to74 += getMalesAged16to74();
        newCASKS14bDataRecord.malesAged16to74LargeEmployersAndHigherManagerialOccupations += getMalesAged16to74LargeEmployersAndHigherManagerialOccupations();
        newCASKS14bDataRecord.malesAged16to74HigherProfessionalOccupations += getMalesAged16to74HigherProfessionalOccupations();
        newCASKS14bDataRecord.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate += getMalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate();
        newCASKS14bDataRecord.malesAged16to74IntermediateOccupations += getMalesAged16to74IntermediateOccupations();
        newCASKS14bDataRecord.malesAged16to74SmallEmployersAndOwnAccountWorkers += getMalesAged16to74SmallEmployersAndOwnAccountWorkers();
        newCASKS14bDataRecord.malesAged16to74LowerSupervisoryAndTechnicalOccupations += getMalesAged16to74LowerSupervisoryAndTechnicalOccupations();
        newCASKS14bDataRecord.malesAged16to74SemiRoutineOccupations += getMalesAged16to74SemiRoutineOccupations();
        newCASKS14bDataRecord.malesAged16to74RoutineOccupations += getMalesAged16to74RoutineOccupations();
        newCASKS14bDataRecord.malesAged16to74NeverWorked += getMalesAged16to74NeverWorked();
        newCASKS14bDataRecord.malesAged16to74LongTermUnemployed += getMalesAged16to74LongTermUnemployed();
        newCASKS14bDataRecord.malesAged16to74FullTimeStudents += getMalesAged16to74FullTimeStudents();
        return newCASKS14bDataRecord;
    }

    /**
     * @return An aggregated <code>Census_CASKS14bDataRecord</code> where:
     *         <code>RecordID = newRecordID</code>
     *         <code>Zone_Code = newZone_Code</code> For aggregating
     *         <code>CASKS14bDataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASKS14bDataRecord
     *            The <code>Census_CASKS14bDataRecord</code> to be aggregated with
     *            <code>this</code>.
     * @param newRecordID
     *            The <code>RecordID</code> assigned to result.
     * @param newZone_Code
     *            The <code>Zone_Code</code> assigned to result.
     */
    public Census_CASKS14bDataRecord aggregate(Census_CASKS14bDataRecord aCASKS14bDataRecord,
            long newRecordID, char[] newZone_Code) {
        Census_CASKS14bDataRecord newCASKS14bDataRecord = new Census_CASKS14bDataRecord(this);
        newCASKS14bDataRecord._RecordID = newRecordID;
        // newCASKS14bDataRecord.Zone_Code = aCASKS14bDataRecord.Zone_Code;
        int aZone_CodeID = 0;
        for (int Zone_CodeID = 0; Zone_CodeID < newZone_Code.length; Zone_CodeID++) {
            newCASKS14bDataRecord.Zone_Code[Zone_CodeID] = newZone_Code[Zone_CodeID];
            aZone_CodeID = Zone_CodeID;
        }
        for (int Zone_CodeID = aZone_CodeID; Zone_CodeID < Zone_Code.length; Zone_CodeID++) {
            newCASKS14bDataRecord.Zone_Code[Zone_CodeID] = ' ';
        }
        newCASKS14bDataRecord.malesAged16to74 += getMalesAged16to74();
        newCASKS14bDataRecord.malesAged16to74LargeEmployersAndHigherManagerialOccupations += getMalesAged16to74LargeEmployersAndHigherManagerialOccupations();
        newCASKS14bDataRecord.malesAged16to74HigherProfessionalOccupations += getMalesAged16to74HigherProfessionalOccupations();
        newCASKS14bDataRecord.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate += getMalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate();
        newCASKS14bDataRecord.malesAged16to74IntermediateOccupations += getMalesAged16to74IntermediateOccupations();
        newCASKS14bDataRecord.malesAged16to74SmallEmployersAndOwnAccountWorkers += getMalesAged16to74SmallEmployersAndOwnAccountWorkers();
        newCASKS14bDataRecord.malesAged16to74LowerSupervisoryAndTechnicalOccupations += getMalesAged16to74LowerSupervisoryAndTechnicalOccupations();
        newCASKS14bDataRecord.malesAged16to74SemiRoutineOccupations += getMalesAged16to74SemiRoutineOccupations();
        newCASKS14bDataRecord.malesAged16to74RoutineOccupations += getMalesAged16to74RoutineOccupations();
        newCASKS14bDataRecord.malesAged16to74NeverWorked += getMalesAged16to74NeverWorked();
        newCASKS14bDataRecord.malesAged16to74LongTermUnemployed += getMalesAged16to74LongTermUnemployed();
        newCASKS14bDataRecord.malesAged16to74FullTimeStudents += getMalesAged16to74FullTimeStudents();
        return newCASKS14bDataRecord;
    }

    /**
     * Returns the size of this CASKS14bRecord in bytes as a long. This does not
     * account for serialVersionUID. A boolean is assumed to be the same size as
     * an int in bytes.
     * @return 
     */
    @Override
    public long getSizeInBytes() {
        long result = super.getSizeInBytes();
        result += (12L * (long) Integer.SIZE) / getNumberOfBitsInByte();
        return result;
    }
}