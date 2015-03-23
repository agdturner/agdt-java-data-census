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
 * For representing CAS KS09c Records and providing safe access to the data.
 */
public class CASKS09cDataRecord extends AbstractCASDataRecord {

    /*
     * Table KS009c Economic activity - females: All females aged 16-74
     * Footnotes and Comments for Table KS009c 1. For the Census, part-time is
     * defined as working 30 hours or less a week. Full-time is defined as
     * working 31 or more hours a week. 2. 'Long-term unemployed' are those who
     * stated that they have not worked since 1999 or earlier.
     */
    /**
     * KS009c0001 = femalesAged16to74
     */
    protected int femalesAged16to74;
    /**
     * KS009c0002 = femalesAged16to74EconomicallyActiveEmployeesPartTime
     */
    protected int femalesAged16to74EconomicallyActiveEmployeesPartTime;
    /**
     * KS009c0003 = femalesAged16to74EconomicallyActiveEmployeesFullTime
     */
    protected int femalesAged16to74EconomicallyActiveEmployeesFullTime;
    /**
     * KS009c0004 = femalesAged16to74EconomicallyActiveSelfEmployed
     */
    protected int femalesAged16to74EconomicallyActiveSelfEmployed;
    /**
     * KS009c0005 = femalesAged16to74EconomicallyActiveUnemployed
     */
    protected int femalesAged16to74EconomicallyActiveUnemployed;
    /**
     * KS009c0006 = femalesAged16to74EconomicallyActiveFullTimeStudent
     */
    protected int femalesAged16to74EconomicallyActiveFullTimeStudent;
    /**
     * KS009c0007 = femalesAged16to74EconomicallyInactiveRetired
     */
    protected int femalesAged16to74EconomicallyInactiveRetired;
    /**
     * KS009c009c = femalesAged16to74EconomicallyInactiveStudent
     */
    protected int femalesAged16to74EconomicallyInactiveStudent;
    /**
     * KS009c0009 =
     * femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily
     */
    protected int femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily;
    /**
     * KS009c0010 =
     * femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled
     */
    protected int femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled;
    /**
     * KS009c0011 = femalesAged16to74EconomicallyInactiveOther
     */
    protected int femalesAged16to74EconomicallyInactiveOther;
    /**
     * KS009c0012 = femalesAged16to24Unemployed
     */
    protected int femalesAged16to24Unemployed;
    /**
     * KS009c0013 = femalesAged50AndOverUnemployed
     */
    protected int femalesAged50AndOverUnemployed;
    /**
     * KS009c0014 = femalesAged16to74UnemployedWhoHaveNeverWorked
     */
    protected int femalesAged16to74UnemployedWhoHaveNeverWorked;
    /**
     * KS009c0015 = femalesAged16to74WhoAreLongTermUnemployed
     */
    protected int femalesAged16to74WhoAreLongTermUnemployed;

    /** Creates a new CASKS09cRecord */
    public CASKS09cDataRecord() {
        _Init();
    }

    /**
     * Creates a new CASKS09cRecord
     *
     * @param initZero
     *            To ensure initZero() is used instead of _Init()
     */
    public CASKS09cDataRecord(boolean initZero) {
        initZero();
    }

    /**
     * Creates a new CASKS09cRecord cloned from cASKS09cRecord
     *
     * @param cASKS09cRecord
     *            The CASKS09cRecord from which this is cloned.
     */
    public CASKS09cDataRecord(CASKS09cDataRecord cASKS09cRecord) {
        init(cASKS09cRecord);
    }

