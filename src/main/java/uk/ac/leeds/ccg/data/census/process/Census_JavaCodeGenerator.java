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
package uk.ac.leeds.ccg.data.census.process;

import java.nio.file.Path;
import uk.ac.leeds.ccg.data.census.core.Census_Environment;
import uk.ac.leeds.ccg.data.census.core.Census_Object;
import uk.ac.leeds.ccg.data.core.Data_Environment;
import uk.ac.leeds.ccg.generic.core.Generic_Environment;
import uk.ac.leeds.ccg.generic.io.Generic_Defaults;

/**
 *
 * @author geoagdt
 */
public class Census_JavaCodeGenerator extends Census_Object implements Runnable {

    public Census_JavaCodeGenerator(Census_Environment e) {
        super(e);
    }

    public static void main(String[] args) {
        try {
            Path dir = null;
            Census_Environment env = new Census_Environment(
                    new Data_Environment(new Generic_Environment(
                    new Generic_Defaults())), dir);
            Census_JavaCodeGenerator p = new Census_JavaCodeGenerator(env);
            p.run();
        } catch (Exception ex) {
            ex.printStackTrace(System.err);
        }
    }

    @Override
    public void run() {
//        try {
//            File f = this.env.getFiles().getInput2001LUT();
//            Data_ReadTXT rt = new Data_ReadTXT(env.de);
//            BufferedReader br = io.getBufferedReader(f);
//            StreamTokenizer st = new StreamTokenizer(br);
//            rt.readLine(st);
//        } catch (IOException ex) {
//            ex.printStackTrace(System.err);
//        }
    }

}
