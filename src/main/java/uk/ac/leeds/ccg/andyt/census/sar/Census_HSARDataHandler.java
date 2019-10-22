/**
 * A component of a library for
 * <a href="http://www.geog.leeds.ac.uk/people/a.turner/projects/MoSeS">MoSeS</a>.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.
 */
package uk.ac.leeds.ccg.andyt.census.sar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Vector;
import uk.ac.leeds.ccg.andyt.census.core.Census_Environment;
import uk.ac.leeds.ccg.andyt.data.Data_AbstractHandler;
import uk.ac.leeds.ccg.andyt.data.Data_AbstractRecord;
import uk.ac.leeds.ccg.andyt.data.converter.Data_AgeConverter;

/**
 * For accessing HSARDataRecords and information about them.
 */
public class Census_HSARDataHandler extends Data_AbstractHandler {

    public Census_Environment env;

    /**
     * For storing all HSARDataRecords
     */
    protected Census_HSARDataRecord[] _HSARDataRecordArray;
    /**
     * A collection providing a convenient way to access data for specific
     * AgeSex classes for HRPs. Keys are AgeSex. Values are Vectors of
     * HSARDataRecords.
     */
    protected HashMap _AgeSexHRP_HSARDataRecordVector_HashMap;

    /**
     * A collection providing a convenient way to access all other
     * HSARDataRecords for a household with a given Household ID. Keys are
     * integer HID. Values are Vectors (of HSARDataRecords) with the first being
     * the Household Reference Person.
     */
    protected HashMap _HID_HSARDataRecordVector_HashMap;

    /**
     * Creates a new instance of HSARDataHandler
     */
    public Census_HSARDataHandler(Census_Environment e) throws IOException {
        super (e);
    }

//    /**
//     * Creates a new instance of HSARDataHandler from aFile.
//     *
//     * @param aFile
//     */
//    public Census_HSARDataHandler( File aFile) {
//        File dir = aFile.getParentFile();
//        init(dir);
//        if (aFile.getName().endsWith(".dat")) {
//            init(aFile.getParentFile());
//            load(aFile);
//            this.recordLength = new Census_ISARDataRecord().getSizeInBytes();
//            loadIntoCache();
//            File thisFile = new File(dir,
//                    this.getClass().getCanonicalName() + ".thisFile");
//            env.env.io.writeObject(this, thisFile);
//        } else {
//            Object object = env.env.io.readObject(aFile);
//            Census_HSARDataHandler aHSARDataHandler = (Census_HSARDataHandler) object;
//            load(aFile);
//            this.recordLength = aHSARDataHandler.recordLength;
//            //this._RecordLength = new Census_ISARDataRecord().getSizeInBytes();
//            this._HSARDataRecordArray = aHSARDataHandler._HSARDataRecordArray;
//            this._AgeSexHRP_HSARDataRecordVector_HashMap = aHSARDataHandler._AgeSexHRP_HSARDataRecordVector_HashMap;
//            this._HID_HSARDataRecordVector_HashMap = aHSARDataHandler._HID_HSARDataRecordVector_HashMap;
//        }
//    }

    /**
     * Loads from source file
     *
     * @param sourceFile
     * @param formattedFile
     * @throws java.io.IOException
     */
    public void formatSource(File sourceFile, File formattedFile) 
            throws IOException {
        file = formattedFile;
//        file = new File (dir, HSARDataRecords.dat);
        if (!file.exists()) {
            this.file.createNewFile();
        }
        this.rAF = new RandomAccessFile(this.file, "rw");
        //File sourceFile = new File(
        //        "C:/Work/data/Census/2001/SAR/household/5278TAB/UKDA-5278-tab/tab/lichhd-051019.tab");
        BufferedReader br = env.env.io.getBufferedReader(sourceFile);
        StreamTokenizer st = new StreamTokenizer(br);
        env.env.io.setStreamTokenizerSyntax2(st);
        String line;
        long RecordID = 0L;
        Census_HSARDataRecord aHSARDataRecord = new Census_HSARDataRecord();
        // Skip the first line
        int tokenType = st.nextToken();
        while (tokenType != StreamTokenizer.TT_EOL) {
            tokenType = st.nextToken();
        }
        tokenType = st.nextToken();
        boolean parsed = false;
        while (tokenType != StreamTokenizer.TT_EOF) {
            switch (tokenType) {
                case StreamTokenizer.TT_EOL:
                    if (RecordID % 10000 == 0) {
                        env.env.log(aHSARDataRecord.toString());
                    }
                    // Write out householdSARRecord
                    if (parsed) {
                        aHSARDataRecord.write(this.rAF);
                        // env.env.log( "this.tRandomAccessFile.length() " +
                        // this.tRandomAccessFile.length() );
                        RecordID++;
                    }
                    break;
                case StreamTokenizer.TT_WORD:
                    line = st.sval;
                    parsed = aHSARDataRecord.parse(
                            RecordID,
                            line);
                    break;
            }
            tokenType = st.nextToken();
        }
        env.env.log("Number of HSARDataRecords loaded " + (RecordID + 1L));
        this.rAF.close();
        this.rAF = new RandomAccessFile(this.file, "r");
    }

