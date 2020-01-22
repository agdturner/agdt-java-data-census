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
 * For storing a CASKS14c Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS14cRecord extends Census_AreaRecord {

    /**
     * For representing CAS KS14c Records and providing safe access to the data.
     *
     * Table KS014c National Statistics - Socio Economic Classification.
     * <ol>
     * <li>For long-term unemployed year last worked is 1999 or earlier.</li>
     * <li>In the NS-SeC classification, all full-time students are recorded in
     * the 'full-time students' category regardless of whether they are
     * economically active or not.</li>
     * <li>Not classifiable for other reasons' includes people whose occupation
     * has not been coded.</li>
     * </ol>
     */

    /**
     * KS014c0001 = femalesAged16to74
     */
    protected int femalesAged16to74;
    /**
     * KS014c0002 =
     * femalesAged16to74LargeEmployersAndHigherManagerialOccupations
     */
    protected int femalesAged16to74LargeEmployersAndHigherManagerialOccupations;
    /**
     * KS014c0003 = femalesAged16to74HigherProfessionalOccupations
     */
    protected int femalesAged16to74HigherProfessionalOccupations;
    /**
     * KS014c0004 =
     * femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate
     */
    protected int femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate;
    /**
     * KS014c0005 = femalesAged16to74IntermediateOccupations
     */
    protected int femalesAged16to74IntermediateOccupations;
    /**
     * KS014c0006 = femalesAged16to74SmallEmployersAndOwnAccountWorkers
     */
    protected int femalesAged16to74SmallEmployersAndOwnAccountWorkers;
    /**
     * KS014c0007 = femalesAged16to74LowerSupervisoryAndTechnicalOccupations
     */
    protected int femalesAged16to74LowerSupervisoryAndTechnicalOccupations;
    /**
     * KS014c014c = femalesAged16to74SemiRoutineOccupations
     */
    protected int femalesAged16to74SemiRoutineOccupations;
    /**
     * KS014c0009 = femalesAged16to74RoutineOccupations
     */
    protected int femalesAged16to74RoutineOccupations;
    /**
     * KS014c0010 = femalesAged16to74NeverWorked
     */
    protected int femalesAged16to74NeverWorked;
    /**
     * KS014c0011 = femalesAged16to74LongTermUnemployed
     */
    protected int femalesAged16to74LongTermUnemployed;
    /**
     * KS014c0012 = femalesAged16to74FullTimeStudents
     */
    protected int femalesAged16to74FullTimeStudents;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS14cRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS14cRecord(Census_RecordID rID, String line) {
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
        // From Table KS14c
        this.femalesAged16to74 = Math_Integer.parseInt(fields[1]);
        this.femalesAged16to74LargeEmployersAndHigherManagerialOccupations = Math_Integer.parseInt(fields[2]);
        this.femalesAged16to74HigherProfessionalOccupations = Math_Integer.parseInt(fields[3]);
        this.femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate = Math_Integer.parseInt(fields[4]);
        this.femalesAged16to74IntermediateOccupations = Math_Integer.parseInt(fields[5]);
        this.femalesAged16to74SmallEmployersAndOwnAccountWorkers = Math_Integer.parseInt(fields[6]);
        this.femalesAged16to74LowerSupervisoryAndTechnicalOccupations = Math_Integer.parseInt(fields[7]);
        this.femalesAged16to74SemiRoutineOccupations = Math_Integer.parseInt(fields[8]);
        this.femalesAged16to74RoutineOccupations = Math_Integer.parseInt(fields[9]);
        this.femalesAged16to74NeverWorked = Math_Integer.parseInt(fields[10]);
        this.femalesAged16to74LongTermUnemployed = Math_Integer.parseInt(fields[11]);
        this.femalesAged16to74FullTimeStudents = Math_Integer.parseInt(fields[12]);
        // this.femalesAged16to74NotClassifiableForOtherReasons =
        // Math_Integer.parseInt( fields[ 13 ] );
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", femalesAged16to74=" + femalesAged16to74 
                + ", femalesAged16to74LargeEmployersAndHigherManagerialOccupations=" + femalesAged16to74LargeEmployersAndHigherManagerialOccupations 
                + ", femalesAged16to74HigherProfessionalOccupations=" + femalesAged16to74HigherProfessionalOccupations 
                + ", femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate=" + femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate
                + ", femalesAged16to74IntermediateOccupations=" + femalesAged16to74IntermediateOccupations 
                + ", femalesAged16to74SmallEmployersAndOwnAccountWorkers=" + femalesAged16to74SmallEmployersAndOwnAccountWorkers
                + ", femalesAged16to74LowerSupervisoryAndTechnicalOccupations" + femalesAged16to74LowerSupervisoryAndTechnicalOccupations 
                + ", femalesAged16to74SemiRoutineOccupations=" + femalesAged16to74SemiRoutineOccupations 
                + ", femalesAged16to74RoutineOccupations=" + femalesAged16to74RoutineOccupations 
                + ", femalesAged16to74NeverWorked=" + femalesAged16to74NeverWorked 
                + ", femalesAged16to74LongTermUnemployed=" + femalesAged16to74LongTermUnemployed 
                + ", femalesAged16to74FullTimeStudents=" + femalesAged16to74FullTimeStudents;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + femalesAged16to74 + "," 
                + femalesAged16to74LargeEmployersAndHigherManagerialOccupations + "," 
                + femalesAged16to74HigherProfessionalOccupations + "," 
                + femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate + "," 
                + femalesAged16to74IntermediateOccupations + "," 
                + femalesAged16to74SmallEmployersAndOwnAccountWorkers + "," 
                + femalesAged16to74LowerSupervisoryAndTechnicalOccupations + "," 
                + femalesAged16to74SemiRoutineOccupations + ","
                + femalesAged16to74RoutineOccupations + "," 
                + femalesAged16to74NeverWorked + ","
                + femalesAged16to74LongTermUnemployed + "," 
                + femalesAged16to74FullTimeStudents;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",femalesAged16to74" 
                + ",femalesAged16to74LargeEmployersAndHigherManagerialOccupations" 
                + ",femalesAged16to74HigherProfessionalOccupations" 
                + ",femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate" 
                + ",femalesAged16to74IntermediateOccupations" 
                + ",femalesAged16to74SmallEmployersAndOwnAccountWorkers"
                + ",femalesAged16to74LowerSupervisoryAndTechnicalOccupations"
                + ",femalesAged16to74SemiRoutineOccupations"
                + ",femalesAged16to74RoutineOccupations"
                + ",femalesAged16to74NeverWorked" 
                + ",femalesAged16to74LongTermUnemployed" 
                + ",femalesAged16to74FullTimeStudents";
    }

    /**
     * Returns a copy of this.femalesAged16to74
     *
     * @return
     */
    public int getFemalesAged16to74() {
        return this.femalesAged16to74;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74LargeEmployersAndHigherManagerialOccupations
     *
     * @return
     */
    public int getFemalesAged16to74LargeEmployersAndHigherManagerialOccupations() {
        return this.femalesAged16to74LargeEmployersAndHigherManagerialOccupations;
    }

    /**
     * Returns a copy of this.femalesAged16to74HigherProfessionalOccupations
     *
     * @return
     */
    public int getFemalesAged16to74HigherProfessionalOccupations() {
        return this.femalesAged16to74HigherProfessionalOccupations;
    }

    /**
     * Returns a copy of this.
     * femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate
     *
     * @return
     */
    public int getFemalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate() {
        return this.femalesAged16to74LowerManagerialAndProfessionalOccupationsIntermediate;
    }

    /**
     * Returns a copy of this.femalesAged16to74IntermediateOccupations
     *
     * @return
     */
    public int getFemalesAged16to74IntermediateOccupations() {
        return this.femalesAged16to74IntermediateOccupations;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74SmallEmployersAndOwnAccountWorkers
     *
     * @return
     */
    public int getFemalesAged16to74SmallEmployersAndOwnAccountWorkers() {
        return this.femalesAged16to74SmallEmployersAndOwnAccountWorkers;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74LowerSupervisoryAndTechnicalOccupations
     *
     * @return
     */
    public int getFemalesAged16to74LowerSupervisoryAndTechnicalOccupations() {
        return this.femalesAged16to74LowerSupervisoryAndTechnicalOccupations;
    }

    /**
     * Returns a copy of this.femalesAged16to74SemiRoutineOccupations
     *
     * @return
     */
    public int getFemalesAged16to74SemiRoutineOccupations() {
        return this.femalesAged16to74SemiRoutineOccupations;
    }

    /**
     * Returns a copy of this.femalesAged16to74RoutineOccupations
     *
     * @return
     */
    public int getFemalesAged16to74RoutineOccupations() {
        return this.femalesAged16to74RoutineOccupations;
    }

    /**
     * Returns a copy of this.femalesAged16to74NeverWorked
     *
     * @return
     */
    public int getFemalesAged16to74NeverWorked() {
        return this.femalesAged16to74NeverWorked;
    }

    /**
     * Returns a copy of this.femalesAged16to74LongTermUnemployed
     *
     * @return
     */
    public int getFemalesAged16to74LongTermUnemployed() {
        return this.femalesAged16to74LongTermUnemployed;
    }

    /**
     * Returns a copy of this.femalesAged16to74FullTimeStudents
     *
     * @return
     */
    public int getFemalesAged16to74FullTimeStudents() {
        return this.femalesAged16to74FullTimeStudents;
    }
}
