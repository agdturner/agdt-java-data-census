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
package uk.ac.leeds.ccg.andyt.census.cas.ks;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeMap;
import uk.ac.leeds.ccg.andyt.census.core.Census_AbstractHandler;
import uk.ac.leeds.ccg.andyt.census.core.Census_AbstractDataRecord;
import uk.ac.leeds.ccg.andyt.census.core.Census_Environment;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_ErrorAndExceptionHandler;

/**
 * A <code>class</code> for handling an individual
 * <code>Census_CASKS09bDataRecord</code> and collections of
 * <code>CASKS09bDataRecords</code>.
 * <ul>
 * <li>Used for formatting source data and testing it can be loaded to and
 * retrieved from a formatted file.</li>
 * <li>Developed for <a href="http://www.ncess.ac.uk/moses">MoSeS</a>.</li>
 * <li>Copyright (C) 2006 <a
 * href="http://www.geog.leeds.ac.uk/people/a.turner/">Andy Turner</a>, <a
 * href="http://www.leeds.ac.uk//">University of Leeds</a>.</li>
 * </ul>
 *
 * @author <a href="http://www.geog.leeds.ac.uk/people/a.turner/">Andy
 * Turner</a>
 * @version 1.0.0, 2006-08-10
 * @see Census_AbstractDataRecord
 */
public class Census_CASKS09bDataHandler extends Census_AbstractHandler {

    /**
     * Creates a new instance of <code>CASKS09bDataHandler</code> for handling
     * CASKS09bDataRecords stored in a formatted <code>File</code> The default
     * <code>File</code> is hard coded. To specify the <code>File</code> use
     * <code>CASKS09bDataHandler(File)</code>. To set a different default
     * <code>File</code> edit the source code and recompile.
     *
     * @throws java.io.IOException
     */
    public Census_CASKS09bDataHandler(Census_Environment e) throws IOException {
        super (e);
        // this( new File(
        // "C:/Work/Projects/MoSeS/Workspace/CASKS09bDataRecords.dat" ) );
        // Want also to setDirectory();
        // initMemoryReserve();
        // Default this.directory, this.file, this.randomAccessFile
        File directory = new File("C:/Work/Projects/MoSeS/Workspace/");
        this.file = new File(directory, "CASKS09bDataRecords.dat");
        if (!this.file.exists()) {
            this.file.createNewFile();
        }
        this.recordLength = new Census_CASKS09bDataRecord().getSizeInBytes();
        // env.env.log("this.recordLength " + this.recordLength);
        this.rAF = new RandomAccessFile(this.file, "r");
    }

//    /**
//     * Creates a new instance of CASKS09bDataHandler with Records loaded from
//     * formattedFile.
//     *
//     * @param formattedFile Formatted file of CASKS09bDataRecords
//     */
//    public Census_CASKS09bDataHandler(File formattedFile) {
//        // initMemoryReserve();
//        this.init(formattedFile.getParentFile());
//        this.recordLength = new Census_CASKS09bDataRecord().getSizeInBytes();
//        load(formattedFile);
//        env.env.log("CASKS09bDataRecords loaded successfully");
//    }
//
//    /**
//     * @param args the command line arguments No arguments are used.
//     * @throws java.io.IOException
//     */
//    public static void main(String[] args) throws IOException {
//        Census_CASKS09bDataHandler aCASKS09bDataHandler = new Census_CASKS09bDataHandler();
//        aCASKS09bDataHandler.run();
//    }
//
//    /**
//     * Top level run method
//     */
//    private void run() throws IOException {
//        // run1( true, 20 );
//        // run1( false, 20 );
//        run2(20);
//    }
//
//    /**
//     * Loads <code>CASKS09bDataRecords</code> and prints out n randomly
//     *
//     * @param loadFromSource If true, data is loaded from hardcoded source files
//     * as downloaded from casweb. Otherwise, data is loaded from
//     * <code>this.formattedFile</code>
//     * @param n The number of loaded data records to print out.
//     */
//    private void run2(int n) throws IOException {
//        File file = new File(
//                "C:/Work/Projects/MoSeS/Workspace/Leeds/MSOA/CASKS09bDataRecords.dat");
//        load(file);
//        print(n, new Random());
//    }

