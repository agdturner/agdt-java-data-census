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
package uk.ac.leeds.ccg.data.census.data.cas;

import uk.ac.leeds.ccg.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.data.census.data.id.Census_RecordID;
import uk.ac.leeds.ccg.math.Math_Integer;

/**
 * For storing a CAS001 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CAS002Record extends Census_AreaRecord {

    /*
     * Table CS002 Age by Sex and Marital Status: All People Footnotes and
     * Comments for Table CS002 1 ONS have confirmed that table CS002 should
     * contain separate categories of 65-69 and 70-74 years of age instead of
     * the combined 65-74 category that is actually present. This error was due
     * to a fault in the production of the table. The data available for this
     * category does fit the description within the table framework (i.e. it is
     * genuinely for a category of 65-74 years of age).
     */
    /**
     * CS0020001 = allPeople
     */
    protected int allPeopleTotal;
    /**
     * CS0020002 = allPeopleMarried
     */
    protected int allPeopleMarried;
    /**
     * CS0020003 = allPeopleSingle
     */
    protected int allPeopleSingle;
    /**
     * CS0020004 = malesTotal
     */
    protected int malesTotal;
    /**
     * CS0020005 = malesMarried
     */
    protected int malesMarried;
    /**
     * CS0020006 = malesSingle
     */
    protected int malesSingle;
    /**
     * CS0020007 = femalesTotal
     */
    protected int femalesTotal;
    /**
     * CS0020008 = femalesMarried
     */
    protected int femalesMarried;
    /**
     * CS0020009 = femalesSingle
     */
    protected int femalesSingle;
    /**
     * CS0020010 = allPeopleAge0to15
     */
    protected int allPeopleTotalAge0to15;
    /**
     * CS0020011 = allPeopleMarriedAge0to15
     */
    protected int allPeopleMarriedAge0to15;
    /**
     * CS0020012 = allPeopleSingleAge0to15
     */
    protected int allPeopleSingleAge0to15;
    /**
     * CS0020013 = malesTotalAge0to15
     */
    protected int malesTotalAge0to15;
    /**
     * CS0020014 = malesMarriedAge0to15
     */
    protected int malesMarriedAge0to15;
    /**
     * CS0020015 = malesSingleAge0to15
     */
    protected int malesSingleAge0to15;
    /**
     * CS0020016 = femalesTotalAge0to15
     */
    protected int femalesTotalAge0to15;
    /**
     * CS0020017 = femalesMarriedAge0to15
     */
    protected int femalesMarriedAge0to15;
    /**
     * CS0020018 = femalesSingleAge0to15
     */
    protected int femalesSingleAge0to15;
    /**
     * CS0020019 = allPeopleAge16to19
     */
    protected int allPeopleTotalAge16to19;
    /**
     * CS0020020 = allPeopleMarriedAge16to19
     */
    protected int allPeopleMarriedAge16to19;
    /**
     * CS0020021 = allPeopleSingleAge16to19
     */
    protected int allPeopleSingleAge16to19;
    /**
     * CS0020022 = malesTotalAge16to19
     */
    protected int malesTotalAge16to19;
    /**
     * CS0020023 = malesMarriedAge16to19
     */
    protected int malesMarriedAge16to19;
    /**
     * CS0020024 = malesSingleAge16to19
     */
    protected int malesSingleAge16to19;
    /**
     * CS0020025 = femalesTotalAge16to19
     */
    protected int femalesTotalAge16to19;
    /**
     * CS0020026 = femalesMarriedAge16to19
     */
    protected int femalesMarriedAge16to19;
    /**
     * CS0020027 = femalesSingleAge16to19
     */
    protected int femalesSingleAge16to19;
    /**
     * CS0020028 = allPeopleAge20to24
     */
    protected int allPeopleTotalAge20to24;
    /**
     * CS0020029 = allPeopleMarriedAge20to24
     */
    protected int allPeopleMarriedAge20to24;
    /**
     * CS0020030 = allPeopleSingleAge20to24
     */
    protected int allPeopleSingleAge20to24;
    /**
     * CS0020031 = malesTotalAge20to24
     */
    protected int malesTotalAge20to24;
    /**
     * CS0020032 = malesMarriedAge20to24
     */
    protected int malesMarriedAge20to24;
    /**
     * CS0020033 = malesSingleAge20to24
     */
    protected int malesSingleAge20to24;
    /**
     * CS0020034 = femalesTotalAge20to24
     */
    protected int femalesTotalAge20to24;
    /**
     * CS0020035 = femalesMarriedAge20to24
     */
    protected int femalesMarriedAge20to24;
    /**
     * CS0020036 = femalesSingleAge20to24
     */
    protected int femalesSingleAge20to24;
    /**
     * CS0020037 = allPeopleAge25to29
     */
    protected int allPeopleTotalAge25to29;
    /**
     * CS0020038 = allPeopleMarriedAge25to29
     */
    protected int allPeopleMarriedAge25to29;
    /**
     * CS0020039 = allPeopleSingleAge25to29
     */
    protected int allPeopleSingleAge25to29;
    /**
     * CS0020040 = malesTotalAge25to29
     */
    protected int malesTotalAge25to29;
    /**
     * CS0020041 = malesMarriedAge25to29
     */
    protected int malesMarriedAge25to29;
    /**
     * CS0020042 = malesSingleAge25to29
     */
    protected int malesSingleAge25to29;
    /**
     * CS0020043 = femalesTotalAge25to29
     */
    protected int femalesTotalAge25to29;
    /**
     * CS0020044 = femalesMarriedAge25to29
     */
    protected int femalesMarriedAge25to29;
    /**
     * CS0020045 = femalesSingleAge25to29
     */
    protected int femalesSingleAge25to29;
    /**
     * CS0020046 = allPeopleAge30to34
     */
    protected int allPeopleTotalAge30to34;
    /**
     * CS0020047 = allPeopleMarriedAge30to34
     */
    protected int allPeopleMarriedAge30to34;
    /**
     * CS0020048 = allPeopleSingleAge30to34
     */
    protected int allPeopleSingleAge30to34;
    /**
     * CS0020049 = malesTotalAge30to34
     */
    protected int malesTotalAge30to34;
    /**
     * CS0020050 = malesMarriedAge30to34
     */
    protected int malesMarriedAge30to34;
    /**
     * CS0020051 = malesSingleAge30to34
     */
    protected int malesSingleAge30to34;
    /**
     * CS0020052 = femalesTotalAge30to34
     */
    protected int femalesTotalAge30to34;
    /**
     * CS0020053 = femalesMarriedAge30to34
     */
    protected int femalesMarriedAge30to34;
    /**
     * CS0020054 = femalesSingleAge30to34
     */
    protected int femalesSingleAge30to34;
    /**
     * CS0020055 = allPeopleAge35to39
     */
    protected int allPeopleTotalAge35to39;
    /**
     * CS0020056 = allPeopleMarriedAge35to39
     */
    protected int allPeopleMarriedAge35to39;
    /**
     * CS0020057 = allPeopleSingleAge35to39
     */
    protected int allPeopleSingleAge35to39;
    /**
     * CS0020058 = malesTotalAge35to39
     */
    protected int malesTotalAge35to39;
    /**
     * CS0020059 = malesMarriedAge35to39
     */
    protected int malesMarriedAge35to39;
    /**
     * CS0020060 = malesSingleAge35to39
     */
    protected int malesSingleAge35to39;
    /**
     * CS0020061 = femalesTotalAge35to39
     */
    protected int femalesTotalAge35to39;
    /**
     * CS0020062 = femalesMarriedAge35to39
     */
    protected int femalesMarriedAge35to39;
    /**
     * CS0020063 = femalesSingleAge35to39
     */
    protected int femalesSingleAge35to39;
    /**
     * CS0020064 = allPeopleAge40to44
     */
    protected int allPeopleTotalAge40to44;
    /**
     * CS0020065 = allPeopleMarriedAge40to44
     */
    protected int allPeopleMarriedAge40to44;
    /**
     * CS0020066 = allPeopleSingleAge40to44
     */
    protected int allPeopleSingleAge40to44;
    /**
     * CS0020067 = malesTotalAge40to44
     */
    protected int malesTotalAge40to44;
    /**
     * CS0020068 = malesMarriedAge40to44
     */
    protected int malesMarriedAge40to44;
    /**
     * CS0020069 = malesSingleAge40to44
     */
    protected int malesSingleAge40to44;
    /**
     * CS0020070 = femalesTotalAge40to44
     */
    protected int femalesTotalAge40to44;
    /**
     * CS0020071 = femalesMarriedAge40to44
     */
    protected int femalesMarriedAge40to44;
    /**
     * CS0020072 = femalesSingleAge40to44
     */
    protected int femalesSingleAge40to44;
    /**
     * CS0020073 = allPeopleAge45to49
     */
    protected int allPeopleTotalAge45to49;
    /**
     * CS0020074 = allPeopleMarriedAge45to49
     */
    protected int allPeopleMarriedAge45to49;
    /**
     * CS0020075 = allPeopleSingleAge45to49
     */
    protected int allPeopleSingleAge45to49;
    /**
     * CS0020076 = malesTotalAge45to49
     */
    protected int malesTotalAge45to49;
    /**
     * CS0020077 = malesMarriedAge45to49
     */
    protected int malesMarriedAge45to49;
    /**
     * CS0020078 = malesSingleAge45to49
     */
    protected int malesSingleAge45to49;
    /**
     * CS0020079 = femalesTotalAge45to49
     */
    protected int femalesTotalAge45to49;
    /**
     * CS0020080 = femalesMarriedAge45to49
     */
    protected int femalesMarriedAge45to49;
    /**
     * CS0020081 = femalesSingleAge45to49
     */
    protected int femalesSingleAge45to49;
    /**
     * CS0020082 = allPeopleAge50to54
     */
    protected int allPeopleTotalAge50to54;
    /**
     * CS0020083 = allPeopleMarriedAge50to54
     */
    protected int allPeopleMarriedAge50to54;
    /**
     * CS0020084 = allPeopleSingleAge50to54
     */
    protected int allPeopleSingleAge50to54;
    /**
     * CS0020085 = malesTotalAge50to54
     */
    protected int malesTotalAge50to54;
    /**
     * CS0020086 = malesMarriedAge50to54
     */
    protected int malesMarriedAge50to54;
    /**
     * CS0020087 = malesSingleAge50to54
     */
    protected int malesSingleAge50to54;
    /**
     * CS0020088 = femalesTotalAge50to54
     */
    protected int femalesTotalAge50to54;
    /**
     * CS0020089 = femalesMarriedAge50to54
     */
    protected int femalesMarriedAge50to54;
    /**
     * CS0020090 = femalesSingleAge50to54
     */
    protected int femalesSingleAge50to54;
    /**
     * CS0020091 = allPeopleAge55to59
     */
    protected int allPeopleTotalAge55to59;
    /**
     * CS0020092 = allPeopleMarriedAge55to59
     */
    protected int allPeopleMarriedAge55to59;
    /**
     * CS0020093 = allPeopleSingleAge55to59
     */
    protected int allPeopleSingleAge55to59;
    /**
     * CS0020094 = malesTotalAge55to59
     */
    protected int malesTotalAge55to59;
    /**
     * CS0020095 = malesMarriedAge55to59
     */
    protected int malesMarriedAge55to59;
    /**
     * CS0020096 = malesSingleAge55to59
     */
    protected int malesSingleAge55to59;
    /**
     * CS0020097 = femalesTotalAge55to59
     */
    protected int femalesTotalAge55to59;
    /**
     * CS0020098 = femalesMarriedAge55to59
     */
    protected int femalesMarriedAge55to59;
    /**
     * CS0020099 = femalesSingleAge55to59
     */
    protected int femalesSingleAge55to59;
    /**
     * CS0020100 = allPeopleAge60to64
     */
    protected int allPeopleTotalAge60to64;
    /**
     * CS0020101 = allPeopleMarriedAge60to64
     */
    protected int allPeopleMarriedAge60to64;
    /**
     * CS0020102 = allPeopleSingleAge60to64
     */
    protected int allPeopleSingleAge60to64;
    /**
     * CS0020103 = malesTotalAge60to64
     */
    protected int malesTotalAge60to64;
    /**
     * CS0020104 = malesMarriedAge60to64
     */
    protected int malesMarriedAge60to64;
    /**
     * CS0020105 = malesSingleAge60to64
     */
    protected int malesSingleAge60to64;
    /**
     * CS0020106 = femalesTotalAge60to64
     */
    protected int femalesTotalAge60to64;
    /**
     * CS0020107 = femalesMarriedAge60to64
     */
    protected int femalesMarriedAge60to64;
    /**
     * CS0020108 = femalesSingleAge60to64
     */
    protected int femalesSingleAge60to64;
    /**
     * CS0020109 = allPeopleAge65to74
     */
    protected int allPeopleTotalAge65to74;
    /**
     * CS0020110 = allPeopleMarriedAge65to74
     */
    protected int allPeopleMarriedAge65to74;
    /**
     * CS0020111 = allPeopleSingleAge65to74
     */
    protected int allPeopleSingleAge65to74;
    /**
     * CS0020112 = malesTotalAge65to74
     */
    protected int malesTotalAge65to74;
    /**
     * CS0020113 = malesMarriedAge65to74
     */
    protected int malesMarriedAge65to74;
    /**
     * CS0020114 = malesSingleAge65to74
     */
    protected int malesSingleAge65to74;
    /**
     * CS0020115 = femalesTotalAge65to74
     */
    protected int femalesTotalAge65to74;
    /**
     * CS0020116 = femalesMarriedAge65to74
     */
    protected int femalesMarriedAge65to74;
    /**
     * CS0020117 = femalesSingleAge65to74
     */
    protected int femalesSingleAge65to74;
    /**
     * CS0020118 = allPeopleAge75to79
     */
    protected int allPeopleTotalAge75to79;
    /**
     * CS0020119 = allPeopleMarriedAge75to79
     */
    protected int allPeopleMarriedAge75to79;
    /**
     * CS0020120 = allPeopleSingleAge75to79
     */
    protected int allPeopleSingleAge75to79;
    /**
     * CS0020121 = malesTotalAge75to79
     */
    protected int malesTotalAge75to79;
    /**
     * CS0020122 = malesMarriedAge75to79
     */
    protected int malesMarriedAge75to79;
    /**
     * CS0020123 = malesSingleAge75to79
     */
    protected int malesSingleAge75to79;
    /**
     * CS0020124 = femalesTotalAge75to79
     */
    protected int femalesTotalAge75to79;
    /**
     * CS0020125 = femalesMarriedAge75to79
     */
    protected int femalesMarriedAge75to79;
    /**
     * CS0020126 = femalesSingleAge75to79
     */
    protected int femalesSingleAge75to79;
    /**
     * CS0020127 = allPeopleAge80to84
     */
    protected int allPeopleTotalAge80to84;
    /**
     * CS0020128 = allPeopleMarriedAge80to84
     */
    protected int allPeopleMarriedAge80to84;
    /**
     * CS0020129 = allPeopleSingleAge80to84
     */
    protected int allPeopleSingleAge80to84;
    /**
     * CS0020130 = malesTotalAge80to84
     */
    protected int malesTotalAge80to84;
    /**
     * CS0020131 = malesMarriedAge80to84
     */
    protected int malesMarriedAge80to84;
    /**
     * CS0020132 = malesSingleAge80to84
     */
    protected int malesSingleAge80to84;
    /**
     * CS0020133 = femalesTotalAge80to84
     */
    protected int femalesTotalAge80to84;
    /**
     * CS0020134 = femalesMarriedAge80to84
     */
    protected int femalesMarriedAge80to84;
    /**
     * CS0020135 = femalesSingleAge80to84
     */
    protected int femalesSingleAge80to84;
    /**
     * CS0020136 = allPeopleAge85to89
     */
    protected int allPeopleTotalAge85to89;
    /**
     * CS0020137 = allPeopleMarriedAge85to89
     */
    protected int allPeopleMarriedAge85to89;
    /**
     * CS0020138 = allPeopleSingleAge85to89
     */
    protected int allPeopleSingleAge85to89;
    /**
     * CS0020139 = malesTotalAge85to89
     */
    protected int malesTotalAge85to89;
    /**
     * CS0020140 = malesMarriedAge85to89
     */
    protected int malesMarriedAge85to89;
    /**
     * CS0020141 = malesSingleAge85to89
     */
    protected int malesSingleAge85to89;
    /**
     * CS0020142 = femalesTotalAge85to89
     */
    protected int femalesTotalAge85to89;
    /**
     * CS0020143 = femalesMarriedAge85to89
     */
    protected int femalesMarriedAge85to89;
    /**
     * CS0020144 = femalesSingleAge85to89
     */
    protected int femalesSingleAge85to89;
    /**
     * CS0020145 = allPeopleAge90AndOver
     */
    protected int allPeopleTotalAge90AndOver;
    /**
     * CS0020146 = allPeopleMarriedAge90AndOver
     */
    protected int allPeopleMarriedAge90AndOver;
    /**
     * CS0020147 = allPeopleSingleAge90AndOver
     */
    protected int allPeopleSingleAge90AndOver;
    /**
     * CS0020148 = malesTotalAge90AndOver
     */
    protected int malesTotalAge90AndOver;
    /**
     * CS0020149 = malesMarriedAge90AndOver
     */
    protected int malesMarriedAge90AndOver;
    /**
     * CS0020150 = malesSingleAge90AndOver
     */
    protected int malesSingleAge90AndOver;
    /**
     * CS0020151 = femalesTotalAge90AndOver
     */
    protected int femalesTotalAge90AndOver;
    /**
     * CS0020152 = femalesMarriedAge90AndOver
     */
    protected int femalesMarriedAge90AndOver;
    /**
     * CS0020153 = femalesSingleAge90AndOver
     */
    protected int femalesSingleAge90AndOver;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CAS002Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CAS002Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fields = line.split(",");
        this.zoneCode = fields[0].substring(1, 11);
        // From Table CAS002
        this.allPeopleTotal = Math_Integer.parseInt(fields[1]);
        this.allPeopleMarried = Math_Integer.parseInt(fields[2]);
        this.allPeopleSingle = Math_Integer.parseInt(fields[3]);
        this.malesTotal = Math_Integer.parseInt(fields[4]);
        this.malesMarried = Math_Integer.parseInt(fields[5]);
        this.malesSingle = Math_Integer.parseInt(fields[6]);
        this.femalesTotal = Math_Integer.parseInt(fields[7]);
        this.femalesMarried = Math_Integer.parseInt(fields[8]);
        this.femalesSingle = Math_Integer.parseInt(fields[9]);
        this.allPeopleTotalAge0to15 = Math_Integer.parseInt(fields[10]);
        this.allPeopleMarriedAge0to15 = Math_Integer.parseInt(fields[11]);
        this.allPeopleSingleAge0to15 = Math_Integer.parseInt(fields[12]);
        this.malesTotalAge0to15 = Math_Integer.parseInt(fields[13]);
        this.malesMarriedAge0to15 = Math_Integer.parseInt(fields[14]);
        this.malesSingleAge0to15 = Math_Integer.parseInt(fields[15]);
        this.femalesTotalAge0to15 = Math_Integer.parseInt(fields[16]);
        this.femalesMarriedAge0to15 = Math_Integer.parseInt(fields[17]);
        this.femalesSingleAge0to15 = Math_Integer.parseInt(fields[18]);
        this.allPeopleTotalAge16to19 = Math_Integer.parseInt(fields[19]);
        this.allPeopleMarriedAge16to19 = Math_Integer.parseInt(fields[20]);
        this.allPeopleSingleAge16to19 = Math_Integer.parseInt(fields[21]);
        this.malesTotalAge16to19 = Math_Integer.parseInt(fields[22]);
        this.malesMarriedAge16to19 = Math_Integer.parseInt(fields[23]);
        this.malesSingleAge16to19 = Math_Integer.parseInt(fields[24]);
        this.femalesTotalAge16to19 = Math_Integer.parseInt(fields[25]);
        this.femalesMarriedAge16to19 = Math_Integer.parseInt(fields[26]);
        this.femalesSingleAge16to19 = Math_Integer.parseInt(fields[27]);
        this.allPeopleTotalAge20to24 = Math_Integer.parseInt(fields[28]);
        this.allPeopleMarriedAge20to24 = Math_Integer.parseInt(fields[29]);
        this.allPeopleSingleAge20to24 = Math_Integer.parseInt(fields[30]);
        this.malesTotalAge20to24 = Math_Integer.parseInt(fields[31]);
        this.malesMarriedAge20to24 = Math_Integer.parseInt(fields[32]);
        this.malesSingleAge20to24 = Math_Integer.parseInt(fields[33]);
        this.femalesTotalAge20to24 = Math_Integer.parseInt(fields[34]);
        this.femalesMarriedAge20to24 = Math_Integer.parseInt(fields[35]);
        this.femalesSingleAge20to24 = Math_Integer.parseInt(fields[36]);
        this.allPeopleTotalAge25to29 = Math_Integer.parseInt(fields[37]);
        this.allPeopleMarriedAge25to29 = Math_Integer.parseInt(fields[38]);
        this.allPeopleSingleAge25to29 = Math_Integer.parseInt(fields[39]);
        this.malesTotalAge25to29 = Math_Integer.parseInt(fields[40]);
        this.malesMarriedAge25to29 = Math_Integer.parseInt(fields[41]);
        this.malesSingleAge25to29 = Math_Integer.parseInt(fields[42]);
        this.femalesTotalAge25to29 = Math_Integer.parseInt(fields[43]);
        this.femalesMarriedAge25to29 = Math_Integer.parseInt(fields[44]);
        this.femalesSingleAge25to29 = Math_Integer.parseInt(fields[45]);
        this.allPeopleTotalAge30to34 = Math_Integer.parseInt(fields[46]);
        this.allPeopleMarriedAge30to34 = Math_Integer.parseInt(fields[47]);
        this.allPeopleSingleAge30to34 = Math_Integer.parseInt(fields[48]);
        this.malesTotalAge30to34 = Math_Integer.parseInt(fields[49]);
        this.malesMarriedAge30to34 = Math_Integer.parseInt(fields[50]);
        this.malesSingleAge30to34 = Math_Integer.parseInt(fields[51]);
        this.femalesTotalAge30to34 = Math_Integer.parseInt(fields[52]);
        this.femalesMarriedAge30to34 = Math_Integer.parseInt(fields[53]);
        this.femalesSingleAge30to34 = Math_Integer.parseInt(fields[54]);
        this.allPeopleTotalAge35to39 = Math_Integer.parseInt(fields[55]);
        this.allPeopleMarriedAge35to39 = Math_Integer.parseInt(fields[56]);
        this.allPeopleSingleAge35to39 = Math_Integer.parseInt(fields[57]);
        this.malesTotalAge35to39 = Math_Integer.parseInt(fields[58]);
        this.malesMarriedAge35to39 = Math_Integer.parseInt(fields[59]);
        this.malesSingleAge35to39 = Math_Integer.parseInt(fields[60]);
        this.femalesTotalAge35to39 = Math_Integer.parseInt(fields[61]);
        this.femalesMarriedAge35to39 = Math_Integer.parseInt(fields[62]);
        this.femalesSingleAge35to39 = Math_Integer.parseInt(fields[63]);
        this.allPeopleTotalAge40to44 = Math_Integer.parseInt(fields[64]);
        this.allPeopleMarriedAge40to44 = Math_Integer.parseInt(fields[65]);
        this.allPeopleSingleAge40to44 = Math_Integer.parseInt(fields[66]);
        this.malesTotalAge40to44 = Math_Integer.parseInt(fields[67]);
        this.malesMarriedAge40to44 = Math_Integer.parseInt(fields[68]);
        this.malesSingleAge40to44 = Math_Integer.parseInt(fields[69]);
        this.femalesTotalAge40to44 = Math_Integer.parseInt(fields[70]);
        this.femalesMarriedAge40to44 = Math_Integer.parseInt(fields[71]);
        this.femalesSingleAge40to44 = Math_Integer.parseInt(fields[72]);
        this.allPeopleTotalAge45to49 = Math_Integer.parseInt(fields[73]);
        this.allPeopleMarriedAge45to49 = Math_Integer.parseInt(fields[74]);
        this.allPeopleSingleAge45to49 = Math_Integer.parseInt(fields[75]);
        this.malesTotalAge45to49 = Math_Integer.parseInt(fields[76]);
        this.malesMarriedAge45to49 = Math_Integer.parseInt(fields[77]);
        this.malesSingleAge45to49 = Math_Integer.parseInt(fields[78]);
        this.femalesTotalAge45to49 = Math_Integer.parseInt(fields[79]);
        this.femalesMarriedAge45to49 = Math_Integer.parseInt(fields[80]);
        this.femalesSingleAge45to49 = Math_Integer.parseInt(fields[81]);
        this.allPeopleTotalAge50to54 = Math_Integer.parseInt(fields[82]);
        this.allPeopleMarriedAge50to54 = Math_Integer.parseInt(fields[83]);
        this.allPeopleSingleAge50to54 = Math_Integer.parseInt(fields[84]);
        this.malesTotalAge50to54 = Math_Integer.parseInt(fields[85]);
        this.malesMarriedAge50to54 = Math_Integer.parseInt(fields[86]);
        this.malesSingleAge50to54 = Math_Integer.parseInt(fields[87]);
        this.femalesTotalAge50to54 = Math_Integer.parseInt(fields[88]);
        this.femalesMarriedAge50to54 = Math_Integer.parseInt(fields[89]);
        this.femalesSingleAge50to54 = Math_Integer.parseInt(fields[90]);
        this.allPeopleTotalAge55to59 = Math_Integer.parseInt(fields[91]);
        this.allPeopleMarriedAge55to59 = Math_Integer.parseInt(fields[92]);
        this.allPeopleSingleAge55to59 = Math_Integer.parseInt(fields[93]);
        this.malesTotalAge55to59 = Math_Integer.parseInt(fields[94]);
        this.malesMarriedAge55to59 = Math_Integer.parseInt(fields[95]);
        this.malesSingleAge55to59 = Math_Integer.parseInt(fields[96]);
        this.femalesTotalAge55to59 = Math_Integer.parseInt(fields[97]);
        this.femalesMarriedAge55to59 = Math_Integer.parseInt(fields[98]);
        this.femalesSingleAge55to59 = Math_Integer.parseInt(fields[99]);
        this.allPeopleTotalAge60to64 = Math_Integer.parseInt(fields[100]);
        this.allPeopleMarriedAge60to64 = Math_Integer.parseInt(fields[101]);
        this.allPeopleSingleAge60to64 = Math_Integer.parseInt(fields[102]);
        this.malesTotalAge60to64 = Math_Integer.parseInt(fields[103]);
        this.malesMarriedAge60to64 = Math_Integer.parseInt(fields[104]);
        this.malesSingleAge60to64 = Math_Integer.parseInt(fields[105]);
        this.femalesTotalAge60to64 = Math_Integer.parseInt(fields[106]);
        this.femalesMarriedAge60to64 = Math_Integer.parseInt(fields[107]);
        this.femalesSingleAge60to64 = Math_Integer.parseInt(fields[108]);
        this.allPeopleTotalAge65to74 = Math_Integer.parseInt(fields[109]);
        this.allPeopleMarriedAge65to74 = Math_Integer.parseInt(fields[110]);
        this.allPeopleSingleAge65to74 = Math_Integer.parseInt(fields[111]);
        this.malesTotalAge65to74 = Math_Integer.parseInt(fields[112]);
        this.malesMarriedAge65to74 = Math_Integer.parseInt(fields[113]);
        this.malesSingleAge65to74 = Math_Integer.parseInt(fields[114]);
        this.femalesTotalAge65to74 = Math_Integer.parseInt(fields[115]);
        this.femalesMarriedAge65to74 = Math_Integer.parseInt(fields[116]);
        this.femalesSingleAge65to74 = Math_Integer.parseInt(fields[117]);
        this.allPeopleTotalAge75to79 = Math_Integer.parseInt(fields[118]);
        this.allPeopleMarriedAge75to79 = Math_Integer.parseInt(fields[119]);
        this.allPeopleSingleAge75to79 = Math_Integer.parseInt(fields[120]);
        this.malesTotalAge75to79 = Math_Integer.parseInt(fields[121]);
        this.malesMarriedAge75to79 = Math_Integer.parseInt(fields[122]);
        this.malesSingleAge75to79 = Math_Integer.parseInt(fields[123]);
        this.femalesTotalAge75to79 = Math_Integer.parseInt(fields[124]);
        this.femalesMarriedAge75to79 = Math_Integer.parseInt(fields[125]);
        this.femalesSingleAge75to79 = Math_Integer.parseInt(fields[126]);
        this.allPeopleTotalAge80to84 = Math_Integer.parseInt(fields[127]);
        this.allPeopleMarriedAge80to84 = Math_Integer.parseInt(fields[128]);
        this.allPeopleSingleAge80to84 = Math_Integer.parseInt(fields[129]);
        this.malesTotalAge80to84 = Math_Integer.parseInt(fields[130]);
        this.malesMarriedAge80to84 = Math_Integer.parseInt(fields[131]);
        this.malesSingleAge80to84 = Math_Integer.parseInt(fields[132]);
        this.femalesTotalAge80to84 = Math_Integer.parseInt(fields[133]);
        this.femalesMarriedAge80to84 = Math_Integer.parseInt(fields[134]);
        this.femalesSingleAge80to84 = Math_Integer.parseInt(fields[135]);
        this.allPeopleTotalAge85to89 = Math_Integer.parseInt(fields[136]);
        this.allPeopleMarriedAge85to89 = Math_Integer.parseInt(fields[137]);
        this.allPeopleSingleAge85to89 = Math_Integer.parseInt(fields[138]);
        this.malesTotalAge85to89 = Math_Integer.parseInt(fields[139]);
        this.malesMarriedAge85to89 = Math_Integer.parseInt(fields[140]);
        this.malesSingleAge85to89 = Math_Integer.parseInt(fields[141]);
        this.femalesTotalAge85to89 = Math_Integer.parseInt(fields[142]);
        this.femalesMarriedAge85to89 = Math_Integer.parseInt(fields[143]);
        this.femalesSingleAge85to89 = Math_Integer.parseInt(fields[144]);
        this.allPeopleTotalAge90AndOver = Math_Integer.parseInt(fields[145]);
        this.allPeopleMarriedAge90AndOver = Math_Integer.parseInt(fields[146]);
        this.allPeopleSingleAge90AndOver = Math_Integer.parseInt(fields[147]);
        this.malesTotalAge90AndOver = Math_Integer.parseInt(fields[148]);
        this.malesMarriedAge90AndOver = Math_Integer.parseInt(fields[149]);
        this.malesSingleAge90AndOver = Math_Integer.parseInt(fields[150]);
        this.femalesTotalAge90AndOver = Math_Integer.parseInt(fields[151]);
        this.femalesMarriedAge90AndOver = Math_Integer.parseInt(fields[152]);
        this.femalesSingleAge90AndOver = Math_Integer.parseInt(fields[153]);
    }

    /**
     * @return A String description of this.
     */
    @Override
    public String toString() {
        String r = super.toString() + ", allPeopleTotal=" + allPeopleTotal
                + ", allPeopleMarried=" + allPeopleMarried
                + ", allPeopleSingle=" + allPeopleSingle
                + ", malesTotal=" + malesTotal
                + ", malesMarried=" + malesMarried
                + ", malesSingle=" + malesSingle
                + ", femalesTotal=" + femalesTotal
                + ", femalesMarried=" + femalesMarried
                + ", femalesSingle=" + femalesSingle
                + ", allPeopleTotalAge0to15=" + allPeopleTotalAge0to15
                + ", allPeopleMarriedAge0to15=" + allPeopleMarriedAge0to15
                + ", allPeopleSingleAge0to15=" + allPeopleSingleAge0to15
                + ", malesTotalAge0to15=" + malesTotalAge0to15
                + ", malesMarriedAge0to15=" + malesMarriedAge0to15
                + ", malesSingleAge0to15=" + malesSingleAge0to15
                + ", femalesTotalAge0to15=" + femalesTotalAge0to15
                + ", femalesMarriedAge0to15=" + femalesMarriedAge0to15
                + ", femalesSingleAge0to15=" + femalesSingleAge0to15
                + ", allPeopleTotalAge16to19=" + allPeopleTotalAge16to19
                + ", allPeopleMarriedAge16to19=" + allPeopleMarriedAge16to19
                + ", allPeopleSingleAge16to19=" + allPeopleSingleAge16to19
                + ", malesTotalAge16to19=" + malesTotalAge16to19
                + ", malesMarriedAge16to19=" + malesMarriedAge16to19
                + ", malesSingleAge16to19=" + malesSingleAge16to19
                + ", femalesTotalAge16to19=" + femalesTotalAge16to19
                + ", femalesMarriedAge16to19=" + femalesMarriedAge16to19
                + ", femalesSingleAge16to19=" + femalesSingleAge16to19
                + ", allPeopleTotalAge20to24=" + allPeopleTotalAge20to24
                + ", allPeopleMarriedAge20to24=" + allPeopleMarriedAge20to24
                + ", allPeopleSingleAge20to24=" + allPeopleSingleAge20to24
                + ", malesTotalAge20to24=" + malesTotalAge20to24
                + ", malesMarriedAge20to24=" + malesMarriedAge20to24
                + ", malesSingleAge20to24=" + malesSingleAge20to24
                + ", femalesTotalAge20to24=" + femalesTotalAge20to24
                + ", femalesMarriedAge20to24=" + femalesMarriedAge20to24
                + ", femalesSingleAge20to24=" + femalesSingleAge20to24
                + ", allPeopleTotalAge25to29=" + allPeopleTotalAge25to29
                + ", allPeopleMarriedAge25to29=" + allPeopleMarriedAge25to29
                + ", allPeopleSingleAge25to29=" + allPeopleSingleAge25to29
                + ", malesTotalAge25to29=" + malesTotalAge25to29
                + ", malesMarriedAge25to29=" + malesMarriedAge25to29
                + ", malesSingleAge25to29=" + malesSingleAge25to29
                + ", femalesTotalAge25to29=" + femalesTotalAge25to29
                + ", femalesMarriedAge25to29=" + femalesMarriedAge25to29
                + ", femalesSingleAge25to29=" + femalesSingleAge25to29
                + ", allPeopleTotalAge30to34=" + allPeopleTotalAge30to34
                + ", allPeopleMarriedAge30to34=" + allPeopleMarriedAge30to34
                + ", allPeopleSingleAge30to34=" + allPeopleSingleAge30to34
                + ", malesTotalAge30to34=" + malesTotalAge30to34
                + ", malesMarriedAge30to34=" + malesMarriedAge30to34
                + ", malesSingleAge30to34=" + malesSingleAge30to34
                + ", femalesTotalAge30to34=" + femalesTotalAge30to34
                + ", femalesMarriedAge30to34=" + femalesMarriedAge30to34
                + ", femalesSingleAge30to34=" + femalesSingleAge30to34
                + ", allPeopleTotalAge35to39=" + allPeopleTotalAge35to39
                + ", allPeopleMarriedAge35to39=" + allPeopleMarriedAge35to39
                + ", allPeopleSingleAge35to39=" + allPeopleSingleAge35to39
                + ", malesTotalAge35to39=" + malesTotalAge35to39
                + ", malesMarriedAge35to39=" + malesMarriedAge35to39
                + ", malesSingleAge35to39=" + malesSingleAge35to39
                + ", femalesTotalAge35to39=" + femalesTotalAge35to39
                + ", femalesMarriedAge35to39=" + femalesMarriedAge35to39
                + ", femalesSingleAge35to39=" + femalesSingleAge35to39
                + ", allPeopleTotalAge40to44=" + allPeopleTotalAge40to44
                + ", allPeopleMarriedAge40to44=" + allPeopleMarriedAge40to44
                + ", allPeopleSingleAge40to44=" + allPeopleSingleAge40to44
                + ", malesTotalAge40to44=" + malesTotalAge40to44
                + ", malesMarriedAge40to44=" + malesMarriedAge40to44
                + ", malesSingleAge40to44=" + malesSingleAge40to44
                + ", femalesTotalAge40to44=" + femalesTotalAge40to44
                + ", femalesMarriedAge40to44=" + femalesMarriedAge40to44
                + ", femalesSingleAge40to44=" + femalesSingleAge40to44
                + ", allPeopleTotalAge45to49=" + allPeopleTotalAge45to49
                + ", allPeopleMarriedAge45to49=" + allPeopleMarriedAge45to49
                + ", allPeopleSingleAge45to49=" + allPeopleSingleAge45to49
                + ", malesTotalAge45to49=" + malesTotalAge45to49
                + ", malesMarriedAge45to49=" + malesMarriedAge45to49
                + ", malesSingleAge45to49=" + malesSingleAge45to49
                + ", femalesTotalAge45to49=" + femalesTotalAge45to49
                + ", femalesMarriedAge45to49=" + femalesMarriedAge45to49
                + ", femalesSingleAge45to49=" + femalesSingleAge45to49
                + ", allPeopleTotalAge50to54=" + allPeopleTotalAge50to54
                + ", allPeopleMarriedAge50to54=" + allPeopleMarriedAge50to54
                + ", allPeopleSingleAge50to54=" + allPeopleSingleAge50to54
                + ", malesTotalAge50to54=" + malesTotalAge50to54
                + ", malesMarriedAge50to54=" + malesMarriedAge50to54
                + ", malesSingleAge50to54=" + malesSingleAge50to54
                + ", femalesTotalAge50to54=" + femalesTotalAge50to54
                + ", femalesMarriedAge50to54=" + femalesMarriedAge50to54
                + ", femalesSingleAge50to54=" + femalesSingleAge50to54
                + ", allPeopleTotalAge55to59=" + allPeopleTotalAge55to59
                + ", allPeopleMarriedAge55to59=" + allPeopleMarriedAge55to59
                + ", allPeopleSingleAge55to59=" + allPeopleSingleAge55to59
                + ", malesTotalAge55to59=" + malesTotalAge55to59
                + ", malesMarriedAge55to59=" + malesMarriedAge55to59
                + ", malesSingleAge55to59=" + malesSingleAge55to59
                + ", femalesTotalAge55to59=" + femalesTotalAge55to59
                + ", femalesMarriedAge55to59=" + femalesMarriedAge55to59
                + ", femalesSingleAge55to59=" + femalesSingleAge55to59
                + ", allPeopleTotalAge65to74=" + allPeopleTotalAge65to74
                + ", allPeopleMarriedAge65to74=" + allPeopleMarriedAge65to74
                + ", allPeopleSingleAge65to74=" + allPeopleSingleAge65to74
                + ", malesTotalAge65to74=" + malesTotalAge65to74
                + ", malesMarriedAge65to74=" + malesMarriedAge65to74
                + ", malesSingleAge65to74=" + malesSingleAge65to74
                + ", femalesTotalAge65to74=" + femalesTotalAge65to74
                + ", femalesMarriedAge65to74=" + femalesMarriedAge65to74
                + ", femalesSingleAge65to74=" + femalesSingleAge65to74
                + ", allPeopleTotalAge75to79=" + allPeopleTotalAge75to79
                + ", allPeopleMarriedAge75to79=" + allPeopleMarriedAge75to79
                + ", allPeopleSingleAge75to79=" + allPeopleSingleAge75to79
                + ", malesTotalAge75to79=" + malesTotalAge75to79
                + ", malesMarriedAge75to79=" + malesMarriedAge75to79
                + ", malesSingleAge75to79=" + malesSingleAge75to79
                + ", femalesTotalAge75to79=" + femalesTotalAge75to79
                + ", femalesMarriedAge75to79=" + femalesMarriedAge75to79
                + ", femalesSingleAge75to79=" + femalesSingleAge75to79
                + ", allPeopleTotalAge80to84=" + allPeopleTotalAge80to84
                + ", allPeopleMarriedAge80to84=" + allPeopleMarriedAge80to84
                + ", allPeopleSingleAge80to84=" + allPeopleSingleAge80to84
                + ", malesTotalAge80to84=" + malesTotalAge80to84
                + ", malesMarriedAge80to84=" + malesMarriedAge80to84
                + ", malesSingleAge80to84=" + malesSingleAge80to84
                + ", femalesTotalAge80to84=" + femalesTotalAge80to84
                + ", femalesMarriedAge80to84=" + femalesMarriedAge80to84
                + ", femalesSingleAge80to84=" + femalesSingleAge80to84
                + ", allPeopleTotalAge85to89=" + allPeopleTotalAge85to89
                + ", allPeopleMarriedAge85to89=" + allPeopleMarriedAge85to89
                + ", allPeopleSingleAge85to89=" + allPeopleSingleAge85to89
                + ", malesTotalAge85to89=" + malesTotalAge85to89
                + ", malesMarriedAge85to89=" + malesMarriedAge85to89
                + ", malesSingleAge85to89=" + malesSingleAge85to89
                + ", femalesTotalAge85to89=" + femalesTotalAge85to89
                + ", femalesMarriedAge85to89=" + femalesMarriedAge85to89
                + ", femalesSingleAge85to89=" + femalesSingleAge85to89
                + ", allPeopleTotalAge90AndOver=" + allPeopleTotalAge90AndOver
                + ", allPeopleMarriedAge90AndOver=" + allPeopleMarriedAge90AndOver
                + ", allPeopleSingleAge90AndOver=" + allPeopleSingleAge90AndOver
                + ", malesTotalAge90AndOver=" + malesTotalAge90AndOver
                + ", malesMarriedAge90AndOver=" + malesMarriedAge90AndOver
                + ", malesSingleAge90AndOver=" + malesSingleAge90AndOver
                + ", femalesTotalAge90AndOver=" + femalesTotalAge90AndOver
                + ", femalesMarriedAge90AndOver=" + femalesMarriedAge90AndOver
                + ", femalesSingleAge90AndOver=" + femalesSingleAge90AndOver;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        String r = super.toCSV();
        r += "," + this.allPeopleTotal;
        r += "," + this.allPeopleMarried;
        r += "," + this.allPeopleSingle;
        r += "," + this.malesTotal;
        r += "," + this.malesMarried;
        r += "," + this.malesSingle;
        r += "," + this.femalesTotal;
        r += "," + this.femalesMarried;
        r += "," + this.femalesSingle;
        r += "," + this.allPeopleTotalAge0to15;
        r += "," + this.allPeopleMarriedAge0to15;
        r += "," + this.allPeopleSingleAge0to15;
        r += "," + this.malesTotalAge0to15;
        r += "," + this.malesMarriedAge0to15;
        r += "," + this.malesSingleAge0to15;
        r += "," + this.femalesTotalAge0to15;
        r += "," + this.femalesMarriedAge0to15;
        r += "," + this.femalesSingleAge0to15;
        r += "," + this.allPeopleTotalAge16to19;
        r += "," + this.allPeopleMarriedAge16to19;
        r += "," + this.allPeopleSingleAge16to19;
        r += "," + this.malesTotalAge16to19;
        r += "," + this.malesMarriedAge16to19;
        r += "," + this.malesSingleAge16to19;
        r += "," + this.femalesTotalAge16to19;
        r += "," + this.femalesMarriedAge16to19;
        r += "," + this.femalesSingleAge16to19;
        r += "," + this.allPeopleTotalAge20to24;
        r += "," + this.allPeopleMarriedAge20to24;
        r += "," + this.allPeopleSingleAge20to24;
        r += "," + this.malesTotalAge20to24;
        r += "," + this.malesMarriedAge20to24;
        r += "," + this.malesSingleAge20to24;
        r += "," + this.femalesTotalAge20to24;
        r += "," + this.femalesMarriedAge20to24;
        r += "," + this.femalesSingleAge20to24;
        r += "," + this.allPeopleTotalAge25to29;
        r += "," + this.allPeopleMarriedAge25to29;
        r += "," + this.allPeopleSingleAge25to29;
        r += "," + this.malesTotalAge25to29;
        r += "," + this.malesMarriedAge25to29;
        r += "," + this.malesSingleAge25to29;
        r += "," + this.femalesTotalAge25to29;
        r += "," + this.femalesMarriedAge25to29;
        r += "," + this.femalesSingleAge25to29;
        r += "," + this.allPeopleTotalAge30to34;
        r += "," + this.allPeopleMarriedAge30to34;
        r += "," + this.allPeopleSingleAge30to34;
        r += "," + this.malesTotalAge30to34;
        r += "," + this.malesMarriedAge30to34;
        r += "," + this.malesSingleAge30to34;
        r += "," + this.femalesTotalAge30to34;
        r += "," + this.femalesMarriedAge30to34;
        r += "," + this.femalesSingleAge30to34;
        r += "," + this.allPeopleTotalAge35to39;
        r += "," + this.allPeopleMarriedAge35to39;
        r += "," + this.allPeopleSingleAge35to39;
        r += "," + this.malesTotalAge35to39;
        r += "," + this.malesMarriedAge35to39;
        r += "," + this.malesSingleAge35to39;
        r += "," + this.femalesTotalAge35to39;
        r += "," + this.femalesMarriedAge35to39;
        r += "," + this.femalesSingleAge35to39;
        r += "," + this.allPeopleTotalAge40to44;
        r += "," + this.allPeopleMarriedAge40to44;
        r += "," + this.allPeopleSingleAge40to44;
        r += "," + this.malesTotalAge40to44;
        r += "," + this.malesMarriedAge40to44;
        r += "," + this.malesSingleAge40to44;
        r += "," + this.femalesTotalAge40to44;
        r += "," + this.femalesMarriedAge40to44;
        r += "," + this.femalesSingleAge40to44;
        r += "," + this.allPeopleTotalAge45to49;
        r += "," + this.allPeopleMarriedAge45to49;
        r += "," + this.allPeopleSingleAge45to49;
        r += "," + this.malesTotalAge45to49;
        r += "," + this.malesMarriedAge45to49;
        r += "," + this.malesSingleAge45to49;
        r += "," + this.femalesTotalAge45to49;
        r += "," + this.femalesMarriedAge45to49;
        r += "," + this.femalesSingleAge45to49;
        r += "," + this.allPeopleTotalAge50to54;
        r += "," + this.allPeopleMarriedAge50to54;
        r += "," + this.allPeopleSingleAge50to54;
        r += "," + this.malesTotalAge50to54;
        r += "," + this.malesMarriedAge50to54;
        r += "," + this.malesSingleAge50to54;
        r += "," + this.femalesTotalAge50to54;
        r += "," + this.femalesMarriedAge50to54;
        r += "," + this.femalesSingleAge50to54;
        r += "," + this.allPeopleTotalAge55to59;
        r += "," + this.allPeopleMarriedAge55to59;
        r += "," + this.allPeopleSingleAge55to59;
        r += "," + this.malesTotalAge55to59;
        r += "," + this.malesMarriedAge55to59;
        r += "," + this.malesSingleAge55to59;
        r += "," + this.femalesTotalAge55to59;
        r += "," + this.femalesMarriedAge55to59;
        r += "," + this.femalesSingleAge55to59;
        r += "," + this.allPeopleTotalAge60to64;
        r += "," + this.allPeopleMarriedAge60to64;
        r += "," + this.allPeopleSingleAge60to64;
        r += "," + this.malesTotalAge60to64;
        r += "," + this.malesMarriedAge60to64;
        r += "," + this.malesSingleAge60to64;
        r += "," + this.femalesTotalAge60to64;
        r += "," + this.femalesMarriedAge60to64;
        r += "," + this.femalesSingleAge60to64;
        r += "," + this.allPeopleTotalAge65to74;
        r += "," + this.allPeopleMarriedAge65to74;
        r += "," + this.allPeopleSingleAge65to74;
        r += "," + this.malesTotalAge65to74;
        r += "," + this.malesMarriedAge65to74;
        r += "," + this.malesSingleAge65to74;
        r += "," + this.femalesTotalAge65to74;
        r += "," + this.femalesMarriedAge65to74;
        r += "," + this.femalesSingleAge65to74;
        r += "," + this.allPeopleTotalAge75to79;
        r += "," + this.allPeopleMarriedAge75to79;
        r += "," + this.allPeopleSingleAge75to79;
        r += "," + this.malesTotalAge75to79;
        r += "," + this.malesMarriedAge75to79;
        r += "," + this.malesSingleAge75to79;
        r += "," + this.femalesTotalAge75to79;
        r += "," + this.femalesMarriedAge75to79;
        r += "," + this.femalesSingleAge75to79;
        r += "," + this.allPeopleTotalAge80to84;
        r += "," + this.allPeopleMarriedAge80to84;
        r += "," + this.allPeopleSingleAge80to84;
        r += "," + this.malesTotalAge80to84;
        r += "," + this.malesMarriedAge80to84;
        r += "," + this.malesSingleAge80to84;
        r += "," + this.femalesTotalAge80to84;
        r += "," + this.femalesMarriedAge80to84;
        r += "," + this.femalesSingleAge80to84;
        r += "," + this.allPeopleTotalAge85to89;
        r += "," + this.allPeopleMarriedAge85to89;
        r += "," + this.allPeopleSingleAge85to89;
        r += "," + this.malesTotalAge85to89;
        r += "," + this.malesMarriedAge85to89;
        r += "," + this.malesSingleAge85to89;
        r += "," + this.femalesTotalAge85to89;
        r += "," + this.femalesMarriedAge85to89;
        r += "," + this.femalesSingleAge85to89;
        r += "," + this.allPeopleTotalAge90AndOver;
        r += "," + this.allPeopleMarriedAge90AndOver;
        r += "," + this.allPeopleSingleAge90AndOver;
        r += "," + this.malesTotalAge90AndOver;
        r += "," + this.malesMarriedAge90AndOver;
        r += "," + this.malesSingleAge90AndOver;
        r += "," + this.femalesTotalAge90AndOver;
        r += "," + this.femalesMarriedAge90AndOver;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        String r = super.toCSVHeader();
        r += ",allPeopleTotal";
        r += ",allPeopleMarried";
        r += ",allPeopleSingle";
        r += ",malesTotal";
        r += ",malesMarried";
        r += ",malesSingle";
        r += ",femalesTotal";
        r += ",femalesMarried";
        r += ",femalesSingle";
        r += ",allPeopleTotalAge0to15";
        r += ",allPeopleMarriedAge0to15";
        r += ",allPeopleSingleAge0to15";
        r += ",malesTotalAge0to15";
        r += ",malesMarriedAge0to15";
        r += ",malesSingleAge0to15";
        r += ",femalesTotalAge0to15";
        r += ",femalesMarriedAge0to15";
        r += ",femalesSingleAge0to15";
        r += ",allPeopleTotalAge16to19";
        r += ",allPeopleMarriedAge16to19";
        r += ",allPeopleSingleAge16to19";
        r += ",malesTotalAge16to19";
        r += ",malesMarriedAge16to19";
        r += ",malesSingleAge16to19";
        r += ",femalesTotalAge16to19";
        r += ",femalesMarriedAge16to19";
        r += ",femalesSingleAge16to19";
        r += ",allPeopleTotalAge20to24";
        r += ",allPeopleMarriedAge20to24";
        r += ",allPeopleSingleAge20to24";
        r += ",malesTotalAge20to24";
        r += ",malesMarriedAge20to24";
        r += ",malesSingleAge20to24";
        r += ",femalesTotalAge20to24";
        r += ",femalesMarriedAge20to24";
        r += ",femalesSingleAge20to24";
        r += ",allPeopleTotalAge25to29";
        r += ",allPeopleMarriedAge25to29";
        r += ",allPeopleSingleAge25to29";
        r += ",malesTotalAge25to29";
        r += ",malesMarriedAge25to29";
        r += ",malesSingleAge25to29";
        r += ",femalesTotalAge25to29";
        r += ",femalesMarriedAge25to29";
        r += ",femalesSingleAge25to29";
        r += ",allPeopleTotalAge30to34";
        r += ",allPeopleMarriedAge30to34";
        r += ",allPeopleSingleAge30to34";
        r += ",malesTotalAge30to34";
        r += ",malesMarriedAge30to34";
        r += ",malesSingleAge30to34";
        r += ",femalesTotalAge30to34";
        r += ",femalesMarriedAge30to34";
        r += ",femalesSingleAge30to34";
        r += ",allPeopleTotalAge35to39";
        r += ",allPeopleMarriedAge35to39";
        r += ",allPeopleSingleAge35to39";
        r += ",malesTotalAge35to39";
        r += ",malesMarriedAge35to39";
        r += ",malesSingleAge35to39";
        r += ",femalesTotalAge35to39";
        r += ",femalesMarriedAge35to39";
        r += ",femalesSingleAge35to39";
        r += ",allPeopleTotalAge40to44";
        r += ",allPeopleMarriedAge40to44";
        r += ",allPeopleSingleAge40to44";
        r += ",malesTotalAge40to44";
        r += ",malesMarriedAge40to44";
        r += ",malesSingleAge40to44";
        r += ",femalesTotalAge40to44";
        r += ",femalesMarriedAge40to44";
        r += ",femalesSingleAge40to44";
        r += ",allPeopleTotalAge45to49";
        r += ",allPeopleMarriedAge45to49";
        r += ",allPeopleSingleAge45to49";
        r += ",malesTotalAge45to49";
        r += ",malesMarriedAge45to49";
        r += ",malesSingleAge45to49";
        r += ",femalesTotalAge45to49";
        r += ",femalesMarriedAge45to49";
        r += ",femalesSingleAge45to49";
        r += ",allPeopleTotalAge50to54";
        r += ",allPeopleMarriedAge50to54";
        r += ",allPeopleSingleAge50to54";
        r += ",malesTotalAge50to54";
        r += ",malesMarriedAge50to54";
        r += ",malesSingleAge50to54";
        r += ",femalesTotalAge50to54";
        r += ",femalesMarriedAge50to54";
        r += ",femalesSingleAge50to54";
        r += ",allPeopleTotalAge55to59";
        r += ",allPeopleMarriedAge55to59";
        r += ",allPeopleSingleAge55to59";
        r += ",malesTotalAge55to59";
        r += ",malesMarriedAge55to59";
        r += ",malesSingleAge55to59";
        r += ",femalesTotalAge55to59";
        r += ",femalesMarriedAge55to59";
        r += ",femalesSingleAge55to59";
        r += ",allPeopleTotalAge60to64";
        r += ",allPeopleMarriedAge60to64";
        r += ",allPeopleSingleAge60to64";
        r += ",malesTotalAge60to64";
        r += ",malesMarriedAge60to64";
        r += ",malesSingleAge60to64";
        r += ",femalesTotalAge60to64";
        r += ",femalesMarriedAge60to64";
        r += ",femalesSingleAge60to64";
        r += ",allPeopleTotalAge65to74";
        r += ",allPeopleMarriedAge65to74";
        r += ",allPeopleSingleAge65to74";
        r += ",malesTotalAge65to74";
        r += ",malesMarriedAge65to74";
        r += ",malesSingleAge65to74";
        r += ",femalesTotalAge65to74";
        r += ",femalesMarriedAge65to74";
        r += ",femalesSingleAge65to74";
        r += ",allPeopleTotalAge75to79";
        r += ",allPeopleMarriedAge75to79";
        r += ",allPeopleSingleAge75to79";
        r += ",malesTotalAge75to79";
        r += ",malesMarriedAge75to79";
        r += ",malesSingleAge75to79";
        r += ",femalesTotalAge75to79";
        r += ",femalesMarriedAge75to79";
        r += ",femalesSingleAge75to79";
        r += ",allPeopleTotalAge80to84";
        r += ",allPeopleMarriedAge80to84";
        r += ",allPeopleSingleAge80to84";
        r += ",malesTotalAge80to84";
        r += ",malesMarriedAge80to84";
        r += ",malesSingleAge80to84";
        r += ",femalesTotalAge80to84";
        r += ",femalesMarriedAge80to84";
        r += ",femalesSingleAge80to84";
        r += ",allPeopleTotalAge85to89";
        r += ",allPeopleMarriedAge85to89";
        r += ",allPeopleSingleAge85to89";
        r += ",malesTotalAge85to89";
        r += ",malesMarriedAge85to89";
        r += ",malesSingleAge85to89";
        r += ",femalesTotalAge85to89";
        r += ",femalesMarriedAge85to89";
        r += ",femalesSingleAge85to89";
        r += ",allPeopleTotalAge90AndOver";
        r += ",allPeopleMarriedAge90AndOver";
        r += ",allPeopleSingleAge90AndOver";
        r += ",malesTotalAge90AndOver";
        r += ",malesMarriedAge90AndOver";
        r += ",malesSingleAge90AndOver";
        r += ",femalesTotalAge90AndOver";
        r += ",femalesMarriedAge90AndOver";
        return r;
    }

    /**
     * Returns a copy of this.allPeopleTotal
     *
     * @return
     */
    public int getAllPeopleTotal() {
        return this.allPeopleTotal;
    }

    /**
     * Returns a copy of this.allPeopleMarried
     *
     * @return
     */
    public int getAllPeopleMarried() {
        return this.allPeopleMarried;
    }

    /**
     * Returns a copy of this.allPeopleSingle
     *
     * @return
     */
    public int getAllPeopleSingle() {
        return this.allPeopleSingle;
    }

    /**
     * Returns a copy of this.malesTotal
     *
     * @return
     */
    public int getMalesTotal() {
        return this.malesTotal;
    }

    /**
     * Returns a copy of this.malesMarried
     *
     * @return
     */
    public int getMalesMarried() {
        return this.malesMarried;
    }

    /**
     * Returns a copy of this.malesSingle
     *
     * @return
     */
    public int getMalesSingle() {
        return this.malesSingle;
    }

    /**
     * Returns a copy of this.femalesTotal
     *
     * @return
     */
    public int getFemalesTotal() {
        return this.femalesTotal;
    }

    /**
     * Returns a copy of this.femalesMarried
     *
     * @return
     */
    public int getFemalesMarried() {
        return this.femalesMarried;
    }

    /**
     * Returns a copy of this.femalesSingle
     *
     * @return
     */
    public int getFemalesSingle() {
        return this.femalesSingle;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge0to15
     *
     * @return
     */
    public int getAllPeopleTotalAge0to15() {
        return this.allPeopleTotalAge0to15;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge0to15
     *
     * @return
     */
    public int getAllPeopleMarriedAge0to15() {
        return this.allPeopleMarriedAge0to15;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge0to15
     *
     * @return
     */
    public int getAllPeopleSingleAge0to15() {
        return this.allPeopleSingleAge0to15;
    }

    /**
     * Returns a copy of this.malesTotalAge0to15
     *
     * @return
     */
    public int getMalesTotalAge0to15() {
        return this.malesTotalAge0to15;
    }

    /**
     * Returns a copy of this.malesMarriedAge0to15
     *
     * @return
     */
    public int getMalesMarriedAge0to15() {
        return this.malesMarriedAge0to15;
    }

    /**
     * Returns a copy of this.malesSingleAge0to15
     *
     * @return
     */
    public int getMalesSingleAge0to15() {
        return this.malesSingleAge0to15;
    }

    /**
     * Returns a copy of this.femalesTotalAge0to15
     *
     * @return
     */
    public int getFemalesTotalAge0to15() {
        return this.femalesTotalAge0to15;
    }

    /**
     * Returns a copy of this.femalesMarriedAge0to15
     *
     * @return
     */
    public int getFemalesMarriedAge0to15() {
        return this.femalesMarriedAge0to15;
    }

    /**
     * Returns a copy of this.femalesSingleAge0to15
     *
     * @return
     */
    public int getFemalesSingleAge0to15() {
        return this.femalesSingleAge0to15;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge16to19
     *
     * @return
     */
    public int getAllPeopleTotalAge16to19() {
        return this.allPeopleTotalAge16to19;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge16to19
     *
     * @return
     */
    public int getAllPeopleMarriedAge16to19() {
        return this.allPeopleMarriedAge16to19;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge16to19
     *
     * @return
     */
    public int getAllPeopleSingleAge16to19() {
        return this.allPeopleSingleAge16to19;
    }

    /**
     * Returns a copy of this.malesTotalAge16to19
     *
     * @return
     */
    public int getMalesTotalAge16to19() {
        return this.malesTotalAge16to19;
    }

    /**
     * Returns a copy of this.malesMarriedAge16to19
     *
     * @return
     */
    public int getMalesMarriedAge16to19() {
        return this.malesMarriedAge16to19;
    }

    /**
     * Returns a copy of this.malesSingleAge16to19
     *
     * @return
     */
    public int getMalesSingleAge16to19() {
        return this.malesSingleAge16to19;
    }

    /**
     * Returns a copy of this.femalesTotalAge16to19
     *
     * @return
     */
    public int getFemalesTotalAge16to19() {
        return this.femalesTotalAge16to19;
    }

    /**
     * Returns a copy of this.femalesMarriedAge16to19
     *
     * @return
     */
    public int getFemalesMarriedAge16to19() {
        return this.femalesMarriedAge16to19;
    }

    /**
     * Returns a copy of this.femalesSingleAge16to19
     *
     * @return
     */
    public int getFemalesSingleAge16to19() {
        return this.femalesSingleAge16to19;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge20to24
     *
     * @return
     */
    public int getAllPeopleTotalAge20to24() {
        return this.allPeopleTotalAge20to24;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge20to24
     *
     * @return
     */
    public int getAllPeopleMarriedAge20to24() {
        return this.allPeopleMarriedAge20to24;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge20to24
     *
     * @return
     */
    public int getAllPeopleSingleAge20to24() {
        return this.allPeopleSingleAge20to24;
    }

    /**
     * Returns a copy of this.malesTotalAge20to24
     *
     * @return
     */
    public int getMalesTotalAge20to24() {
        return this.malesTotalAge20to24;
    }

    /**
     * Returns a copy of this.malesMarriedAge20to24
     *
     * @return
     */
    public int getMalesMarriedAge20to24() {
        return this.malesMarriedAge20to24;
    }

    /**
     * Returns a copy of this.malesSingleAge20to24
     *
     * @return
     */
    public int getMalesSingleAge20to24() {
        return this.malesSingleAge20to24;
    }

    /**
     * Returns a copy of this.femalesTotalAge20to24
     *
     * @return
     */
    public int getFemalesTotalAge20to24() {
        return this.femalesTotalAge20to24;
    }

    /**
     * Returns a copy of this.femalesMarriedAge20to24
     *
     * @return
     */
    public int getFemalesMarriedAge20to24() {
        return this.femalesMarriedAge20to24;
    }

    /**
     * Returns a copy of this.femalesSingleAge20to24
     *
     * @return
     */
    public int getFemalesSingleAge20to24() {
        return this.femalesSingleAge20to24;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge25to29
     *
     * @return
     */
    public int getAllPeopleTotalAge25to29() {
        return this.allPeopleTotalAge25to29;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge25to29
     *
     * @return
     */
    public int getAllPeopleMarriedAge25to29() {
        return this.allPeopleMarriedAge25to29;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge25to29
     *
     * @return
     */
    public int getAllPeopleSingleAge25to29() {
        return this.allPeopleSingleAge25to29;
    }

    /**
     * Returns a copy of this.malesTotalAge25to29
     *
     * @return
     */
    public int getMalesTotalAge25to29() {
        return this.malesTotalAge25to29;
    }

    /**
     * Returns a copy of this.malesMarriedAge25to29
     *
     * @return
     */
    public int getMalesMarriedAge25to29() {
        return this.malesMarriedAge25to29;
    }

    /**
     * Returns a copy of this.malesSingleAge25to29
     *
     * @return
     */
    public int getMalesSingleAge25to29() {
        return this.malesSingleAge25to29;
    }

    /**
     * Returns a copy of this.femalesTotalAge25to29
     *
     * @return
     */
    public int getFemalesTotalAge25to29() {
        return this.femalesTotalAge25to29;
    }

    /**
     * Returns a copy of this.femalesMarriedAge25to29
     *
     * @return
     */
    public int getFemalesMarriedAge25to29() {
        return this.femalesMarriedAge25to29;
    }

    /**
     * Returns a copy of this.femalesSingleAge25to29
     *
     * @return
     */
    public int getFemalesSingleAge25to29() {
        return this.femalesSingleAge25to29;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge30to34
     *
     * @return
     */
    public int getAllPeopleTotalAge30to34() {
        return this.allPeopleTotalAge30to34;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge30to34
     *
     * @return
     */
    public int getAllPeopleMarriedAge30to34() {
        return this.allPeopleMarriedAge30to34;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge30to34
     *
     * @return
     */
    public int getAllPeopleSingleAge30to34() {
        return this.allPeopleSingleAge30to34;
    }

    /**
     * Returns a copy of this.malesTotalAge30to34
     *
     * @return
     */
    public int getMalesTotalAge30to34() {
        return this.malesTotalAge30to34;
    }

    /**
     * Returns a copy of this.malesMarriedAge30to34
     *
     * @return
     */
    public int getMalesMarriedAge30to34() {
        return this.malesMarriedAge30to34;
    }

    /**
     * Returns a copy of this.malesSingleAge30to34
     *
     * @return
     */
    public int getMalesSingleAge30to34() {
        return this.malesSingleAge30to34;
    }

    /**
     * Returns a copy of this.femalesTotalAge30to34
     *
     * @return
     */
    public int getFemalesTotalAge30to34() {
        return this.femalesTotalAge30to34;
    }

    /**
     * Returns a copy of this.femalesMarriedAge30to34
     *
     * @return
     */
    public int getFemalesMarriedAge30to34() {
        return this.femalesMarriedAge30to34;
    }

    /**
     * Returns a copy of this.femalesSingleAge30to34
     *
     * @return
     */
    public int getFemalesSingleAge30to34() {
        return this.femalesSingleAge30to34;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge35to39
     *
     * @return
     */
    public int getAllPeopleTotalAge35to39() {
        return this.allPeopleTotalAge35to39;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge35to39
     *
     * @return
     */
    public int getAllPeopleMarriedAge35to39() {
        return this.allPeopleMarriedAge35to39;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge35to39
     *
     * @return
     */
    public int getAllPeopleSingleAge35to39() {
        return this.allPeopleSingleAge35to39;
    }

    /**
     * Returns a copy of this.malesTotalAge35to39
     *
     * @return
     */
    public int getMalesTotalAge35to39() {
        return this.malesTotalAge35to39;
    }

    /**
     * Returns a copy of this.malesMarriedAge35to39
     *
     * @return
     */
    public int getMalesMarriedAge35to39() {
        return this.malesMarriedAge35to39;
    }

    /**
     * Returns a copy of this.malesSingleAge35to39
     *
     * @return
     */
    public int getMalesSingleAge35to39() {
        return this.malesSingleAge35to39;
    }

    /**
     * Returns a copy of this.femalesTotalAge35to39
     *
     * @return
     */
    public int getFemalesTotalAge35to39() {
        return this.femalesTotalAge35to39;
    }

    /**
     * Returns a copy of this.femalesMarriedAge35to39
     *
     * @return
     */
    public int getFemalesMarriedAge35to39() {
        return this.femalesMarriedAge35to39;
    }

    /**
     * Returns a copy of this.femalesSingleAge35to39
     *
     * @return
     */
    public int getFemalesSingleAge35to39() {
        return this.femalesSingleAge35to39;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge40to44
     *
     * @return
     */
    public int getAllPeopleTotalAge40to44() {
        return this.allPeopleTotalAge40to44;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge40to44
     *
     * @return
     */
    public int getAllPeopleMarriedAge40to44() {
        return this.allPeopleMarriedAge40to44;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge40to44
     *
     * @return
     */
    public int getAllPeopleSingleAge40to44() {
        return this.allPeopleSingleAge40to44;
    }

    /**
     * Returns a copy of this.malesTotalAge40to44
     *
     * @return
     */
    public int getMalesTotalAge40to44() {
        return this.malesTotalAge40to44;
    }

    /**
     * Returns a copy of this.malesMarriedAge40to44
     *
     * @return
     */
    public int getMalesMarriedAge40to44() {
        return this.malesMarriedAge40to44;
    }

    /**
     * Returns a copy of this.malesSingleAge40to44
     *
     * @return
     */
    public int getMalesSingleAge40to44() {
        return this.malesSingleAge40to44;
    }

    /**
     * Returns a copy of this.femalesTotalAge40to44
     *
     * @return
     */
    public int getFemalesTotalAge40to44() {
        return this.femalesTotalAge40to44;
    }

    /**
     * Returns a copy of this.femalesMarriedAge40to44
     *
     * @return
     */
    public int getFemalesMarriedAge40to44() {
        return this.femalesMarriedAge40to44;
    }

    /**
     * Returns a copy of this.femalesSingleAge40to44
     *
     * @return
     */
    public int getFemalesSingleAge40to44() {
        return this.femalesSingleAge40to44;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge45to49
     *
     * @return
     */
    public int getAllPeopleTotalAge45to49() {
        return this.allPeopleTotalAge45to49;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge45to49
     *
     * @return
     */
    public int getAllPeopleMarriedAge45to49() {
        return this.allPeopleMarriedAge45to49;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge45to49
     *
     * @return
     */
    public int getAllPeopleSingleAge45to49() {
        return this.allPeopleSingleAge45to49;
    }

    /**
     * Returns a copy of this.malesTotalAge45to49
     *
     * @return
     */
    public int getMalesTotalAge45to49() {
        return this.malesTotalAge45to49;
    }

    /**
     * Returns a copy of this.malesMarriedAge45to49
     *
     * @return
     */
    public int getMalesMarriedAge45to49() {
        return this.malesMarriedAge45to49;
    }

    /**
     * Returns a copy of this.malesSingleAge45to49
     *
     * @return
     */
    public int getMalesSingleAge45to49() {
        return this.malesSingleAge45to49;
    }

    /**
     * Returns a copy of this.femalesTotalAge45to49
     *
     * @return
     */
    public int getFemalesTotalAge45to49() {
        return this.femalesTotalAge45to49;
    }

    /**
     * Returns a copy of this.femalesMarriedAge45to49
     *
     * @return
     */
    public int getFemalesMarriedAge45to49() {
        return this.femalesMarriedAge45to49;
    }

    /**
     * Returns a copy of this.femalesSingleAge45to49
     *
     * @return
     */
    public int getFemalesSingleAge45to49() {
        return this.femalesSingleAge45to49;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge50to54
     *
     * @return
     */
    public int getAllPeopleTotalAge50to54() {
        return this.allPeopleTotalAge50to54;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge50to54
     *
     * @return
     */
    public int getAllPeopleMarriedAge50to54() {
        return this.allPeopleMarriedAge50to54;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge50to54
     *
     * @return
     */
    public int getAllPeopleSingleAge50to54() {
        return this.allPeopleSingleAge50to54;
    }

    /**
     * Returns a copy of this.malesTotalAge50to54
     *
     * @return
     */
    public int getMalesTotalAge50to54() {
        return this.malesTotalAge50to54;
    }

    /**
     * Returns a copy of this.malesMarriedAge50to54
     *
     * @return
     */
    public int getMalesMarriedAge50to54() {
        return this.malesMarriedAge50to54;
    }

    /**
     * Returns a copy of this.malesSingleAge50to54
     *
     * @return
     */
    public int getMalesSingleAge50to54() {
        return this.malesSingleAge50to54;
    }

    /**
     * Returns a copy of this.femalesTotalAge50to54
     *
     * @return
     */
    public int getFemalesTotalAge50to54() {
        return this.femalesTotalAge50to54;
    }

    /**
     * Returns a copy of this.femalesMarriedAge50to54
     *
     * @return
     */
    public int getFemalesMarriedAge50to54() {
        return this.femalesMarriedAge50to54;
    }

    /**
     * Returns a copy of this.femalesSingleAge50to54
     *
     * @return
     */
    public int getFemalesSingleAge50to54() {
        return this.femalesSingleAge50to54;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge55to59
     *
     * @return
     */
    public int getAllPeopleTotalAge55to59() {
        return this.allPeopleTotalAge55to59;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge55to59
     *
     * @return
     */
    public int getAllPeopleMarriedAge55to59() {
        return this.allPeopleMarriedAge55to59;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge55to59
     *
     * @return
     */
    public int getAllPeopleSingleAge55to59() {
        return this.allPeopleSingleAge55to59;
    }

    /**
     * Returns a copy of this.malesTotalAge55to59
     *
     * @return
     */
    public int getMalesTotalAge55to59() {
        return this.malesTotalAge55to59;
    }

    /**
     * Returns a copy of this.malesMarriedAge55to59
     *
     * @return
     */
    public int getMalesMarriedAge55to59() {
        return this.malesMarriedAge55to59;
    }

    /**
     * Returns a copy of this.malesSingleAge55to59
     *
     * @return
     */
    public int getMalesSingleAge55to59() {
        return this.malesSingleAge55to59;
    }

    /**
     * Returns a copy of this.femalesTotalAge55to59
     *
     * @return
     */
    public int getFemalesTotalAge55to59() {
        return this.femalesTotalAge55to59;
    }

    /**
     * Returns a copy of this.femalesMarriedAge55to59
     *
     * @return
     */
    public int getFemalesMarriedAge55to59() {
        return this.femalesMarriedAge55to59;
    }

    /**
     * Returns a copy of this.femalesSingleAge55to59
     *
     * @return
     */
    public int getFemalesSingleAge55to59() {
        return this.femalesSingleAge55to59;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge60to64
     *
     * @return
     */
    public int getAllPeopleTotalAge60to64() {
        return this.allPeopleTotalAge60to64;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge60to64
     *
     * @return
     */
    public int getAllPeopleMarriedAge60to64() {
        return this.allPeopleMarriedAge60to64;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge60to64
     *
     * @return
     */
    public int getAllPeopleSingleAge60to64() {
        return this.allPeopleSingleAge60to64;
    }

    /**
     * Returns a copy of this.malesTotalAge60to64
     *
     * @return
     */
    public int getMalesTotalAge60to64() {
        return this.malesTotalAge60to64;
    }

    /**
     * Returns a copy of this.malesMarriedAge60to64
     *
     * @return
     */
    public int getMalesMarriedAge60to64() {
        return this.malesMarriedAge60to64;
    }

    /**
     * Returns a copy of this.malesSingleAge60to64
     *
     * @return
     */
    public int getMalesSingleAge60to64() {
        return this.malesSingleAge60to64;
    }

    /**
     * Returns a copy of this.femalesTotalAge60to64
     *
     * @return
     */
    public int getFemalesTotalAge60to64() {
        return this.femalesTotalAge60to64;
    }

    /**
     * Returns a copy of this.femalesMarriedAge60to64
     *
     * @return
     */
    public int getFemalesMarriedAge60to64() {
        return this.femalesMarriedAge60to64;
    }

    /**
     * Returns a copy of this.femalesSingleAge60to64
     *
     * @return
     */
    public int getFemalesSingleAge60to64() {
        return this.femalesSingleAge60to64;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge65to74
     *
     * @return
     */
    public int getAllPeopleTotalAge65to74() {
        return this.allPeopleTotalAge65to74;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge65to74
     *
     * @return
     */
    public int getAllPeopleMarriedAge65to74() {
        return this.allPeopleMarriedAge65to74;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge65to74
     *
     * @return
     */
    public int getAllPeopleSingleAge65to74() {
        return this.allPeopleSingleAge65to74;
    }

    /**
     * Returns a copy of this.malesTotalAge65to74
     *
     * @return
     */
    public int getMalesTotalAge65to74() {
        return this.malesTotalAge65to74;
    }

    /**
     * Returns a copy of this.malesMarriedAge65to74
     *
     * @return
     */
    public int getMalesMarriedAge65to74() {
        return this.malesMarriedAge65to74;
    }

    /**
     * Returns a copy of this.malesSingleAge65to74
     *
     * @return
     */
    public int getMalesSingleAge65to74() {
        return this.malesSingleAge65to74;
    }

    /**
     * Returns a copy of this.femalesTotalAge65to74
     *
     * @return
     */
    public int getFemalesTotalAge65to74() {
        return this.femalesTotalAge65to74;
    }

    /**
     * Returns a copy of this.femalesMarriedAge65to74
     *
     * @return
     */
    public int getFemalesMarriedAge65to74() {
        return this.femalesMarriedAge65to74;
    }

    /**
     * Returns a copy of this.femalesSingleAge65to74
     *
     * @return
     */
    public int getFemalesSingleAge65to74() {
        return this.femalesSingleAge65to74;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge75to79
     *
     * @return
     */
    public int getAllPeopleTotalAge75to79() {
        return this.allPeopleTotalAge75to79;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge75to79
     *
     * @return
     */
    public int getAllPeopleMarriedAge75to79() {
        return this.allPeopleMarriedAge75to79;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge75to79
     *
     * @return
     */
    public int getAllPeopleSingleAge75to79() {
        return this.allPeopleSingleAge75to79;
    }

    /**
     * Returns a copy of this.malesTotalAge75to79
     *
     * @return
     */
    public int getMalesTotalAge75to79() {
        return this.malesTotalAge75to79;
    }

    /**
     * Returns a copy of this.malesMarriedAge75to79
     *
     * @return
     */
    public int getMalesMarriedAge75to79() {
        return this.malesMarriedAge75to79;
    }

    /**
     * Returns a copy of this.malesSingleAge75to79
     *
     * @return
     */
    public int getMalesSingleAge75to79() {
        return this.malesSingleAge75to79;
    }

    /**
     * Returns a copy of this.femalesTotalAge75to79
     *
     * @return
     */
    public int getFemalesTotalAge75to79() {
        return this.femalesTotalAge75to79;
    }

    /**
     * Returns a copy of this.femalesMarriedAge75to79
     *
     * @return
     */
    public int getFemalesMarriedAge75to79() {
        return this.femalesMarriedAge75to79;
    }

    /**
     * Returns a copy of this.femalesSingleAge75to79
     *
     * @return
     */
    public int getFemalesSingleAge75to79() {
        return this.femalesSingleAge75to79;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge80to84
     *
     * @return
     */
    public int getAllPeopleTotalAge80to84() {
        return this.allPeopleTotalAge80to84;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge80to84
     *
     * @return
     */
    public int getAllPeopleMarriedAge80to84() {
        return this.allPeopleMarriedAge80to84;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge80to84
     *
     * @return
     */
    public int getAllPeopleSingleAge80to84() {
        return this.allPeopleSingleAge80to84;
    }

    /**
     * Returns a copy of this.malesTotalAge80to84
     *
     * @return
     */
    public int getMalesTotalAge80to84() {
        return this.malesTotalAge80to84;
    }

    /**
     * Returns a copy of this.malesMarriedAge80to84
     *
     * @return
     */
    public int getMalesMarriedAge80to84() {
        return this.malesMarriedAge80to84;
    }

    /**
     * Returns a copy of this.malesSingleAge80to84
     *
     * @return
     */
    public int getMalesSingleAge80to84() {
        return this.malesSingleAge80to84;
    }

    /**
     * Returns a copy of this.femalesTotalAge80to84
     *
     * @return
     */
    public int getFemalesTotalAge80to84() {
        return this.femalesTotalAge80to84;
    }

    /**
     * Returns a copy of this.femalesMarriedAge80to84
     *
     * @return
     */
    public int getFemalesMarriedAge80to84() {
        return this.femalesMarriedAge80to84;
    }

    /**
     * Returns a copy of this.femalesSingleAge80to84
     *
     * @return
     */
    public int getFemalesSingleAge80to84() {
        return this.femalesSingleAge80to84;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge85to89
     *
     * @return
     */
    public int getAllPeopleTotalAge85to89() {
        return this.allPeopleTotalAge85to89;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge85to89
     *
     * @return
     */
    public int getAllPeopleMarriedAge85to89() {
        return this.allPeopleMarriedAge85to89;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge85to89
     *
     * @return
     */
    public int getAllPeopleSingleAge85to89() {
        return this.allPeopleSingleAge85to89;
    }

    /**
     * Returns a copy of this.malesTotalAge85to89
     *
     * @return
     */
    public int getMalesTotalAge85to89() {
        return this.malesTotalAge85to89;
    }

    /**
     * Returns a copy of this.malesMarriedAge85to89
     *
     * @return
     */
    public int getMalesMarriedAge85to89() {
        return this.malesMarriedAge85to89;
    }

    /**
     * Returns a copy of this.malesSingleAge85to89
     *
     * @return
     */
    public int getMalesSingleAge85to89() {
        return this.malesSingleAge85to89;
    }

    /**
     * Returns a copy of this.femalesTotalAge85to89
     *
     * @return
     */
    public int getFemalesTotalAge85to89() {
        return this.femalesTotalAge85to89;
    }

    /**
     * Returns a copy of this.femalesMarriedAge85to89
     *
     * @return
     */
    public int getFemalesMarriedAge85to89() {
        return this.femalesMarriedAge85to89;
    }

    /**
     * Returns a copy of this.femalesSingleAge85to89
     *
     * @return
     */
    public int getFemalesSingleAge85to89() {
        return this.femalesSingleAge85to89;
    }

    /**
     * Returns a copy of this.allPeopleTotalAge90AndOver
     *
     * @return
     */
    public int getAllPeopleTotalAge90AndOver() {
        return this.allPeopleTotalAge90AndOver;
    }

    /**
     * Returns a copy of this.allPeopleMarriedAge90AndOver
     *
     * @return
     */
    public int getAllPeopleMarriedAge90AndOver() {
        return this.allPeopleMarriedAge90AndOver;
    }

    /**
     * Returns a copy of this.allPeopleSingleAge90AndOver
     *
     * @return
     */
    public int getAllPeopleSingleAge90AndOver() {
        return this.allPeopleSingleAge90AndOver;
    }

    /**
     * Returns a copy of this.malesTotalAge90AndOver
     *
     * @return
     */
    public int getMalesTotalAge90AndOver() {
        return this.malesTotalAge90AndOver;
    }

    /**
     * Returns a copy of this.malesMarriedAge90AndOver
     *
     * @return
     */
    public int getMalesMarriedAge90AndOver() {
        return this.malesMarriedAge90AndOver;
    }

    /**
     * Returns a copy of this.malesSingleAge90AndOver
     *
     * @return
     */
    public int getMalesSingleAge90AndOver() {
        return this.malesSingleAge90AndOver;
    }

    /**
     * Returns a copy of this.femalesTotalAge90AndOver
     *
     * @return
     */
    public int getFemalesTotalAge90AndOver() {
        return this.femalesTotalAge90AndOver;
    }

    /**
     * Returns a copy of this.femalesMarriedAge90AndOver
     *
     * @return
     */
    public int getFemalesMarriedAge90AndOver() {
        return this.femalesMarriedAge90AndOver;
    }

    /**
     * Returns a copy of this.femalesSingleAge90AndOver
     *
     * @return
     */
    public int getFemalesSingleAge90AndOver() {
        return this.femalesSingleAge90AndOver;
    }
}
