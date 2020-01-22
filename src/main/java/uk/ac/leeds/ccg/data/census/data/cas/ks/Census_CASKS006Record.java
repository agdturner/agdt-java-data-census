/**
 * A component of a library for
 * <a href="http://www.geog.leeds.ac.uk/people/a.turner/projects/MoSeS">MoSeS</a>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 */
package uk.ac.leeds.ccg.data.census.data.cas.ks;

import uk.ac.leeds.ccg.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.data.census.data.id.Census_RecordID;
import uk.ac.leeds.ccg.math.Math_Integer;

/**
 * For storing a CASKS006 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS006Record extends Census_AreaRecord {

    /*
     * Ethnic group: All people NB: This table contains counts of Persons
     */
    /**
     * KS0060001 = allPeople
     */
    protected int allPeople;
    /**
     * KS0060002 = whiteWhiteBritish
     */
    protected int whiteWhiteBritish;
    /**
     * KS0060003 = whiteWhiteIrish
     */
    protected int whiteWhiteIrish;
    /**
     * KS0060004 = whiteOtherWhite
     */
    protected int whiteOtherWhite;
    /**
     * KS0060005 = mixedWhiteAndBlackCarribean
     */
    protected int mixedWhiteAndBlackCarribean;
    /**
     * KS0060006 = mixedWhiteAndBlackAfrican
     */
    protected int mixedWhiteAndBlackAfrican;
    /**
     * KS0060007 = mixedWhiteAndAsian
     */
    protected int mixedWhiteAndAsian;
    /**
     * KS0060008 = mixedOtherWhite
     */
    protected int mixedOtherWhite;
    /**
     * KS0060009 = asianOrAsianBritishIndian
     */
    protected int asianOrAsianBritishIndian;
    /**
     * KS0060010 = asianOrAsianBritishPakistani
     */
    protected int asianOrAsianBritishPakistani;
    /**
     * KS0060011 = asianOrAsianBritishBangledeshi
     */
    protected int asianOrAsianBritishBangledeshi;
    /**
     * KS0060012 = asianOrAsianBritishOtherAsian
     */
    protected int asianOrAsianBritishOtherAsian;
    /**
     * KS0060013 = blackOrBlackBritishCaribbean
     */
    protected int blackOrBlackBritishCaribbean;
    /**
     * KS0060014 = blackOrBlackBritishAfrican
     */
    protected int blackOrBlackBritishAfrican;
    /**
     * KS0060015 = blackOrBlackBritishOtherBlack
     */
    protected int blackOrBlackBritishOtherBlack;
    /**
     * KS0060016 = chineseOrOtherEthnicGroupChinese
     */
    protected int chineseOrOtherEthnicGroupChinese;
    /**
     * KS0060017 = chineseOrOtherEthnicGroupOtherEthnicGroup
     */
    protected int chineseOrOtherEthnicGroupOtherEthnicGroup;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS006Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS006Record(Census_RecordID rID, String line) {
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
        zoneCode = fields[0].substring(1, 11);
        // From Table KS006
        this.allPeople = Math_Integer.parseInt(fields[1]);
        this.whiteWhiteBritish = Math_Integer.parseInt(fields[2]);
        this.whiteWhiteIrish = Math_Integer.parseInt(fields[3]);
        this.whiteOtherWhite = Math_Integer.parseInt(fields[4]);
        this.mixedWhiteAndBlackCarribean = Math_Integer.parseInt(fields[5]);
        this.mixedWhiteAndBlackAfrican = Math_Integer.parseInt(fields[6]);
        this.mixedWhiteAndAsian = Math_Integer.parseInt(fields[7]);
        this.mixedOtherWhite = Math_Integer.parseInt(fields[8]);
        this.asianOrAsianBritishIndian = Math_Integer.parseInt(fields[9]);
        this.asianOrAsianBritishPakistani = Math_Integer.parseInt(fields[10]);
        this.asianOrAsianBritishBangledeshi = Math_Integer.parseInt(fields[11]);
        this.asianOrAsianBritishOtherAsian = Math_Integer.parseInt(fields[12]);
        this.blackOrBlackBritishCaribbean = Math_Integer.parseInt(fields[13]);
        this.blackOrBlackBritishAfrican = Math_Integer.parseInt(fields[14]);
        this.blackOrBlackBritishOtherBlack = Math_Integer.parseInt(fields[15]);
        this.chineseOrOtherEthnicGroupChinese = Math_Integer.parseInt(fields[16]);
        this.chineseOrOtherEthnicGroupOtherEthnicGroup = Math_Integer.parseInt(fields[17]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", allPeople " + allPeople
                + ", whiteWhiteBritish " + whiteWhiteBritish 
                + ", whiteWhiteIrish " + whiteWhiteIrish 
                + ", whiteOtherWhite " + whiteOtherWhite 
                + ", mixedWhiteAndBlackCarribean " + mixedWhiteAndBlackCarribean 
                + ", mixedWhiteAndBlackAfrican " + mixedWhiteAndBlackAfrican 
                + ", mixedWhiteAndAsian " + mixedWhiteAndAsian 
                + ", mixedOtherWhite " + mixedOtherWhite
                + ", asianOrAsianBritishIndian " + asianOrAsianBritishIndian 
                + ", asianOrAsianBritishPakistani " + asianOrAsianBritishPakistani 
                + ", asianOrAsianBritishBangledeshi " + asianOrAsianBritishBangledeshi
                + ", asianOrAsianBritishOtherAsian " + asianOrAsianBritishOtherAsian 
                + ", blackOrBlackBritishCaribbean " + blackOrBlackBritishCaribbean 
                + ", blackOrBlackBritishAfrican " + blackOrBlackBritishAfrican 
                + ", blackOrBlackBritishOtherBlack " + blackOrBlackBritishOtherBlack 
                + ", chineseOrOtherEthnicGroupChinese " + chineseOrOtherEthnicGroupChinese 
                + ", chineseOrOtherEthnicGroupOtherEthnicGroup " + chineseOrOtherEthnicGroupOtherEthnicGroup;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        String r = super.toCSV();
        r += "," + this.allPeople;
        r += "," + this.whiteWhiteBritish;
        r += "," + this.whiteWhiteIrish;
        r += "," + this.whiteOtherWhite;
        r += "," + this.mixedWhiteAndBlackCarribean;
        r += "," + this.mixedWhiteAndBlackAfrican;
        r += "," + this.mixedWhiteAndAsian;
        r += "," + this.mixedOtherWhite;
        r += "," + this.asianOrAsianBritishIndian;
        r += "," + this.asianOrAsianBritishPakistani;
        r += "," + this.asianOrAsianBritishBangledeshi;
        r += "," + this.asianOrAsianBritishOtherAsian;
        r += "," + this.blackOrBlackBritishCaribbean;
        r += "," + this.blackOrBlackBritishAfrican;
        r += "," + this.blackOrBlackBritishOtherBlack;
        r += "," + this.chineseOrOtherEthnicGroupChinese;
        r += "," + this.chineseOrOtherEthnicGroupOtherEthnicGroup;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        String r = super.toCSVHeader();
        r += ",allPeople";
        r += ",whiteWhiteBritish";
        r += ",whiteWhiteIrish";
        r += ",whiteOtherWhite";
        r += ",mixedWhiteAndBlackCarribean";
        r += ",mixedWhiteAndBlackAfrican";
        r += ",mixedWhiteAndAsian";
        r += ",mixedOtherWhite";
        r += ",asianOrAsianBritishIndian";
        r += ",asianOrAsianBritishPakistani";
        r += ",asianOrAsianBritishBangledeshi";
        r += ",asianOrAsianBritishOtherAsian";
        r += ",blackOrBlackBritishCaribbean";
        r += ",blackOrBlackBritishAfrican";
        r += ",blackOrBlackBritishOtherBlack";
        r += ",chineseOrOtherEthnicGroupChinese";
        r += ",chineseOrOtherEthnicGroupOtherEthnicGroup";
        return r;
    }

    /**
     * Returns a copy of this.allPeople
     * @return 
     */
    public int getAllPeople() {
        return this.allPeople;
    }

    /**
     * Returns a copy of this.whiteWhiteBritish
     * @return 
     */
    public int getWhiteWhiteBritish() {
        return this.whiteWhiteBritish;
    }

    /**
     * Returns a copy of this.whiteWhiteIrish
     * @return 
     */
    public int getWhiteWhiteIrish() {
        return this.whiteWhiteIrish;
    }

    /**
     * Returns a copy of this.whiteOtherWhite
     * @return 
     */
    public int getWhiteOtherWhite() {
        return this.whiteOtherWhite;
    }

    /**
     * Returns a copy of this.mixedWhiteAndBlackCarribean
     * @return 
     */
    public int getMixedWhiteAndBlackCarribean() {
        return this.mixedWhiteAndBlackCarribean;
    }

    /**
     * Returns a copy of this.mixedWhiteAndBlackAfrican
     * @return 
     */
    public int getMixedWhiteAndBlackAfrican() {
        return this.mixedWhiteAndBlackAfrican;
    }

    /**
     * Returns a copy of this.mixedWhiteAndAsian
     * @return 
     */
    public int getMixedWhiteAndAsian() {
        return this.mixedWhiteAndAsian;
    }

    /**
     * Returns a copy of this.mixedOtherWhite
     * @return 
     */
    public int getMixedOtherWhite() {
        return this.mixedOtherWhite;
    }

    /**
     * Returns a copy of this.asianOrAsianBritishIndian
     * @return 
     */
    public int getAsianOrAsianBritishIndian() {
        return this.asianOrAsianBritishIndian;
    }

    /**
     * Returns a copy of this.asianOrAsianBritishPakistani
     * @return 
     */
    public int getAsianOrAsianBritishPakistani() {
        return this.asianOrAsianBritishPakistani;
    }

    /**
     * Returns a copy of this.asianOrAsianBritishBangledeshi
     * @return 
     */
    public int getAsianOrAsianBritishBangledeshi() {
        return this.asianOrAsianBritishBangledeshi;
    }

    /**
     * Returns a copy of this.asianOrAsianBritishOtherAsian
     * @return 
     */
    public int getAsianOrAsianBritishOtherAsian() {
        return this.asianOrAsianBritishOtherAsian;
    }

    /**
     * Returns a copy of this.blackOrBlackBritishCaribbean
     * @return 
     */
    public int getBlackOrBlackBritishCaribbean() {
        return this.blackOrBlackBritishCaribbean;
    }

    /**
     * Returns a copy of this.blackOrBlackBritishAfrican
     * @return 
     */
    public int getBlackOrBlackBritishAfrican() {
        return this.blackOrBlackBritishAfrican;
    }

    /**
     * Returns a copy of this.blackOrBlackBritishOtherBlack
     * @return 
     */
    public int getBlackOrBlackBritishOtherBlack() {
        return this.blackOrBlackBritishOtherBlack;
    }

    /**
     * Returns a copy of this.chineseOrOtherEthnicGroupOtherEthnicGroup
     * @return 
     */
    public int getChineseOrOtherEthnicGroupOtherEthnicGroup() {
        return this.chineseOrOtherEthnicGroupOtherEthnicGroup;
    }

    /**
     * Returns a copy of this.chineseOrOtherEthnicGroupChinese
     * @return 
     */
    public int getChineseOrOtherEthnicGroupChinese() {
        return this.chineseOrOtherEthnicGroupChinese;
    }
}
