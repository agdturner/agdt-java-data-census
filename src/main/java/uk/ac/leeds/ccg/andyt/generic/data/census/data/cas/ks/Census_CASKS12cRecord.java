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

/**
 * For storing a CASKS12c Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS12cRecord extends Census_AreaRecord {

    /*
     * Table KS012c Occupation groups - females: All females aged 16-74 in
     * employment
     */
    /**
     * KS012c0001 = femalesAged16to74InEmployment
     */
    protected int femalesAged16to74InEmployment;
    /**
     * KS012c0002 =
     * femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials
     */
    protected int femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials;
    /**
     * KS012c0003 =
     * femalesAged16to74InEmploymentWorkingAsProfessionalOccupations
     */
    protected int femalesAged16to74InEmploymentWorkingAsProfessionalOccupations;
    /**
     * KS012c0004 =femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations
     */
    protected int femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations;
    /**
     * KS012c0005 =
     * femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations
     */
    protected int femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations;
    /**
     * KS012c0006 =
     * femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations
     */
    protected int femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations;
    /**
     * KS012c0007 =
     * femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations
     */
    protected int femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations;
    /**
     * KS012c012c =
     * femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations
     */
    protected int femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations;
    /**
     * KS012c0009 =
     * femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives
     */
    protected int femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives;
    /**
     * KS012c0010 = femalesAged16to74InEmploymentWorkingAsElementaryOccupations
     */
    protected int femalesAged16to74InEmploymentWorkingAsElementaryOccupations;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS12cRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS12cRecord(Census_RecordID rID, String line) {
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
        // From Table KS12c
        this.femalesAged16to74InEmployment = Integer.valueOf(fields[1]);
        this.femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials = Integer.valueOf(fields[2]);
        this.femalesAged16to74InEmploymentWorkingAsProfessionalOccupations = Integer.valueOf(fields[3]);
        this.femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations = Integer.valueOf(fields[4]);
        this.femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations = Integer.valueOf(fields[5]);
        this.femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations = Integer.valueOf(fields[6]);
        this.femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations = Integer.valueOf(fields[7]);
        this.femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations = Integer.valueOf(fields[8]);
        this.femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives = Integer.valueOf(fields[9]);
        this.femalesAged16to74InEmploymentWorkingAsElementaryOccupations = Integer.valueOf(fields[10]);
    }

    /**
     * Returns a string description of this;
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() +
                ", femalesAged16to74InEmployment " + femalesAged16to74InEmployment +
                ", femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials " + femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials +
                ", femalesAged16to74InEmploymentWorkingAsProfessionalOccupations " + femalesAged16to74InEmploymentWorkingAsProfessionalOccupations +
                ", femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations " + femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations +
                ", femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations " + femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations +
                ", femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations " + femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations +
                ", femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations" + femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations +
                ", femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations" + femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations +
                ", femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives " + femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives +
                ", femalesAged16to74InEmploymentWorkingAsElementaryOccupations " + femalesAged16to74InEmploymentWorkingAsElementaryOccupations;
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + femalesAged16to74InEmployment + "," +
                femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials + "," +
                femalesAged16to74InEmploymentWorkingAsProfessionalOccupations + "," +
                femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations + "," +
                femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations + "," +
                femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations + "," +
                femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations + "," +
                femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations + "," +
                femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives + "," +
                femalesAged16to74InEmploymentWorkingAsElementaryOccupations;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",femalesAged16to74InEmployment" +
                ",femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials" +
                ",femalesAged16to74InEmploymentWorkingAsProfessionalOccupations" +
                ",femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations" +
                ",femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations" +
                ",femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations" +
                ",femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations" +
                ",femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations" +
                ",femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives" +
                ",femalesAged16to74InEmploymentWorkingAsElementaryOccupations";
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
     * this.femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials() {
        return this.femalesAged16to74InEmploymentWorkingAsManagersAndSeniorOfficials;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingAsProfessionalOccupations
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsProfessionalOccupations() {
        return this.femalesAged16to74InEmploymentWorkingAsProfessionalOccupations;
    }

    /**
     * Returns a copy of this.femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations() {
        return this.femalesAged16to74InEmploymentWorkingAsAssociateProfessionalAndTechnicalOccupations;
    }

    /**
     * Returns a copy of this.
     * femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations() {
        return this.femalesAged16to74InEmploymentWorkingAsAdministrativeAndSecretarialOccupations;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations() {
        return this.femalesAged16to74InEmploymentWorkingAsSkilledTradesOccupations;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations() {
        return this.femalesAged16to74InEmploymentWorkingAsPersonalServiceOccupations;
    }

    /**
     * Returns a copy of this.
     * femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations() {
        return this.femalesAged16to74InEmploymentWorkingAsSalesAndCustomerServiceOccupations;
    }

    /**
     * Returns a copy of this.
     * femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives() {
        return this.femalesAged16to74InEmploymentWorkingAsProcessPlantAndMachineOperatives;
    }

    /**
     * Returns a copy of
     * this.femalesAged16to74InEmploymentWorkingAsElementaryOccupations
     * @return 
     */
    public int getFemalesAged16to74InEmploymentWorkingAsElementaryOccupations() {
        return this.femalesAged16to74InEmploymentWorkingAsElementaryOccupations;
    }
}