    /**
     * Loads this.tAGEHHRPVectors and this.tHouseholdVectors
     */
    private void initVectors() {
        this._HID_HSARDataRecordVector_HashMap = new HashMap();
        this._AgeSexHRP_HSARDataRecordVector_HashMap = new HashMap();
        AgeSex aAgeSex;
        Census_HSARDataRecord aHSARDataRecord;
        long nDataRecords = getNDataRecords();
        boolean HRP;
        int HHID;
        for (long RecordID = 0L; RecordID < nDataRecords; RecordID++) {
            aHSARDataRecord = getHSARDataRecord(RecordID);
            HRP = aHSARDataRecord.get_HRP();
            if (HRP) {
                aAgeSex = new AgeSex(
                        aHSARDataRecord.get_AGEH(),
                        aHSARDataRecord.get_SEX());
                if (this._AgeSexHRP_HSARDataRecordVector_HashMap.containsKey(aAgeSex)) {
                    ((Vector) this._AgeSexHRP_HSARDataRecordVector_HashMap.get(aAgeSex)).add(aHSARDataRecord);
                } else {
                    Vector aHSARDataRecordsVector = new Vector();
                    aHSARDataRecordsVector.add(aHSARDataRecord);
                    this._AgeSexHRP_HSARDataRecordVector_HashMap.put(
                            aAgeSex,
                            aHSARDataRecordsVector);
                }
            }
            HHID = aHSARDataRecord.get_HHID();
            if (this._HID_HSARDataRecordVector_HashMap.containsKey(HHID)) {
                // Add HRP at the start
                if (HRP) {
                    ((Vector) this._HID_HSARDataRecordVector_HashMap.get(HHID)).add(
                            0,
                            aHSARDataRecord);
                } else {
                    ((Vector) this._HID_HSARDataRecordVector_HashMap.get(HHID)).add(
                            aHSARDataRecord);
                }
            } else {
                Vector aHSARDataRecordsVector = new Vector();
                aHSARDataRecordsVector.add(aHSARDataRecord);
                this._HID_HSARDataRecordVector_HashMap.put(
                        HHID,
                        aHSARDataRecordsVector);
            }
        }
        //env.env.log("this.tHouseholdVectors.size() " + this._HID_HSARDataRecordsVector_HashMap.size());
    }

    /**
     * Randomly prints out 20 HSAR records
     */
    private void printHSARDataRecords(
            Random aRandom,
            int numberOfRecords) {
        Census_HSARDataRecord aHSARDataRecord = new Census_HSARDataRecord();
        int ID = Integer.MIN_VALUE;
        int Age;
        short aAgeClassHSARDataRecord;
        boolean Sex;
        AgeSex aAgeSex;
        for (int i = 0; i < numberOfRecords; i++) {
            Age = (short) aRandom.nextInt(100);
            aAgeClassHSARDataRecord = Data_AgeConverter.getAgeClassHSARDataRecord(Age);
            Sex = aRandom.nextBoolean();
            aAgeSex = new AgeSex(
                    aAgeClassHSARDataRecord,
                    Sex);
            aHSARDataRecord = getHSARDataRecord(
                    aRandom,
                    aAgeSex);
            if (aHSARDataRecord != null) {
                env.env.log(aHSARDataRecord.toString());
            }
        }
    }

    /**
     * Loads HSARDataRecords into the cache.
     */
    public void loadIntoCache() throws IOException {
        long nDataRecords = super.getNDataRecords();
        if (nDataRecords > Integer.MAX_VALUE) {
            env.env.log("nDataRecords>Integer.MAX_VALUE");
            System.exit(4);
        }
        this._HSARDataRecordArray = new Census_HSARDataRecord[(int) nDataRecords];
        try {
            this.rAF.seek(0);
        } catch (IOException ioe0) {
            ioe0.printStackTrace();
        }
        for (int _HSARRecordID = 0; _HSARRecordID < nDataRecords; _HSARRecordID++) {
            this._HSARDataRecordArray[_HSARRecordID] = new Census_HSARDataRecord(
                    this.rAF);
            if (_HSARRecordID % 10000 == 0) {
                env.env.log("loadIntoCache " + _HSARRecordID);
            }
        }
        initVectors();
    }

