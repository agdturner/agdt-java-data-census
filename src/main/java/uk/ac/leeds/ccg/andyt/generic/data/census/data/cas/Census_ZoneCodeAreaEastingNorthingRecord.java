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
package uk.ac.leeds.ccg.andyt.generic.data.census.data.cas;

import uk.ac.leeds.ccg.andyt.generic.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_RecordID;

/**
 * For storing a CAS044 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_ZoneCodeAreaEastingNorthingRecord extends Census_AreaRecord {

    /*
     * Area is in hectares.
     * Easting and Northing are as per the Ordnance Survey Great Britain
     * National Grid projection for England, Wales and Scotland.
     * Not sure about Northern Ireland...
     */
    /**
     * Area
     */
    protected double Area;
    /**
     * Easting
     */
    protected double Easting;
    /**
     * Northing
     */
    protected double Northing;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_ZoneCodeAreaEastingNorthingRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_ZoneCodeAreaEastingNorthingRecord(Census_RecordID rID, String line) {
        super(rID);
        String[] fields = line.split(",");
        this.zoneCode = fields[0].substring(1, 11);
        this.Area = Double.parseDouble(fields[1]);
        this.Easting = Double.parseDouble(fields[2]);
        this.Northing = Double.parseDouble(fields[3]);
    }

    /**
     * @return A String description of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", Area=" + Area + ", Easting=" + Easting 
                + ", Northing=" + Northing;
    }

   /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.Area + "," + this.Easting
            + "," + this.Northing;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        String r = super.toCSVHeader();
        r += ",_Area";
        r += ",_Easting";
        r += ",_Northing";
        return r;
    }

    /**
     * Returns a copy of this.Area
     *
     * @return
     */
    public double get_Area() {
        return this.Area;
    }

    /**
     * Returns a copy of this.Easting
     *
     * @return
     */
    public double get_Easting() {
        return this.Easting;
    }

    /**
     * Returns a copy of this.Northing
     *
     * @return
     */
    public double get_Northing() {
        return this.Northing;
    }
}
