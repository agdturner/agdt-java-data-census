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
 * For storing a CASKS09c Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS09cRecord extends Census_AreaRecord {

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

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS09cRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS09cRecord(Census_RecordID rID, String line) {
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
        // From Table KS09c
        this.femalesAged16to74 = Math_Integer.parseInt(fields[1]);
        this.femalesAged16to74EconomicallyActiveEmployeesPartTime = Math_Integer.parseInt(fields[2]);
        this.femalesAged16to74EconomicallyActiveEmployeesFullTime = Math_Integer.parseInt(fields[3]);
        this.femalesAged16to74EconomicallyActiveSelfEmployed = Math_Integer.parseInt(fields[4]);
        this.femalesAged16to74EconomicallyActiveUnemployed = Math_Integer.parseInt(fields[5]);
        this.femalesAged16to74EconomicallyInactiveRetired = Math_Integer.parseInt(fields[6]);
        this.femalesAged16to74EconomicallyActiveFullTimeStudent = Math_Integer.parseInt(fields[7]);
        this.femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily = Math_Integer.parseInt(fields[8]);
        this.femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled = Math_Integer.parseInt(fields[9]);
        this.femalesAged16to74EconomicallyInactiveOther = Math_Integer.parseInt(fields[10]);
        this.femalesAged16to24Unemployed = Math_Integer.parseInt(fields[11]);
        this.femalesAged50AndOverUnemployed = Math_Integer.parseInt(fields[12]);
        this.femalesAged16to74UnemployedWhoHaveNeverWorked = Math_Integer.parseInt(fields[13]);
        this.femalesAged16to74WhoAreLongTermUnemployed = Math_Integer.parseInt(fields[14]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() +
                ", femalesAged16to74=" + femalesAged16to74 +
                ", femalesAged16to74EconomicallyActiveEmployeesPartTime=" + femalesAged16to74EconomicallyActiveEmployeesPartTime +
                ", femalesAged16to74EconomicallyActiveEmployeesFullTime=" + femalesAged16to74EconomicallyActiveEmployeesFullTime +
                ", femalesAged16to74EconomicallyActiveSelfEmployed=" + femalesAged16to74EconomicallyActiveSelfEmployed +
                ", femalesAged16to74EconomicallyActiveUnemployed=" + femalesAged16to74EconomicallyActiveUnemployed +
                ", femalesAged16to74EconomicallyInactiveRetired=" + femalesAged16to74EconomicallyInactiveRetired +
                ", femalesAged16to74EconomicallyActiveFullTimeStudent" + femalesAged16to74EconomicallyActiveFullTimeStudent +
                ", femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily=" + femalesAged16to74EconomicallyInactiveLookingAfterHomeOrFamily +
                ", femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled=" + femalesAged16to74EconomicallyInactivePermanentlySickOrDisabled +
                ", femalesAged16to74EconomicallyInactiveOther=" + femalesAged16to74EconomicallyInactiveOther +
                ", femalesAged16to24Unemployed=" + femalesAged16to24Unemployed +
                ", femalesAged50AndOverUnemployed=" + femalesAged50AndOverUnemployed +
                ", femalesAged16to74UnemployedWhoHaveNeverWorked=" + femalesAged16to74UnemployedWhoHaveNeverWorked +
                ", femalesAged16to74WhoAreLongTermUnemployed=" + femalesAged16to74WhoAreLongTermUnemployed;
    }

   /**
     * @return A String representation of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + femalesAged16to74 + "," +
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
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",femalesAged16to74" +
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
}
