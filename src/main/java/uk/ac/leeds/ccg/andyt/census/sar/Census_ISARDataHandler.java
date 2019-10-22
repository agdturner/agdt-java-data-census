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
import java.util.Random;
import java.util.Vector;
import uk.ac.leeds.ccg.andyt.census.core.Census_Environment;
import uk.ac.leeds.ccg.andyt.data.Data_AbstractHandler;
import uk.ac.leeds.ccg.andyt.data.Data_AbstractRecord;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_ErrorAndExceptionHandler;

/**
 * For accessing ISARDataRecords and information about them.
 */
public class Census_ISARDataHandler extends Data_AbstractHandler {

    /**
     * For storing ISARDataRecords.
     */
    protected Census_ISARDataRecord[] _ISARDataRecordArray;
    protected HashMap _AgeSexType_ISARDataRecordVector_HashMap_0;
    protected HashMap _AgeSexType_ISARDataRecordVector_HashMap_1;

    /**
     * Creates a new instance of ISARDataHandler
     */
    public Census_ISARDataHandler(Census_Environment e) {
        super(e);
    }

//    /**
//     * Creates a new instance of ISARDataHandler from aFile.
//     *
//     * @param f
//     */
//    public Census_ISARDataHandler(Census_Environment e, File f) {
//        env = e;
//        dir = f.getParentFile();
//        init(dir);
//        if (f.getName().endsWith(".dat")) {
//            init(f.getParentFile());
//            load(f);
//            this.recordLength = new Census_ISARDataRecord().getSizeInBytes();
//            loadIntoCache();
//            File thisFile = new File(dir,
//                    this.getClass().getCanonicalName() + ".thisFile");
//            init_AgeSexType_ISARDataRecordVector_HashMap_0();
//            env.env.io.writeObject(this, thisFile);
//        } else {
//            Object object = env.env.io.readObject(f);
//            Census_ISARDataHandler aISARDataHandler = (Census_ISARDataHandler) object;
//            load(f);
//            this.recordLength = aISARDataHandler.recordLength;
//            //this._RecordLength = new Census_ISARDataRecord().getSizeInBytes();
//            this._ISARDataRecordArray = aISARDataHandler._ISARDataRecordArray;
//            this._AgeSexType_ISARDataRecordVector_HashMap_0 = aISARDataHandler._AgeSexType_ISARDataRecordVector_HashMap_0;
//        }
//    }

    /**
     * Loads ISARDataRecords into the cache.
     */
    public void loadIntoCache() throws IOException {
        long nDataRecords = super.getNDataRecords();
        if (nDataRecords > Integer.MAX_VALUE) {
            env.env.log("nDataRecords>Integer.MAX_VALUE");
            System.exit(Generic_ErrorAndExceptionHandler.NumberFormatException);
        }
        this._ISARDataRecordArray = new Census_ISARDataRecord[(int) nDataRecords];
        try {
            this.rAF.seek(0);
        } catch (IOException ioe0) {
            ioe0.printStackTrace();
        }
        for (int _ISARRecordID = 0; _ISARRecordID < nDataRecords; _ISARRecordID++) {
            this._ISARDataRecordArray[_ISARRecordID] = new Census_ISARDataRecord(
                    this.rAF);
            if (_ISARRecordID % 10000 == 0) {
                env.env.log("loadIntoCache " + _ISARRecordID);
            }
        }
        init_AgeSexType_ISARDataRecordVector_HashMap_0();
    }

