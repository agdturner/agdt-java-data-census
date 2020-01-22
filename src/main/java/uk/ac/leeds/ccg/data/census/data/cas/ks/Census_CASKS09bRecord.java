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
 * For storing a CASKS09b Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS09bRecord extends Census_AreaRecord {

    /*
     * Table KS009b Economic activity - males: All males aged 16-74 Footnotes
     * and Comments for Table KS009c 1. For the Census, part-time is defined as
     * working 30 hours or less a week. Full-time is defined as working 31 or
     * more hours a week. 2. 'Long-term unemployed' are those who stated that
     * they have not worked since 1999 or earlier.
     */
    /**
     * KS009b0001 = malesAged16to74
     */
    protected int malesAged16to74;
    /**
     * KS009b0002 = malesAged16to74EconomicallyActiveEmployeesPartTime
     */
    protected int malesAged16to74EconomicallyActiveEmployeesPartTime;
    /**
     * KS009b0003 = malesAged16to74EconomicallyActiveEmployeesFullTime
     */
    protected int malesAged16to74EconomicallyActiveEmployeesFullTime;
    /**
     * KS009b0004 = malesAged16to74EconomicallyActiveSelfEmployed
     */
    protected int malesAged16to74EconomicallyActiveSelfEmployed;
    /**
     * KS009b0005 = malesAged16to74EconomicallyActiveUnemployed
     */
    protected int malesAged16to74EconomicallyActiveUnemployed;
    /**
     * KS009b0006 = malesAged16to74EconomicallyActiveFullTimeStudent
     */
    protected int malesAged16to74EconomicallyActiveFullTimeStudent;
    /**
     * KS009b0007 = malesAged16to74EconomicallyInactiveRetired
     */
    protected int malesAged16to74EconomicallyInactiveRetired;
    /**
     * KS009b009b = malesAged16to74EconomicallyInactiveStudent
     */
    protected int malesAged16to74EconomicallyInactiveStudent;
    /**
     * KS009b0009 = malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily
     */
    protected int malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily;
    /**
     * KS009b0010 = malesAged16to74EconomicallyInactivePermanentlySickOrDisabled
     */
    protected int malesAged16to74EconomicallyInactivePermanentlySickOrDisabled;
    /**
     * KS009b0011 = malesAged16to74EconomicallyInactiveOther
     */
    protected int malesAged16to74EconomicallyInactiveOther;
    /**
     * KS009b0012 = malesAged16to24Unemployed
     */
    protected int malesAged16to24Unemployed;
    /**
     * KS009b0013 = malesAged50AndOverUnemployed
     */
    protected int malesAged50AndOverUnemployed;
    /**
     * KS009b0014 = malesAged16to74UnemployedWhoHaveNeverWorked
     */
    protected int malesAged16to74UnemployedWhoHaveNeverWorked;
    /**
     * KS009b0015 = malesAged16to74WhoAreLongTermUnemployed
     */
    protected int malesAged16to74WhoAreLongTermUnemployed;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS09bRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS09bRecord(Census_RecordID rID, String line) {
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
        // From Table KS09b
        this.malesAged16to74 = Math_Integer.parseInt(fields[1]);
        this.malesAged16to74EconomicallyActiveEmployeesPartTime = Math_Integer.parseInt(fields[2]);
        this.malesAged16to74EconomicallyActiveEmployeesFullTime = Math_Integer.parseInt(fields[3]);
        this.malesAged16to74EconomicallyActiveSelfEmployed = Math_Integer.parseInt(fields[4]);
        this.malesAged16to74EconomicallyActiveUnemployed = Math_Integer.parseInt(fields[5]);
        this.malesAged16to74EconomicallyInactiveRetired = Math_Integer.parseInt(fields[6]);
        this.malesAged16to74EconomicallyActiveFullTimeStudent = Math_Integer.parseInt(fields[7]);
        this.malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily = Math_Integer.parseInt(fields[8]);
        this.malesAged16to74EconomicallyInactivePermanentlySickOrDisabled = Math_Integer.parseInt(fields[9]);
        this.malesAged16to74EconomicallyInactiveOther = Math_Integer.parseInt(fields[10]);
        this.malesAged16to24Unemployed = Math_Integer.parseInt(fields[11]);
        this.malesAged50AndOverUnemployed = Math_Integer.parseInt(fields[12]);
        this.malesAged16to74UnemployedWhoHaveNeverWorked = Math_Integer.parseInt(fields[13]);
        this.malesAged16to74WhoAreLongTermUnemployed = Math_Integer.parseInt(fields[14]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", malesAged16to74=" + malesAged16to74 
                + ", malesAged16to74EconomicallyActiveEmployeesPartTime=" + malesAged16to74EconomicallyActiveEmployeesPartTime 
                + ", malesAged16to74EconomicallyActiveEmployeesFullTime=" + malesAged16to74EconomicallyActiveEmployeesFullTime 
                + ", malesAged16to74EconomicallyActiveSelfEmployed=" + malesAged16to74EconomicallyActiveSelfEmployed 
                + ", malesAged16to74EconomicallyActiveUnemployed=" + malesAged16to74EconomicallyActiveUnemployed 
                + ", malesAged16to74EconomicallyInactiveRetired=" + malesAged16to74EconomicallyInactiveRetired 
                + ", malesAged16to74EconomicallyActiveFullTimeStudent" + malesAged16to74EconomicallyActiveFullTimeStudent 
                + ", malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily=" + malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily 
                + ", malesAged16to74EconomicallyInactivePermanentlySickOrDisabled=" + malesAged16to74EconomicallyInactivePermanentlySickOrDisabled 
                + ", malesAged16to74EconomicallyInactiveOther=" + malesAged16to74EconomicallyInactiveOther 
                + ", malesAged16to24Unemployed=" + malesAged16to24Unemployed
                + ", malesAged50AndOverUnemployed=" + malesAged50AndOverUnemployed
                + ", malesAged16to74UnemployedWhoHaveNeverWorked=" + malesAged16to74UnemployedWhoHaveNeverWorked
                + ", malesAged16to74WhoAreLongTermUnemployed=" + malesAged16to74WhoAreLongTermUnemployed;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + malesAged16to74 + "," 
                + malesAged16to74EconomicallyActiveEmployeesPartTime + "," 
                + malesAged16to74EconomicallyActiveEmployeesFullTime + "," 
                + malesAged16to74EconomicallyActiveSelfEmployed + "," 
                + malesAged16to74EconomicallyActiveUnemployed + "," 
                + malesAged16to74EconomicallyInactiveRetired + "," 
                + malesAged16to74EconomicallyActiveFullTimeStudent + "," 
                + malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily + "," 
                + malesAged16to74EconomicallyInactivePermanentlySickOrDisabled + "," 
                + malesAged16to74EconomicallyInactiveOther + "," 
                + malesAged16to24Unemployed + "," 
                + malesAged50AndOverUnemployed + "," 
                + malesAged16to74UnemployedWhoHaveNeverWorked + "," 
                + malesAged16to74WhoAreLongTermUnemployed;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",malesAged16to74" 
                + ",malesAged16to74EconomicallyActiveEmployeesPartTime"
                + ",malesAged16to74EconomicallyActiveEmployeesFullTime"
                + ",malesAged16to74EconomicallyActiveSelfEmployed"
                + ",malesAged16to74EconomicallyActiveUnemployed"
                + ",malesAged16to74EconomicallyInactiveRetired"
                + ",malesAged16to74EconomicallyActiveFullTimeStudent"
                + ",malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily"
                + ",malesAged16to74EconomicallyInactivePermanentlySickOrDisabled"
                + ",malesAged16to74EconomicallyInactiveOther" 
                + ",malesAged16to24Unemployed" 
                + ",malesAged50AndOverUnemployed" 
                + ",malesAged16to74UnemployedWhoHaveNeverWorked" 
                + ",malesAged16to74WhoAreLongTermUnemployed";
    }

    /**
     * Returns a copy of this.malesAged16to74
     * @return 
     */
    public int getMalesAged16to74() {
        return this.malesAged16to74;
    }

    /**
     * Returns a copy of this.malesAged16to74EconomicallyActiveEmployeesPartTime
     * @return 
     */
    public int getMalesAged16to74EconomicallyActiveEmployeesPartTime() {
        return this.malesAged16to74EconomicallyActiveEmployeesPartTime;
    }

    /**
     * Returns a copy of this.malesAged16to74EconomicallyActiveEmployeesFullTime
     * @return 
     */
    public int getMalesAged16to74EconomicallyActiveEmployeesFullTime() {
        return this.malesAged16to74EconomicallyActiveEmployeesFullTime;
    }

    /**
     * Returns a copy of this.malesAged16to74EconomicallyActiveSelfEmployed
     * @return 
     */
    public int getMalesAged16to74EconomicallyActiveSelfEmployed() {
        return this.malesAged16to74EconomicallyActiveSelfEmployed;
    }

    /**
     * Returns a copy of this.malesAged16to74EconomicallyActiveUnemployed
     * @return 
     */
    public int getMalesAged16to74EconomicallyActiveUnemployed() {
        return this.malesAged16to74EconomicallyActiveUnemployed;
    }

    /**
     * Returns a copy of this.malesAged16to74EconomicallyInactiveRetired
     * @return 
     */
    public int getMalesAged16to74EconomicallyInactiveRetired() {
        return this.malesAged16to74EconomicallyInactiveRetired;
    }

    /**
     * Returns a copy of this.malesAged16to74EconomicallyActiveFullTimeStudent
     * @return 
     */
    public int getMalesAged16to74EconomicallyActiveFullTimeStudent() {
        return this.malesAged16to74EconomicallyActiveFullTimeStudent;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily
     * @return 
     */
    public int getMalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily() {
        return this.malesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74EconomicallyInactivePermanentlySickOrDisabled
     * @return 
     */
    public int getMalesAged16to74EconomicallyInactivePermanentlySickOrDisabled() {
        return this.malesAged16to74EconomicallyInactivePermanentlySickOrDisabled;
    }

    /**
     * Returns a copy of this.malesAged16to74EconomicallyInactiveOther
     * @return 
     */
    public int getMalesAged16to74EconomicallyInactiveOther() {
        return this.malesAged16to74EconomicallyInactiveOther;
    }

    /**
     * Returns a copy of this.malesAged16to24Unemployed
     * @return 
     */
    public int getMalesAged16to24Unemployed() {
        return this.malesAged16to24Unemployed;
    }

    /**
     * Returns a copy of this.malesAged50AndOverUnemployed
     * @return 
     */
    public int getMalesAged50AndOverUnemployed() {
        return this.malesAged50AndOverUnemployed;
    }

    /**
     * Returns a copy of this.malesAged16to74UnemployedWhoHaveNeverWorked
     * @return 
     */
    public int getMalesAged16to74UnemployedWhoHaveNeverWorked() {
        return this.malesAged16to74UnemployedWhoHaveNeverWorked;
    }

    /**
     * Returns a copy of this.malesAged16to74WhoAreLongTermUnemployed
     * @return 
     */
    public int getMalesAged16to74WhoAreLongTermUnemployed() {
        return this.malesAged16to74WhoAreLongTermUnemployed;
    }
}
