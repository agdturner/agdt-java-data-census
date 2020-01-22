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
package uk.ac.leeds.ccg.data.census.io;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import uk.ac.leeds.ccg.data.census.core.Census_Strings;
import uk.ac.leeds.ccg.data.io.Data_Files;

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
    public Census_Files(Path dir) throws IOException {
        super(dir);
    }

    public Path getInput2001Dir() throws IOException {
        return Paths.get(getInputDir().toString(), Census_Strings.s_2001);
    }

    public Path getInput2011Dir() throws IOException {
        return Paths.get(getInputDir().toString(), Census_Strings.s_2011);
    }

    public Path getInput2001LUTDir() throws IOException {
        return Paths.get(getInput2001Dir().toString(), Census_Strings.s_lut);
    }

    public Path getInput2011LUTDir() throws IOException {
        return Paths.get(getInput2011Dir().toString(), Census_Strings.s_lut);
    }

//    public Path getInput2001LUT() {
//        return Paths.get(getInput2001LUTDir().toString(), "OA_LSOA_MSOA_LA_Apr05.txt");
//    }

    public Path getGenerated2001Dir() throws IOException {
        return Paths.get(getGeneratedDir().toString(), Census_Strings.s_2001);
    }

    public Path getGenerated2001LUTDir() throws IOException {
        return Paths.get(getGenerated2001Dir().toString(), Census_Strings.s_lut);
    }

}
