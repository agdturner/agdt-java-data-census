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
 * For storing a CASKS016 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS016Record extends Census_AreaRecord {

    /*
     * Table KS016 Household spaces and accommodation type: All household spaces
     * NB: This table contains counts of Household spaces Footnotes and Comments
     * for Table KS016 1. 'In commercial building' includes in an office
     * building; or hotel; or over a shop.
     */
    /**
     * KS0160001 = allHouseholdSpacesWithResidents
     */
    protected int allHouseholdSpacesWithResidents;
    /**
     * KS0160002 = allHouseholdSpacesWithNoResidentsVacant
     */
    protected int allHouseholdSpacesWithNoResidentsVacant;
    /**
     * KS0160003 =
     * allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation
     */
    protected int allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation;
    /**
     * KS0160004 =
     * allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached
     */
    protected int allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached;
    /**
     * KS0160005 =
     * allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached
     */
    protected int allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached;
    /**
     * KS0160006
     * =allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace
     */
    protected int allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace;
    /**
     * KS0160007
     * =allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement
     */
    protected int allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement;
    /**
     * KS0160008
     * =allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits
     */
    protected int allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits;
    /**
     * KS0160009
     * =allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding
     */
    protected int allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding;
    /**
     * KS0160010
     * =allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure
     */
    protected int allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS016Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS016Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fields = line.split(",");
        zoneCode = fields[0].substring(1, 11);
        this.allHouseholdSpacesWithResidents = Math_Integer.parseInt(fields[1]);
        this.allHouseholdSpacesWithNoResidentsVacant = Math_Integer.parseInt(fields[2]);
        this.allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation = Math_Integer.parseInt(fields[3]);
        this.allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached = Math_Integer.parseInt(fields[4]);
        this.allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached = Math_Integer.parseInt(fields[5]);
        this.allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace = Math_Integer.parseInt(fields[6]);
        this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement = Math_Integer.parseInt(fields[7]);
        this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits = Math_Integer.parseInt(fields[8]);
        this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding = Math_Integer.parseInt(fields[9]);
        this.allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure = Math_Integer.parseInt(fields[10]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", allHouseholdSpacesWithResidents=" + allHouseholdSpacesWithResidents 
                + ", allHouseholdSpacesWithNoResidentsVacant=" + allHouseholdSpacesWithNoResidentsVacant 
                + ", allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation=" + allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation 
                + ", allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached=" + allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached 
                + ", allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached=" + allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached
                + ", allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace=" + allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace 
                + ", allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement=" + allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement 
                + ", allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits=" + allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits 
                + ", allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding=" + allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding 
                + ", allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure=" + allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + allHouseholdSpacesWithResidents + "," 
                + allHouseholdSpacesWithNoResidentsVacant + "," 
                + allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation + ","
                + allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached + ","
                + allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached + ","
                + allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace + ","
                + allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement + "," 
                + allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits + "," 
                + allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding + ","
                + allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",allHouseholdSpacesWithResidents" 
                + ",allHouseholdSpacesWithNoResidentsVacant" 
                + ",allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation"
                + ",allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached" 
                + ",allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached" 
                + ",allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace"
                + ",allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement"
                + ",allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits" 
                + ",allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding" 
                + ",allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure";
    }

    /**
     * Returns a copy of this.allHouseholdSpacesWithResidents
     *
     * @return
     */
    public int getAllHouseholdSpacesWithResidents() {
        return this.allHouseholdSpacesWithResidents;
    }

    /**
     * Returns a copy of this.allHouseholdSpacesWithNoResidentsVacant
     *
     * @return
     */
    public int getAllHouseholdSpacesWithNoResidentsVacant() {
        return this.allHouseholdSpacesWithNoResidentsVacant;
    }

    /**
     * Returns a copy of this.
     * allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation
     *
     * @return
     */
    public int getAllHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation() {
        return this.allHouseholdSpacesWithNoResidentsSecondResidenceHolidayAccommodation;
    }

    /**
     * Returns a copy of this.
     * allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached
     *
     * @return
     */
    public int getAllHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached() {
        return this.allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowDetached;
    }

    /**
     * Returns a copy of this.
     * allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached
     *
     * @return
     */
    public int getAllHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached() {
        return this.allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowSemiDetached;
    }

    /**
     * Returns a copy of
     * this.allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace
     *
     * @return
     */
    public int getAllHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace() {
        return this.allHouseholdSpacesWhichAreOfAccommodationTypeWholeHouseOrbungalowTerracedIncludingEndTerrace;
    }

    /**
     * Returns a copy of
     * this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement
     *
     * @return
     */
    public int getAllHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement() {
        return this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPurposeBuiltBlockOfFlatsOrTenement;
    }

    /**
     * Returns a copy of
     * this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits
     *
     * @return
     */
    public int getAllHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits() {
        return this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentPartOfAConvertedOrSharedHouseIncludingBedSits;
    }

    /**
     * Returns a copy of
     * this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding
     *
     * @return
     */
    public int getAllHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding() {
        return this.allHouseholdSpacesWhichAreOfAccommodationTypeFlatMaisonetteOrApartmentInACommercialBuilding;
    }

    /**
     * Returns a copy of
     * this.allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure
     *
     * @return
     */
    public int getAllHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure() {
        return this.allHouseholdSpacesWhichAreOfAccommodationTypeCaravanOrOtherMobileOrTemporaryStructure;
    }
}
