/*
 * Copyright (C) 2014 geoagdt.
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package uk.ac.leeds.ccg.andyt.census;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_IO;

/**
 *
 * @author geoagdt
 */
public class Census_DeprivationDataHandler {

    // most deprived areas are those with highest IMDSCore and lowest IMDRank
    public static Integer getDeprivationClass(
            TreeMap<Integer, Integer> deprivationClasses,
            Census_DeprivationDataRecord aDeprivation_DataRecord) {
        String rankOfIMDScoreForEngland = aDeprivation_DataRecord.getRankOfIMDScoreForEngland();
        Integer rankOfIMDScoreForEnglandInteger;
        int thisRank = 0;
        if (rankOfIMDScoreForEngland != null) {
            rankOfIMDScoreForEnglandInteger = Integer.valueOf(rankOfIMDScoreForEngland);
            thisRank = rankOfIMDScoreForEnglandInteger;
        } else {
            int debug = 1;
        }
        Integer deprivationClass = null;
        Integer key = deprivationClasses.higherKey(thisRank);
        if (key == null) {
            deprivationClass = 3;
        } else {
            deprivationClass = deprivationClasses.get(key);
        }
        return deprivationClass;
    }

    public static TreeMap<Integer, Integer> getDeprivationClasses(
            TreeMap<String, Census_DeprivationDataRecord> tDeprivationData) {
        TreeMap<Integer, Integer> result;
        int count = tDeprivationData.size();
        double percentageClassWidth = count / (double) 100;
        result = new TreeMap<Integer, Integer>();
        result.put(new Double(3.0 * percentageClassWidth).intValue(), 3);
        result.put(new Double(5.0 * percentageClassWidth).intValue(), 5);
        result.put(new Double(10.0 * percentageClassWidth).intValue(), 10);
        result.put(new Double(15.0 * percentageClassWidth).intValue(), 15);
        result.put(new Double(20.0 * percentageClassWidth).intValue(), 20);
        result.put(new Double(25.0 * percentageClassWidth).intValue(), 25);
        result.put(new Double(30.0 * percentageClassWidth).intValue(), 30);
        result.put(new Double(35.0 * percentageClassWidth).intValue(), 35);
        result.put(new Double(40.0 * percentageClassWidth).intValue(), 40);
        result.put(new Double(45.0 * percentageClassWidth).intValue(), 45);
        result.put(new Double(50.0 * percentageClassWidth).intValue(), 50);
        result.put(Integer.MAX_VALUE, 100);
        return result;
    }

    public Census_DeprivationDataHandler() {
    }

