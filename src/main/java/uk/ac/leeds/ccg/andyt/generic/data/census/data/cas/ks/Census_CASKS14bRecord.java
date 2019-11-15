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
package uk.ac.leeds.ccg.andyt.generic.data.census.data.cas.ks;

import uk.ac.leeds.ccg.andyt.generic.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_RecordID;
import uk.ac.leeds.ccg.andyt.math.Math_Integer;

/**
 * For storing a CASKS14b Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS14bRecord extends Census_AreaRecord {

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

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS14bRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS14bRecord(Census_RecordID rID, String line) {
        super(rID);
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
        zoneCode = fields[0].substring(1, 11);
        // From Table KS14b
        this.malesAged16to74 = Math_Integer.parseInt(fields[1]);
        this.malesAged16to74LargeEmployersAndHigherManagerialOccupations = Math_Integer.parseInt(fields[2]);
        this.malesAged16to74HigherProfessionalOccupations = Math_Integer.parseInt(fields[3]);
        this.malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate = Math_Integer.parseInt(fields[4]);
        this.malesAged16to74IntermediateOccupations = Math_Integer.parseInt(fields[5]);
        this.malesAged16to74SmallEmployersAndOwnAccountWorkers = Math_Integer.parseInt(fields[6]);
        this.malesAged16to74LowerSupervisoryAndTechnicalOccupations = Math_Integer.parseInt(fields[7]);
        this.malesAged16to74SemiRoutineOccupations = Math_Integer.parseInt(fields[8]);
        this.malesAged16to74RoutineOccupations = Math_Integer.parseInt(fields[9]);
        this.malesAged16to74NeverWorked = Math_Integer.parseInt(fields[10]);
        this.malesAged16to74LongTermUnemployed = Math_Integer.parseInt(fields[11]);
        this.malesAged16to74FullTimeStudents = Math_Integer.parseInt(fields[12]);
    }

    /**
     * @return a string description of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", malesAged16to74 " + malesAged16to74 + ", malesAged16to74LargeEmployersAndHigherManagerialOccupations " + malesAged16to74LargeEmployersAndHigherManagerialOccupations + ", malesAged16to74HigherProfessionalOccupations " + malesAged16to74HigherProfessionalOccupations + ", malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate " + malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate + ", malesAged16to74IntermediateOccupations " + malesAged16to74IntermediateOccupations + ", malesAged16to74SmallEmployersAndOwnAccountWorkers " + malesAged16to74SmallEmployersAndOwnAccountWorkers + ", malesAged16to74LowerSupervisoryAndTechnicalOccupations" + malesAged16to74LowerSupervisoryAndTechnicalOccupations + ", malesAged16to74SemiRoutineOccupations " + malesAged16to74SemiRoutineOccupations + ", malesAged16to74RoutineOccupations " + malesAged16to74RoutineOccupations + ", malesAged16to74NeverWorked " + malesAged16to74NeverWorked + ", malesAged16to74LongTermUnemployed " + malesAged16to74LongTermUnemployed + ", malesAged16to74FullTimeStudents " + malesAged16to74FullTimeStudents;
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + malesAged16to74 + "," 
                + malesAged16to74LargeEmployersAndHigherManagerialOccupations + ","
                + malesAged16to74HigherProfessionalOccupations + ","
                + malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate + "," 
                + malesAged16to74IntermediateOccupations + ","
                + malesAged16to74SmallEmployersAndOwnAccountWorkers + ","
                + malesAged16to74LowerSupervisoryAndTechnicalOccupations + ","
                + malesAged16to74SemiRoutineOccupations + "," 
                + malesAged16to74RoutineOccupations + "," 
                + malesAged16to74NeverWorked + ","
                + malesAged16to74LongTermUnemployed + "," 
                + malesAged16to74FullTimeStudents;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",malesAged16to74"
                + ",malesAged16to74LargeEmployersAndHigherManagerialOccupations" 
                + ",malesAged16to74HigherProfessionalOccupations" 
                + ",malesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate"
                + ",malesAged16to74IntermediateOccupations" 
                + ",malesAged16to74SmallEmployersAndOwnAccountWorkers"
                + ",malesAged16to74LowerSupervisoryAndTechnicalOccupations" 
                + ",malesAged16to74SemiRoutineOccupations" 
                + ",malesAged16to74RoutineOccupations" 
                + ",malesAged16to74NeverWorked" 
                + ",malesAged16to74LongTermUnemployed" 
                + ",malesAged16to74FullTimeStudents";
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
}
