/**
 * A component of a library for <a
 * href="http://www.geog.leeds.ac.uk/people/a.turner/projects/MoSeS">MoSeS</a>.
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
package uk.ac.leeds.ccg.andyt.census.core;

import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS002DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS14bDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS14cDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS12bDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS017DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS006DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS013DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS09cDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS023DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS020DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS12cDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS010DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS015DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS09bDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS008DataRecord;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS001DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS001DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS002DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS003DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS003DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS044DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.uv.Census_CASUV003DataRecord;
import uk.ac.leeds.ccg.andyt.data.Data_AbstractHandler;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_ErrorAndExceptionHandler;
import uk.ac.leeds.ccg.andyt.generic.util.Generic_Collections;

/**
 * For handling <code>AbstractCASDataRecords</code>.
 *
 * @version 1.0.0, 2006-08-10
 * @see Census_AbstractDataRecord
 */
public abstract class Census_AbstractDataHandler extends Data_AbstractHandler {

    public Census_Environment env;

    /**
     * Census_CAS001DataHandler
     */
    protected Census_CAS001DataHandler _CAS001DataHandler;

    /**
     * Returns this._CAS001DataHandler
     *
     * @return
     */
    public Census_CAS001DataHandler getCAS001DataHandler() {
        return this._CAS001DataHandler;
    }
    /**
     * Census_CAS003DataHandler
     */
    protected Census_CAS003DataHandler _CAS003DataHandler;

    /**
     * Returns this._CAS003DataHandler
     *
     * @return
     */
    public Census_CAS003DataHandler getCAS003DataHandler() {
        return this._CAS003DataHandler;
    }
    /**
     * For storing a one to one mapping of:
     * <code>long Census_AbstractDataRecord.RecordID</code> as keys and
     * <code>String Zone Code</code> as values.
     */
    protected HashMap _RecordIDZoneCodeHashMap;
    /**
     * For storing a look up table for converting from OA to MSOA Zone Code
     */
    protected HashMap _LookUpMSOAfromOAHashMap;

    /**
     * @return An <code>Census_AbstractDataRecord</code> for the given RecordID
     * @param RecordID The RecordID of the
     * <code>Census_AbstractDataRecord</code> to be returned.
     */
    @Override
    public abstract Census_AbstractDataRecord getDataRecord(long RecordID);

    /**
     * @return An <code>Census_AbstractDataRecord</code> for the given zoneCode
     * if it exists or null otherwise.
     * @param aZoneCode A <code>String</code> representation of an
     * <code>Census_AbstractDataRecord.Zone_Code</code> for the
     * <code>Census_AbstractDataRecord</code> to be returned.
     */
    public Census_AbstractDataRecord getDataRecord(String aZoneCode) {
        if (getRecordIDZoneCodeHashMap() == null) {
            // Initialise
            File _RecordIDZoneCodeHashMapObjectFile = new File(
                    getDir(),
                    "RecordIDZoneCodeHashMap.thisFile");
            if (_RecordIDZoneCodeHashMapObjectFile.exists()) {
                this._RecordIDZoneCodeHashMap = (HashMap) env.env.io.readObject(_RecordIDZoneCodeHashMapObjectFile);
            } else {
                // If not on disc create
                this._RecordIDZoneCodeHashMap = new HashMap();
                long RecordID;
                long nRecords = getNDataRecords();
                for (RecordID = 0L; RecordID < nRecords; RecordID++) {
                    this._RecordIDZoneCodeHashMap.put(RecordID, new String(
                            getDataRecord(RecordID).getZone_Code()));
                }
                // Store on disc for future reference
                try {
                    _RecordIDZoneCodeHashMapObjectFile.createNewFile();
                } catch (IOException aIOException) {
                    log(aIOException.getLocalizedMessage());
                    System.exit(Generic_ErrorAndExceptionHandler.IOException);
                }
                env.env.io.writeObject(this._RecordIDZoneCodeHashMap,
                        _RecordIDZoneCodeHashMapObjectFile);
            }
        }
        Iterator iterator = this._RecordIDZoneCodeHashMap.keySet().iterator();
        Object key;
        Object value;
        String bZoneCode;
        while (iterator.hasNext()) {
            key = iterator.next();
            value = this._RecordIDZoneCodeHashMap.get(key);
            bZoneCode = (String) value;
            // System.out.println("aZoneCode " + aZoneCode + " , bZoneCode " +
            // bZoneCode);
            // System.out.println("aZoneCode.length() " + aZoneCode.length() +
            // " , bZoneCode.length() " + bZoneCode.length() );
            if (bZoneCode.startsWith(aZoneCode)) {
                // if ( bZoneCode.equalsIgnoreCase( aZoneCode ) ) {
                return getDataRecord((Long) key);
            }
        }
        return null;
    }