    /**
     * Loads from source file
     *
     * @param sourceFile
     * @param formattedFile
     * @throws java.io.IOException
     */
    public void formatSource(            File sourceFile,            File formattedFile)
            throws IOException {
        file = formattedFile;
//        file = new File (
//                dir,
//                ISARDataRecords.dat);
        if (!file.exists()) {
            this.file.createNewFile();
        }
        this.rAF = new RandomAccessFile(this.file, "rw");
        //File sourceFile = new File(
        //        "C:/work/data/census/2001/SAR/01uklicind-20050401.dat");
        BufferedReader aBufferedReader
                = new BufferedReader(
                        new InputStreamReader(
                                new FileInputStream(sourceFile)));
        StreamTokenizer aStreamTokenizer
                = new StreamTokenizer(aBufferedReader);
        env.env.io.setStreamTokenizerSyntax2(aStreamTokenizer);
        String line;
        long RecordID = 0L;
        Census_ISARDataRecord aISARDataRecord = new Census_ISARDataRecord();
        // Skip the first line
        int tokenType = aStreamTokenizer.nextToken();
        while (tokenType != StreamTokenizer.TT_EOL) {
            tokenType = aStreamTokenizer.nextToken();
        }
        tokenType = aStreamTokenizer.nextToken();
        boolean parsed = false;
        while (tokenType != aStreamTokenizer.TT_EOF) {
            switch (tokenType) {
                case StreamTokenizer.TT_EOL:
                    if (RecordID % 10000 == 0) {
                        env.env.log(aISARDataRecord.toString());
                    }
                    // Write out householdSARRecord
                    if (parsed) {
                        aISARDataRecord.write(this.rAF);
                        // env.env.log( "this.tRandomAccessFile.length() " +
                        // this.tRandomAccessFile.length() );
                        RecordID++;
                    }
                    break;
                case StreamTokenizer.TT_WORD:
                    line = aStreamTokenizer.sval;
                    parsed = aISARDataRecord.parse(
                            RecordID,
                            line);
                    break;
            }
            tokenType = aStreamTokenizer.nextToken();
        }
        env.env.log("Number of ISARDataRecords loaded " + (RecordID + 1L));
        this.rAF.close();
        this.rAF = new RandomAccessFile(this.file, "r");
    }

    /**
     * @param RecordID The <code>RecordID</code> of the
     * <code>Census_ISARDataRecord</code> to be returned.
     * @return
     */
    public Data_AbstractRecord getDataRecord(long RecordID) {
        return getISARDataRecord(RecordID);
    }

    /**
     * @param RecordID The <code>RecordID</code> of the
     * <code>Census_ISARDataRecord</code> to be returned.
     * @return
     */
    public Census_ISARDataRecord getISARDataRecord(long RecordID) {
        return this._ISARDataRecordArray[(int) RecordID];
    }

    /**
     * @return _AgeSexType_ISARDataRecordArray_HashMap first initialising it if
     * it is null.
     */
    public HashMap get_AgeSexType_ISARDataRecordVector_HashMap_0() {
        if (_AgeSexType_ISARDataRecordVector_HashMap_0 == null) {
            init_AgeSexType_ISARDataRecordVector_HashMap_0();
        }
        return _AgeSexType_ISARDataRecordVector_HashMap_0;
    }

    /**
     * Initialises _AgeSexType_ISARDataRecordArray_HashMap by going through
     * _ISARDataRecordArray.
     */
    protected void init_AgeSexType_ISARDataRecordVector_HashMap_0() {
        _AgeSexType_ISARDataRecordVector_HashMap_0
                = get_AgeSexType_ISARDataRecordVector_HashMap_0(_ISARDataRecordArray);
    }

    /**
     * Method to be used to look up Census_ISARDataRecord from
     * Census_ISARDataRecord._ID.
     *
     * @return a HashMap for looking up RecordID from ID
     */
    public HashMap get_ID_RecordID_HashMap() {
        //public HashMap<Long,Long> get_ID_RecordID_HashMap() {
        HashMap tID_RecordID_HashMap = new HashMap();
        Census_ISARDataRecord aISARDataRecord;
        for (long RecordID = 0; RecordID < getNDataRecords(); RecordID++) {
            aISARDataRecord = getISARDataRecord(RecordID);
            tID_RecordID_HashMap.put(
                    aISARDataRecord.get_ID(),
                    RecordID);
        }
        return tID_RecordID_HashMap;
    }

    @Override
    public long getNDataRecords() {
        return this._ISARDataRecordArray.length;

    }