    /**
     * Loads <code>CAS001DataRecords</code> and prints out n randomly
     *
     * @param directory to load source data from
     * @param n the number of loaded data records to print out.
     * @throws java.io.IOException
     */
    public void formatSourceData(
            File directory,
            int n)
            throws IOException {
        rAF = new RandomAccessFile(this.file, "rw");
        // Load from source
        File infile;
        long long0 = 0L;
        long RecordID = 0L;
        // Load England
        infile = new File(
                directory,
                "KS09bEnglandOA.csv");
        RecordID = format(infile, RecordID);
        env.env.log(infile.toString() + " formatted successfully " + RecordID + " records"); // 165665
        long0 = RecordID;
        // Load Wales
        infile = new File(
                directory,
                "KS09bWalesOA.csv");
        RecordID = format(infile, RecordID);
        env.env.log(infile.toString() + " formatted successfully " + (RecordID - long0) + " records"); // 9769
        long0 = RecordID;
        // Load Scotland
        infile = new File(
                directory,
                "KS09bScotlandOA.csv");
        RecordID = format(infile, RecordID);
        env.env.log(infile.toString() + " formatted successfully " + (RecordID - long0) + " records"); // 42604
        long0 = RecordID;
        // Load Northern Ireland
        infile = new File(
                directory,
                "KS09bNorthernIrelandOA.csv");
        RecordID = format(infile, RecordID);
        env.env.log(infile.toString() + " formatted successfully " + (RecordID - long0) + " records"); // 5022
        rAF.close();
        load(file);
        print(20, new Random());
    }

    /**
     * Uses a <code>BufferedReader<code> and a <code>StreamTokenizer</code> to
     * read lines from the sourceFile <code>File</code>. The lines are converted
     * to <code>CASKS09bDataRecords</code> and written to
     * <code>this.tRandomAccessFile</code>.
     *
     * @param sourceFile The source CASKS09bDataRecords file to be formatted and
     * written to <code>this.tRandomAccessFile</code>.
     * @param RecordID The <code>RecordID</code> to assign to the first
     * <code>Census_CASKS09bDataRecord</code>.
     * @return The <code>RecordID</code> assigned to the last
     * <code>CASKS09bDataRecords</code>.
     * @throws java.io.IOException
     */
    protected long format(File sourceFile, long RecordID) throws IOException {
        env.env.log("format( File( " + sourceFile.toString() + " ), RecordID( " + RecordID + " ))");
        BufferedReader br = env.env.io.getBufferedReader(sourceFile);
        StreamTokenizer st = new StreamTokenizer(br);
        env.env.io.setStreamTokenizerSyntax1(st);
        String string0 = new String();
        String string1;
        String string2;
        long long0;
        long longZero = 0L;
        Census_CASKS09bDataRecord rec = new Census_CASKS09bDataRecord();
        boolean print = false;
        int int1000 = 1000;
        // Skip the first line
        int tokenType = st.nextToken();
        while (tokenType != StreamTokenizer.TT_EOL) {
            tokenType = st.nextToken();
        }
        tokenType = st.nextToken();
        while (tokenType != StreamTokenizer.TT_EOF) {
            switch (tokenType) {
                case StreamTokenizer.TT_EOL:
                    long0 = RecordID % int1000;
                    print = (long0 == longZero);
                    if (print) {
                        string2 = rec.toString();
                        env.env.log(string2);
                        string2 = string0;
                    }
                    // Write out
                    rec.write(rAF);
                    RecordID++;
                    break;
                case StreamTokenizer.TT_WORD:
                    string1 = st.sval;
                    rec = new Census_CASKS09bDataRecord(RecordID, string1);
                    break;
            }
            string1 = string0;
            tokenType = st.nextToken();
        }
        env.env.log("Number of Records loaded = " + RecordID);
        return RecordID;
    }

    /**
     * @return a <code>Census_CASKS09bDataRecord</code> with
     * <code>Census_AbstractDataRecord.RecordID = RecordID</code>
     * @param RecordID The RecordID of the Census_CASKS09bDataRecord to be
     * returned.
     */
    public Census_AbstractDataRecord getDataRecord(long RecordID) {
        return getCASKS09bDataRecord(RecordID);
    }

