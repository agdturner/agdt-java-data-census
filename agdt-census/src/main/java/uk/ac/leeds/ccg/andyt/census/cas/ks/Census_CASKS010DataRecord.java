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
 * For representing CAS KS010 Records and providing safe access to the data.
 */
public class Census_CASKS010DataRecord extends Census_AbstractDataRecord {

    /*
     * Table KS010 Hours worked: All people aged 16-74 in employment. Footnotes
     * and Comments for Table KS010 1. Hours worked is the average number of
     * hours per week worked for the last four weeks before the Census (29 April
     * 2001).
     */
    /**
     * KS0100001 = malesAged16to74InEmployment
     */
    protected int malesAged16to74InEmployment;
    /**
     * KS0100002 = malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5
     */
    protected int malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5;
    /**
     * KS0100003 = malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15
     */
    protected int malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15;
    /**
     * KS0100004 = malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30
     */
    protected int malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30;
    /**
     * KS0100005 = malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37
     */
    protected int malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37;
    /**
     * KS0100006 = malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48
     */
    protected int malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48;
    /**
     * KS0100007 = malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore
     */
    protected int malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
    /**
     * KS0100010 = femalesAged16to74InEmployment
     */
    protected int femalesAged16to74InEmployment;
    /**
     * KS0100009 = femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5
     */
    protected int femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5;
    /**
     * KS0100010 = femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15
     */
    protected int femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15;
    /**
     * KS0100011 = femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30
     */
    protected int femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30;
    /**
     * KS0100012 = femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37
     */
    protected int femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37;
    /**
     * KS0100013 = femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48
     */
    protected int femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48;
    /**
     * KS0100014 =
     * femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore
     */
    protected int femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;

    /** Creates a new CASKS010Record */
    public Census_CASKS010DataRecord() {
        _Init();
    }

    /**
     * Creates a new CASKS010Record cloned from cASKS010Record
     *
     * @param cASKS010Record
     *            The CASKS010Record from which this is cloned.
     */
    public Census_CASKS010DataRecord(Census_CASKS010DataRecord cASKS010Record) {
        init(cASKS010Record);
    }

    /**
     * Creates a new CASKS010DataRecord
     *
     * @param initZero
     *            To ensure initZero() is used instead of _Init()
     */
    public Census_CASKS010DataRecord(boolean initZero) {
        initZero();
    }

