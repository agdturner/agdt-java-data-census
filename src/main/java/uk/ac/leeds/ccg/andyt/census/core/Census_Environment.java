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
package uk.ac.leeds.ccg.andyt.census.core;

import java.io.File;
import java.io.IOException;
import uk.ac.leeds.ccg.andyt.census.io.Census_Files;
import uk.ac.leeds.ccg.andyt.data.core.Data_Environment;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_Environment;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_Defaults;

/**
 *
 * @author geoagdt
 */
public class Census_Environment extends Data_Environment {

    //public transient final Generic_Environment env;
    //public transient final Census_Files files;
            
    public Census_Environment() throws IOException {
        this(new Generic_Environment());
    }
    
    public Census_Environment(Generic_Environment e) throws IOException {
        this(e, Generic_Defaults.getDefaultDir());
    }
    
    /**
     * 
     * @param env What {@link #env} is set to. 
     * @param dir Directory used to initialise {@link #files}. 
     */
    public Census_Environment(Generic_Environment env, File dir) throws IOException {
        this.env = env;
        files = new Census_Files(dir);
    }

    public Census_Files getFiles() {
        return (Census_Files) files;
    }
}
