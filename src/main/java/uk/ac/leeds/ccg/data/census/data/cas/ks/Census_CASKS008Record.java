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
 * For storing a CASKS008 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS008Record extends Census_AreaRecord {

    /**
     * Table KS0008 National Statistics - Socio Economic Classification -
     * females aged 16-74 Footnotes and Comments for Table KS0008 1. Limiting
     * long-term illness covers any long-term illness, health problem or
     * disability which limits daily activities or work. 2. Working age
     * population is 16 to 64 years inclusive for men and 16 to 59 years
     * inclusive for women. 3. General health refers to health over the 12
     * months prior to Census day (29 April 2001). 4. Provision of unpaid care:
     * looking after, giving help or support to family members, friends,
     * neighbours or others because of long-term physical or mental ill-health
     * or disability or problems relating to old age.
     */
    /**
     * KS00080001 = allPeople
     */
    protected int allPeople;
    /**
     * KS00080002 = peopleWithLimitingLongTermIllness
     */
    protected int peopleWithLimitingLongTermIllness;
    /**
     * KS00080003 = peopleOfWorkingAgeWithLimitingLongTermIllness
     */
    protected int peopleOfWorkingAgeWithLimitingLongTermIllness;
    /**
     * KS00080004 = peopleWhoseGeneralHealthWasGood
     */
    protected int peopleWhoseGeneralHealthWasGood;
    /**
     * KS00080005 = peopleWhoseGeneralHealthWasFairlyGood
     */
    protected int peopleWhoseGeneralHealthWasFairlyGood;
    /**
     * KS00080006 = peopleWhoseGeneralHealthWasNotGood
     */
    protected int peopleWhoseGeneralHealthWasNotGood;
    /**
     * KS00080007 = peopleWhoProvideUnpaidCare1to19HoursAWeek
     */
    protected int peopleWhoProvideUnpaidCare1to19HoursAWeek;
    /**
     * KS00080008 = peopleWhoProvideUnpaidCare20to49HoursAWeek
     */
    protected int peopleWhoProvideUnpaidCare20to49HoursAWeek;
    /**
     * KS00080009 = peopleWhoProvideUnpaidCare50rMoreHoursAWeek
     */
    protected int peopleWhoProvideUnpaidCare50rMoreHoursAWeek;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS008Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS008Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[10];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        zoneCode = fields[0].substring(1, 11);
        // From Table KS008
        this.allPeople = Math_Integer.parseInt(fields[1]);
        this.peopleWithLimitingLongTermIllness = Math_Integer.parseInt(fields[2]);
        this.peopleOfWorkingAgeWithLimitingLongTermIllness = Math_Integer.parseInt(fields[3]);
        this.peopleWhoseGeneralHealthWasGood = Math_Integer.parseInt(fields[4]);
        this.peopleWhoseGeneralHealthWasFairlyGood = Math_Integer.parseInt(fields[5]);
        this.peopleWhoseGeneralHealthWasNotGood = Math_Integer.parseInt(fields[6]);
        this.peopleWhoProvideUnpaidCare1to19HoursAWeek = Math_Integer.parseInt(fields[7]);
        this.peopleWhoProvideUnpaidCare20to49HoursAWeek = Math_Integer.parseInt(fields[8]);
        this.peopleWhoProvideUnpaidCare50rMoreHoursAWeek = Math_Integer.parseInt(fields[9]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", allPeople=" + allPeople 
                + ", peopleWithLimitingLongTermIllness=" + peopleWithLimitingLongTermIllness
                + ", peopleOfWorkingAgeWithLimitingLongTermIllness=" + peopleOfWorkingAgeWithLimitingLongTermIllness
                + ", peopleWhoseGeneralHealthWasGood=" + peopleWhoseGeneralHealthWasGood
                + ", peopleWhoseGeneralHealthWasFairlyGood=" + peopleWhoseGeneralHealthWasFairlyGood
                + ", peopleWhoseGeneralHealthWasNotGood=" + peopleWhoseGeneralHealthWasNotGood
                + ", peopleWhoProvideUnpaidCare1to19HoursAWeek=" + peopleWhoProvideUnpaidCare1to19HoursAWeek
                + ", peopleWhoProvideUnpaidCare20to49HoursAWeek=" + peopleWhoProvideUnpaidCare20to49HoursAWeek
                + ", peopleWhoProvideUnpaidCare50rMoreHoursAWeek=" + peopleWhoProvideUnpaidCare50rMoreHoursAWeek;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + allPeople + "," 
                + peopleWithLimitingLongTermIllness + ","
                + peopleOfWorkingAgeWithLimitingLongTermIllness + "," 
                + peopleWhoseGeneralHealthWasGood + "," 
                + peopleWhoseGeneralHealthWasFairlyGood + "," 
                + peopleWhoseGeneralHealthWasNotGood + ","
                + peopleWhoProvideUnpaidCare1to19HoursAWeek + "," 
                + peopleWhoProvideUnpaidCare20to49HoursAWeek + "," 
                + peopleWhoProvideUnpaidCare50rMoreHoursAWeek;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",allPeople"
                + ",peopleWithLimitingLongTermIllness"
                + ",peopleOfWorkingAgeWithLimitingLongTermIllness" 
                + ",peopleWhoseGeneralHealthWasGood" 
                + ",peopleWhoseGeneralHealthWasFairlyGood" 
                + ",peopleWhoseGeneralHealthWasNotGood" 
                + ",peopleWhoProvideUnpaidCare1to19HoursAWeek"
                + ",peopleWhoProvideUnpaidCare20to49HoursAWeek"
                + ",peopleWhoProvideUnpaidCare50rMoreHoursAWeek";
    }

    /**
     * Returns a copy of this.allPeople
     * @return 
     */
    public int getAllPeople() {
        return this.allPeople;
    }

    /**
     * Returns a copy of this.peopleWithLimitingLongTermIllness
     * @return 
     */
    public int getPeopleWithLimitingLongTermIllness() {
        return this.peopleWithLimitingLongTermIllness;
    }

    /**
     * Returns a copy of this.peopleOfWorkingAgeWithLimitingLongTermIllness
     * @return 
     */
    public int getPeopleOfWorkingAgeWithLimitingLongTermIllness() {
        return this.peopleOfWorkingAgeWithLimitingLongTermIllness;
    }

    /**
     * Returns a copy of this.peopleWhoseGeneralHealthWasGood
     * @return 
     */
    public int getPeopleWhoseGeneralHealthWasGood() {
        return this.peopleWhoseGeneralHealthWasGood;
    }

    /**
     * Returns a copy of this.peopleWhoseGeneralHealthWasFairlyGood
     * @return 
     */
    public int getPeopleWhoseGeneralHealthWasFairlyGood() {
        return this.peopleWhoseGeneralHealthWasFairlyGood;
    }

    /**
     * Returns a copy of this.peopleWhoseGeneralHealthWasNotGood
     * @return 
     */
    public int getPeopleWhoseGeneralHealthWasNotGood() {
        return this.peopleWhoseGeneralHealthWasNotGood;
    }

    /**
     * Returns a copy of this.peopleWhoProvideUnpaidCare1to19HoursAWeek
     * @return 
     */
    public int getPeopleWhoProvideUnpaidCare1to19HoursAWeek() {
        return this.peopleWhoProvideUnpaidCare1to19HoursAWeek;
    }

    /**
     * Returns a copy of this.peopleWhoProvideUnpaidCare20to49HoursAWeek
     * @return 
     */
    public int getPeopleWhoProvideUnpaidCare20to49HoursAWeek() {
        return this.peopleWhoProvideUnpaidCare20to49HoursAWeek;
    }

    /**
     * Returns a copy of this.peopleWhoProvideUnpaidCare50rMoreHoursAWeek
     * @return 
     */
    public int getPeopleWhoProvideUnpaidCare50rMoreHoursAWeek() {
        return this.peopleWhoProvideUnpaidCare50rMoreHoursAWeek;
    }
}
