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

import java.util.HashMap;
import java.util.HashSet;
import uk.ac.leeds.ccg.andyt.generic.data.census.core.Census_Environment;
import uk.ac.leeds.ccg.andyt.generic.data.census.core.Census_Object;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_2001_LSOAID;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_2001_OAID;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_MSOAID;

/**
 * For Census look ups to/from 2001 Output Areas (OAs). OAs aggregate into 
 * Lower Layer Super Output Areas (LSOAs) which aggregate onto Middle Layer 
 * Super Output Areas (MSOAs). MSOAs for the 2001 Census are supposed to be the 
 * same for the 2011 Census.
 * 
 * @author Andy Turner
 * @version 1.0.0.
 */
public class Census_2001_OA_LUT extends Census_Object {
    
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
     * For a lookup from an LSOAID to a OAID 
     */
    protected HashMap<Census_2001_LSOAID, Census_2001_OAID> LSOAID2OAID;
    
    /**
     * For a lookup from an OAID to a MSOAID 
     */
    protected HashMap<Census_2001_OAID, Census_MSOAID> OAID2MSOAID;
    
    /**
     * For a lookup from an MSOAID to a OAID 
     */
    protected HashMap<Census_MSOAID, Census_2001_OAID> MSOAID2OAID;
    
    public Census_2001_OA_LUT(Census_Environment e) {
        super(e);
    }
    
    /**
     * If {@link #OAIDs} is null then it and other fields are initialised and then it is returned.
     * @return {@link #OAIDs} 
     */
    public HashSet<Census_2001_OAID> getOAIDs() {
        if (OAIDs == null) {
            loadLuts();
        }
        return OAIDs;
    }
    
    getCensusCodes(area, level, censusDataDirectory);
}
