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
 * For storing a CASKS017 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS017Record extends Census_AreaRecord {

    /**
     * Table KS017 Cars or vans: All households Footnotes and Comments for Table
     * KS017 1. Includes any company car or van if available for private use. 2.
     * 'All cars or vans in the area' includes only those cars and vans owned
     * by, or available for use by, households. This count is not exact as
     * households with more than 10 cars or vans are counted as having 10 cars
     * or vans.
     */
    /**
     * KS0170001 = allHouseholds
     */
    protected int allHouseholds;
    /**
     * KS0170002 = householdsWith0CarsOrVans
     */
    protected int householdsWith0CarsOrVans;
    /**
     * KS0170003 = householdsWith1CarOrVan
     */
    protected int householdsWith1CarOrVan;
    /**
     * KS0170004 = householdsWith2CarsOrVans
     */
    protected int householdsWith2CarsOrVans;
    /**
     * KS0170005 = householdsWith3CarsOrVans
     */
    protected int householdsWith3CarsOrVans;
    /**
     * KS0170006 = householdsWith4OrMoreCarsOrVans
     */
    protected int householdsWith4OrMoreCarsOrVans;
    /**
     * KS0170007 = allCarsOrVansInTheArea
     */
    protected int allCarsOrVansInTheArea;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS017Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS017Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[8];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        zoneCode = fields[0].substring(1, 11);
        // From Table KS017
        this.allHouseholds = Math_Integer.parseInt(fields[1]);
        this.householdsWith0CarsOrVans = Math_Integer.parseInt(fields[2]);
        this.householdsWith1CarOrVan = Math_Integer.parseInt(fields[3]);
        this.householdsWith2CarsOrVans = Math_Integer.parseInt(fields[4]);
        this.householdsWith3CarsOrVans = Math_Integer.parseInt(fields[5]);
        this.householdsWith4OrMoreCarsOrVans = Math_Integer.parseInt(fields[6]);
        this.allCarsOrVansInTheArea = Math_Integer.parseInt(fields[7]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", allHouseholds=" + allHouseholds
                + ", householdsWith0CarsOrVans=" + householdsWith0CarsOrVans
                + ", householdsWith1CarOrVan=" + householdsWith1CarOrVan
                + ", householdsWith2CarsOrVans=" + householdsWith2CarsOrVans
                + ", householdsWith3CarsOrVans=" + householdsWith3CarsOrVans
                + ", householdsWith4OrMoreCarsOrVans=" + householdsWith4OrMoreCarsOrVans
                + ", allCarsOrVansInTheArea=" + allCarsOrVansInTheArea;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + allHouseholds + ","
                + householdsWith0CarsOrVans + ","
                + householdsWith1CarOrVan + ","
                + householdsWith2CarsOrVans + ","
                + householdsWith3CarsOrVans + ","
                + householdsWith4OrMoreCarsOrVans + ","
                + allCarsOrVansInTheArea;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",allHouseholds" 
                + ",householdsWith0CarsOrVans" + ",householdsWith1CarOrVan" 
                + ",householdsWith2CarsOrVans" + ",householdsWith3CarsOrVans" 
                + ",householdsWith4OrMoreCarsOrVans" + ",allCarsOrVansInTheArea";
    }

    /**
     * Returns a copy of this.allHouseholds
     *
     * @return
     */
    public int getAllHouseholds() {
        return this.allHouseholds;
    }

    /**
     * Returns a copy of this.householdsWith0CarsOrVans
     *
     * @return
     */
    public int getHouseholdsWith0CarsOrVans() {
        return this.householdsWith0CarsOrVans;
    }

    /**
     * Returns a copy of this.householdsWith1CarOrVan
     *
     * @return
     */
    public int getHouseholdsWith1CarOrVan() {
        return this.householdsWith1CarOrVan;
    }

    /**
     * Returns a copy of this.householdsWith2CarsOrVans
     *
     * @return
     */
    public int getHouseholdsWith2CarsOrVans() {
        return this.householdsWith2CarsOrVans;
    }

    /**
     * Returns a copy of this.householdsWith3CarsOrVans
     *
     * @return
     */
    public int getHouseholdsWith3CarsOrVans() {
        return this.householdsWith3CarsOrVans;
    }

    /**
     * Returns a copy of this.householdsWith4OrMoreCarsOrVans
     *
     * @return
     */
    public int getHouseholdsWith4OrMoreCarsOrVans() {
        return this.householdsWith4OrMoreCarsOrVans;
    }

    /**
     * Returns a copy of this.allCarsOrVansInTheArea
     *
     * @return
     */
    public int getAllCarsOrVansInTheArea() {
        return this.allCarsOrVansInTheArea;
    }
}
