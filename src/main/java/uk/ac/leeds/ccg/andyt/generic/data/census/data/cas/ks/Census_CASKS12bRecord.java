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
 * For storing a CASKS12b Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS12bRecord extends Census_AreaRecord {

    /*
     * Table KS012b Occupation groups - males: All males aged 16-74 in
     * employment
     */
    /**
     * KS012b0001 = malesAged16to74InEmployment
     */
    protected int malesAged16to74InEmployment;
    /**
     * KS012b0002 =
     * malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials
     */
    protected int malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials;
    /**
     * KS012b0003 = malesAged16to74InEmploymentWorkingAsProfessionalOccupations
     */
    protected int malesAged16to74InEmploymentWorkingAsProfessionalOccupations;
    /**
     * KS012b0004 =
     * malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations
     */
    protected int malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations;
    /**
     * KS012b0005 =
     * malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations
     */
    protected int malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations;
    /**
     * KS012b0006 = malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations
     */
    protected int malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations;
    /**
     * KS012b0007 =
     * malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations
     */
    protected int malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations;
    /**
     * KS012b012b =
     * malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations
     */
    protected int malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations;
    /**
     * KS012b0009 =
     * malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives
     */
    protected int malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives;
    /**
     * KS012b0010 = malesAged16to74InEmploymentWorkingAsElementaryOccupations
     */
    protected int malesAged16to74InEmploymentWorkingAsElementaryOccupations;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS12bRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS12bRecord(Census_RecordID rID, String line) {
        super(rID);
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[11];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        zoneCode = fields[0].substring(1, 11);
        // From Table KS12b
        this.malesAged16to74InEmployment = Math_Integer.parseInt(fields[1]);
        this.malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials = Math_Integer.parseInt(fields[2]);
        this.malesAged16to74InEmploymentWorkingAsProfessionalOccupations = Math_Integer.parseInt(fields[3]);
        this.malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations = Math_Integer.parseInt(fields[4]);
        this.malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations = Math_Integer.parseInt(fields[5]);
        this.malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations = Math_Integer.parseInt(fields[6]);
        this.malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations = Math_Integer.parseInt(fields[7]);
        this.malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations = Math_Integer.parseInt(fields[8]);
        this.malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives = Math_Integer.parseInt(fields[9]);
        this.malesAged16to74InEmploymentWorkingAsElementaryOccupations = Math_Integer.parseInt(fields[10]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", malesAged16to74InEmployment=" + malesAged16to74InEmployment 
                + ", malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials=" + malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials 
                + ", malesAged16to74InEmploymentWorkingAsProfessionalOccupations=" + malesAged16to74InEmploymentWorkingAsProfessionalOccupations 
                + ", malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations=" + malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations 
                + ", malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations=" + malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations 
                + ", malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations=" + malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations
                + ", malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations" + malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations 
                + ", malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations" + malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations 
                + ", malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives=" + malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives 
                + ", malesAged16to74InEmploymentWorkingAsElementaryOccupations=" + malesAged16to74InEmploymentWorkingAsElementaryOccupations;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + malesAged16to74InEmployment + "," 
                + malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials + "," 
                + malesAged16to74InEmploymentWorkingAsProfessionalOccupations + ","
                + malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations + "," 
                + malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations + "," 
                + malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations + "," 
                + malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations + "," 
                + malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations + "," 
                + malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives + "," 
                + malesAged16to74InEmploymentWorkingAsElementaryOccupations;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",malesAged16to74InEmployment" 
                + ",malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials"
                + ",malesAged16to74InEmploymentWorkingAsProfessionalOccupations" 
                + ",malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations"
                + ",malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations"
                + ",malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations"
                + ",malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations"
                + ",malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations" 
                + ",malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives"
                + ",malesAged16to74InEmploymentWorkingAsElementaryOccupations";
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
     * this.malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials() {
        return this.malesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingAsProfessionalOccupations
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsProfessionalOccupations() {
        return this.malesAged16to74InEmploymentWorkingAsProfessionalOccupations;
    }

    /**
     * Returns a copy of this.
     * malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations() {
        return this.malesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations;
    }

    /**
     * Returns a copy of this.
     * malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations() {
        return this.malesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations() {
        return this.malesAged16to74InEmploymentWorkingAsSkilledTradesOccupations;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations() {
        return this.malesAged16to74InEmploymentWorkingAsPersonalServiceOccupations;
    }

    /**
     * Returns a copy of this.
     * malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations() {
        return this.malesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations;
    }

    /**
     * Returns a copy of this.
     * malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives() {
        return this.malesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives;
    }

    /**
     * Returns a copy of
     * this.malesAged16to74InEmploymentWorkingAsElementaryOccupations
     * @return 
     */
    public int getMalesAged16to74InEmploymentWorkingAsElementaryOccupations() {
        return this.malesAged16to74InEmploymentWorkingAsElementaryOccupations;
    }
}