    /**
     * Loads LeedsCAB data from a file in directory, filename reporting progress
     * of loading to PrintWriter pw.
     *
     * @param directory
     * @param filename
     * @return TreeMap<String,LeedsCAB_DataRecord> representing records
     */
    public TreeMap<String, Census_DeprivationDataRecord> loadInputData(
            File directory,
            String filename) {
        TreeMap<String, Census_DeprivationDataRecord> result;
        result = new TreeMap<String, Census_DeprivationDataRecord>();
        File inputFile = new File(
                directory,
                filename);
        try {
            BufferedReader br;
            br = Generic_IO.getBufferedReader(inputFile);
            StreamTokenizer st;
            st = new StreamTokenizer(br);
            Generic_IO.setStreamTokenizerSyntax5(st);
            st.wordChars('`', '`');
            st.wordChars('\'', '\'');
            st.wordChars('*', '*');
            st.wordChars('\\', '\\');
            st.wordChars('/', '/');
            st.wordChars('&', '&');
            String line = "";
            long RecordID = 0;
            // Skip the header
            int headerLines = 1;
            for (int i = 0; i < headerLines; i++) {
                Generic_IO.skipline(st);
            }
            // Read data
            int tokenType;
            tokenType = st.nextToken();
            while (tokenType != StreamTokenizer.TT_EOF) {

                // For debugging
                if (RecordID == 10) {
                    int debug = 1;
                }

                switch (tokenType) {
                    case StreamTokenizer.TT_EOL:
                        //System.out.println(line);
                        break;
                    case StreamTokenizer.TT_WORD:
                        line = st.sval;
                        try {
                            Census_DeprivationDataRecord record = new Census_DeprivationDataRecord(RecordID, line, this);
                            String LSOACode = record.getLSOACode();
                            if (result.containsKey(LSOACode)) {
                                System.out.println("Additional record for LSOACode " + LSOACode);
                            } else {
                                result.put(LSOACode, record);
                            }
                        } catch (Exception e) {
                            System.err.println(line);
                            System.err.println("RecordID " + RecordID);
                            System.err.println(e.getLocalizedMessage());
                        }
                        RecordID++;
                        break;
                }
                tokenType = st.nextToken();
            }
            br.close();
        } catch (IOException ex) {
            Logger.getLogger(Census_DeprivationDataHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

//    /**
//     *
//     * @param tLeedsCABData
//     * @param tDeprivationData
//     * @param tLookupFromPostcodeToCensusCodes
//     * @param deprivationClasses
//     * @return Object[2] result where: result[0] =
//     * deprivationClassCountOfCABClients is a TreeMap<Integer, Integer> where
//     * the keys are deprivationClasses and the values are counts of the number
//     * of clients in each deprivation class; result[1] =
//     * clientsWithoutARecognisedPostcode is an integer count of the number of
//     * client records that do not have a recognised postcode value.
//     */
//    public static Object[] getDeprivationClassCountOfCABClients(
//            TreeMap<EnquiryClientBureauOutletID, DW_Data_CAB2_Record> tLeedsCABData,
//            TreeMap<String, Census_DeprivationDataRecord> tDeprivationData,
//            TreeMap<String, String> tLookupFromPostcodeToCensusCodes,
//            TreeMap<Integer, Integer> deprivationClasses) {
//        Object[] result = new Object[2];
//        int clientsWithoutARecognisedPostcode = 0;
//        TreeMap<Integer, Integer> deprivationClassCountOfCABClients;
//        deprivationClassCountOfCABClients = new TreeMap<Integer, Integer>();
//        Iterator<EnquiryClientBureauOutletID> ite;
//        ite = tLeedsCABData.keySet().iterator();
//        while (ite.hasNext()) {
//            DW_ID_ClientOutletEnquiryID id = ite.next();
//            DW_Data_CAB2_Record aLeedsCABData_DataRecord = tLeedsCABData.get(id);
//            String postcode = aLeedsCABData_DataRecord.getPostcode();
//            postcode = DW_Processor.formatPostcodeForONSPDLookup(postcode);
//            if (!postcode.isEmpty()) {
//                String SOACode = tLookupFromPostcodeToCensusCodes.get(postcode);
//                if (SOACode == null) {
//                    clientsWithoutARecognisedPostcode++;
//                } else {
//                    Census_DeprivationDataRecord aDeprivation_DataRecord = tDeprivationData.get(SOACode);
//                    if (aDeprivation_DataRecord != null) {
//                        Integer deprivationClass = getDeprivationClass(deprivationClasses, aDeprivation_DataRecord);
//                        if (deprivationClassCountOfCABClients.containsKey(deprivationClass)) {
//                            Integer classCount = deprivationClassCountOfCABClients.get(deprivationClass);
//                            Integer newClassCount = classCount + 1;
//                            deprivationClassCountOfCABClients.put(deprivationClass, newClassCount);
//                        } else {
//                            deprivationClassCountOfCABClients.put(deprivationClass, 1);
//                        }
//                    } else {
//                        int debug = 1;
//                    }
//                }
//            } else {
//                int debug = 1;
//                clientsWithoutARecognisedPostcode++;
//            }
//        }
//        result[0] = deprivationClassCountOfCABClients;
//        result[1] = clientsWithoutARecognisedPostcode;
//        return result;
//    }
//
//    /**
//     *
//     * @param count
//     * @param percentageBand
//     * @param tLeedsCABData
//     * @param tDeprivationData
//     * @param tLookupFromPostcodeToCensusCodes
//     * @param classWidth
//     * @param numberOfClasses
//     * @return Object[] result where: ------------------------------------------
//     * result[0] = deprivationClassCountOfCABClients; // TreeMap<Integer,
//     * Integer> // Key = Class; value = count ----------------------------------
//     * result[1] = clientsWithoutARecognisedPostcode; // An int count ----------
//     */
//    public static Object[] getDeprivationClassCountOfCABClients(
//            int count,
//            int percentageBand,
//            TreeMap<String, DW_Data_CAB2_Record> tLeedsCABData,
//            TreeMap<String, Census_DeprivationDataRecord> tDeprivationData,
//            TreeMap<String, String[]> tLookupFromPostcodeToCensusCodes,
//            int classWidth,
//            int numberOfClasses) {
//        Object[] result = new Object[2];
//        int clientsWithoutARecognisedPostcode = 0;
//        TreeMap<Integer, Integer> deprivationClassCountOfCABClients = new TreeMap<Integer, Integer>();
//        Iterator<String> ite = tLeedsCABData.keySet().iterator();
//        while (ite.hasNext()) {
//            String clientProfileID = ite.next();
//            DW_Data_CAB2_Record aLeedsCABData_DataRecord = tLeedsCABData.get(clientProfileID);
//            String postcode = aLeedsCABData_DataRecord.getPostcode();
//            postcode = DW_Processor.formatPostcodeForONSPDLookup(postcode);
//            if (!postcode.isEmpty()) {
//                String[] codes = tLookupFromPostcodeToCensusCodes.get(postcode);
//                if (codes == null) {
//                    clientsWithoutARecognisedPostcode++;
//                } else {
//                    String SOACode = codes[1];
//                    Census_DeprivationDataRecord aDeprivation_DataRecord = tDeprivationData.get(SOACode);
//                    if (aDeprivation_DataRecord != null) {
//                        Integer deprivationClass = getDeprivationClass(count, percentageBand, classWidth, numberOfClasses, aDeprivation_DataRecord);
//                        if (deprivationClassCountOfCABClients.containsKey(deprivationClass)) {
//                            Integer classCount = deprivationClassCountOfCABClients.get(deprivationClass);
//                            Integer newClassCount = classCount + 1;
//                            deprivationClassCountOfCABClients.put(deprivationClass, newClassCount);
//                        } else {
//                            deprivationClassCountOfCABClients.put(deprivationClass, 1);
//                        }
//                    } else {
//                        int debug = 1;
//                    }
//                }
//            } else {
//                int debug = 1;
//                clientsWithoutARecognisedPostcode++;
//            }
//        }
//        result[0] = deprivationClassCountOfCABClients;
//        result[1] = clientsWithoutARecognisedPostcode;
//        return result;
//    }
//
//    /**
//     *
//     * @param tLeedsCABData
//     * @param tDeprivationData
//     * @param tLookupFromPostcodeToCensusCodes
//     * @param count
//     * @param percentageBand
//     * @param classWidth
//     * @param numberOfClasses
//     * @return Object[] result where: ------------------------------------------
//     * result[0] = deprivationClassCountOfCABClients; // TreeMap<Integer,
//     * Integer> // Key = Class; value = count ----------------------------------
//     * result[1] = clientsWithoutARecognisedPostcode; // An int count ----------
//     */
//    public static Object[] getDeprivationClassCountOfCABClients(
//            TreeMap<String, DW_Data_CAB1_Record> tLeedsCABData,
//            TreeMap<String, Census_DeprivationDataRecord> tDeprivationData,
//            TreeMap<String, String> tLookupFromPostcodeToCensusCodes,
//            int count,
//            int percentageBand,
//            int classWidth,
//            int numberOfClasses) {
//        Object[] result = new Object[2];
//        int clientsWithoutARecognisedPostcode = 0;
//        TreeMap<Integer, Integer> deprivationClassCountOfCABClients = new TreeMap<Integer, Integer>();
//        Iterator<String> ite = tLeedsCABData.keySet().iterator();
//        while (ite.hasNext()) {
//            String clientProfileID = ite.next();
//            DW_Data_CAB1_Record aLeedsCABData_DataRecord = tLeedsCABData.get(clientProfileID);
//            String postcode = aLeedsCABData_DataRecord.getPostalCode();
//            postcode = DW_Processor.formatPostcodeForONSPDLookup(postcode);
//            if (!postcode.isEmpty()) {
//                String SOACode = tLookupFromPostcodeToCensusCodes.get(postcode);
//                if (SOACode == null) {
//                    clientsWithoutARecognisedPostcode++;
//                } else {
//                    Census_DeprivationDataRecord aDeprivation_DataRecord = tDeprivationData.get(SOACode);
//                    if (aDeprivation_DataRecord != null) {
//                        Integer deprivationClass = getDeprivationClass(count, percentageBand, classWidth, numberOfClasses, aDeprivation_DataRecord);
//                        if (deprivationClassCountOfCABClients.containsKey(deprivationClass)) {
//                            Integer classCount = deprivationClassCountOfCABClients.get(deprivationClass);
//                            Integer newClassCount = classCount + 1;
//                            deprivationClassCountOfCABClients.put(deprivationClass, newClassCount);
//                        } else {
//                            deprivationClassCountOfCABClients.put(deprivationClass, 1);
//                        }
//                    } else {
//                        int debug = 1;
//                    }
//                }
//            } else {
//                int debug = 1;
//                clientsWithoutARecognisedPostcode++;
//            }
//        }
//        result[0] = deprivationClassCountOfCABClients;
//        result[1] = clientsWithoutARecognisedPostcode;
//        return result;
//    }
    // most deprived areas are those with highest IMDSCore and IMDRank
    public static Integer getDeprivationClass(
            int count,
            int percentageBand,
            int classWidth,
            int numberOfClasses,
            Census_DeprivationDataRecord aDeprivation_DataRecord) {
        String rankOfIMDScoreForEngland = aDeprivation_DataRecord.getRankOfIMDScoreForEngland();
        Integer rankOfIMDScoreForEnglandInteger;
        int thisRank = 0;
        if (rankOfIMDScoreForEngland != null) {
            rankOfIMDScoreForEnglandInteger = Integer.valueOf(rankOfIMDScoreForEngland);
            thisRank = rankOfIMDScoreForEnglandInteger;
        } else {
            int debug = 1;
        }
        int rank = 0;
        Integer DeprivationClass = percentageBand;
        for (int i = 0; i < numberOfClasses; i++) {
            rank += classWidth;
            if (thisRank <= rank) {
                return DeprivationClass;
            }
            DeprivationClass += percentageBand;
        }
        return DeprivationClass;
    }
}
