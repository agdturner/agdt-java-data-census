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
package uk.ac.leeds.ccg.andyt.generic.data.census.sws;

import uk.ac.leeds.ccg.andyt.generic.data.census.data.Census_Record;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_RecordID;

/**
 * A <code>class</code> for representing a SWS
 * Method of travel to work (2001 SWS Level 3 Table 1)
 * Data Record and providing safe
 * access to the data.
 * There are 36 cells in this table.
 * +-------------------+---------+-------------------------------------------+
 * |                   | All     | Aged 16-74 in employment                  |
 * |                   | persons +-------------------+-----------------------+
 * |                   |         | Full-time student | Not full-time student |
 * +-------------------+---------+-------------------+-----------------------+
 * | Total             | 1       | 2                 | 3                     |
 * | Work/study mainly |         |                   |                       |
 * | at/from home      | 4 	 | 5                 | 6                     |
 * | Underground etc.  | 7       | 8                 | 9                     |
 * | Train             | 10      | 11                | 12                    |
 * | Bus etc.          | 13      | 14                | 15                    |
 * | Taxi              | 16      | 17                | 18                    |
 * | Car - driver      | 19      | 20                | 21                    |
 * | Car - passenger   | 22      | 23                | 24                    |
 * | Motorcycle etc.   | 25      | 26                | 27                    |
 * | Bicycle           | 28      | 29                | 30                    |
 * | On foot           | 31      | 32                | 33                    |
 * | Other             | 34      | 35                | 36                    |
 * +-------------------+---------+-------------------+-----------------------+
 *
 */
public class Census_SWSRecord extends Census_Record {

    public Census_SWSRecord(Census_RecordID rID) {
        super(rID);
    }
}
