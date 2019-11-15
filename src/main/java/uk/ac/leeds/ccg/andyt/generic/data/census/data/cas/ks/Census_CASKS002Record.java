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
 * For storing a CASKS002 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS002Record extends Census_AreaRecord {

    /*
     * Table KS002 Age structure: All people Footnotes and Comments for Table
     * KS002 1. 'Age' is age last birthday.
     */
    /**
     * KS0020001 = agesAll
     */
    protected int agesAll;
    /**
     * KS0020002 = ages0to4
     */
    protected int ages0to4;
    /**
     * KS0020003 = ages5to7
     */
    protected int ages5to7;
    /**
     * KS0020004 = ages8to9
     */
    protected int ages8to9;
    /**
     * KS0020005 = ages10to14
     */
    protected int ages10to14;
    /**
     * KS0020006 = age15
     */
    protected int age15;
    /**
     * KS0020007 = ages16to17
     */
    protected int ages16to17;
    /**
     * KS0020008 = ages18to19
     */
    protected int ages18to19;
    /**
     * KS0020009 = ages20to24
     */
    protected int ages20to24;
    /**
     * KS0020010 = ages25to29
     */
    protected int ages25to29;
    /**
     * KS0020011 = ages30to44
     */
    protected int ages30to44;
    /**
     * KS0020012 = ages45to59
     */
    protected int ages45to59;
    /**
     * KS0020013 = ages60to64
     */
    protected int ages60to64;
    /**
     * KS0020014 = ages65to74
     */
    protected int ages65to74;
    /**
     * KS0020015 = ages75to84
     */
    protected int ages75to84;
    /**
     * KS0020016 = ages85to89
     */
    protected int ages85to89;
    /**
     * KS0020017 = ages90AndOver
     */
    protected int ages90AndOver;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS002Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS002Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[18];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        this.zoneCode = fields[0].substring(1, 11);
        // From Table KS002
        this.agesAll = Math_Integer.parseInt(fields[1]);
        this.ages0to4 = Math_Integer.parseInt(fields[2]);
        this.ages5to7 = Math_Integer.parseInt(fields[3]);
        this.ages8to9 = Math_Integer.parseInt(fields[4]);
        this.ages10to14 = Math_Integer.parseInt(fields[5]);
        this.age15 = Math_Integer.parseInt(fields[6]);
        this.ages16to17 = Math_Integer.parseInt(fields[7]);
        this.ages18to19 = Math_Integer.parseInt(fields[8]);
        this.ages20to24 = Math_Integer.parseInt(fields[9]);
        this.ages25to29 = Math_Integer.parseInt(fields[10]);
        this.ages30to44 = Math_Integer.parseInt(fields[11]);
        this.ages45to59 = Math_Integer.parseInt(fields[12]);
        this.ages60to64 = Math_Integer.parseInt(fields[13]);
        this.ages65to74 = Math_Integer.parseInt(fields[14]);
        this.ages75to84 = Math_Integer.parseInt(fields[15]);
        this.ages85to89 = Math_Integer.parseInt(fields[16]);
        this.ages90AndOver = Math_Integer.parseInt(fields[17]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", agesAll=" + agesAll 
                + ", ages0to4=" + ages0to4 + ", ages5to7=" + ages5to7 
                + ", ages8to9=" + ages8to9 + ", ages10to14=" + ages10to14 
                + ", age15=" + age15 + ", ages16to17=" + ages16to17 
                + ", ages18to19=" + ages18to19 + ", ages20to24=" + ages20to24 
                + ", ages25to29=" + ages25to29 + ", ages30to44=" + ages30to44 
                + ", ages45to59=" + ages45to59 + ", ages60to64=" + ages60to64 
                + ", ages65to74=" + ages65to74 + ", ages75to84=" + ages75to84 
                + ", ages85to89=" + ages85to89 
                + ", ages90AndOver=" + ages90AndOver;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        String r = super.toCSV();
        r += "," + this.agesAll;
        r += "," + this.ages0to4;
        r += "," + this.ages5to7;
        r += "," + this.ages8to9;
        r += "," + this.ages10to14;
        r += "," + this.age15;
        r += "," + this.ages16to17;
        r += "," + this.ages18to19;
        r += "," + this.ages20to24;
        r += "," + this.ages25to29;
        r += "," + this.ages30to44;
        r += "," + this.ages45to59;
        r += "," + this.ages60to64;
        r += "," + this.ages65to74;
        r += "," + this.ages75to84;
        r += "," + this.ages85to89;
        r += "," + this.ages90AndOver;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        String r = super.toCSVHeader();
        r += ",agesAll";
        r += ",ages0to4";
        r += ",ages5to7";
        r += ",ages8to9";
        r += ",ages10to14";
        r += ",age15";
        r += ",ages16to17";
        r += ",ages18to19";
        r += ",ages20to24";
        r += ",ages25to29";
        r += ",ages30to44";
        r += ",ages45to59";
        r += ",ages60to64";
        r += ",ages65to74";
        r += ",ages75to84";
        r += ",ages85to89";
        r += ",ages90AndOver";
        return r;
    }

    /**
     * Returns a copy of this.agesAll
     * @return 
     */
    public int getAgesAll() {
        return this.agesAll;
    }

    /**
     * Returns a copy of this.ages0to4
     * @return 
     */
    public int getAges0to4() {
        return this.ages0to4;
    }

    /**
     * Returns a copy of this.ages5to7
     * @return 
     */
    public int getAges5to7() {
        return this.ages5to7;
    }

    /**
     * Returns a copy of this.ages8to9
     * @return 
     */
    public int getAges8to9() {
        return this.ages8to9;
    }

    /**
     * Returns a copy of this.ages10to14
     * @return 
     */
    public int getAges10to14() {
        return this.ages10to14;
    }

    /**
     * Returns a copy of this.age15
     * @return 
     */
    public int getAge15() {
        return this.age15;
    }

    /**
     * Returns a copy of this.ages16to17
     * @return 
     */
    public int getAges16to17() {
        return this.ages16to17;
    }

    /**
     * Returns a copy of this.ages18to19
     * @return 
     */
    public int getAges18to19() {
        return this.ages18to19;
    }

    /**
     * Returns a copy of this.ages20to24
     * @return 
     */
    public int getAges20to24() {
        return this.ages20to24;
    }

    /**
     * Returns a copy of this.ages25to29
     * @return 
     */
    public int getAges25to29() {
        return this.ages25to29;
    }

    /**
     * Returns a copy of this.ages30to44
     * @return 
     */
    public int getAges30to44() {
        return this.ages30to44;
    }

    /**
     * Returns a copy of this.ages45to59
     * @return 
     */
    public int getAges45to59() {
        return this.ages45to59;
    }

    /**
     * Returns a copy of this.ages60to64
     * @return 
     */
    public int getAges60to64() {
        return this.ages60to64;
    }

    /**
     * Returns a copy of this.ages65to74
     * @return 
     */
    public int getAges65to74() {
        return this.ages65to74;
    }

    /**
     * Returns a copy of this.ages75to84
     * @return 
     */
    public int getAges75to84() {
        return this.ages75to84;
    }

    /**
     * Returns a copy of this.ages85to89
     * @return 
     */
    public int getAges85to89() {
        return this.ages85to89;
    }

    /**
     * Returns a copy of this.ages90AndOver
     * @return 
     */
    public int getAges90AndOver() {
        return this.ages90AndOver;
    }
}
