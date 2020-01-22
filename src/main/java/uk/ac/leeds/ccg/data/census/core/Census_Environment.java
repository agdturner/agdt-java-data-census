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
package uk.ac.leeds.ccg.data.census.core;

import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import uk.ac.leeds.ccg.data.census.io.Census_Files;
import uk.ac.leeds.ccg.data.core.Data_Environment;
import uk.ac.leeds.ccg.data.census.data.id.Census_2001_LSOAID;
import uk.ac.leeds.ccg.data.census.data.id.Census_2001_OAID;
import uk.ac.leeds.ccg.data.census.data.id.Census_2011_LADID;
import uk.ac.leeds.ccg.data.census.data.id.Census_2011_LSOAID;
import uk.ac.leeds.ccg.data.census.data.id.Census_2011_OAID;
import uk.ac.leeds.ccg.data.census.data.id.Census_MSOAID;
import uk.ac.leeds.ccg.data.census.data.luts.Census_2001_LUTs;
import uk.ac.leeds.ccg.data.census.data.luts.Census_2011_LUTs;

/**
 * Census Environment.
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_Environment {

    public transient final Data_Environment de;
    public transient final Census_Files files;

    public transient Census_2001_LUTs c01LUTs;
    public transient Census_2011_LUTs c11LUTs;

    /**
     *
     * @param e What {@link #de} is set to.
     * @param dir Directory used to initialise {@link #files}.
     * @throws java.io.IOException If dir cannot be set up as a data directory.
     */
    public Census_Environment(Data_Environment e, Path dir) throws IOException {
        this.de = e;
        files = new Census_Files(dir);
    }

    public Census_Files getFiles() {
        return (Census_Files) files;
    }

    /**
     * If {@link #c01LUTs} is {@code null} is it initialised.
     *
     * @return {@link #c01LUTs}
     * @throws java.io.IOException
     */
    public Census_2001_LUTs getC01LUTs() throws IOException {
        if (c01LUTs == null) {
            c01LUTs = new Census_2001_LUTs(this);
        }
        return c01LUTs;
    }

    /**
     * If {@link #c11LUTs} is {@code null} is it initialised.
     *
     * @return {@link #c11LUTs}
     * @throws java.io.IOException
     */
    public Census_2011_LUTs getC11LUTs() throws IOException {
        if (c11LUTs == null) {
            c11LUTs = new Census_2011_LUTs(this);
        }
        return c11LUTs;
    }

    /**
     * For getting census area codes within a Local Authority District.
     *
     * @param area 2001 Local Authority District Name for an area within which
     * the codes for other areas are returned.
     * @param level The level for which codes are wanted. Expects: "OA", "LSOA"
     * or "MSOA". For anything else an IOException is thrown.
     * @return A set of census area codes in an area. Try not to use this method
     * for new code.
     * @throws java.io.IOException
     */
    @Deprecated
    public TreeSet<String> getCensusCodes(String area, String level) throws IOException {
        TreeSet<String> r = new TreeSet<>();
        if (level.equalsIgnoreCase("OA")) {
            r.addAll(get2011OACodes(area));
        } else if (level.equalsIgnoreCase("LSOA")) {
            r.addAll(get2011LSOACodes(area));
        } else if (level.equalsIgnoreCase("MSOA")) {
            r.addAll(get2011MSOACodes(area));
        } else {
            throw new IOException("Unrecognised level " + level);
        }
        return r;
    }

    /**
     * Provides all 2011 Output Area Codes in the 2011 Local Authority given by
     * {@code name}.
     *
     * @param name 2011 Local Authority District Name
     * @return A set of all 2011 Output Area Codes in the 2011 Local Authority
     * given by {@code name}.
     * @throws java.io.IOException
     */
    public HashSet<String> get2011OACodes(String name) throws IOException {
        c11LUTs = getC11LUTs();
        if (c11LUTs.LADNAME2LADID.containsKey(name)) {
            Census_2011_LADID ladid = c11LUTs.LADNAME2LADID.get(name);
            Set<Census_2011_OAID> s = c11LUTs.LADID2OAIDs.get(ladid);
            HashSet<String> r = new HashSet<>();
            de.env.log("There are " + s.size() + " 2011 Output Areas in "
                    + name + " Local Authority District.");
            Iterator<Census_2011_OAID> ite = s.iterator();
            while (ite.hasNext()) {
                r.add(c11LUTs.OAID2OA.get(ite.next()));
            }
            return r;
        } else {
            throw new IOException("Local Authority District Name " + name
                    + " not recognised.");
        }
    }

    /**
     * Provides all 2011 Lower Layer Super Output Area Codes in the 2011 Local
     * Authority given by {@code name}.
     *
     * @param name 2011 Local Authority District Name
     * @return A set of all 2011 Lower Layer Super Output Area Codes in the 2011
     * Local Authority given by {@code name}.
     * @throws java.io.IOException
     */
    public HashSet<String> get2011LSOACodes(String name) throws IOException {
        c11LUTs = getC11LUTs();
        if (c11LUTs.LADNAME2LADID.containsKey(name)) {
            Census_2011_LADID ladid = c11LUTs.LADNAME2LADID.get(name);
            Set<Census_2011_LSOAID> s = c11LUTs.LADID2LSOAIDs.get(ladid);
            HashSet<String> r = new HashSet<>();
            de.env.log("There are " + s.size()
                    + " Lower Layer Super Output Areas in "
                    + name + " Local Authority District.");
            Iterator<Census_2011_LSOAID> ite = s.iterator();
            while (ite.hasNext()) {
                r.add(c11LUTs.LSOAID2LSOA.get(ite.next()));
            }
            return r;
        } else {
            throw new IOException("Local Authority District Name " + name
                    + " not recognised.");
        }
    }

    /**
     * Provides all 2011 Middle Layer Super Output Area Codes in the 2011 Local
     * Authority given by {@code name}.
     *
     * @param name 2011 Local Authority District Name
     * @return A set of all 2011 Middle Layer Super Output Area Codes in the
     * 2011 Local Authority given by {@code name}.
     * @throws java.io.IOException
     */
    public HashSet<String> get2011MSOACodes(String name) throws IOException {
        c11LUTs = getC11LUTs();
        if (c11LUTs.LADNAME2LADID.containsKey(name)) {
            Census_2011_LADID ladid = c11LUTs.LADNAME2LADID.get(name);
            Set<Census_MSOAID> s = c11LUTs.LADID2MSOAIDs.get(ladid);
            HashSet<String> r = new HashSet<>();
            de.env.log("There are " + s.size()
                    + " 2011 Middle Layer Super Output Areas in "
                    + name + " Local Authority District.");
            Iterator<Census_MSOAID> ite = s.iterator();
            while (ite.hasNext()) {
                r.add(c11LUTs.MSOAID2MSOA.get(ite.next()));
            }
            return r;
        } else {
            throw new IOException("Local Authority District Name " + name
                    + " not recognised.");
        }
    }

    /**
     * Provides all 2001 Output Area Codes in the 2011 Local Authority given by
     * {@code name}.
     *
     * @param name 2011 Local Authority District Name
     * @return A set of all 2001 Output Area Codes in the 2011 Local Authority
     * given by {@code name}.
     * @throws java.io.IOException
     */
    public HashSet<String> get2001OACodes(String name) throws IOException {
        c01LUTs = getC01LUTs();
        if (c01LUTs.LADNAME2LADID.containsKey(name)) {
            Census_2011_LADID ladid = c01LUTs.LADNAME2LADID.get(name);
            Set<Census_2001_OAID> s = c01LUTs.LADID2OAIDs.get(ladid);
            HashSet<String> r = new HashSet<>();
            de.env.log("There are " + s.size() + " 2001 Output Areas in "
                    + name + " Local Authority District.");
            Iterator<Census_2001_OAID> ite = s.iterator();
            while (ite.hasNext()) {
                String oa = c01LUTs.OAID2OA.get(ite.next());
                r.add(oa);
            }
            return r;
        } else {
            throw new IOException("Local Authority District Name " + name
                    + " not recognised.");
        }
    }

    /**
     * Provides all 2001 Lower Layer Super Output Area Codes in the 2011 Local
     * Authority given by {@code name}.
     *
     * @param name 2011 Local Authority District Name
     * @return A set of all 2001 Lower Layer Super Output Area Codes in the 2011
     * Local Authority given by {@code name}.
     * @throws java.io.IOException
     */
    public HashSet<String> get2001LSOACodes(String name) throws IOException {
        c01LUTs = getC01LUTs();
        if (c01LUTs.LADNAME2LADID.containsKey(name)) {
            Census_2011_LADID ladid = c01LUTs.LADNAME2LADID.get(name);
            Set<Census_2001_LSOAID> s = c01LUTs.LADID2LSOAIDs.get(ladid);
            HashSet<String> r = new HashSet<>();
            de.env.log("There are " + s.size()
                    + " 2001 Lower Layer Super Output Areas in "
                    + name + " Local Authority District.");
            Iterator<Census_2001_LSOAID> ite = s.iterator();
            while (ite.hasNext()) {
                r.add(c01LUTs.LSOAID2LSOA.get(ite.next()));
            }
            return r;
        } else {
            throw new IOException("Local Authority District Name " + name
                    + " not recognised.");
        }
    }

    /**
     * Provides all 2001 Middle Layer Super Output Area Codes in the 2011 Local
     * Authority given by {@code name}.
     *
     * @param name 2011 Local Authority District Name
     * @return A set of all 2001 Lower Layer Super Output Area Codes in the 2011
     * Local Authority given by {@code name}.
     * @throws java.io.IOException
     */
    public HashSet<String> get2001MSOACodes(String name) throws IOException {
        c01LUTs = getC01LUTs();
        if (c01LUTs.LADNAME2LADID.containsKey(name)) {
            Census_2011_LADID ladid = c01LUTs.LADNAME2LADID.get(name);
            Set<Census_MSOAID> s = c01LUTs.LADID2MSOAIDs.get(ladid);
            HashSet<String> r = new HashSet<>();
            de.env.log("There are " + s.size()
                    + " 2001 Middle Layer Super Output Areas in "
                    + name + " Local Authority District.");
            Iterator<Census_MSOAID> ite = s.iterator();
            while (ite.hasNext()) {
                r.add(c01LUTs.MSOAID2MSOA.get(ite.next()));
            }
            return r;
        } else {
            throw new IOException("Local Authority District Name " + name
                    + " not recognised.");
        }
    }
}