    /**
     * Creates a new CASKS010DataRecord
     *
     * @param RecordID
     *            The RecordID to be assigned to this
     * @param line
     *            The Comma Seperated Value <code>String</code>
     * @throws java.io.IOException
     */
    public Census_CASKS010DataRecord(long RecordID, String line) throws IOException {
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
        // From Table KS010
        this.malesAged16to74InEmployment = StaticConverter.to_int(fields[1]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = StaticConverter.to_int(fields[2]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = StaticConverter.to_int(fields[3]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = StaticConverter.to_int(fields[4]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = StaticConverter.to_int(fields[5]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = StaticConverter.to_int(fields[6]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = StaticConverter.to_int(fields[7]);
        this.femalesAged16to74InEmployment = StaticConverter.to_int(fields[8]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = StaticConverter.to_int(fields[9]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = StaticConverter.to_int(fields[10]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = StaticConverter.to_int(fields[11]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = StaticConverter.to_int(fields[12]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = StaticConverter.to_int(fields[13]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = StaticConverter.to_int(fields[14]);
    }

    /**
     * Creates a new CASKS010Record
     *
     * @param aRandomAccessFile
     * @throws java.io.IOException
     */
    public Census_CASKS010DataRecord(RandomAccessFile aRandomAccessFile)
            throws IOException {
        try {
            this._RecordID = aRandomAccessFile.readLong();
            this.Zone_Code = new char[10];
            for (int i = 0; i < this.Zone_Code.length; i++) {
                Zone_Code[i] = aRandomAccessFile.readChar();
            }
            this.malesAged16to74InEmployment = aRandomAccessFile.readInt();
            this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = aRandomAccessFile.readInt();
            this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = aRandomAccessFile.readInt();
            this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = aRandomAccessFile.readInt();
            this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = aRandomAccessFile.readInt();
            this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = aRandomAccessFile.readInt();
            this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = aRandomAccessFile.readInt();
            this.femalesAged16to74InEmployment = aRandomAccessFile.readInt();
            this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = aRandomAccessFile.readInt();
            this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = aRandomAccessFile.readInt();
            this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = aRandomAccessFile.readInt();
            this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = aRandomAccessFile.readInt();
            this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = aRandomAccessFile.readInt();
            this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = aRandomAccessFile.readInt();
        } catch (IOException ioe0) {
            // ioe0.printStackTrace();
            throw ioe0;
        }
    }

    /**
     * Initialises.
     */
    protected void _Init() {
        super._Init();
        this.malesAged16to74InEmployment = Integer.MIN_VALUE;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = Integer.MIN_VALUE;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = Integer.MIN_VALUE;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = Integer.MIN_VALUE;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = Integer.MIN_VALUE;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = Integer.MIN_VALUE;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = Integer.MIN_VALUE;
        this.femalesAged16to74InEmployment = Integer.MIN_VALUE;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = Integer.MIN_VALUE;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = Integer.MIN_VALUE;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = Integer.MIN_VALUE;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = Integer.MIN_VALUE;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = Integer.MIN_VALUE;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = Integer.MIN_VALUE;
    }

    /**
     * Initialises to zero.
     */
    protected void initZero() {
        super._Init();
        this.malesAged16to74InEmployment = 0;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = 0;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = 0;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = 0;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = 0;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = 0;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = 0;
        this.femalesAged16to74InEmployment = 0;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = 0;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = 0;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = 0;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = 0;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = 0;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = 0;
    }

    /**
     * Initialises all fields from those in cASKS010Record.
     *
     * @param cASKS010Record
     *            The CASKS010Record thats fields are used to initialise this.
     */
    protected void init(Census_CASKS010DataRecord cASKS010Record) {
        super.init(cASKS010Record);
        this.malesAged16to74InEmployment = cASKS010Record.malesAged16to74InEmployment;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = cASKS010Record.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = cASKS010Record.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = cASKS010Record.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = cASKS010Record.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = cASKS010Record.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48;
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = cASKS010Record.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
        this.femalesAged16to74InEmployment = cASKS010Record.femalesAged16to74InEmployment;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = cASKS010Record.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = cASKS010Record.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = cASKS010Record.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = cASKS010Record.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = cASKS010Record.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48;
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = cASKS010Record.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
    }

    /**
     * Returns a string description of this;
     * @return 
     */
    public String toString() {
        return super.toString() + ", malesAged16to74InEmployment " + malesAged16to74InEmployment + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 " + malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 " + malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 " + malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 " + malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48" + malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore " + malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore + ", femalesAged16to74InEmployment " + femalesAged16to74InEmployment + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 " + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 " + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 " + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 " + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 " + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore " + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the values
     *         of the <code>Fields</code> of <code>this</code>.
     */
    @Override
    public String toCSVString() {
        return super.toCSVString() + "," + malesAged16to74InEmployment + "," + malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 + "," + malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 + "," + malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 + "," + malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 + "," + malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 + "," + malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore + "," + femalesAged16to74InEmployment + "," + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 + "," + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 + "," + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 + "," + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 + "," + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 + "," + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
    }

    /**
     * @return A Comma Seperated Version (CSV) <code>String</code> of the names
     *         of the <code>Fields</code> of <code>this</code>
     */
    @Override
    public String toCSVStringFields() {
        return super.toCSVStringFields() + ",malesAged16to74InEmployment" + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5" + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15" + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30" + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37" + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48" + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore" + ",femalesAged16to74InEmployment" + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5" + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15" + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30" + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37" + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48" + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore";
    }

    /**
     * Returns a copy of this.malesAged16to74InEmployment
     * @return 
     */
    public int getMalesAged16to74InEmployment() {
        return this.malesAged16to74InEmployment;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5() {
        return this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15() {
        return this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30() {
        return this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37() {
        return this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48() {
        return this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore() {
        return this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
    }

    /**
     * Returns a copy of this.femalesAged16to74InEmployment
     * @return 
     */
    public int getFemalesAged16to74InEmployment() {
        return this.femalesAged16to74InEmployment;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5() {
        return this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15() {
        return this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30() {
        return this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37() {
        return this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48() {
        return this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore() {
        return this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
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
                aRandomAccessFile.writeInt(malesAged16to74InEmployment);
                aRandomAccessFile.writeInt(malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5);
                aRandomAccessFile.writeInt(malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15);
                aRandomAccessFile.writeInt(malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30);
                aRandomAccessFile.writeInt(malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37);
                aRandomAccessFile.writeInt(malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48);
                aRandomAccessFile.writeInt(malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore);
                aRandomAccessFile.writeInt(femalesAged16to74InEmployment);
                aRandomAccessFile.writeInt(femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5);
                aRandomAccessFile.writeInt(femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15);
                aRandomAccessFile.writeInt(femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30);
                aRandomAccessFile.writeInt(femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37);
                aRandomAccessFile.writeInt(femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48);
                aRandomAccessFile.writeInt(femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore);
            } catch (IOException aIOException) {
                System.err.println(aIOException.getLocalizedMessage());
                System.exit(Generic_ErrorAndExceptionHandler.IOException);
            }
        } else {
            write(aRandomAccessFile);
        }
    }

    /**
     * @return An aggregated <code>Census_CASKS010DataRecord</code> where:
     *         <code>RecordID = this.RecordID</code>
     *         <code>Zone_Code = this.Zone_Code</code> For aggregating
     *         <code>CASKS010DataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASKS010DataRecord
     *            The <code>Census_CASKS010DataRecord</code> to be aggregated with
     *            <code>this</code>.
     */
    public Census_CASKS010DataRecord aggregate(Census_CASKS010DataRecord aCASKS010DataRecord) {
        Census_CASKS010DataRecord newCASKS010DataRecord = new Census_CASKS010DataRecord(
                aCASKS010DataRecord);
        newCASKS010DataRecord.malesAged16to74InEmployment += getMalesAged16to74InEmployment();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore();
        newCASKS010DataRecord.femalesAged16to74InEmployment += getFemalesAged16to74InEmployment();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore();
        return newCASKS010DataRecord;
    }

    /**
     * @return An aggregated <code>Census_CASKS010DataRecord</code> where:
     *         <code>RecordID = newRecordID</code>
     *         <code>Zone_Code = newZone_Code</code> For aggregating
     *         <code>CASKS010DataRecords</code>. User needs to take care in
     *         aggregating to ensure aggregation does not compromise (introduce
     *         error) based on the numbers used (i.e. numbers may not be precise
     *         or have sufficient magnitude).
     * @param aCASKS010DataRecord
     *            The <code>Census_CASKS010DataRecord</code> to be aggregated with
     *            <code>this</code>.
     * @param newRecordID
     *            The <code>RecordID</code> assigned to result.
     * @param newZone_Code
     *            The <code>Zone_Code</code> assigned to result.
     */
    public Census_CASKS010DataRecord aggregate(Census_CASKS010DataRecord aCASKS010DataRecord,
            long newRecordID, char[] newZone_Code) {
        Census_CASKS010DataRecord newCASKS010DataRecord = new Census_CASKS010DataRecord(this);
        newCASKS010DataRecord._RecordID = newRecordID;
        // newCASKS010DataRecord.Zone_Code = aCASKS010DataRecord.Zone_Code;
        int aZone_CodeID = 0;
        for (int Zone_CodeID = 0; Zone_CodeID < newZone_Code.length; Zone_CodeID++) {
            newCASKS010DataRecord.Zone_Code[Zone_CodeID] = newZone_Code[Zone_CodeID];
            aZone_CodeID = Zone_CodeID;
        }
        for (int Zone_CodeID = aZone_CodeID; Zone_CodeID < Zone_Code.length; Zone_CodeID++) {
            newCASKS010DataRecord.Zone_Code[Zone_CodeID] = ' ';
        }
        newCASKS010DataRecord.malesAged16to74InEmployment += getMalesAged16to74InEmployment();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48();
        newCASKS010DataRecord.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore += getMalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore();
        newCASKS010DataRecord.femalesAged16to74InEmployment += getFemalesAged16to74InEmployment();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48();
        newCASKS010DataRecord.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore += getFemalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore();
        return newCASKS010DataRecord;
    }

    /**
     * Returns the size of this CASKS010Record in bytes as a long. This does not
     * account for serialVersionUID. A boolean is assumed to be the same size as
     * an int in bytes.
     * @return 
     */
    @Override
    public long getSizeInBytes() {
        long result = super.getSizeInBytes();
        result += (14L * (long) Integer.SIZE) / getNumberOfBitsInByte();
        return result;
    }
}