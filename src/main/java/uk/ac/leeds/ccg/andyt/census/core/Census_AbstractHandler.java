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
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS001Handler;
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
public abstract class Census_AbstractHandler extends Data_AbstractHandler {

    public Census_Environment getEnv() {
        return (Census_Environment) env;
    }

    /**
     * Census_CAS001Handler
     */
    public Census_CAS001Handler CAS001Handler;

    /**
     * Census_CAS003DataHandler
     */
    public Census_CAS003DataHandler CAS003Handler;

    /**
     * For looking up an OA from an OAID
     */
    public HashMap<Integer, String> OAID2OA;

    /**
     * For looking up an OAID from an OA
     */
    public HashMap<String, Integer> OA2OAID;

    /**
     * For looking up an MSOA from an MSOAID
     */
    public HashMap<Integer, String> MSOAID2MSOA;

    /**
     * For looking up an MSOAID from an MSOA
     */
    public HashMap<String, Integer> MSOA2MSOAID;
    
    /**
     * For looking up an MSOAID from an OAID.
     */
    public HashMap<Integer, Integer> OAID2MSOAID;
    
    /**
     * For looking up OAIDs from an MSOAID.
     */
    public HashMap<Integer, Set<Integer>> MSOAID2OAID;
    
    /**
     * @param e What {@link #env} is set to.
     */
    public Census_AbstractHandler(Census_Environment e){
        super(e);
    }
    
    /**
     * TODO docs
     *
     * @return
     */
    public void initLookups() {
            
    }

}
