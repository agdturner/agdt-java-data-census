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
package uk.ac.leeds.ccg.andyt.generic.data.census.luts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.util.HashMap;
import java.util.HashSet;
import uk.ac.leeds.ccg.andyt.data.core.Data_Environment;
import uk.ac.leeds.ccg.andyt.data.format.Data_ReadTXT;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_Environment;
import uk.ac.leeds.ccg.andyt.generic.data.census.core.Census_Environment;
import uk.ac.leeds.ccg.andyt.generic.data.census.core.Census_Object;
import uk.ac.leeds.ccg.andyt.generic.data.census.core.Census_Strings;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_2001_LSOAID;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_2001_OAID;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_MSOAID;
import uk.ac.leeds.ccg.andyt.generic.util.Generic_Collections;

/**
 * For Census look ups to/from 2001 Output Areas (OAs). OAs aggregate into Lower
 * Layer Super Output Areas (LSOAs) which aggregate onto Middle Layer Super
 * Output Areas (MSOAs). MSOAs for the 2001 Census are supposed to be the same
 * for the 2011 Census.
 *
 * @author Andy Turner
 * @version 1.0.0.
 */
public class Census_2001_LUTs extends Census_Object {

    /**
     * For storing a list of all OA IDs.
     */
    protected HashSet<Census_2001_OAID> OAIDs;

    /**
     * For storing a list of all Lower Layer Super Output Area IDs.
     */
    protected HashSet<Census_2001_LSOAID> LSOAIDs;

    /**
     * For storing a list of all Middle Layer Super Output Area IDs.
     */
    protected HashSet<Census_MSOAID> MSOAIDs;

    /**
     * For storing a lookup from an OA code to an OAID.
     */
    protected HashMap<String, Census_2001_OAID> OA2OAID;

    /**
     * For storing a lookup from an OAID to an OA code.
     */
    protected HashMap<Census_2001_OAID, String> OAID2OA;

    /**
     * For storing a lookup from an LSOA code to an LSOAID.
     */
    protected HashMap<String, Census_2001_LSOAID> LSOA2LSOAID;

    /**
     * For storing a lookup from an LSOAID to an LSOA code.
     */
    protected HashMap<Census_2001_LSOAID, String> LSOAID2LSOA;

    /**
     * For storing a lookup from an MSOA code to an MSOAID.
     */
    protected HashMap<String, Census_MSOAID> MSOA2MSOAID;

    /**
     * For storing a lookup from an MSOAID to an MSOA code.
     */
    protected HashMap<Census_MSOAID, String> MSOAID2MSOA;

    /**
     * For a lookup from an OAID to a LSOAID
     */
    protected HashMap<Census_2001_OAID, Census_2001_LSOAID> OAID2LSOAID;

    /**
     * For a lookup from an LSOAID to a set of OAIDs
     */
    protected HashMap<Census_2001_LSOAID, HashSet<Census_2001_OAID>> LSOAID2OAIDs;

    /**
     * For a lookup from an OAID to a MSOAID
     */
    protected HashMap<Census_2001_OAID, Census_MSOAID> OAID2MSOAID;

    /**
     * For a lookup from an MSOAID to a set of OAIDs
     */
    protected HashMap<Census_MSOAID, HashSet<Census_2001_OAID>> MSOAID2OAIDs;

    /**
     * For a lookup from an LSOAID to a MSOAID
     */
    protected HashMap<Census_2001_LSOAID, Census_MSOAID> LSOAID2MSOAID;

    /**
     * For a lookup from an MSOAID to a set of LSOAIDs
     */
    protected HashMap<Census_MSOAID, HashSet<Census_2001_LSOAID>> MSOAID2LSOAIDs;

    public Census_2001_LUTs(Census_Environment e) {
        super(e);
    }

    /**
     * If {@link #OAIDs} is null then it and other fields are initialised and
     * then it is returned.
     *
     * @return {@link #OAIDs}
     * @throws java.io.IOException IFF IOException is encountered.
     */
    public HashSet<Census_2001_OAID> getOAIDs() throws IOException {
        if (OAIDs == null) {
            load();
        }
        return OAIDs;
    }

