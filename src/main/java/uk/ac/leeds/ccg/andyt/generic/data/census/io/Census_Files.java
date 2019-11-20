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
package uk.ac.leeds.ccg.andyt.generic.data.census.io;

import java.io.File;
import java.io.IOException;
import uk.ac.leeds.ccg.andyt.generic.data.census.core.Census_Strings;
import uk.ac.leeds.ccg.andyt.data.io.Data_Files;

/**
 * For Census files.
 * 
 * @author Andy Turner
 * @version 1.0.0.
 */
public class Census_Files extends Data_Files {

    /**
     * @param dir The data directory.
     * @throws java.io.IOException
     */
    public Census_Files(File dir) throws IOException {
        super(dir);
    }

    public File getInput2001Dir() {
        return new File(getInputDir(), Census_Strings.s_2001);
    }

    public File getInput2011Dir() {
        return new File(getInputDir(), Census_Strings.s_2011);
    }

    public File getInput2001LUTDir() {
        return new File(getInput2001Dir(), Census_Strings.s_lut);
    }

    public File getInput2011LUTDir() {
        return new File(getInput2011Dir(), Census_Strings.s_lut);
    }

//    public File getInput2001LUT() {
//        return new File(getInput2001LUTDir(), "OA_LSOA_MSOA_LA_Apr05.txt");
//    }

    public File getGenerated2001Dir() {
        return new File(getGeneratedDir(), Census_Strings.s_2001);
    }

    public File getGenerated2001LUTDir() {
        return new File(getGenerated2001Dir(), Census_Strings.s_lut);
    }

}