    /**
     * @param a_ISARDataRecord_Array@return HashMap<AgeSexType,Vector>
     *
     */
    public HashMap<AgeSexType, Vector> get_AgeSexType_ISARDataRecordVector_HashMap_0(
            Census_ISARDataRecord[] a_ISARDataRecord_Array) {
        HashMap<AgeSexType, Vector> aAgeSexType_ISARDataRecordVector_HashMap_0 = new HashMap();
        Census_ISARDataRecord a_ISARDataRecord;
        AgeSexType a_AgeSexType;
        Object object;
        Vector a_ISARDataRecord_Vector;
        for (int aISARDataRecordID = 0; aISARDataRecordID < a_ISARDataRecord_Array.length; aISARDataRecordID++) {
            a_ISARDataRecord = a_ISARDataRecord_Array[aISARDataRecordID];
            a_AgeSexType = new AgeSexType(a_ISARDataRecord);
            object = aAgeSexType_ISARDataRecordVector_HashMap_0.get(a_AgeSexType);
            if (object == null) {
                a_ISARDataRecord_Vector = new Vector();
            } else {
                a_ISARDataRecord_Vector = (Vector) object;
            }
            a_ISARDataRecord_Vector.add(a_ISARDataRecord);
            aAgeSexType_ISARDataRecordVector_HashMap_0.put(
                    a_AgeSexType,
                    a_ISARDataRecord_Vector);
        }
        return aAgeSexType_ISARDataRecordVector_HashMap_0;
    }

    /**
     * a return integer count of the number of other ISARDataRecords in
     * _ISARDataRecordArray with the same      <code>
     * AgeSexType(aISARDataRecord)
     * </code>
     *
     * @param aISARDataRecord
     * @return
     */
    public int getAgeSexTypeCount_0(Census_ISARDataRecord aISARDataRecord) {
        AgeSexType aAgeSexType = new AgeSexType(aISARDataRecord);
        HashMap aAgeSexType_ISARDataRecordVector_HashMap
                = get_AgeSexType_ISARDataRecordVector_HashMap_0();
        Object object = aAgeSexType_ISARDataRecordVector_HashMap.get(aAgeSexType);
        if (object == null) {
            return 0;
        } else {
            Vector _ISARDataRecordVector = (Vector) object;
            return _ISARDataRecordVector.size();
        }
    }

    /**
     * a return integer count of the number of other ISARDataRecords in
     * _ISARDataRecordArray with the same      <code>
     * AgeSexType(aISARDataRecord)
     * </code>
     *
     * @param aAgeSexType
     * @return
     */
    public int getAgeSexTypeCount_0(AgeSexType aAgeSexType) {
        HashMap aAgeSexType_ISARDataRecordVector_HashMap
                = get_AgeSexType_ISARDataRecordVector_HashMap_0();
        Object object = aAgeSexType_ISARDataRecordVector_HashMap.get(aAgeSexType);
        if (object == null) {
            return 0;
        } else {
            Vector _ISARDataRecordVector = (Vector) object;
            return _ISARDataRecordVector.size();
        }
    }

    /**
     *
     * @param aISARDataRecord
     * @param aRandom
     * @return Census_ISARDataRecord with the same AgeSexType as aISARDataRecord
     * or null if there is no such Census_ISARDataRecord
     */
    public Census_ISARDataRecord getISARDataRecord(
            Random aRandom,
            Census_ISARDataRecord aISARDataRecord) {
        Census_ISARDataRecord result;
        HashMap aAgeSexType_ISARDataRecordVector_HashMap
                = get_AgeSexType_ISARDataRecordVector_HashMap_0();
        AgeSexType aAgeSexType = new AgeSexType(aISARDataRecord);
        int aAgeSexTypeCount = getAgeSexTypeCount_0(aAgeSexType);
        int index;
        if (aAgeSexTypeCount == 0) {
            return null;
        } else {
            index = aRandom.nextInt(aAgeSexTypeCount);
        }
        Vector aAgeSexType_ISARDataRecordVector = (Vector) aAgeSexType_ISARDataRecordVector_HashMap.get(aAgeSexType);
        result = (Census_ISARDataRecord) aAgeSexType_ISARDataRecordVector.elementAt(index);
        return result;
    }