    /**
     * @return An <code>Census_AbstractDataRecord</code> for the given Zone_Code
     * if it exists or null otherwise.
     * @param Zone_Code A <code>Census_AbstractDataRecord.Zone_Code</code> for
     * the <code>Census_AbstractDataRecord</code> to be returned.
     * @throws java.io.IOException
     */
    protected Census_AbstractDataRecord getDataRecord(char[] Zone_Code)
            throws IOException {
        return getDataRecord(new String(Zone_Code));
    }

    /**
     * @return <code>this.tRecordIDZoneCodeHashMap</code>
     */
    protected HashMap getRecordIDZoneCodeHashMap() {
        if (this._RecordIDZoneCodeHashMap == null) {
            initRecordIDZoneCode_HashMap();
        }
        return this._RecordIDZoneCodeHashMap;
    }

    /**
     * @return deep copy of <code>this.tRecordIDZoneCodeHashMap</code>
     */
    public HashMap getRecordIDZoneCode_HashMap() {
        return Generic_Collections.deepCopyHashMapValueString(getRecordIDZoneCodeHashMap());
    }

    private void initRecordIDZoneCode_HashMap() {
        _RecordIDZoneCodeHashMap = new HashMap();
        long n = getNDataRecords();
        for (long recordID = 0; recordID < n; recordID++) {
            _RecordIDZoneCodeHashMap.put(
                    recordID,
                    new String(this._CAS001DataHandler.getCAS001DataRecord(recordID).Zone_Code));
        }
    }

    /**
     * @return <code>this.tRecordIDZoneCodeHashMap</code> with keys and values
     * deep copied and swapped around
     */
    public HashMap getZoneCodeRecordID_HashMap() {
        HashMap<String, Long> result = new HashMap<String, Long>();
        Iterator<Long> ite = getRecordIDZoneCodeHashMap().keySet().iterator();
        Long k;
        String valueToCopy;
        String valueCopy;
        while (ite.hasNext()) {
            k = ite.next();
            valueToCopy = (String) this._RecordIDZoneCodeHashMap.get(k);
            valueCopy = valueToCopy;
            result.put(valueCopy, k);
        }
        return result;
    }