    /**
     * For loading the look-ups from source files.
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void load() throws FileNotFoundException, IOException {
        // Initialise collections.
        OAIDs = new HashSet<>();
        LSOAIDs = new HashSet<>();
        MSOAIDs = new HashSet<>();
        OA2OAID = new HashMap<>();
        OAID2OA = new HashMap<>();
        LSOA2LSOAID = new HashMap<>();
        LSOAID2LSOA = new HashMap<>();
        MSOA2MSOAID = new HashMap<>();
        MSOAID2MSOA = new HashMap<>();
        OAID2LSOAID = new HashMap<>();
        LSOAID2OAIDs = new HashMap<>();
        OAID2MSOAID = new HashMap<>();
        MSOAID2OAIDs = new HashMap<>();
        LSOAID2MSOAID = new HashMap<>();
        MSOAID2LSOAIDs = new HashMap<>();

        // Common things for loading from the files.
        String fn;
        File f;
        Data_ReadTXT reader = new Data_ReadTXT(env.de);
        String line;
        
        /**
         * Initialise LUTs between OA, LSOA and MSOA.
         */
        fn = "Output_Area_to_Lower_Layer_Super_Output_Area_to_Middle_"
                + "Layer_Super_Output_Area_December_2001_Lookup_in_England_and_"
                + "Wales.csv";
        f = new File(env.files.getInput2001LUTDir(), fn);
        try (BufferedReader br = env.de.env.io.getBufferedReader(f)) {
            StreamTokenizer st = new StreamTokenizer(br);
            env.de.env.io.setStreamTokenizerSyntax1(st);
            env.de.env.io.setStreamTokenizerSyntaxNumbersAsWords1(st);
            line = reader.readLine(st);     // Skip header...
            env.de.env.log("Reading " + f); // ...
            env.de.env.log(line);           // ... but log it.
            line = reader.readLine(st);
            while (line != null) {
                //env.de.env.log(line); // For testing.
                String[] split = line.split(",");
                // Add to OAIDs, OA2OAID and OAID2OA
                Census_2001_OAID oaid = new Census_2001_OAID(OAIDs.size());
                OAIDs.add(oaid);
                OA2OAID.put(split[0], oaid);
                OAID2OA.put(oaid, split[0]);
                // Add to LSOAIDs, LSOA2LSOAID and LSOAID2LSOA
                Census_2001_LSOAID lsoaid;
                if (LSOA2LSOAID.containsKey(split[1])) {
                    lsoaid = LSOA2LSOAID.get(split[1]);
                } else {
                    lsoaid = new Census_2001_LSOAID(LSOAIDs.size());
                    LSOAIDs.add(lsoaid);
                    LSOA2LSOAID.put(split[1], lsoaid);
                    LSOAID2LSOA.put(lsoaid, split[1]);
                    // Add to OAID2LSOAID and LSOAID2OAIDs
                    OAID2LSOAID.put(oaid, lsoaid);
                    Generic_Collections.addToMap(LSOAID2OAIDs, lsoaid, oaid);
                }
                // Add to MSOAIDs, MSOA2MSOAID and MSOAID2MSOA                
                Census_MSOAID msoaid;
                if (MSOA2MSOAID.containsKey(split[3])) {
                    msoaid = MSOA2MSOAID.get(split[3]);
                } else {
                    msoaid = new Census_MSOAID(MSOAIDs.size());
                    MSOAIDs.add(msoaid);
                    MSOA2MSOAID.put(split[3], msoaid);
                    MSOAID2MSOA.put(msoaid, split[3]);
                    // Add to OAID2MSOAID and MSOAID2OAIDs
                    OAID2MSOAID.put(oaid, msoaid);
                    Generic_Collections.addToMap(MSOAID2OAIDs, msoaid, oaid);
                }
                // Add to LSOAID2MSOAID and MSOAID2LSOAIDs
                LSOAID2MSOAID.put(lsoaid, msoaid);
                Generic_Collections.addToMap(MSOAID2LSOAIDs, msoaid, lsoaid);
                // Get next line.
                line = reader.readLine(st);
            }
        }
    }

    public static void main(String[] args) {
        try {
            Data_Environment de = new Data_Environment(new Generic_Environment());
            File dataDir = new File(de.files.getDataDir(), Census_Strings.s_census);
            Census_Environment e = new Census_Environment(de, dataDir);
            Census_2001_LUTs p = new Census_2001_LUTs(e);
            p.load();
            // Test
            p.env.de.env.log("OAIDs.size()=" + p.OAIDs.size());
            p.env.de.env.log("LSOAIDs.size()=" + p.LSOAIDs.size());
            p.env.de.env.log("MSOAIDs.size()=" + p.MSOAIDs.size());
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }
    //getCensusCodes(area, level, censusDataDirectory);
}
