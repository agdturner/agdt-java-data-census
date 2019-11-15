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
 * For storing a CASKS013 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS013Record extends Census_AreaRecord {

    /**
     * Table KS013 Qualifications and students: All people aged 16-74 NB: This
     * table contains counts of Persons Footnotes and Comments for Table KS013
     * for England and Wales 1 1+ 'O' level passes, 1+ CSE/GCSE any grades, NVQ
     * level 1, Foundation GNVQ. 2 5+ 'O' level passes, 5+ CSEs (grade 1), 5+
     * GCSEs (grades A-C), School Certificate, 1+ 'A' levels/'AS' levels, NVQ
     * level 2, Intermediate GNVQ. 3 2+ 'A' levels, 4+ 'AS' levels, Higher
     * School Certificate, NVQ level 3, Advanced GNVQ. 4 First degree, Higher
     * degree, NVQ levels 4 and 5, HNC, HND, Qualified Teacher Status, Qualified
     * Medical Doctor, Qualified Dentist, Qualified Nurse, Midwife, Heath
     * Visitor. Footnotes and Comments for Table KS013 for Scotland 1 Highest
     * level of Qualification is defined as: Group 1: 'O' Grade, Standard Grade,
     * Intermediate 1, Intermediate 2, City and Guilds Craft, SVQ level 1 or 2,
     * or equivalent. Group 2: Higher Grade, CSYS, ONC, OND, City and Guilds
     * Advanced Craft, RSA Advanced Diploma, SVQ level 3 or equivalent. Group 3:
     * HND, HNC, RSA Higher Diploma, SVQ level 4 or 5, or equivalent. Group 4:
     * First degree, Higher Degree, Professional Qualification. CDU Note Users
     * should note that there is a slight difference between the Key Statistics
     * data available at Census Area Statistics Postcode Sector (CASPCS) level
     * available from Casweb, and that available in percentage form from GROS,
     * via SuperTABLE CD, or from the SCROL website. In all available versions
     * of the Scottish Standard Tables and Census Area Statistics, the GROS
     * Output Area to Higher Area Index, AND THE VERSION OF THE KEY STATISTICS
     * AVAILABLE FROM CASWEB, output area 60QP002440 is assigned to CASPCS QPC23
     * (postcode sector EH14 4). In the version of the Key Statistics available
     * from GROS via SuperTABLE CD, or from the SCROL website, output area
     * 60QP002440 is assigned to CASPCS QPC24 (postcode sector EH14 5). The CDU
     * are awaiting further information from GROS about the assignment of output
     * area 60QP002440. Footnotes and Comments for Table KS013 for Northern
     * Ireland 1 GCSE (grades D-G), CSE (grades 2-5), 1-4 CSEs (grade 1), 1-4
     * GCSEs (grades A-C), 1-4 'O' level passes, NVQ level 1, GNVQ Foundation or
     * equivalents. 2 5+ CSEs (grade 1), 5+ GCSEs (grades A-C), 5+ 'O' level
     * passes, Senior Certificate, 1 'A' level, 1-3 AS levels, Advanced Senior
     * Certificate, NVQ level 2, GNVQ Intermediate or equivalents. 3 2+ 'A'
     * levels, 4+ AS levels, NVQ level 3, GNVQ Advanced or equivalents. 4 First
     * degree, NVQ level 4, HNC, HND or equivalents. 5 Higher degree, NVQ level
     * 5 or equivalents. 6 All students and schoolchildren are counted at their
     * term-time address.
     */
    protected int allPeopleAged16to74;
    protected int peopleAged16to74WithNoQualifications;
    protected int peopleAged16to74WithHighestQualificationAttainedLevel1;
    protected int peopleAged16to74WithHighestQualificationAttainedLevel2;
    protected int peopleAged16to74WithHighestQualificationAttainedLevel3;
    protected int peopleAged16to74WithHighestQualificationAttainedLevel4and5;
    // protected int peopleAged16to74WithOtherQualificationsLevelUnknown;
    protected int fullTimeStudentsAndSchoolchildrenAged16to17;
    protected int fullTimeStudentsAndSchoolchildrenAged18to74;
    protected int fullTimeStudentsAged18to74EconomicallyActiveInEmployment;
    protected int fullTimeStudentsAged18to74EconomicallyActiveUnemployed;
    protected int fullTimeStudentsAged18to74EconomicallyInactive;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS013Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     * @param country Expecting "Scotland" or "Northern Ireland" or defaulting
     * to anything else.
     */
    public Census_CASKS013Record(Census_RecordID rID, String line, String country) {
        super(rID);
        if (country.equalsIgnoreCase("Scotland")) {
            String[] fieldsDummy = line.split(",");
            String[] fields = new String[12];
            for (int i = 0; i < fields.length; i++) {
                fields[i] = "";
            }
            System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
            zoneCode = fields[0].substring(1, 11);
            // From Table KS013
            this.allPeopleAged16to74 = Math_Integer.parseInt(fields[1]);
            this.peopleAged16to74WithNoQualifications = Math_Integer.parseInt(fields[2]);
            this.peopleAged16to74WithHighestQualificationAttainedLevel1 = Math_Integer.parseInt(fields[3]);
            this.peopleAged16to74WithHighestQualificationAttainedLevel2 = Math_Integer.parseInt(fields[4]);
            this.peopleAged16to74WithHighestQualificationAttainedLevel3 = Math_Integer.parseInt(fields[5]);
            this.peopleAged16to74WithHighestQualificationAttainedLevel4and5 = Math_Integer.parseInt(fields[6]);
            // this.peopleAged16to74WithOtherQualificationsLevelUnknown =
            // Math_Integer.parseInt( fields[ 7 ] );
            this.fullTimeStudentsAndSchoolchildrenAged16to17 = Math_Integer.parseInt(fields[7]);
            this.fullTimeStudentsAndSchoolchildrenAged18to74 = Math_Integer.parseInt(fields[8]);
            this.fullTimeStudentsAged18to74EconomicallyActiveInEmployment = Math_Integer.parseInt(fields[9]);
            this.fullTimeStudentsAged18to74EconomicallyActiveUnemployed = Math_Integer.parseInt(fields[10]);
            this.fullTimeStudentsAged18to74EconomicallyInactive = Math_Integer.parseInt(fields[11]);
        } else {
            if (country.equalsIgnoreCase("Northern Ireland")) {
                String[] fieldsDummy = line.split(",");
                String[] fields = new String[13];
                for (int i = 0; i < fields.length; i++) {
                    fields[i] = "";
                }
                System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
                zoneCode = fields[0].substring(1, 11);
                // From Table KS013
                this.allPeopleAged16to74 = Math_Integer.parseInt(fields[1]);
                this.peopleAged16to74WithNoQualifications = Math_Integer.parseInt(fields[2]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel1 = Math_Integer.parseInt(fields[3]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel2 = Math_Integer.parseInt(fields[4]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel3 = Math_Integer.parseInt(fields[5]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel4and5 = Math_Integer.parseInt(fields[6]) + Math_Integer.parseInt(fields[7]);
                this.fullTimeStudentsAndSchoolchildrenAged16to17 = Math_Integer.parseInt(fields[8]);
                this.fullTimeStudentsAndSchoolchildrenAged18to74 = Math_Integer.parseInt(fields[9]);
                this.fullTimeStudentsAged18to74EconomicallyActiveInEmployment = Math_Integer.parseInt(fields[10]);
                this.fullTimeStudentsAged18to74EconomicallyActiveUnemployed = Math_Integer.parseInt(fields[11]);
                this.fullTimeStudentsAged18to74EconomicallyInactive = Math_Integer.parseInt(fields[12]);
            } else {
                String[] fieldsDummy = line.split(",");
                String[] fields = new String[12];
                for (int i = 0; i < fields.length; i++) {
                    fields[i] = "";
                }
                System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
                zoneCode = fields[0].substring(1, 11);
                // From Table KS013
                this.allPeopleAged16to74 = Math_Integer.parseInt(fields[1]);
                this.peopleAged16to74WithNoQualifications = Math_Integer.parseInt(fields[2]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel1 = Math_Integer.parseInt(fields[3]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel2 = Math_Integer.parseInt(fields[4]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel3 = Math_Integer.parseInt(fields[5]);
                this.peopleAged16to74WithHighestQualificationAttainedLevel4and5 = Math_Integer.parseInt(fields[6]);
                // this.peopleAged16to74WithOtherQualificationsLevelUnknown =
                // Math_Integer.parseInt( fields[ 7 ] );
                this.fullTimeStudentsAndSchoolchildrenAged16to17 = Math_Integer.parseInt(fields[7]);
                this.fullTimeStudentsAndSchoolchildrenAged18to74 = Math_Integer.parseInt(fields[8]);
                this.fullTimeStudentsAged18to74EconomicallyActiveInEmployment = Math_Integer.parseInt(fields[9]);
                this.fullTimeStudentsAged18to74EconomicallyActiveUnemployed = Math_Integer.parseInt(fields[10]);
                this.fullTimeStudentsAged18to74EconomicallyInactive = Math_Integer.parseInt(fields[11]);
            }
        }
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ",allPeopleAged16to74=" + allPeopleAged16to74
                + ",peopleAged16to74WithNoQualifications=" + peopleAged16to74WithNoQualifications
                + ",peopleAged16to74WithHighestQualificationAttainedLevel1=" + peopleAged16to74WithHighestQualificationAttainedLevel1
                + ",peopleAged16to74WithHighestQualificationAttainedLevel2=" + peopleAged16to74WithHighestQualificationAttainedLevel2
                + ",peopleAged16to74WithHighestQualificationAttainedLevel3=" + peopleAged16to74WithHighestQualificationAttainedLevel3
                + ",peopleAged16to74WithHighestQualificationAttainedLevel4and5=" + peopleAged16to74WithHighestQualificationAttainedLevel4and5
                + // ",peopleAged16to74WithOtherQualificationsLevelUnknown=" + peopleAged16to74WithOtherQualificationsLevelUnknown +
                ",fullTimeStudentsAndSchoolchildrenAged16to17=" + fullTimeStudentsAndSchoolchildrenAged16to17
                + ",fullTimeStudentsAndSchoolchildrenAged18to74=" + fullTimeStudentsAndSchoolchildrenAged18to74
                + ",fullTimeStudentsAged18to74EconomicallyActiveInEmployment=" + fullTimeStudentsAged18to74EconomicallyActiveInEmployment
                + ",fullTimeStudentsAged18to74EconomicallyActiveUnemployed=" + fullTimeStudentsAged18to74EconomicallyActiveUnemployed
                + ",fullTimeStudentsAged18to74EconomicallyInactive=" + fullTimeStudentsAged18to74EconomicallyInactive;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + allPeopleAged16to74 + ","
                + peopleAged16to74WithNoQualifications + ","
                + peopleAged16to74WithHighestQualificationAttainedLevel1 + ","
                + peopleAged16to74WithHighestQualificationAttainedLevel2 + ","
                + peopleAged16to74WithHighestQualificationAttainedLevel3 + ","
                + peopleAged16to74WithHighestQualificationAttainedLevel4and5 + ","
                // + peopleAged16to74WithOtherQualificationsLevelUnknown + "," 
                + fullTimeStudentsAndSchoolchildrenAged16to17 + ","
                + fullTimeStudentsAndSchoolchildrenAged18to74 + ","
                + fullTimeStudentsAged18to74EconomicallyActiveInEmployment + ","
                + fullTimeStudentsAged18to74EconomicallyActiveUnemployed + ","
                + fullTimeStudentsAged18to74EconomicallyInactive;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",allPeopleAged16to74 "
                + ",peopleAged16to74WithNoQualifications "
                + ",peopleAged16to74WithHighestQualificationAttainedLevel1 "
                + ",peopleAged16to74WithHighestQualificationAttainedLevel2 "
                + ",peopleAged16to74WithHighestQualificationAttainedLevel3 "
                + ",peopleAged16to74WithHighestQualificationAttainedLevel4and5 "
                // + ",peopleAged16to74WithOtherQualificationsLevelUnknown "
                + ",fullTimeStudentsAndSchoolchildrenAged16to17 "
                + ",fullTimeStudentsAndSchoolchildrenAged18to74 "
                + ",fullTimeStudentsAged18to74EconomicallyActiveInEmployment "
                + ",fullTimeStudentsAged18to74EconomicallyActiveUnemployed "
                + ",fullTimeStudentsAged18to74EconomicallyInactive ";
    }

    /**
     * Returns a copy of this.allPeopleAged16to74
     *
     * @return
     */
    public int getAllPeopleAged16to74() {
        return this.allPeopleAged16to74;
    }

    /**
     * Returns a copy of this.peopleAged16to74WithNoQualifications
     *
     * @return
     */
    public int getPeopleAged16to74WithNoQualifications() {
        return this.peopleAged16to74WithNoQualifications;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74WithHighestQualificationAttainedLevel1
     *
     * @return
     */
    public int getPeopleAged16to74WithHighestQualificationAttainedLevel1() {
        return this.peopleAged16to74WithHighestQualificationAttainedLevel1;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74WithHighestQualificationAttainedLevel2
     *
     * @return
     */
    public int getPeopleAged16to74WithHighestQualificationAttainedLevel2() {
        return this.peopleAged16to74WithHighestQualificationAttainedLevel2;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74WithHighestQualificationAttainedLevel3
     *
     * @return
     */
    public int getPeopleAged16to74WithHighestQualificationAttainedLevel3() {
        return this.peopleAged16to74WithHighestQualificationAttainedLevel3;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74WithHighestQualificationAttainedLevel4and5
     *
     * @return
     */
    public int getPeopleAged16to74WithHighestQualificationAttainedLevel4and5() {
        return this.peopleAged16to74WithHighestQualificationAttainedLevel4and5;
    }

    // /**
    // * Returns a copy of
    // this.peopleAged16to74WithOtherQualificationsLevelUnknown
    // */
    // public int getPeopleAged16to74WithOtherQualificationsLevelUnknown() {
    // return this.peopleAged16to74WithOtherQualificationsLevelUnknown;
    // }
    /**
     * Returns a copy of this.fullTimeStudentsAndSchoolchildrenAged16to17
     *
     * @return
     */
    public int get_FullTimeStudentsAndSchoolchildrenAged16to17() {
        return this.fullTimeStudentsAndSchoolchildrenAged16to17;
    }

    /**
     * Returns a copy of this._FullTimeStudentsAndSchoolchildrenAged18to74
     *
     * @return
     */
    public int getFullTimeStudentsAndSchoolchildrenAged18to74() {
        return this.fullTimeStudentsAndSchoolchildrenAged18to74;
    }

    /**
     * Returns a copy of
     * this.fullTimeStudentsAged18to74EconomicallyActiveInEmployment
     *
     * @return
     */
    public int getFullTimeStudentsAged18to74EconomicallyActiveInEmployment() {
        return this.fullTimeStudentsAged18to74EconomicallyActiveInEmployment;
    }

    /**
     * Returns a copy of
     * this.fullTimeStudentsAged18to74EconomicallyActiveUnemployed
     *
     * @return
     */
    public int getFullTimeStudentsAged18to74EconomicallyActiveUnemployed() {
        return this.fullTimeStudentsAged18to74EconomicallyActiveUnemployed;
    }

    /**
     * Returns a copy of this.fullTimeStudentsAged18to74EconomicallyInactive
     *
     * @return
     */
    public int getFullTimeStudentsAged18to74EconomicallyInactive() {
        return this.fullTimeStudentsAged18to74EconomicallyInactive;
    }
}
