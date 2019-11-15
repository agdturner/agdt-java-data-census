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
package uk.ac.leeds.ccg.andyt.generic.data.census.data;

import uk.ac.leeds.ccg.andyt.data.id.Data_RecordID;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_AreaID;

/**
 * For area records.
 * 
 * @author Andy Turner
 * @version 1.0.0
 */
public abstract class Census_AreaRecord extends Census_Record {
    
    public String zoneCode;
    public Census_AreaID zoneID;
    
    public Census_AreaRecord(Data_RecordID rID) {
        super(rID);
    }
    
    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", zoneCode=" + this.zoneCode;
    }
    
    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + this.zoneCode;
    }
        
    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSV() + ",zoneCode";
    }
}
