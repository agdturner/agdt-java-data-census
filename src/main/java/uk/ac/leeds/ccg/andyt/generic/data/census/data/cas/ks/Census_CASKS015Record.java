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
 * For storing a CASKS015 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS015Record extends Census_AreaRecord {

    /*
     * This table is different for Scotland and Northern and Ireland. The cell
     * numbers shown are for England and Wales Table KS015 Travel to Work: All
     * people aged 16-74 in employment Footnotes and Comments for Table KS015 1.
     * The distance travelled is a calculation of the straight line between the
     * postcode of place of residence and postcode of workplace. 2. Excludes
     * working at home, no fixed place of work, working at offshore
     * installation, working outside UK. 3. For the purposes of this table,
     * public transport is defined as Underground, metro, light rail or tram;
     * train; bus, minibus or coach. 4. The number of people who travel to work
     * by public transport who live in a household with/without a car or van is
     * expressed as a percentage of the number of people who travel to work by
     * public transport. These figures may not sum to 100% as residents of
     * communal establishments who travel to work by public transport are not
     * included in these counts.
     */
    /**
     * KS0150001 = peopleAged16to74InEmployment
     */
    protected int peopleAged16to74InEmployment;
    /**
     * KS0150002 = peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome
     */
    protected int peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome;
    /**
     * KS0150003 =peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram;
    /**
     * KS0150004 = peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain;
    /**
     * KS0150005 =
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach;
    /**
     * KS0150006 =
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped;
    /**
     * KS0150007 =
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan;
    /**
     * KS0150008 =
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan;
    /**
     * KS0150009 =
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab;
    /**
     * KS0150010 = peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle;
    /**
     * KS0150011 = peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot;
    /**
     * KS0150012 = peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther
     */
    protected int peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther;
    /**
     * KS0150013 = averageDistanceInKMTravelledToFixedPlaceOfWork
     */
    protected int averageDistanceInKMTravelledToFixedPlaceOfWork;
    /**
     * KS0150014 = publicTransportUsersInHouseholdsWithACarOrVan
     */
    protected int publicTransportUsersInHouseholdsWithACarOrVan;
    /**
     * KS0150015 = publicTransportUsersInHouseholdsWithoutACarOrVan
     */
    protected int publicTransportUsersInHouseholdsWithoutACarOrVan;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS015Record(Census_RecordID rID) {
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
    public Census_CASKS015Record(Census_RecordID rID, String line, String country) {
        super(rID);
        String[] fieldsDummy = line.split(",");
        String[] fields = new String[16];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        if (country.equalsIgnoreCase("Scotland")) {
            System.arraycopy(fieldsDummy, 0, fields, 0, 13);
            System.arraycopy(fieldsDummy, 16, fields, 14, 2);
            zoneCode = fields[0].substring(1, 11);
            // From Table KS015
            this.peopleAged16to74InEmployment = Math_Integer.parseInt(fields[1]);
            this.peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome = Math_Integer.parseInt(fields[2]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram = Math_Integer.parseInt(fields[3]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain = Math_Integer.parseInt(fields[4]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach = Math_Integer.parseInt(fields[5]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped = Math_Integer.parseInt(fields[6]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan = Math_Integer.parseInt(fields[7]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan = Math_Integer.parseInt(fields[8]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab = Math_Integer.parseInt(fields[9]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle = Math_Integer.parseInt(fields[10]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot = Math_Integer.parseInt(fields[11]);
            this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther = Math_Integer.parseInt(fields[12]);
            this.averageDistanceInKMTravelledToFixedPlaceOfWork = Math_Integer.parseInt(fields[13]);
            this.publicTransportUsersInHouseholdsWithACarOrVan = Math_Integer.parseInt(fields[14]);
            this.publicTransportUsersInHouseholdsWithoutACarOrVan = Math_Integer.parseInt(fields[15]);
        } else {
            if (country.equalsIgnoreCase("Northern Ireland")) {
                fields = new String[15];
                System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
                zoneCode = fields[0].substring(1, 11);
                // From Table KS015
                this.peopleAged16to74InEmployment = Math_Integer.parseInt(fields[1]);
                this.peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome = Math_Integer.parseInt(fields[2]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain = Math_Integer.parseInt(fields[3]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach = Math_Integer.parseInt(fields[4]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped = Math_Integer.parseInt(fields[5]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan = Math_Integer.parseInt(fields[6]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan = Math_Integer.parseInt(fields[7]);
                // this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByCarOrVanPool
                // = Math_Integer.parseInt( fields[ 8 ] );
                // this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxi
                // = Math_Integer.parseInt( fields[ 9 ] );
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab = Math_Integer.parseInt(fields[9]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle = Math_Integer.parseInt(fields[10]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot = Math_Integer.parseInt(fields[11]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther = Math_Integer.parseInt(fields[12]) + Math_Integer.parseInt(fields[8]);
                this.publicTransportUsersInHouseholdsWithACarOrVan = Math_Integer.parseInt(fields[13]);
                this.publicTransportUsersInHouseholdsWithoutACarOrVan = Math_Integer.parseInt(fields[14]);
            } else {
                // if ( country.equalsIgnoreCase( "England" ) ||
                // country.equalsIgnoreCase( "Wales" ) ) {
                System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
                zoneCode = fields[0].substring(1, 11);
                // From Table KS015
                this.peopleAged16to74InEmployment = Math_Integer.parseInt(fields[1]);
                this.peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome = Math_Integer.parseInt(fields[2]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram = Math_Integer.parseInt(fields[3]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain = Math_Integer.parseInt(fields[4]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach = Math_Integer.parseInt(fields[5]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped = Math_Integer.parseInt(fields[6]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan = Math_Integer.parseInt(fields[7]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan = Math_Integer.parseInt(fields[8]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab = Math_Integer.parseInt(fields[9]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle = Math_Integer.parseInt(fields[10]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot = Math_Integer.parseInt(fields[11]);
                this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther = Math_Integer.parseInt(fields[12]);
                this.averageDistanceInKMTravelledToFixedPlaceOfWork = Math_Integer.parseInt(fields[13]);
                this.publicTransportUsersInHouseholdsWithACarOrVan = Math_Integer.parseInt(fields[14]);
                this.publicTransportUsersInHouseholdsWithoutACarOrVan = Math_Integer.parseInt(fields[15]);
            }
        }
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", peopleAged16to74InEmployment=" + peopleAged16to74InEmployment
                + ", peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome=" + peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram 
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain 
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped 
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab 
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle 
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot 
                + ", peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther=" + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther
                + ", averageDistanceInKMTravelledToFixedPlaceOfWork=" + averageDistanceInKMTravelledToFixedPlaceOfWork 
                + ", publicTransportUsersInHouseholdsWithACarOrVan=" + publicTransportUsersInHouseholdsWithACarOrVan 
                + ", publicTransportUsersInHouseholdsWithoutACarOrVan=" + publicTransportUsersInHouseholdsWithoutACarOrVan;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + peopleAged16to74InEmployment + "," 
                + peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome + "," 
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram + "," 
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain + "," 
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach + ","
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped + ","
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan + ","
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan + "," 
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab + ","
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle + "," 
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot + "," 
                + peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther + "," 
                + averageDistanceInKMTravelledToFixedPlaceOfWork + "," 
                + publicTransportUsersInHouseholdsWithACarOrVan + "," 
                + publicTransportUsersInHouseholdsWithoutACarOrVan;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",peopleAged16to74InEmployment" 
                + ",peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome"
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram"
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain" 
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach" 
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped"
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan" 
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan"
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab" 
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle" 
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot" 
                + ",peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther"
                + ",averageDistanceInKMTravelledToFixedPlaceOfWork"
                + ",publicTransportUsersInHouseholdsWithACarOrVan" 
                + ",publicTransportUsersInHouseholdsWithoutACarOrVan";
    }

    /**
     * Returns a copy of this.peopleAged16to74InEmployment
     * @return 
     */
    public int getPeopleAged16to74InEmployment() {
        return this.peopleAged16to74InEmployment;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome() {
        return this.peopleAged16to74InEmploymentWhoWorkMainlyAtOrFromHome;
    }

    /**
     * Returns a copy of this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByUndergroundMetroLightRailTram;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTrain;
    }

    /**
     * Returns a copy of this.
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBusMinibusOrCoach;
    }

    /**
     * Returns a copy of this.
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByMotorcycleScooterOrMoped;
    }

    /**
     * Returns a copy of this.
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByDrivingACarOrVan;
    }

    /**
     * Returns a copy of this.
     * peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByPassengerInACarOrVan;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByTaxiOrMinicab;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByBicycle;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOnFoot;
    }

    /**
     * Returns a copy of
     * this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther
     * @return 
     */
    public int getPeopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther() {
        return this.peopleAged16to74InEmploymentWhoUsuallyTravelToWorkByOther;
    }

    /**
     * Returns a copy of this.averageDistanceInKMTravelledToFixedPlaceOfWork
     * @return 
     */
    public int getAverageDistanceInKMTravelledToFixedPlaceOfWork() {
        return this.averageDistanceInKMTravelledToFixedPlaceOfWork;
    }

    /**
     * Returns a copy of this.publicTransportUsersInHouseholdsWithACarOrVan
     * @return 
     */
    public int getPublicTransportUsersInHouseholdsWithACarOrVan() {
        return this.publicTransportUsersInHouseholdsWithACarOrVan;
    }

    /**
     * Returns a copy of this.publicTransportUsersInHouseholdsWithoutACarOrVan
     * @return 
     */
    public int getPublicTransportUsersInHouseholdsWithoutACarOrVan() {
        return this.publicTransportUsersInHouseholdsWithoutACarOrVan;
    }
}