    /**
     * @param aRecordID The RecordID of the Census_HSARDataRecord to be
     * returned.
     * @return
     */
    public Data_AbstractRecord getDataRecord(long aRecordID) {
        return getHSARDataRecord(aRecordID);
    }

    /**
     * @param aRecordID The RecordID of the Census_HSARDataRecord to be
     * returned.
     * @return
     */
    public Census_HSARDataRecord getHSARDataRecord(long aRecordID) {
        try {
            return this._HSARDataRecordArray[(int) aRecordID];
        } catch (NullPointerException aNullPointerException) {
            try {
                this.rAF.seek(recordLength * aRecordID);
                return new Census_HSARDataRecord(this.rAF);
            } catch (IOException ioe0) {
                ioe0.printStackTrace();
                return null;
            }
        }
    }

    /**
     * @return A pseudo random HRP Census_HSARDataRecord.
     * @param aRandom The Random used to select.
     */
    public Census_HSARDataRecord getHSARDataRecord(
            Random aRandom) {
        int age;
        short aAgeClassHSARDataRecord;
        Census_HSARDataRecord aHSARDataRecord;
        boolean sex;
        AgeSex aAgeSex;
        do {
            age = aRandom.nextInt(100);
            aAgeClassHSARDataRecord = Data_AgeConverter.getAgeClassHSARDataRecord(age);
            sex = aRandom.nextBoolean();
            aAgeSex = new AgeSex(
                    aAgeClassHSARDataRecord,
                    sex);
            aHSARDataRecord = getHSARDataRecord(aRandom, aAgeSex);
        } while (aHSARDataRecord == null);
        return aHSARDataRecord;
    }

    /**
     * @return A Vector of HSARDataRecords for the Household which contains
     * aHRPHSARDataRecord.
     * @param aHRPHSARDataRecord
     */
    public Vector getHSARDataRecordsVector(
            Census_HSARDataRecord aHRPHSARDataRecord) {
        if (this._HID_HSARDataRecordVector_HashMap.containsKey(aHRPHSARDataRecord.get_HHID())) {
            return (Vector) this._HID_HSARDataRecordVector_HashMap.get(aHRPHSARDataRecord.get_HHID());
        } else {
            env.env.log("HSARDataRecord" + aHRPHSARDataRecord.toString() + "is not an HRP!");
            return (Vector) null;
        }
    }

    /**
     * @return A Vector of Vectors of HSARDataRecords for the Households with
     * HRP as in aHRPHSARDataRecordsHashSet
     * @param aHRPHSARDataRecordsHashSet A HashSet of HSARDataRecords for HRP
     * for the HSARDataRecords returned in the Vector of Vectors
     */
    public Vector getHSARDataRecordsVectors(
            HashSet aHRPHSARDataRecordsHashSet) {
        Vector result = new Vector(aHRPHSARDataRecordsHashSet.size());
        Iterator aHRPHSARDataRecordsHashSetIterator = aHRPHSARDataRecordsHashSet.iterator();
        Vector aHousehold;
        while (aHRPHSARDataRecordsHashSetIterator.hasNext()) {
            aHousehold = getHSARDataRecordsVector((Census_HSARDataRecord) aHRPHSARDataRecordsHashSetIterator.next());
            result.add(aHousehold);
        }
        return result;
    }

    /**
     * @param aHPHRPHSARDataRecordsHashSet
     * @return All <code>HSARDataRecords</code> in a HashSet for those HRP in
     * aHPHRPHSARDataRecordsHashSet
     */
    public HashSet getHSARDataRecordsHashSet(
            HashSet aHPHRPHSARDataRecordsHashSet) {
        // Get all Householders
        HashSet tHSARDataRecords = new HashSet();
        Census_HSARDataRecord aHRPHSARDataRecord;
        Vector aHousehold;
        Iterator tIterator = aHPHRPHSARDataRecordsHashSet.iterator();
        while (tIterator.hasNext()) {
            aHRPHSARDataRecord = (Census_HSARDataRecord) tIterator.next();
            aHousehold = getHSARDataRecordsVector(aHRPHSARDataRecord);
            tHSARDataRecords.addAll(aHousehold);
        }
        return tHSARDataRecords;
    }

    /**
     * @param tHPHRPs
     * @return All <code>HSARDataRecords</code> for the Households with HRPs as
     * in Census_HSARDataRecord[] tHPHRPs
     */
    public Vector getHSARDataRecords(Census_HSARDataRecord[] tHPHRPs) {
        // Get all Householders
        Vector result = new Vector();
        Vector aHousehold;
        for (int i = 0; i < tHPHRPs.length; i++) {
            // env.env.log("i " + i + " from " + tHPHRPs.length );
            if (tHPHRPs[i] == null) {
                boolean debug = true;
                env.env.log("Null in getHSARDataRecords(HSARDataRecord[])!");
            } else {
                aHousehold = getHSARDataRecordsVector(tHPHRPs[i]);
                result.addAll(aHousehold);
            }
        }
        return result;
    }