    /**
     * Creates a new CASKS09cDataRecord
     *
     * @param RecordID
     *            The RecordID to be assigned to this
     * @param line
     *            The Comma Seperated Value <code>String</code>
     * @throws java.io.IOException
     */
    public CASKS09cDataRecord(long RecordID, String line) throws IOException {
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[15];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        this._RecordID = RecordID;
        this.Zone_Code = fields[0].substring(1, 11).toCharArray();
        // From Table KS09c
        this.femalesAged16to74 = StaticConverter.to_int(fields[1]);
        this.femalesAged16to74EconomicallyActiveEmployeesPartTime = StaticConverter.to_int(fields[2]);
        this.femalesAged16to74EconomicallyActiveEmployeesFullTime = StaticConverter.to_int(fields[3]);
        this.femalesAged16to74EconomicallyActiveSelfEmployed = StaticConverter.to_int(fields[4]);
        this.femalesAged16to74EconomicallyActiveUnemployed = StaticConverter.to_int(fields[5]);
        this.femalesAged16to74EconomicallyInactiveRetired = StaticConverter.to_int(fields[6]);
        this.femalesAged16to74EconomicallyActiveFullTimeStudent = StaticConverter.to_int(fields[7]);
        this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily = StaticConverter.to_int(fields[8]);
        this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled = StaticConverter.to_int(fields[9]);
        this.femalesAged16to74EconomicallyInactiveOther = StaticConverter.to_int(fields[10]);
        this.femalesAged16to24Unemployed = StaticConverter.to_int(fields[11]);
        this.femalesAged50AndOverUnemployed = StaticConverter.to_int(fields[12]);
        this.femalesAged16to74UnemployedWhoHaveNeverWorked = StaticConverter.to_int(fields[13]);
        this.femalesAged16to74WhoAreLongTermUnemployed = StaticConverter.to_int(fields[14]);
    }

