/*
 * Copyright 2010 Centre for Computational Geography, University of Leeds.
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
package uk.ac.leeds.ccg.andyt.census.cas;

import uk.ac.leeds.ccg.andyt.census.core.Census_AbstractDataHandler;
import uk.ac.leeds.ccg.andyt.census.core.Census_AbstractDataRecord;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.io.StreamTokenizer;
import java.util.HashMap;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_ErrorAndExceptionHandler;

/**
 * A <code>class</code> for handling an individual
 * <code>Census_CASAreaEastingNorthingDataRecord</code> and collections of
 * <code>CASAreaEastingNorthingDataRecords</code>.
 */
public class Census_CASAreaEastingNorthingDataHandler extends Census_AbstractDataHandler {

    public Census_CASAreaEastingNorthingDataHandler() {
        File directory = new File("C:/Work/Projects/GENESIS/Workspace/");
        init(directory);
        try {
            this.file = new File(directory, "CASAreaEastingNorthingDataRecords.dat");
            if (!this.file.exists()) {
                this.file.createNewFile();
            }
            this.recordLength = new Census_CASAreaEastingNorthingDataRecord().getSizeInBytes();
            // log("this.recordLength " + this.recordLength);
            this.rAF = new RandomAccessFile(this.file, "r");
        } catch (IOException aIOException) {
            log(aIOException.getLocalizedMessage());
            System.exit(Generic_ErrorAndExceptionHandler.IOException);
        }
    }

    /**
     * Creates a new instance of CASAreaEastingNorthingDataHandler with Records
     * loaded from formattedFile.
     *
     * @param file Formatted file of CASAreaEastingNorthingDataRecords
     */
    public Census_CASAreaEastingNorthingDataHandler(File file) {
        this.init(file.getParentFile());
        if (file.getName().endsWith("thisFile")) {
            Census_CASAreaEastingNorthingDataHandler h;
            h = (Census_CASAreaEastingNorthingDataHandler) env.env.io.readObject(file);
            this.file = h.file;
            load(this.file);
        } else {
            load(file);
        }
        this.recordLength = new Census_CASAreaEastingNorthingDataRecord().getSizeInBytes();
        log("CASAreaEastingNorthingDataRecords loaded successfully");
    }

    /**
     * Loads <code>CAS001DataRecords</code> and prints out n randomly
     *
     * @param directory to load source data from
     * @param n the number of loaded data records to print out.
     */
    public void formatSourceData(
            File directory,
            int n) {
        try {
            rAF = new RandomAccessFile(this.file, "rw");
            // Load from source
            File infile;
            long long0 = 0L;
            long RecordID = 0L;
            // Load England
            infile = new File(
                    directory,
                    "England_OA_ZoneCode_Area_Easting_Northing.csv");
            RecordID = format(infile, RecordID);
            log(infile.toString() + " formatted successfully " + RecordID + " records"); // 165665
            long0 = RecordID;
//            // Load Wales
//            infile = new File(
//                    directory,
//                    "Wales_OA_ZoneCode_Area_Easting_Northing.csv");
//            RecordID = format(infile, RecordID);
//            log(infile.toString() + " formatted successfully " + (RecordID - long0) + " records"); // 9769
//            long0 = RecordID;
//            // Load Scotland
//            infile = new File(
//                    directory,
//                    "Scotland_OA_ZoneCode_Area_Easting_Northing.csv");
//            RecordID = format(infile, RecordID);
//            log(infile.toString() + " formatted successfully " + (RecordID - long0) + " records"); // 42604
//            long0 = RecordID;
//            // Load Northern Ireland
//            infile = new File(
//                    directory,
//                    "NorthernIreland_OA_ZoneCode_Area_Easting_Northing.csv");
//            RecordID = format(infile, RecordID);
//            log(infile.toString() + " formatted successfully " + (RecordID - long0) + " records"); // 5022
//            rAF.close();
//            load(file);
//            print(20, new Random());
        } catch (FileNotFoundException aIOException) {
            log(aIOException.getLocalizedMessage());
            System.exit(Generic_ErrorAndExceptionHandler.IOException);
        }
    }