    /**
     * @param tHPHRPRecordIDs
     * @return All <code>HSARDataRecords</code> for the Households with HRPs as
     * in Vector tHPHRPs
     */
    public Vector getHSARDataRecords(Vector tHPHRPRecordIDs) {
        // Get all Householders
        Vector result = new Vector();
        Vector aHousehold;
        for (int i = 0; i < tHPHRPRecordIDs.size(); i++) {
            // env.env.log("i " + i + " from " + tHPHRPs.length );
            if (tHPHRPRecordIDs.get(i) == null) {
                env.env.log("Null in getHSARDataRecords(Vector)!");
            } else {
                aHousehold = getHSARDataRecordsVector(getHSARDataRecord((Long) tHPHRPRecordIDs.get(i)));
                result.addAll(aHousehold);
            }
        }
        return result;
    }

    /**
     * @param aRandom
     * @param aAgeSex
     * @return A pseudo random Census_HSARDataRecord with AgeSex as in aAgeSex.
     */
    public Census_HSARDataRecord getHSARDataRecord(
            Random aRandom,
            AgeSex aAgeSex) {
        Object value = this._AgeSexHRP_HSARDataRecordVector_HashMap.get(aAgeSex);
        if (value != null) {
            Vector aHSARDataRecordVector = (Vector) value;
            if (aHSARDataRecordVector.size() > 0) {
                return (Census_HSARDataRecord) aHSARDataRecordVector.get(
                        aRandom.nextInt(aHSARDataRecordVector.size()));
            }
        }
        return null;
    }

    public HashMap get_AgeSexHRP_HSARDataRecordVector_HashMap() {
        return _AgeSexHRP_HSARDataRecordVector_HashMap;
    }

    public HashMap get_HID_HSARDataRecordVector_HashMap() {
        if (_HID_HSARDataRecordVector_HashMap == null) {
            initVectors();
        }
        return _HID_HSARDataRecordVector_HashMap;
    }

    /**
     * Method to be used to look up Census_ISARDataRecord from
     * Census_ISARDataRecord._ID.
     *
     * @return a HashMap for looking up RecordID from ID
     */
    public HashMap get_ID_RecordID_HashMap() {
        HashMap tID_RecordID_HashMap = new HashMap();
        Census_HSARDataRecord aHSARDataRecord;
        for (long RecordID = 0; RecordID < getNDataRecords(); RecordID++) {
            aHSARDataRecord = getHSARDataRecord(RecordID);
            tID_RecordID_HashMap.put(
                    aHSARDataRecord.get_ID(),
                    RecordID);
        }
        return tID_RecordID_HashMap;
    }

    @Override
    public long getNDataRecords() {
        return this._HSARDataRecordArray.length;
    }

    /**
     * A simple class for distinguishing Census_HSARDataRecord with _HRP = true
     * into those with the same of _AGEH, _Sex
     */
    public class AgeSex
            implements Serializable, Comparable {

        /**
         * For storing _AGE
         */
        protected short _Age;
        /**
         * For storing the _SEX
         */
        protected boolean _Sex;

        public AgeSex() {
        }

        public AgeSex(
                short _Age,
                boolean _Sex) {
            this._Age = _Age;
            this._Sex = _Sex;
        }

        public AgeSex(
                AgeSex aAgeSex) {
            this._Age = aAgeSex._Age;
            this._Sex = aAgeSex._Sex;
        }

        public AgeSex(
                Census_HSARDataRecord aHSARDataRecord) {
            _Age = aHSARDataRecord._AGEH;
            _Sex = aHSARDataRecord._SEX;
        }

        public short get_Age() {
            return _Age;
        }

        public boolean is_Sex() {
            return _Sex;
        }

        @Override
        public boolean equals(Object o) {
            return (compareTo(o) == 0);
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 89 * hash + this._Age;
            hash = 89 * hash + (this._Sex ? 1 : 0);
            return hash;
        }

        public int compareTo(Object o) {
            if (o != null) {
                if (o instanceof AgeSex) {
                    AgeSex aAgeSex = (AgeSex) o;
                    if (aAgeSex._Age > _Age) {
                        return 1;
                    }
                    if (aAgeSex._Sex == true && _Sex == false) {
                        return 1;
                    }
                    if (aAgeSex._Sex == false && _Sex == true) {
                        return -1;
                    }
                    return 0;
                }
            }
            return -1;
        }
    }
}