    /**
     * Creates a new CASKS09cRecord
     *
     * @param aRandomAccessFile
     * @throws java.io.IOException
     */
    public CASKS09cDataRecord(
            RandomAccessFile aRandomAccessFile)
            throws IOException {
        try {
            this._RecordID = aRandomAccessFile.readLong();
            this.Zone_Code = new char[10];
            for (int i = 0; i < this.Zone_Code.length; i++) {
                Zone_Code[i] = aRandomAccessFile.readChar();
            }
            this.femalesAged16to74 = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyActiveEmployeesPartTime = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyActiveEmployeesFullTime = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyActiveSelfEmployed = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyActiveUnemployed = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyActiveFullTimeStudent = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyInactiveRetired = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyInactiveStudent = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled = aRandomAccessFile.readInt();
            this.femalesAged16to74EconomicallyInactiveOther = aRandomAccessFile.readInt();
            this.femalesAged16to24Unemployed = aRandomAccessFile.readInt();
            this.femalesAged50AndOverUnemployed = aRandomAccessFile.readInt();
            this.femalesAged16to74UnemployedWhoHaveNeverWorked = aRandomAccessFile.readInt();
            this.femalesAged16to74WhoAreLongTermUnemployed = aRandomAccessFile.readInt();
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
        this.femalesAged16to74 = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyActiveEmployeesPartTime = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyActiveEmployeesFullTime = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyActiveSelfEmployed = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyActiveUnemployed = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyActiveFullTimeStudent = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyInactiveRetired = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyInactiveStudent = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled = Integer.MIN_VALUE;
        this.femalesAged16to74EconomicallyInactiveOther = Integer.MIN_VALUE;
        this.femalesAged16to24Unemployed = Integer.MIN_VALUE;
        this.femalesAged50AndOverUnemployed = Integer.MIN_VALUE;
        this.femalesAged16to74UnemployedWhoHaveNeverWorked = Integer.MIN_VALUE;
        this.femalesAged16to74WhoAreLongTermUnemployed = Integer.MIN_VALUE;
    }

    /**
     * Initialises all fields.
     */
    protected void initZero() {
        super._Init();
        this.femalesAged16to74 = 0;
        this.femalesAged16to74EconomicallyActiveEmployeesPartTime = 0;
        this.femalesAged16to74EconomicallyActiveEmployeesFullTime = 0;
        this.femalesAged16to74EconomicallyActiveSelfEmployed = 0;
        this.femalesAged16to74EconomicallyActiveUnemployed = 0;
        this.femalesAged16to74EconomicallyActiveFullTimeStudent = 0;
        this.femalesAged16to74EconomicallyInactiveRetired = 0;
        this.femalesAged16to74EconomicallyInactiveStudent = 0;
        this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily = 0;
        this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled = 0;
        this.femalesAged16to74EconomicallyInactiveOther = 0;
        this.femalesAged16to24Unemployed = 0;
        this.femalesAged50AndOverUnemployed = 0;
        this.femalesAged16to74UnemployedWhoHaveNeverWorked = 0;
        this.femalesAged16to74WhoAreLongTermUnemployed = 0;
    }

    /**
     * Initialises all fields from those in cASKS09cRecord.
     *
     * @param cASKS09cRecord
     *            The CASKS09cRecord thats fields are used to initialise this.
     */
    protected void init(CASKS09cDataRecord cASKS09cRecord) {
        super.init(cASKS09cRecord);
        this.femalesAged16to74 = cASKS09cRecord.femalesAged16to74;
        this.femalesAged16to74EconomicallyActiveEmployeesPartTime = cASKS09cRecord.femalesAged16to74EconomicallyActiveEmployeesPartTime;
        this.femalesAged16to74EconomicallyActiveEmployeesFullTime = cASKS09cRecord.femalesAged16to74EconomicallyActiveEmployeesFullTime;
        this.femalesAged16to74EconomicallyActiveSelfEmployed = cASKS09cRecord.femalesAged16to74EconomicallyActiveSelfEmployed;
        this.femalesAged16to74EconomicallyActiveUnemployed = cASKS09cRecord.femalesAged16to74EconomicallyActiveUnemployed;
        this.femalesAged16to74EconomicallyActiveFullTimeStudent = cASKS09cRecord.femalesAged16to74EconomicallyActiveFullTimeStudent;
        this.femalesAged16to74EconomicallyInactiveRetired = cASKS09cRecord.femalesAged16to74EconomicallyInactiveRetired;
        this.femalesAged16to74EconomicallyInactiveStudent = cASKS09cRecord.femalesAged16to74EconomicallyInactiveStudent;
        this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily = cASKS09cRecord.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily;
        this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled = cASKS09cRecord.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled;
        this.femalesAged16to74EconomicallyInactiveOther = cASKS09cRecord.femalesAged16to74EconomicallyInactiveOther;
        this.femalesAged16to24Unemployed = cASKS09cRecord.femalesAged16to24Unemployed;
        this.femalesAged50AndOverUnemployed = cASKS09cRecord.femalesAged50AndOverUnemployed;
        this.femalesAged16to74UnemployedWhoHaveNeverWorked = cASKS09cRecord.femalesAged16to74UnemployedWhoHaveNeverWorked;
        this.femalesAged16to74WhoAreLongTermUnemployed = cASKS09cRecord.femalesAged16to74WhoAreLongTermUnemployed;
    }

    /**
     * Returns a string description of this;
     * @return 
     */
    public String toString() {
        return super.toString() +
                ", femalesAged16to74 " + femalesAged16to74 +
                ", femalesAged16to74EconomicallyActiveEmployeesPartTime " + femalesAged16to74EconomicallyActiveEmployeesPartTime +
                ", femalesAged16to74EconomicallyActiveEmployeesFullTime " + femalesAged16to74EconomicallyActiveEmployeesFullTime +
                ", femalesAged16to74EconomicallyActiveSelfEmployed " + femalesAged16to74EconomicallyActiveSelfEmployed +
                ", femalesAged16to74EconomicallyActiveUnemployed " + femalesAged16to74EconomicallyActiveUnemployed +
                ", femalesAged16to74EconomicallyInactiveRetired " + femalesAged16to74EconomicallyInactiveRetired +
                ", femalesAged16to74EconomicallyActiveFullTimeStudent" + femalesAged16to74EconomicallyActiveFullTimeStudent +
                ", femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily " + femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily +
                ", femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled " + femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled +
                ", femalesAged16to74EconomicallyInactiveOther " + femalesAged16to74EconomicallyInactiveOther +
                ", femalesAged16to24Unemployed " + femalesAged16to24Unemployed +
                ", femalesAged50AndOverUnemployed " + femalesAged50AndOverUnemployed +
                ", femalesAged16to74UnemployedWhoHaveNeverWorked " + femalesAged16to74UnemployedWhoHaveNeverWorked +
                ", femalesAged16to74WhoAreLongTermUnemployed " + femalesAged16to74WhoAreLongTermUnemployed;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the values
     *         of the <code>Fields</code> of <code>this</code>.
     */
    @Override
    public String toCSVString() {
        return super.toCSVString() + "," +
                femalesAged16to74 + "," +
                femalesAged16to74EconomicallyActiveEmployeesPartTime + "," +
                femalesAged16to74EconomicallyActiveEmployeesFullTime + "," +
                femalesAged16to74EconomicallyActiveSelfEmployed + "," +
                femalesAged16to74EconomicallyActiveUnemployed + "," +
                femalesAged16to74EconomicallyInactiveRetired + "," +
                femalesAged16to74EconomicallyActiveFullTimeStudent + "," +
                femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily + "," +
                femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled + "," +
                femalesAged16to74EconomicallyInactiveOther + "," +
                femalesAged16to24Unemployed + "," +
                femalesAged50AndOverUnemployed + "," +
                femalesAged16to74UnemployedWhoHaveNeverWorked + "," +
                femalesAged16to74WhoAreLongTermUnemployed;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the names
     *         of the <code>Fields</code> of <code>this</code>
     */
    @Override
    public String toCSVStringFields() {
        return super.toCSVStringFields() +
                ",femalesAged16to74" +
                ",femalesAged16to74EconomicallyActiveEmployeesPartTime" +
                ",femalesAged16to74EconomicallyActiveEmployeesFullTime" +
                ",femalesAged16to74EconomicallyActiveSelfEmployed" +
                ",femalesAged16to74EconomicallyActiveUnemployed" +
                ",femalesAged16to74EconomicallyInactiveRetired" +
                ",femalesAged16to74EconomicallyActiveFullTimeStudent" +
                ",femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily" +
                ",femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled" +
                ",femalesAged16to74EconomicallyInactiveOther" +
                ",femalesAged16to24Unemployed" +
                ",femalesAged50AndOverUnemployed" +
                ",femalesAged16to74UnemployedWhoHaveNeverWorked" +
                ",femalesAged16to74WhoAreLongTermUnemployed";
    }

    /**
     * Returns a copy of this.femalesAged16to74
     * @return 
     */
    public int getFemalesAged16to74() {
        return this.femalesAged16to74;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74EconomicallyActiveEmployeesPartTime
     * @return 
     */
    public int getFemalesAged16to74EconomicallyActiveEmployeesPartTime() {
        return this.femalesAged16to74EconomicallyActiveEmployeesPartTime;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74EconomicallyActiveEmployeesFullTime
     * @return 
     */
    public int getFemalesAged16to74EconomicallyActiveEmployeesFullTime() {
        return this.femalesAged16to74EconomicallyActiveEmployeesFullTime;
    }

    /**
     * Returns a copy of this.femalesAged16to74EconomicallyActiveSelfEmployed
     * @return 
     */
    public int getFemalesAged16to74EconomicallyActiveSelfEmployed() {
        return this.femalesAged16to74EconomicallyActiveSelfEmployed;
    }

    /**
     * Returns a copy of this.femalesAged16to74EconomicallyActiveUnemployed
     * @return 
     */
    public int getFemalesAged16to74EconomicallyActiveUnemployed() {
        return this.femalesAged16to74EconomicallyActiveUnemployed;
    }

    /**
     * Returns a copy of this.femalesAged16to74EconomicallyInactiveRetired
     * @return 
     */
    public int getFemalesAged16to74EconomicallyInactiveRetired() {
        return this.femalesAged16to74EconomicallyInactiveRetired;
    }

    /**
     * Returns a copy of this.femalesAged16to74EconomicallyActiveFullTimeStudent
     * @return 
     */
    public int getFemalesAged16to74EconomicallyActiveFullTimeStudent() {
        return this.femalesAged16to74EconomicallyActiveFullTimeStudent;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily
     * @return 
     */
    public int getFemalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily() {
        return this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled
     * @return 
     */
    public int getFemalesAged16to74EconomicallyInactivePermanentlySickOrDisabled() {
        return this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled;
    }

    /**
     * Returns a copy of this.femalesAged16to74EconomicallyInactiveOther
     * @return 
     */
    public int getFemalesAged16to74EconomicallyInactiveOther() {
        return this.femalesAged16to74EconomicallyInactiveOther;
    }

    /**
     * Returns a copy of this.femalesAged16to24Unemployed
     * @return 
     */
    public int getFemalesAged16to24Unemployed() {
        return this.femalesAged16to24Unemployed;
    }

    /**
     * Returns a copy of this.femalesAged50AndOverUnemployed
     * @return 
     */
    public int getFemalesAged50AndOverUnemployed() {
        return this.femalesAged50AndOverUnemployed;
    }

    /**
     * Returns a copy of this.femalesAged16to74UnemployedWhoHaveNeverWorked
     * @return 
     */
    public int getFemalesAged16to74UnemployedWhoHaveNeverWorked() {
        return this.femalesAged16to74UnemployedWhoHaveNeverWorked;
    }

    /**
     * Returns a copy of this.femalesAged16to74WhoAreLongTermUnemployed
     * @return 
     */
    public int getFemalesAged16to74WhoAreLongTermUnemployed() {
        return this.femalesAged16to74WhoAreLongTermUnemployed;
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
                aRandomAccessFile.writeInt(femalesAged16to74);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyActiveEmployeesPartTime);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyActiveEmployeesFullTime);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyActiveSelfEmployed);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyActiveUnemployed);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyActiveFullTimeStudent);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyInactiveRetired);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyInactiveStudent);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled);
                aRandomAccessFile.writeInt(femalesAged16to74EconomicallyInactiveOther);
                aRandomAccessFile.writeInt(femalesAged16to24Unemployed);
                aRandomAccessFile.writeInt(femalesAged50AndOverUnemployed);
                aRandomAccessFile.writeInt(femalesAged16to74UnemployedWhoHaveNeverWorked);
                aRandomAccessFile.writeInt(femalesAged16to74WhoAreLongTermUnemployed);
            } catch (IOException aIOException) {
                System.err.println(aIOException.getLocalizedMessage());
                System.exit(Generic_ErrorAndExceptionHandler.IOException);
            }
        } else {
            write(aRandomAccessFile);
        }
    }

    /**
     * User needs to take care in aggregating to ensure aggregation does not
     * compromise (introduce error) based on the numbers used.
     * @param aCASKS09cDataRecord
     * @return 
     */
    public CASKS09cDataRecord aggregate(CASKS09cDataRecord aCASKS09cDataRecord) {
        CASKS09cDataRecord newCASKS09cDataRecord = new CASKS09cDataRecord(
                aCASKS09cDataRecord);
        newCASKS09cDataRecord.femalesAged16to74 += getFemalesAged16to74();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveEmployeesPartTime += getFemalesAged16to74EconomicallyActiveEmployeesPartTime();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveEmployeesFullTime += getFemalesAged16to74EconomicallyActiveEmployeesFullTime();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveSelfEmployed += getFemalesAged16to74EconomicallyActiveSelfEmployed();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveUnemployed += getFemalesAged16to74EconomicallyActiveUnemployed();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactiveRetired += getFemalesAged16to74EconomicallyInactiveRetired();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveFullTimeStudent += getFemalesAged16to74EconomicallyActiveFullTimeStudent();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily += getFemalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled += getFemalesAged16to74EconomicallyInactivePermanentlySickOrDisabled();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactiveOther += getFemalesAged16to74EconomicallyInactiveOther();
        newCASKS09cDataRecord.femalesAged16to24Unemployed += getFemalesAged16to24Unemployed();
        newCASKS09cDataRecord.femalesAged50AndOverUnemployed += getFemalesAged50AndOverUnemployed();
        newCASKS09cDataRecord.femalesAged16to74UnemployedWhoHaveNeverWorked += getFemalesAged16to74UnemployedWhoHaveNeverWorked();
        newCASKS09cDataRecord.femalesAged16to74WhoAreLongTermUnemployed += getFemalesAged16to74WhoAreLongTermUnemployed();
        return newCASKS09cDataRecord;
    }

    /**
     * User needs to take care in aggregating to ensure aggregation does not
     * compromise (introduce error) based on the numbers used.
     * @param newZone_Code
     * @param newRecordID
     * @return 
     */
    public CASKS09cDataRecord aggregate(CASKS09cDataRecord aCASKS09cDataRecord,
            long newRecordID, char[] newZone_Code) {
        CASKS09cDataRecord newCASKS09cDataRecord = new CASKS09cDataRecord(this);
        newCASKS09cDataRecord._RecordID = newRecordID;
        // newCASKS09cDataRecord.Zone_Code = aCASKS09cDataRecord.Zone_Code;
        int aZone_CodeID = 0;
        for (int Zone_CodeID = 0; Zone_CodeID < newZone_Code.length; Zone_CodeID++) {
            newCASKS09cDataRecord.Zone_Code[Zone_CodeID] = newZone_Code[Zone_CodeID];
            aZone_CodeID = Zone_CodeID;
        }
        for (int Zone_CodeID = aZone_CodeID; Zone_CodeID < Zone_Code.length; Zone_CodeID++) {
            newCASKS09cDataRecord.Zone_Code[Zone_CodeID] = ' ';
        }
        newCASKS09cDataRecord.femalesAged16to74 += getFemalesAged16to74();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveEmployeesPartTime += getFemalesAged16to74EconomicallyActiveEmployeesPartTime();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveEmployeesFullTime += getFemalesAged16to74EconomicallyActiveEmployeesFullTime();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveSelfEmployed += getFemalesAged16to74EconomicallyActiveSelfEmployed();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveUnemployed += getFemalesAged16to74EconomicallyActiveUnemployed();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactiveRetired += getFemalesAged16to74EconomicallyInactiveRetired();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyActiveFullTimeStudent += getFemalesAged16to74EconomicallyActiveFullTimeStudent();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily += getFemalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled += getFemalesAged16to74EconomicallyInactivePermanentlySickOrDisabled();
        newCASKS09cDataRecord.femalesAged16to74EconomicallyInactiveOther += getFemalesAged16to74EconomicallyInactiveOther();
        newCASKS09cDataRecord.femalesAged16to24Unemployed += getFemalesAged16to24Unemployed();
        newCASKS09cDataRecord.femalesAged50AndOverUnemployed += getFemalesAged50AndOverUnemployed();
        newCASKS09cDataRecord.femalesAged16to74UnemployedWhoHaveNeverWorked += getFemalesAged16to74UnemployedWhoHaveNeverWorked();
        newCASKS09cDataRecord.femalesAged16to74WhoAreLongTermUnemployed += getFemalesAged16to74WhoAreLongTermUnemployed();
        return newCASKS09cDataRecord;
    }

    /**
     * Returns the size of this CASKS09cRecord in bytes as a long. This does not
     * account for serialVersionUID. A boolean is assumed to be the same size as
     * an int in bytes.
     * @return 
     */
    @Override
    public long getSizeInBytes() {
        long result = super.getSizeInBytes();
        result += (15L * (long) Integer.SIZE) / getNumberOfBitsInByte();
        return result;
    }
}