    /**
     * @return a <code>Census_CASKS09bDataRecord</code> with
     * <code>Census_CASKS09bDataRecord.RecordID = RecordID</code>
     * @param RecordID The RecordID of the Census_CASKS09bDataRecord to be
     * returned.
     */
    public Census_CASKS09bDataRecord getCASKS09bDataRecord(long RecordID) {
        Census_CASKS09bDataRecord result = null;
        try {
            this.rAF.seek(recordLength * RecordID);
            result = new Census_CASKS09bDataRecord(this.rAF);
        } catch (IOException aIOException) {
            System.err.println(aIOException.getLocalizedMessage());
            System.exit(Generic_ErrorAndExceptionHandler.IOException);
        }
        return result;
    }

    /**
     * Aggregates <code>CASKS09bDataRecords</code> from OA To Ward for the OA
     * records in the range [startRecordID,endRecordID] and writes the results
     * to aRandomAccessFile
     *
     * @param aRandomAccessFile <code>RandomAccessFile</code> to which results
     * are written
     * @param startRecordID The first OA RecordID in the sequence to be
     * aggregated.
     * @param endRecordID The last OA RecordID in the sequence to be aggregated.
     * @throws java.io.IOException
     */
    public void aggregateOAToWard(RandomAccessFile aRandomAccessFile,
            long startRecordID, long endRecordID) throws IOException {
        TreeMap result = new TreeMap();
        Census_CASKS09bDataRecord aCASKS09bDataRecord;
        Census_CASKS09bDataRecord bCASKS09bDataRecord;
        String zoneCode;
        Object zoneCodeWard;
        // long newRecordID = startRecordIDForLeeds - 1L;
        long newRecordID = -1L;
        for (long RecordID = startRecordID; RecordID < endRecordID; RecordID++) {
            aCASKS09bDataRecord = (Census_CASKS09bDataRecord) getDataRecord(RecordID);
            zoneCode = new String(aCASKS09bDataRecord.getZone_Code());
            zoneCodeWard = zoneCode.substring(0, 6);
            if (result.containsKey(zoneCodeWard)) {
                bCASKS09bDataRecord = (Census_CASKS09bDataRecord) result.get(zoneCodeWard);
                result.remove(zoneCodeWard);
                result.put(zoneCodeWard, aCASKS09bDataRecord.aggregate(bCASKS09bDataRecord));
            } else {
                result.put(zoneCodeWard, aCASKS09bDataRecord);
            }
        }
        //write(aRandomAccessFile, result);
    }

    /**
     * Aggregates <code>CASKS09bDataRecords</code> from OA To MSOA for the OA
     * records in the range [startRecordID,endRecordID] and writes the results
     * to aRandomAccessFile
     *
     * @param aRandomAccessFile <code>RandomAccessFile</code> to which results
     * are written
     * @param startRecordID The first OA RecordID in the sequence to be
     * aggregated.
     * @param endRecordID The last OA RecordID in the sequence to be aggregated.
     * @throws java.io.IOException
     */
    public void aggregateOAToMSOA(RandomAccessFile aRandomAccessFile,
            long startRecordID, long endRecordID) throws IOException {
        TreeMap result = new TreeMap();
        HashMap lookUpMSOAfromOAHashMap = null;//getOA2MSOA();
        Census_CASKS09bDataRecord aCASKS09bDataRecord;
        Census_CASKS09bDataRecord bCASKS09bDataRecord;
        String zoneCode;
        Object zoneCodeMSOA;
        // long newRecordID = startRecordIDForLeeds - 1L;
        long newRecordID = -1L;
        for (long RecordID = startRecordID; RecordID < endRecordID; RecordID++) {
            aCASKS09bDataRecord = (Census_CASKS09bDataRecord) getDataRecord(RecordID);
            zoneCode = new String(aCASKS09bDataRecord.getZone_Code());
            zoneCodeMSOA = lookUpMSOAfromOAHashMap.get(zoneCode);
            if (result.containsKey(zoneCodeMSOA)) {
                bCASKS09bDataRecord = (Census_CASKS09bDataRecord) result.get(zoneCodeMSOA);
                result.remove(zoneCodeMSOA);
                result.put(zoneCodeMSOA, aCASKS09bDataRecord.aggregate(bCASKS09bDataRecord));
            } else {
                result.put(zoneCodeMSOA, aCASKS09bDataRecord);
            }
        }
        //write(aRandomAccessFile, result);
    }
}