    // /**
    // * Formats the inputFile containing the
    // <code>AbstractCASDataRecords</code>.
    // * @param inputFile The <code>File</code> containing the
    // <code>AbstractCASDataRecords</code>.
    // * @param RecordID The <code>RecordID</code> to assign to the first
    // <code>Census_AbstractDataRecord</code> loaded.
    // * @return The <code>RecordID</code> assigned to the last
    // <code>Census_AbstractDataRecord</code> loaded.
    // */
    // protected abstract long format(
    // File inputFile,
    // long RecordID )
    // throws IOException;
    //
    // /**
    // * For parsing a line from a source file and handling
    // handleOutOfMemoryError.
    // * @param RecordID The RecordID
    // * @param line A string representation of the line of the file.
    // * @param handleOutOfMemoryError If true then an attempt is made
    // * to handle OutOfMemoryErrors.
    // */
    // public Census_AbstractDataRecord parseLine(
    // long RecordID,
    // String line,
    // boolean handleOutOfMemoryError )
    // throws IOException {
    // return parseLine( RecordID, line );
    // }
    //
    // /**
    // * Parses a line from the source CASKeyStatisticSelection1 file.
    // * @param RecordID The RecordID
    // * @param line A string representation of the line of the file.
    // */
    // protected abstract Census_AbstractDataRecord parseLine(
    // long RecordID,
    // String line )
    // throws IOException;
    /**
     * TODO docs
     *
     * @return
     */
    public HashMap<String, String> get_LookUpMSOAfromOAHashMap() {
        if (this._LookUpMSOAfromOAHashMap == null) {
            // Initialise
            File _LookUpMSOAfromOAHashMapObjectFile = new File(getDir(),
                    "LookUpMSOAfromOAHashMap.thisFile");
            if (_LookUpMSOAfromOAHashMapObjectFile.exists()) {
                this._LookUpMSOAfromOAHashMap = (HashMap) env.env.io.readObject(_LookUpMSOAfromOAHashMapObjectFile);
            } else {
                // If not on disc create
                this._LookUpMSOAfromOAHashMap = new HashMap();
                // Load look up table
                File lookUpTableFile = new File(
                        "/scratch01/Work/data/Census/2001/LUTs/OA_LSOA_MSOA_LA_Apr05_txt/OA_LSOA_MSOA_LA_Apr05.txt");
//                File lookUpTableFile = new File(
//                        "C:/Work/data/Census/2001/LUTs/OA_LSOA_MSOA_LA_Apr05_txt/OA_LSOA_MSOA_LA_Apr05.txt");
                try {
                    BufferedReader aBufferedReader = new BufferedReader(
                            new InputStreamReader(new FileInputStream(
                                    lookUpTableFile)));
                    StreamTokenizer aStreamTokenizer = new StreamTokenizer(
                            aBufferedReader);
                    env.env.io.setStreamTokenizerSyntax1(aStreamTokenizer);
                    aStreamTokenizer.wordChars('&', '&');
                    aStreamTokenizer.wordChars('\'', '\'');
                    String line;
                    Object[] codes = null;
                    boolean print = false;
                    boolean boolean0 = false;
                    int int1000 = 1000;
                    int int0 = 0;
                    // Skip the first line
                    int tokenType = aStreamTokenizer.nextToken();
                    while (tokenType != StreamTokenizer.TT_EOL) {
                        tokenType = aStreamTokenizer.nextToken();
                    }
                    tokenType = aStreamTokenizer.nextToken();
                    while (tokenType != StreamTokenizer.TT_EOF) {
                        switch (tokenType) {
                            case StreamTokenizer.TT_EOL:
                                this._LookUpMSOAfromOAHashMap.put(codes[0],
                                        codes[1]);
                                if (int0 % int1000 == 0 && print) {
                                    System.out.println("loaded " + int0 + " look ups");
                                }
                                break;
                            case StreamTokenizer.TT_WORD:
                                int0++;
                                line = aStreamTokenizer.sval;
                                codes = parseLine(line);
                                break;
                        }
                        tokenType = aStreamTokenizer.nextToken();
                    }
                } catch (IOException aIOException) {
                    aIOException.printStackTrace();
                }
                // Store on disc for future reference
                try {
                    _LookUpMSOAfromOAHashMapObjectFile.createNewFile();
                    env.env.io.writeObject(
                            this._LookUpMSOAfromOAHashMap,
                            _LookUpMSOAfromOAHashMapObjectFile);
                } catch (IOException aIOException) {
                    aIOException.printStackTrace();
                }
            }
        }
        return this._LookUpMSOAfromOAHashMap;
    }

    /**
     * TODO docs
     *
     * @param line
     * @return
     */
    protected static Object[] parseLine(String line) {
        Object[] result = new Object[2];
        String[] fields = line.split("\",\"");
        if (fields.length > 7) {
            boolean DEBUG = true;
        } else {
            result[0] = fields[0].substring(1);
            result[1] = fields[3];
        }
        return result;
    }