    /**
     * @param aRandom
     * @param aAgeSexType
     * @return Census_ISARDataRecord with the same AgeSexType as aISARDataRecord
     * or null if there is no such Census_ISARDataRecord
     */
    public Census_ISARDataRecord getISARDataRecord(
            Random aRandom,
            AgeSexType aAgeSexType) {
        Census_ISARDataRecord result;
        HashMap aAgeSexType_ISARDataRecordVector_HashMap
                = get_AgeSexType_ISARDataRecordVector_HashMap_0();
        int aAgeSexTypeCount = getAgeSexTypeCount_0(aAgeSexType);
        int index;
        if (aAgeSexTypeCount == 0) {
            return null;
        } else {
            index = aRandom.nextInt(aAgeSexTypeCount);
        }
        Vector aAgeSexType_ISARDataRecordVector = (Vector) aAgeSexType_ISARDataRecordVector_HashMap.get(aAgeSexType);
        result = (Census_ISARDataRecord) aAgeSexType_ISARDataRecordVector.elementAt(index);
        return result;
    }

    public static short getRELTOHRType1(
            Census_ISARDataRecord aISARDataRecord) {
        short _RELTOHR = aISARDataRecord.get_RELTOHR();
        if (_RELTOHR == 1) {
            return 1;
        }
        if (_RELTOHR == -9) {
            return -9;
        }
        return 2;
    }
//    /**
//     * @return an Census_ISARDataRecord[] of randomly selected ISARDataRecords
//     * with the same aggregate AgeSexType counts as aISARDataRecords.
//     */
//    public Census_ISARDataRecord[] getISARDataRecords(
//            Census_ISARDataRecord[] aISARDataRecords,
//            Random aRandom) {
//        HashMap aAgeSexType_ISARDataRecordVector_HashMap_0 =
//                get_AgeSexType_ISARDataRecordVector_HashMap_0(aISARDataRecords);
//    }

    /**
     * A simple class for distinguishing ISARDataRecords into those with the
     * same of Age, Sex and Type characteristics where Type can be either:
     * RELTOHR = 1 for HRP RELTOHR = -9 for Communal Establishment Populations
     * RELTOHR = other for general household person
     */
    public class AgeSexType
            implements Serializable, Comparable {

        /**
         * For storing _AGE
         */
        protected short _Age;
        /**
         * For storing the _SEX
         */
        protected boolean _Sex;
        /**
         * For storing Type
         */
        protected short _Type;

        public AgeSexType() {
        }

        public AgeSexType(
                short _Age,
                boolean _Sex,
                short _Type) {
            this._Age = _Age;
            this._Sex = _Sex;
            this._Type = _Type;
        }

        public AgeSexType(
                AgeSexType aAgeSexType) {
            this._Age = aAgeSexType._Age;
            this._Sex = aAgeSexType._Sex;
            this._Type = aAgeSexType._Type;
        }

        public AgeSexType(
                Census_ISARDataRecord aISARDataRecord) {
            _Age = aISARDataRecord._AGE0;
            _Sex = aISARDataRecord._SEX;
            _Type = getRELTOHRType1(aISARDataRecord);
        }

        public short get_Age() {
            return _Age;
        }

        public boolean is_Sex() {
            return _Sex;
        }

        public short get_Type() {
            return _Type;
        }

        @Override
        public boolean equals(Object o) {
            return (compareTo(o) == 0);
        }

        @Override
        public int hashCode() {
            int hash = 7;
            hash = 89 * hash + this._Age;
            hash = 89 * hash + (this._Sex ? 1 : 0);
            hash = 89 * hash + this._Type;
            return hash;
        }

        public int compareTo(Object o) {
            if (o != null) {
                if (o instanceof AgeSexType) {
                    AgeSexType aAgeSexType = (AgeSexType) o;
                    if (aAgeSexType._Age > _Age) {
                        return 1;
                    }
                    if (aAgeSexType._Sex == true && _Sex == false) {
                        return 1;
                    }
                    if (aAgeSexType._Sex == false && _Sex == true) {
                        return -1;
                    }
                    if (aAgeSexType._Type > _Type) {
                        return 1;
                    }
                    if (aAgeSexType._Type < _Type) {
                        return -1;
                    }
                    return 0;
                }
            }
            return -1;
        }
    }
}