    /**
     * Uses a <code>BufferedReader<code> and a <code>StreamTokenizer</code> to
     * read lines from the sourceFile <code>File</code>. The lines are converted
     * to <code>CASAreaEastingNorthingDataRecords</code> and written to
     * <code>this.tRandomAccessFile</code>.
     *
     * @param sourceFile The source CASAreaEastingNorthingDataRecords file to be
     * formatted and written to <code>this.tRandomAccessFile</code>.
     * @param RecordID The <code>RecordID</code> to assign to the first
     * <code>Census_CASAreaEastingNorthingDataRecord</code>.
     * @return The <code>RecordID</code> assigned to the last
     * <code>CASAreaEastingNorthingDataRecords</code>.
     */
    protected long format(File sourceFile, long RecordID) {
        try {
            BufferedReader br = env.env.io.getBufferedReader(sourceFile);
            StreamTokenizer st = new StreamTokenizer(br);
            env.env.io.setStreamTokenizerSyntax1(st);
            String string0 = new String();
            String string1;
            String string2;
            long long0;
            long longZero = 0L;
            Census_CASAreaEastingNorthingDataRecord rec = new Census_CASAreaEastingNorthingDataRecord();
            boolean print = false;
            int int10000 = 10000;
            // Skip the first line
            int tokenType = st.nextToken();
            while (tokenType != StreamTokenizer.TT_EOL) {
                tokenType = st.nextToken();
            }
            tokenType = st.nextToken();
            while (tokenType != StreamTokenizer.TT_EOF) {
                switch (tokenType) {
                    case StreamTokenizer.TT_EOL:
                        long0 = RecordID % int10000;
                        print = (long0 == longZero);
                        if (print) {
                            string2 = rec.toString();
                            log(string2);
                            string2 = string0;
                        }
                        // Write out
                        rec.write(rAF);
                        RecordID++;
                        break;
                    case StreamTokenizer.TT_WORD:
                        string1 = st.sval;
                        rec = new Census_CASAreaEastingNorthingDataRecord(RecordID, string1);
                        break;
                }
                string1 = string0;
                tokenType = st.nextToken();
            }
            log("Number of Records loaded = " + RecordID);
        } catch (IOException aIOException) {
            log(aIOException.getLocalizedMessage());
            System.exit(Generic_ErrorAndExceptionHandler.IOException);
        }
        return RecordID;
    }

    /**
     * @return a <code>Census_CASAreaEastingNorthingDataRecord</code> with
     * <code>Census_AbstractDataRecord.RecordID = RecordID</code>
     * @param RecordID The RecordID of the
     * Census_CASAreaEastingNorthingDataRecord to be returned.
     */
    public Census_AbstractDataRecord getDataRecord(long RecordID) {
        return getCASAreaEastingNorthingDataRecord(RecordID);
    }

    /**
     * @return a <code>Census_CASAreaEastingNorthingDataRecord</code> with
     * <code>Census_CASAreaEastingNorthingDataRecord.RecordID = RecordID</code>
     * @param RecordID The RecordID of the
     * Census_CASAreaEastingNorthingDataRecord to be returned.
     */
    public Census_CASAreaEastingNorthingDataRecord getCASAreaEastingNorthingDataRecord(
            long RecordID) {
        Census_CASAreaEastingNorthingDataRecord result = null;
        try {
            this.rAF.seek(recordLength * RecordID);
            result = new Census_CASAreaEastingNorthingDataRecord(this.rAF);
        } catch (IOException aIOException) {
            System.err.println(aIOException.getLocalizedMessage());
            System.exit(Generic_ErrorAndExceptionHandler.IOException);
        }
        return result;
    }

    public HashMap get_CASZoneCode_CASAreaEastingNorthingDataRecord_HashMap(String code) {
        HashMap _CASZoneCode_CASAreaEastingNorthingDataRecord_HashMap = new HashMap();
        Census_CASAreaEastingNorthingDataRecord a_CASAreaEastingNorthingDataRecord;
        Object _Easting_Northing;
        for (long _RecordID = 0; _RecordID < getNDataRecords(); _RecordID++) {
            a_CASAreaEastingNorthingDataRecord = getCASAreaEastingNorthingDataRecord(_RecordID);
            String a_Zone_Code = new String(a_CASAreaEastingNorthingDataRecord.getZone_Code());
            if (a_Zone_Code.startsWith(code)) {
                //System.out.println(a_Zone_Code);
                _CASZoneCode_CASAreaEastingNorthingDataRecord_HashMap.put(
                        a_Zone_Code,
                        a_CASAreaEastingNorthingDataRecord);
            }
        }
        return _CASZoneCode_CASAreaEastingNorthingDataRecord_HashMap;
    }

//    public class EastingNorthing {
//        BigDecimal _Easting;
//        BigDecimal _Northing;
//
//        public EastingNorthing(){
//
//        }
//    }
}