    /**
     * For checking OA MSOA Codes
     *
     * @param startRecordID The RecordID of the first OA code to check
     * @param endRecordID The RecordID of the last OA code to check
     * @throws java.lang.Exception
     */
    public void printOAMSOACodes(
            long startRecordID,
            long endRecordID)
            throws Exception {
        HashMap lookUpMSOAfromOAHashMap = get_LookUpMSOAfromOAHashMap();
        Census_CASDataHandler aCASDataHandler = new Census_CASDataHandler();
        Census_AbstractDataRecord aCASDataRecord;
        String zoneCode;
        for (long RecordID = startRecordID; RecordID < endRecordID; RecordID++) {
            aCASDataRecord = (Census_CASDataRecord) aCASDataHandler.getDataRecord(RecordID);
            zoneCode = new String(aCASDataRecord.getZone_Code());
            System.out.println("OA " + zoneCode + " MSOA " + (String) lookUpMSOAfromOAHashMap.get(zoneCode));
        }
    }

    public TreeSet<String> getLADCodes_TreeSet()
            throws IOException {
        TreeSet<String> tLADCodes;
        File tLADCodeTreeSet_File = new File(
                dir,
                "LADCodes_TreeSet.thisFile");
        if (tLADCodeTreeSet_File.exists()) {
            tLADCodes = (TreeSet) env.env.io.readObject(tLADCodeTreeSet_File);
        } else {
            tLADCodes = new TreeSet();
            Census_AbstractDataRecord aCASDataRecord;
            String aLADCode;
            for (long RecordID = 0; RecordID < getNDataRecords(); RecordID++) {
                aCASDataRecord = getDataRecord(RecordID);
                aLADCode = new String(aCASDataRecord.getZone_Code()).substring(0, 4);
                if (!tLADCodes.contains(aLADCode)) {
                    tLADCodes.add(aLADCode);
                }
            }
            env.env.io.writeObject(tLADCodes, tLADCodeTreeSet_File);
        }
        return tLADCodes;
    }

    /**
     *
     * @return A TreeSet<String> of all OA Codes in the UK.
     */
    public TreeSet<String> getOACodes_TreeSet() {
        TreeSet<String> tOACodes;
        File tOACodeTreeSet_File = new File(
                dir,
                "OACodes_TreeSet.thisFile");
        if (tOACodeTreeSet_File.exists()) {
            tOACodes = (TreeSet<String>) env.env.io.readObject(tOACodeTreeSet_File);
        } else {
            tOACodes = new TreeSet();
            Census_AbstractDataRecord aCASDataRecord;
            String aOACode;
            for (long RecordID = 0; RecordID < getNDataRecords(); RecordID++) {
                aCASDataRecord = getDataRecord(RecordID);
                aOACode = new String(aCASDataRecord.getZone_Code());
                if (!tOACodes.contains(aOACode)) {
                    tOACodes.add(aOACode);
                }
            }
            env.env.io.writeObject(tOACodes, tOACodeTreeSet_File);
        }
        return tOACodes;
    }

    /**
     * @return A HashSet<String> of all OA Codes in the UK.
     */
    public HashSet<String> getOACodes_HashSet() {
        HashSet<String> tOACodes;
        File tOACodeHashSet_File = new File(
                dir,
                "OACodes_HashSet.thisFile");
        if (tOACodeHashSet_File.exists()) {
            tOACodes = (HashSet<String>) env.env.io.readObject(tOACodeHashSet_File);
        } else {
            tOACodes = new HashSet();
            Census_AbstractDataRecord aCASDataRecord;
            String aOACode;
            for (long RecordID = 0; RecordID < getNDataRecords(); RecordID++) {
                aCASDataRecord = getDataRecord(RecordID);
                aOACode = new String(aCASDataRecord.getZone_Code());
                if (!tOACodes.contains(aOACode)) {
                    tOACodes.add(aOACode);
                }
            }
            env.env.io.writeObject(tOACodes, tOACodeHashSet_File);
        }
        return tOACodes;
    }

