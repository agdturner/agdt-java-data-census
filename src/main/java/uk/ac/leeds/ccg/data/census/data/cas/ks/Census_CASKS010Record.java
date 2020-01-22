/*
 * Copyright 2019 Centre for Computational Geography, University of Leeds.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.ac.leeds.ccg.data.census.data.cas.ks;

import uk.ac.leeds.ccg.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.data.census.data.id.Census_RecordID;
import uk.ac.leeds.ccg.math.Math_Integer;

/**
 * For storing a CASKS010 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS010Record extends Census_AreaRecord {

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

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS010Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS010Record(Census_RecordID rID, String line) {
        super(rID);
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
        zoneCode = fields[0].substring(1, 11);
        // From Table KS010
        this.malesAged16to74InEmployment = Math_Integer.parseInt(fields[1]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = Math_Integer.parseInt(fields[2]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = Math_Integer.parseInt(fields[3]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = Math_Integer.parseInt(fields[4]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = Math_Integer.parseInt(fields[5]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = Math_Integer.parseInt(fields[6]);
        this.malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = Math_Integer.parseInt(fields[7]);
        this.femalesAged16to74InEmployment = Math_Integer.parseInt(fields[8]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 = Math_Integer.parseInt(fields[9]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 = Math_Integer.parseInt(fields[10]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 = Math_Integer.parseInt(fields[11]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 = Math_Integer.parseInt(fields[12]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 = Math_Integer.parseInt(fields[13]);
        this.femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore = Math_Integer.parseInt(fields[14]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() 
                + ", malesAged16to74InEmployment=" + malesAged16to74InEmployment 
                + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5=" + malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 
                + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15=" + malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 
                + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30=" + malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30
                + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37=" + malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 
                + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48=" + malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48
                + ", malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore=" + malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore 
                + ", femalesAged16to74InEmployment=" + femalesAged16to74InEmployment
                + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5=" + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 
                + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15=" + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15
                + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30=" + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30
                + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37=" + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37
                + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48=" + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48
                + ", femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore=" + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + malesAged16to74InEmployment + "," 
                + malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 + "," 
                + malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 + ","
                + malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 + "," 
                + malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 + ","
                + malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 + ","
                + malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore + "," 
                + femalesAged16to74InEmployment + ","
                + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5 + "," 
                + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15 + ","
                + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30 + ","
                + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37 + ","
                + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48 + ","
                + femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",malesAged16to74InEmployment" 
                + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5"
                + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15"
                + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30"
                + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37"
                + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48" 
                + ",malesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore"
                + ",femalesAged16to74InEmployment"
                + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime1to5"
                + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime6to15" 
                + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime16to30" 
                + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime31to37" 
                + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime38to48" 
                + ",femalesAged16to74InEmploymentWorkingHoursAWeekPartTime49OrMore";
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
}
