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
package uk.ac.leeds.ccg.data.census.data.cas.uv;

import uk.ac.leeds.ccg.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.data.census.data.id.Census_RecordID;
import uk.ac.leeds.ccg.math.Math_Integer;

/**
 * For representing CAS UV003 Records and providing safe access to the data.
 */
public class Census_CASUV003Record extends Census_AreaRecord {

    /*
     * Sex: All people NB: This table contains counts of Persons
     */
    /**
     * KS0050001 = allPersons (allPeople)
     */
    protected int allPeople;
    /**
     * KS0050002 = males
     */
    protected int males;
    /**
     * KS0050003 = females
     */
    protected int females;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASUV003Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASUV003Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fields = line.split(",");
        zoneCode = fields[0].substring(1, 11);
        // From Table UV003
        this.allPeople = Math_Integer.parseInt(fields[1]);
        this.males = Math_Integer.parseInt(fields[2]);
        this.females = Math_Integer.parseInt(fields[3]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", allPeople=" + allPeople 
                + ", males=" + males + ", females=" + females;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + allPeople + "," + males + "," + females;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",allPeople" + ",males" + ",females";
    }

    /**
     * Returns a copy of this.allPeople
     * @return 
     */
    public int getAllPeople() {
        return this.allPeople;
    }

    /**
     * Returns a copy of this.males
     * @return 
     */
    public int getMales() {
        return this.males;
    }

    /**
     * Returns a copy of this.females
     * @return 
     */
    public int getFemales() {
        return this.females;
    }
}