    /**
     * @return A HashSet<String> of all MSOA Codes in the UK.
     */
    public HashSet<String> getMSOACodes() {
        HashSet<String> tMSOACodes;
        File tMSOACodeHashSet_File = new File(
                dir,
                "MSOACodes_HashSet.thisFile");
        if (tMSOACodeHashSet_File.exists()) {
            tMSOACodes = (HashSet<String>) env.env.io.readObject(tMSOACodeHashSet_File);
        } else {
            HashMap<String, String> lookUpMSOAfromOAHashMap = get_LookUpMSOAfromOAHashMap();
            tMSOACodes = new HashSet();
            Census_AbstractDataRecord aCASDataRecord;
            String aOACode;
            String aMSOACode;
            for (long RecordID = 0; RecordID < getNDataRecords(); RecordID++) {
                aCASDataRecord = getDataRecord(RecordID);
                aOACode = new String(aCASDataRecord.getZone_Code());
                aMSOACode = lookUpMSOAfromOAHashMap.get(aOACode);
                if (!tMSOACodes.contains(aMSOACode)) {
                    tMSOACodes.add(aMSOACode);
                }
            }
            env.env.io.writeObject(tMSOACodes, tMSOACodeHashSet_File);
        }
        return tMSOACodes;
    }

    /**
     * @param s
     * @return Output Area Codes that start with s
     */
    public HashSet getOACodes(String s) {
        HashSet<String> r = new HashSet<>();
        HashSet<String> tOACodes = getOACodes_HashSet();
        Iterator<String> ite = tOACodes.iterator();
        while (ite.hasNext()) {
            String areaCode = ite.next();
            if (areaCode.startsWith(s)) {
                r.add(areaCode);
            }
        }
        return r;
    }

    /**
     * @param s
     * @return Output Area Codes that start with s
     */
    public HashSet getMSOACodes_HashSet(String s) {
        HashSet<String> r = new HashSet<>();
        HashSet<String> tMSOACodes = getMSOACodes();
        Iterator<String> ite = tMSOACodes.iterator();
        while (ite.hasNext()) {
            String areaCode = ite.next();
            if (areaCode.startsWith(s)) {
                r.add(areaCode);
            }
        }
        return r;
    }

    /**
     * Writes aggregateOAToMSOA to aRandomAccessFile
     *
     * @param aRandomAccessFile
     * @param aggregateOAToMSOA
     * @throws java.io.IOException
     */
    public void write(
            RandomAccessFile aRandomAccessFile,
            TreeMap aggregateOAToMSOA) throws IOException {
        Iterator aIterator = aggregateOAToMSOA.keySet().iterator();
        Object key;
        long RecordID = -1L;
        int hashCode = -1;
        while (aIterator.hasNext()) {
            key = aIterator.next();
            Object aObject = aggregateOAToMSOA.get(key);
            RecordID++;
            hashCode++;
            if (aObject instanceof Census_CAS001DataRecord) {
                ((Census_CAS001DataRecord) aObject).write(aRandomAccessFile, RecordID,
                        hashCode, (String) key);
            }
            if (aObject instanceof Census_CAS002DataRecord) {
                ((Census_CAS002DataRecord) aObject).write(aRandomAccessFile, RecordID,
                        hashCode, (String) key);
            }
            if (aObject instanceof Census_CAS003DataRecord) {
                ((Census_CAS003DataRecord) aObject).write(aRandomAccessFile, RecordID,
                        hashCode, (String) key);
            }
            if (aObject instanceof Census_CAS044DataRecord) {
                ((Census_CAS044DataRecord) aObject).write(aRandomAccessFile, RecordID,
                        hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS002DataRecord) {
                ((Census_CASKS002DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS006DataRecord) {
                ((Census_CASKS006DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS008DataRecord) {
                ((Census_CASKS008DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS09bDataRecord) {
                ((Census_CASKS09bDataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS09cDataRecord) {
                ((Census_CASKS09cDataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS010DataRecord) {
                ((Census_CASKS010DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS12bDataRecord) {
                ((Census_CASKS12bDataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS12cDataRecord) {
                ((Census_CASKS12cDataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS013DataRecord) {
                ((Census_CASKS013DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS14bDataRecord) {
                ((Census_CASKS14bDataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS14cDataRecord) {
                ((Census_CASKS14cDataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS015DataRecord) {
                ((Census_CASKS015DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS017DataRecord) {
                ((Census_CASKS017DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS020DataRecord) {
                ((Census_CASKS020DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASKS023DataRecord) {
                ((Census_CASKS023DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
            if (aObject instanceof Census_CASUV003DataRecord) {
                ((Census_CASUV003DataRecord) aObject).write(aRandomAccessFile,
                        RecordID, hashCode, (String) key);
            }
        }
    }
}
