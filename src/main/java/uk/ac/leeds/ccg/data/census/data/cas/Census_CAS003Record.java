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
 * For storing a CAS003 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CAS003Record extends Census_AreaRecord {

    /**
     * Table CS003 Age of Household Reference Person (HRP) by Sex and Marital
     * Status (Headship): All Households NB: This table contains counts of
     * Households.
     */
    /**
     * CS0030001 = allHouseholdsTotal
     */
    protected int allHouseholdsTotal;
    /**
     * CS0030002 = allHouseholdsMarried
     */
    protected int allHouseholdsMarried;
    /**
     * CS0030003 = allHouseholdsSingle
     */
    protected int allHouseholdsSingle;
    /**
     * CS0030004 = maleHRPHouseholdsTotal
     */
    protected int maleHRPHouseholdsTotal;
    /**
     * CS0030005 = maleHRPHouseholdsMarried
     */
    protected int maleHRPHouseholdsMarried;
    /**
     * CS0030006 = maleHRPHouseholdsSingle
     */
    protected int maleHRPHouseholdsSingle;
    /**
     * CS0030007 = femaleHRPHouseholdsTotal
     */
    protected int femaleHRPHouseholdsTotal;
    /**
     * CS0030008 = femaleHRPHouseholdsMarried
     */
    protected int femaleHRPHouseholdsMarried;
    /**
     * CS0030009 = femaleHRPHouseholdsSingle
     */
    protected int femaleHRPHouseholdsSingle;
    /**
     * CS0030010 = allHouseholdsAge19AndUnder
     */
    protected int allHouseholdsTotalAge19AndUnder;
    /**
     * CS0030011 = allHouseholdsMarriedAge19AndUnder
     */
    protected int allHouseholdsMarriedAge19AndUnder;
    /**
     * CS0030012 = allHouseholdsSingleAge19AndUnder
     */
    protected int allHouseholdsSingleAge19AndUnder;
    /**
     * CS0030013 = maleHRPHouseholdsTotalAge19AndUnder
     */
    protected int maleHRPHouseholdsTotalAge19AndUnder;
    /**
     * CS0030014 = maleHRPHouseholdsMarriedAge19AndUnder
     */
    protected int maleHRPHouseholdsMarriedAge19AndUnder;
    /**
     * CS0030015 = maleHRPHouseholdsSingleAge19AndUnder
     */
    protected int maleHRPHouseholdsSingleAge19AndUnder;
    /**
     * CS0030016 = femaleHRPHouseholdsTotalAge19AndUnder
     */
    protected int femaleHRPHouseholdsTotalAge19AndUnder;
    /**
     * CS0030017 = femaleHRPHouseholdsMarriedAge19AndUnder
     */
    protected int femaleHRPHouseholdsMarriedAge19AndUnder;
    /**
     * CS0030018 = femaleHRPHouseholdsSingleAge19AndUnder
     */
    protected int femaleHRPHouseholdsSingleAge19AndUnder;
    /**
     * CS0030019 = allHouseholdsAge20to24
     */
    protected int allHouseholdsTotalAge20to24;
    /**
     * CS0030020 = allHouseholdsMarriedAge20to24
     */
    protected int allHouseholdsMarriedAge20to24;
    /**
     * CS0030021 = allHouseholdsSingleAge20to24
     */
    protected int allHouseholdsSingleAge20to24;
    /**
     * CS0030022 = maleHRPHouseholdsTotalAge20to24
     */
    protected int maleHRPHouseholdsTotalAge20to24;
    /**
     * CS0030023 = maleHRPHouseholdsMarriedAge20to24
     */
    protected int maleHRPHouseholdsMarriedAge20to24;
    /**
     * CS0030024 = maleHRPHouseholdsSingleAge20to24
     */
    protected int maleHRPHouseholdsSingleAge20to24;
    /**
     * CS0030025 = femaleHRPHouseholdsTotalAge20to24
     */
    protected int femaleHRPHouseholdsTotalAge20to24;
    /**
     * CS0030026 = femaleHRPHouseholdsMarriedAge20to24
     */
    protected int femaleHRPHouseholdsMarriedAge20to24;
    /**
     * CS0030027 = femaleHRPHouseholdsSingleAge20to24
     */
    protected int femaleHRPHouseholdsSingleAge20to24;
    /**
     * CS0030028 = allHouseholdsAge25to29
     */
    protected int allHouseholdsTotalAge25to29;
    /**
     * CS0030029 = allHouseholdsMarriedAge25to29
     */
    protected int allHouseholdsMarriedAge25to29;
    /**
     * CS0030030 = allHouseholdsSingleAge25to29
     */
    protected int allHouseholdsSingleAge25to29;
    /**
     * CS0030031 = maleHRPHouseholdsTotalAge25to29
     */
    protected int maleHRPHouseholdsTotalAge25to29;
    /**
     * CS0030032 = maleHRPHouseholdsMarriedAge25to29
     */
    protected int maleHRPHouseholdsMarriedAge25to29;
    /**
     * CS0030033 = maleHRPHouseholdsSingleAge25to29
     */
    protected int maleHRPHouseholdsSingleAge25to29;
    /**
     * CS0030034 = femaleHRPHouseholdsTotalAge25to29
     */
    protected int femaleHRPHouseholdsTotalAge25to29;
    /**
     * CS0030035 = femaleHRPHouseholdsMarriedAge25to29
     */
    protected int femaleHRPHouseholdsMarriedAge25to29;
    /**
     * CS0030036 = femaleHRPHouseholdsSingleAge25to29
     */
    protected int femaleHRPHouseholdsSingleAge25to29;
    /**
     * CS0030037 For Northern Ireland CS0030037 + CS0030046 + CS0030055 For
     * England, Wales, Scotland. allHouseholdsAge30to44
     */
    protected int allHouseholdsTotalAge30to44;
    /**
     * CS0030038 For Northern Ireland CS0030038 + CS0030047 + CS0030056 For
     * England, Wales, Scotland. allHouseholdsMarriedAge30to44
     */
    protected int allHouseholdsMarriedAge30to44;
    /**
     * CS0030039 For Northern Ireland CS0030039 + CS0030048 + CS0030057 For
     * England, Wales, Scotland. allHouseholdsSingleAge30to44
     */
    protected int allHouseholdsSingleAge30to44;
    /**
     * CS0030040 For Northern Ireland CS0030040 + CS0030049 + CS0030058 For
     * England, Wales, Scotland. maleHRPHouseholdsTotalAge30to44
     */
    protected int maleHRPHouseholdsTotalAge30to44;
    /**
     * CS0030041 For Northern Ireland CS0030041 + CS0030050 + CS0030059 For
     * England, Wales, Scotland. maleHRPHouseholdsMarriedAge30to44
     */
    protected int maleHRPHouseholdsMarriedAge30to44;
    /**
     * CS0030042 For Northern Ireland CS0030042 + CS0030051 + CS0030060 For
     * England, Wales, Scotland. maleHRPHouseholdsSingleAge30to44
     */
    protected int maleHRPHouseholdsSingleAge30to44;
    /**
     * CS0030043 For Northern Ireland CS0030043 + CS0030052 + CS0030061 For
     * England, Wales, Scotland. femaleHRPHouseholdsTotalAge30to44
     */
    protected int femaleHRPHouseholdsTotalAge30to44;
    /**
     * CS0030044 For Northern Ireland CS0030044 + CS0030053 + CS0030062 For
     * England, Wales, Scotland. femaleHRPHouseholdsMarriedAge30to44
     */
    protected int femaleHRPHouseholdsMarriedAge30to44;
    /**
     * CS0030045 For Northern Ireland CS0030045 + CS0030054 + CS0030063 For
     * England, Wales, Scotland. femaleHRPHouseholdsSingleAge30to44
     */
    protected int femaleHRPHouseholdsSingleAge30to44;
    /**
     * CS0030046 For Northern Ireland CS0030064 + CS0030073 + CS0030082 For
     * England, Wales, Scotland. allHouseholdsAge45to59
     */
    protected int allHouseholdsTotalAge45to59;
    /**
     * CS0030047 For Northern Ireland CS0030065 + CS0030074 + CS0030083 For
     * England, Wales, Scotland. allHouseholdsMarriedAge45to59
     */
    protected int allHouseholdsMarriedAge45to59;
    /**
     * CS0030048 For Northern Ireland CS0030066 + CS0030075 + CS0030084 For
     * England, Wales, Scotland. allHouseholdsSingleAge45to59
     */
    protected int allHouseholdsSingleAge45to59;
    /**
     * CS0030049 For Northern Ireland CS0030067 + CS0030076 + CS0030085 For
     * England, Wales, Scotland. maleHRPHouseholdsTotalAge45to59
     */
    protected int maleHRPHouseholdsTotalAge45to59;
    /**
     * CS0030050 For Northern Ireland CS0030068 + CS0030077 + CS0030086 For
     * England, Wales, Scotland. maleHRPHouseholdsMarriedAge45to59
     */
    protected int maleHRPHouseholdsMarriedAge45to59;
    /**
     * CS0030051 For Northern Ireland CS0030069 + CS0030078 + CS0030087 For
     * England, Wales, Scotland. maleHRPHouseholdsSingleAge45to59
     */
    protected int maleHRPHouseholdsSingleAge45to59;
    /**
     * CS0030052 For Northern Ireland CS0030070 + CS0030079 + CS0030088 For
     * England, Wales, Scotland. femaleHRPHouseholdsTotalAge45to59
     */
    protected int femaleHRPHouseholdsTotalAge45to59;
    /**
     * CS0030053 For Northern Ireland CS0030071 + CS0030080 + CS0030089 For
     * England, Wales, Scotland. femaleHRPHouseholdsMarriedAge45to59
     */
    protected int femaleHRPHouseholdsMarriedAge45to59;
    /**
     * CS0030054 For Northern Ireland CS0030072 + CS0030081 + CS0030090 For
     * England, Wales, Scotland. femaleHRPHouseholdsSingleAge45to59
     */
    protected int femaleHRPHouseholdsSingleAge45to59;
    /**
     * CS0030055 For Northern Ireland. CS0030091 For England, Wales, Scotland.
     * allHouseholdsAge60to64
     */
    protected int allHouseholdsTotalAge60to64;
    /**
     * CS0030056 For Northern Ireland. CS0030092 For England, Wales, Scotland.
     * allHouseholdsMarriedAge60to64
     */
    protected int allHouseholdsMarriedAge60to64;
    /**
     * CS0030057 For Northern Ireland. CS0030093 For England, Wales, Scotland.
     * allHouseholdsSingleAge60to64
     */
    protected int allHouseholdsSingleAge60to64;
    /**
     * CS0030058 For Northern Ireland. CS0030094 For England, Wales, Scotland.
     * maleHRPHouseholdsTotalAge60to64
     */
    protected int maleHRPHouseholdsTotalAge60to64;
    /**
     * CS0030059 For Northern Ireland. CS0030095 For England, Wales, Scotland.
     * maleHRPHouseholdsMarriedAge60to64
     */
    protected int maleHRPHouseholdsMarriedAge60to64;
    /**
     * CS0030060 For Northern Ireland. CS0030096 For England, Wales, Scotland.
     * maleHRPHouseholdsSingleAge60to64
     */
    protected int maleHRPHouseholdsSingleAge60to64;
    /**
     * CS0030061 For Northern Ireland. CS0030097 For England, Wales, Scotland.
     * femaleHRPHouseholdsTotalAge60to64
     */
    protected int femaleHRPHouseholdsTotalAge60to64;
    /**
     * CS0030062 For Northern Ireland. CS0030098 For England, Wales, Scotland.
     * femaleHRPHouseholdsMarriedAge60to64
     */
    protected int femaleHRPHouseholdsMarriedAge60to64;
    /**
     * CS0030063 For Northern Ireland. CS0030099 For England, Wales, Scotland.
     * femaleHRPHouseholdsSingleAge60to64
     */
    protected int femaleHRPHouseholdsSingleAge60to64;
    /**
     * CS0030064 For Northern Ireland. CS0030100 + CS0030109 For England, Wales,
     * Scotland. allHouseholdsAge65to74
     */
    protected int allHouseholdsTotalAge65to74;
    /**
     * CS0030065 For Northern Ireland. CS0030101 + CS0030110 For England, Wales,
     * Scotland. allHouseholdsMarriedAge65to74
     */
    protected int allHouseholdsMarriedAge65to74;
    /**
     * CS0030066 For Northern Ireland. CS0030102 + CS0030111 For England, Wales,
     * Scotland. allHouseholdsSingleAge65to74
     */
    protected int allHouseholdsSingleAge65to74;
    /**
     * CS0030067 For Northern Ireland. CS0030103 + CS0030112 For England, Wales,
     * Scotland. maleHRPHouseholdsTotalAge65to74
     */
    protected int maleHRPHouseholdsTotalAge65to74;
    /**
     * CS0030068 For Northern Ireland. CS0030104 + CS0030113 For England, Wales,
     * Scotland. maleHRPHouseholdsMarriedAge65to74
     */
    protected int maleHRPHouseholdsMarriedAge65to74;
    /**
     * CS0030069 For Northern Ireland. CS0030105 + CS0030114 For England, Wales,
     * Scotland. maleHRPHouseholdsSingleAge65to74
     */
    protected int maleHRPHouseholdsSingleAge65to74;
    /**
     * CS0030070 For Northern Ireland. CS0030106 + CS0030115 For England, Wales,
     * Scotland. femaleHRPHouseholdsTotalAge65to74
     */
    protected int femaleHRPHouseholdsTotalAge65to74;
    /**
     * CS0030071 For Northern Ireland. CS0030107 + CS0030116 For England, Wales,
     * Scotland. femaleHRPHouseholdsMarriedAge65to74
     */
    protected int femaleHRPHouseholdsMarriedAge65to74;
    /**
     * CS0030072 For Northern Ireland. CS0030108 + CS0030117 For England, Wales,
     * Scotland. femaleHRPHouseholdsSingleAge65to74
     */
    protected int femaleHRPHouseholdsSingleAge65to74;
    /**
     * CS0030073 For Northern Ireland. CS0030118 + CS0030127 For England, Wales,
     * Scotland. allHouseholdsAge75to84
     */
    protected int allHouseholdsTotalAge75to84;
    /**
     * CS0030074 For Northern Ireland. CS0030119 + CS0030128 For England, Wales,
     * Scotland. allHouseholdsMarriedAge75to84
     */
    protected int allHouseholdsMarriedAge75to84;
    /**
     * CS0030075 For Northern Ireland. CS0030120 + CS0030129 For England, Wales,
     * Scotland. allHouseholdsSingleAge75to84
     */
    protected int allHouseholdsSingleAge75to84;
    /**
     * CS0030076 For Northern Ireland. CS0030121 + CS0030130 For England, Wales,
     * Scotland. maleHRPHouseholdsTotalAge75to84
     */
    protected int maleHRPHouseholdsTotalAge75to84;
    /**
     * CS0030077 For Northern Ireland. CS0030122 + CS0030131 For England, Wales,
     * Scotland. maleHRPHouseholdsMarriedAge75to84
     */
    protected int maleHRPHouseholdsMarriedAge75to84;
    /**
     * CS0030078 For Northern Ireland. CS0030123 + CS0030132 For England, Wales,
     * Scotland. maleHRPHouseholdsSingleAge75to84
     */
    protected int maleHRPHouseholdsSingleAge75to84;
    /**
     * CS0030079 For Northern Ireland. CS0030124 + CS0030133 For England, Wales,
     * Scotland. femaleHRPHouseholdsTotalAge75to84
     */
    protected int femaleHRPHouseholdsTotalAge75to84;
    /**
     * CS0030080 For Northern Ireland. CS0030125 + CS0030134 For England, Wales,
     * Scotland. femaleHRPHouseholdsMarriedAge75to84
     */
    protected int femaleHRPHouseholdsMarriedAge75to84;
    /**
     * CS0030081 For Northern Ireland. CS0030126 + CS0030135 For England, Wales,
     * Scotland. femaleHRPHouseholdsSingleAge75to84
     */
    protected int femaleHRPHouseholdsSingleAge75to84;
    /**
     * CS0030082 For Northern Ireland. CS0030136 + CS0030145 For England, Wales,
     * Scotland. allHouseholdsAge85AndOver
     */
    protected int allHouseholdsTotalAge85AndOver;
    /**
     * CS0030083 For Northern Ireland. CS0030137 + CS0030146 For England, Wales,
     * Scotland. allHouseholdsMarriedAge85AndOver
     */
    protected int allHouseholdsMarriedAge85AndOver;
    /**
     * CS0030084 For Northern Ireland. CS0030138 + CS0030147 For England, Wales,
     * Scotland. allHouseholdsSingleAge85AndOver
     */
    protected int allHouseholdsSingleAge85AndOver;
    /**
     * CS0030085 For Northern Ireland. CS0030139 + CS0030148 For England, Wales,
     * Scotland. maleHRPHouseholdsTotalAge85AndOver
     */
    protected int maleHRPHouseholdsTotalAge85AndOver;
    /**
     * CS0030086 For Northern Ireland. CS0030140 + CS0030149 For England, Wales,
     * Scotland. maleHRPHouseholdsMarriedAge85AndOver
     */
    protected int maleHRPHouseholdsMarriedAge85AndOver;
    /**
     * CS0030087 For Northern Ireland. CS0030141 + CS0030150 For England, Wales,
     * Scotland. maleHRPHouseholdsSingleAge85AndOver
     */
    protected int maleHRPHouseholdsSingleAge85AndOver;
    /**
     * CS0030088 For Northern Ireland. CS0030142 + CS0030151 For England, Wales,
     * Scotland. femaleHRPHouseholdsTotalAge85AndOver
     */
    protected int femaleHRPHouseholdsTotalAge85AndOver;
    /**
     * CS0030089 For Northern Ireland. CS0030143 + CS0030152 For England, Wales,
     * Scotland. femaleHRPHouseholdsMarriedAge85AndOver
     */
    protected int femaleHRPHouseholdsMarriedAge85AndOver;
    /**
     * CS0030090 For Northern Ireland. CS0030144 + CS0030153 For England, Wales,
     * Scotland. femaleHRPHouseholdsSingleAge85AndOver
     */
    protected int femaleHRPHouseholdsSingleAge85AndOver;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CAS003Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CAS003Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fields = line.split(",");
        this.zoneCode = fields[0].substring(1, 11);
        // From Table CAS003
        this.allHouseholdsTotal = Math_Integer.parseInt(fields[1]);
        this.allHouseholdsMarried = Math_Integer.parseInt(fields[2]);
        this.allHouseholdsSingle = Math_Integer.parseInt(fields[3]);
        this.maleHRPHouseholdsTotal = Math_Integer.parseInt(fields[4]);
        this.maleHRPHouseholdsMarried = Math_Integer.parseInt(fields[5]);
        this.maleHRPHouseholdsSingle = Math_Integer.parseInt(fields[6]);
        this.femaleHRPHouseholdsTotal = Math_Integer.parseInt(fields[7]);
        this.femaleHRPHouseholdsMarried = Math_Integer.parseInt(fields[8]);
        this.femaleHRPHouseholdsSingle = Math_Integer.parseInt(fields[9]);
        this.allHouseholdsTotalAge19AndUnder = Math_Integer.parseInt(fields[10]);
        this.allHouseholdsMarriedAge19AndUnder = Math_Integer.parseInt(fields[11]);
        this.allHouseholdsSingleAge19AndUnder = Math_Integer.parseInt(fields[12]);
        this.maleHRPHouseholdsTotalAge19AndUnder = Math_Integer.parseInt(fields[13]);
        this.maleHRPHouseholdsMarriedAge19AndUnder = Math_Integer.parseInt(fields[14]);
        this.maleHRPHouseholdsSingleAge19AndUnder = Math_Integer.parseInt(fields[15]);
        this.femaleHRPHouseholdsTotalAge19AndUnder = Math_Integer.parseInt(fields[16]);
        this.femaleHRPHouseholdsMarriedAge19AndUnder = Math_Integer.parseInt(fields[17]);
        this.femaleHRPHouseholdsSingleAge19AndUnder = Math_Integer.parseInt(fields[18]);
        this.allHouseholdsTotalAge20to24 = Math_Integer.parseInt(fields[19]);
        this.allHouseholdsMarriedAge20to24 = Math_Integer.parseInt(fields[20]);
        this.allHouseholdsSingleAge20to24 = Math_Integer.parseInt(fields[21]);
        this.maleHRPHouseholdsTotalAge20to24 = Math_Integer.parseInt(fields[22]);
        this.maleHRPHouseholdsMarriedAge20to24 = Math_Integer.parseInt(fields[23]);
        this.maleHRPHouseholdsSingleAge20to24 = Math_Integer.parseInt(fields[24]);
        this.femaleHRPHouseholdsTotalAge20to24 = Math_Integer.parseInt(fields[25]);
        this.femaleHRPHouseholdsMarriedAge20to24 = Math_Integer.parseInt(fields[26]);
        this.femaleHRPHouseholdsSingleAge20to24 = Math_Integer.parseInt(fields[27]);
        this.allHouseholdsTotalAge25to29 = Math_Integer.parseInt(fields[28]);
        this.allHouseholdsMarriedAge25to29 = Math_Integer.parseInt(fields[29]);
        this.allHouseholdsSingleAge25to29 = Math_Integer.parseInt(fields[30]);
        this.maleHRPHouseholdsTotalAge25to29 = Math_Integer.parseInt(fields[31]);
        this.maleHRPHouseholdsMarriedAge25to29 = Math_Integer.parseInt(fields[32]);
        this.maleHRPHouseholdsSingleAge25to29 = Math_Integer.parseInt(fields[33]);
        this.femaleHRPHouseholdsTotalAge25to29 = Math_Integer.parseInt(fields[34]);
        this.femaleHRPHouseholdsMarriedAge25to29 = Math_Integer.parseInt(fields[35]);
        this.femaleHRPHouseholdsSingleAge25to29 = Math_Integer.parseInt(fields[36]);
        this.allHouseholdsTotalAge30to44 = Math_Integer.parseInt(fields[37]) + Math_Integer.parseInt(fields[46]) + Math_Integer.parseInt(fields[55]);
        this.allHouseholdsMarriedAge30to44 = Math_Integer.parseInt(fields[38]) + Math_Integer.parseInt(fields[47]) + Math_Integer.parseInt(fields[56]);
        this.allHouseholdsSingleAge30to44 = Math_Integer.parseInt(fields[39]) + Math_Integer.parseInt(fields[48]) + Math_Integer.parseInt(fields[57]);
        this.maleHRPHouseholdsTotalAge30to44 = Math_Integer.parseInt(fields[40]) + Math_Integer.parseInt(fields[49]) + Math_Integer.parseInt(fields[58]);
        this.maleHRPHouseholdsMarriedAge30to44 = Math_Integer.parseInt(fields[41]) + Math_Integer.parseInt(fields[50]) + Math_Integer.parseInt(fields[59]);
        this.maleHRPHouseholdsSingleAge30to44 = Math_Integer.parseInt(fields[42]) + Math_Integer.parseInt(fields[51]) + Math_Integer.parseInt(fields[60]);
        this.femaleHRPHouseholdsTotalAge30to44 = Math_Integer.parseInt(fields[43]) + Math_Integer.parseInt(fields[52]) + Math_Integer.parseInt(fields[61]);
        this.femaleHRPHouseholdsMarriedAge30to44 = Math_Integer.parseInt(fields[44]) + Math_Integer.parseInt(fields[53]) + Math_Integer.parseInt(fields[62]);
        this.femaleHRPHouseholdsSingleAge30to44 = Math_Integer.parseInt(fields[45]) + Math_Integer.parseInt(fields[54]) + Math_Integer.parseInt(fields[63]);
        this.allHouseholdsTotalAge45to59 = Math_Integer.parseInt(fields[64]) + Math_Integer.parseInt(fields[73]) + Math_Integer.parseInt(fields[82]);
        this.allHouseholdsMarriedAge45to59 = Math_Integer.parseInt(fields[65]) + Math_Integer.parseInt(fields[74]) + Math_Integer.parseInt(fields[83]);
        this.allHouseholdsSingleAge45to59 = Math_Integer.parseInt(fields[66]) + Math_Integer.parseInt(fields[75]) + Math_Integer.parseInt(fields[84]);
        this.maleHRPHouseholdsTotalAge45to59 = Math_Integer.parseInt(fields[67]) + Math_Integer.parseInt(fields[76]) + Math_Integer.parseInt(fields[85]);
        this.maleHRPHouseholdsMarriedAge45to59 = Math_Integer.parseInt(fields[68]) + Math_Integer.parseInt(fields[77]) + Math_Integer.parseInt(fields[86]);
        this.maleHRPHouseholdsSingleAge45to59 = Math_Integer.parseInt(fields[69]) + Math_Integer.parseInt(fields[78]) + Math_Integer.parseInt(fields[87]);
        this.femaleHRPHouseholdsTotalAge45to59 = Math_Integer.parseInt(fields[70]) + Math_Integer.parseInt(fields[79]) + Math_Integer.parseInt(fields[88]);
        this.femaleHRPHouseholdsMarriedAge45to59 = Math_Integer.parseInt(fields[71]) + Math_Integer.parseInt(fields[80]) + Math_Integer.parseInt(fields[89]);
        this.femaleHRPHouseholdsSingleAge45to59 = Math_Integer.parseInt(fields[72]) + Math_Integer.parseInt(fields[81]) + Math_Integer.parseInt(fields[90]);
        this.allHouseholdsTotalAge60to64 = Math_Integer.parseInt(fields[91]);
        this.allHouseholdsMarriedAge60to64 = Math_Integer.parseInt(fields[92]);
        this.allHouseholdsSingleAge60to64 = Math_Integer.parseInt(fields[93]);
        this.maleHRPHouseholdsTotalAge60to64 = Math_Integer.parseInt(fields[94]);
        this.maleHRPHouseholdsMarriedAge60to64 = Math_Integer.parseInt(fields[95]);
        this.maleHRPHouseholdsSingleAge60to64 = Math_Integer.parseInt(fields[96]);
        this.femaleHRPHouseholdsTotalAge60to64 = Math_Integer.parseInt(fields[97]);
        this.femaleHRPHouseholdsMarriedAge60to64 = Math_Integer.parseInt(fields[98]);
        this.femaleHRPHouseholdsSingleAge60to64 = Math_Integer.parseInt(fields[99]);
        this.allHouseholdsTotalAge65to74 = Math_Integer.parseInt(fields[100]) + Math_Integer.parseInt(fields[109]);
        this.allHouseholdsMarriedAge65to74 = Math_Integer.parseInt(fields[101]) + Math_Integer.parseInt(fields[110]);
        this.allHouseholdsSingleAge65to74 = Math_Integer.parseInt(fields[102]) + Math_Integer.parseInt(fields[111]);
        this.maleHRPHouseholdsTotalAge65to74 = Math_Integer.parseInt(fields[103]) + Math_Integer.parseInt(fields[112]);
        this.maleHRPHouseholdsMarriedAge65to74 = Math_Integer.parseInt(fields[104]) + Math_Integer.parseInt(fields[113]);
        this.maleHRPHouseholdsSingleAge65to74 = Math_Integer.parseInt(fields[105]) + Math_Integer.parseInt(fields[114]);
        this.femaleHRPHouseholdsTotalAge65to74 = Math_Integer.parseInt(fields[106]) + Math_Integer.parseInt(fields[115]);
        this.femaleHRPHouseholdsMarriedAge65to74 = Math_Integer.parseInt(fields[107]) + Math_Integer.parseInt(fields[116]);
        this.femaleHRPHouseholdsSingleAge65to74 = Math_Integer.parseInt(fields[108]) + Math_Integer.parseInt(fields[117]);
        this.allHouseholdsTotalAge75to84 = Math_Integer.parseInt(fields[118]) + Math_Integer.parseInt(fields[127]);
        this.allHouseholdsMarriedAge75to84 = Math_Integer.parseInt(fields[119]) + Math_Integer.parseInt(fields[128]);
        this.allHouseholdsSingleAge75to84 = Math_Integer.parseInt(fields[120]) + Math_Integer.parseInt(fields[129]);
        this.maleHRPHouseholdsTotalAge75to84 = Math_Integer.parseInt(fields[121]) + Math_Integer.parseInt(fields[130]);
        this.maleHRPHouseholdsMarriedAge75to84 = Math_Integer.parseInt(fields[122]) + Math_Integer.parseInt(fields[131]);
        this.maleHRPHouseholdsSingleAge75to84 = Math_Integer.parseInt(fields[123]) + Math_Integer.parseInt(fields[132]);
        this.femaleHRPHouseholdsTotalAge75to84 = Math_Integer.parseInt(fields[124]) + Math_Integer.parseInt(fields[133]);
        this.femaleHRPHouseholdsMarriedAge75to84 = Math_Integer.parseInt(fields[125]) + Math_Integer.parseInt(fields[134]);
        this.femaleHRPHouseholdsSingleAge75to84 = Math_Integer.parseInt(fields[126]) + Math_Integer.parseInt(fields[135]);
        this.allHouseholdsTotalAge85AndOver = Math_Integer.parseInt(fields[136]) + Math_Integer.parseInt(fields[145]);
        this.allHouseholdsMarriedAge85AndOver = Math_Integer.parseInt(fields[137]) + Math_Integer.parseInt(fields[146]);
        this.allHouseholdsSingleAge85AndOver = Math_Integer.parseInt(fields[138]) + Math_Integer.parseInt(fields[147]);
        this.maleHRPHouseholdsTotalAge85AndOver = Math_Integer.parseInt(fields[139]) + Math_Integer.parseInt(fields[148]);
        this.maleHRPHouseholdsMarriedAge85AndOver = Math_Integer.parseInt(fields[140]) + Math_Integer.parseInt(fields[149]);
        this.maleHRPHouseholdsSingleAge85AndOver = Math_Integer.parseInt(fields[141]) + Math_Integer.parseInt(fields[150]);
        this.femaleHRPHouseholdsTotalAge85AndOver = Math_Integer.parseInt(fields[142]) + Math_Integer.parseInt(fields[151]);
        this.femaleHRPHouseholdsMarriedAge85AndOver = Math_Integer.parseInt(fields[143]) + Math_Integer.parseInt(fields[152]);
        this.femaleHRPHouseholdsSingleAge85AndOver = Math_Integer.parseInt(fields[144]) + Math_Integer.parseInt(fields[153]);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     * @param n The flag is added for loading data from Northern
     * Island which is a little different to that from England and Wales and
     * Scotland!
     */
    public Census_CAS003Record(Census_RecordID rID, String line, boolean n) {
        super(rID);
        String[] dummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[91];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(dummy, 0, fields, 0, fields.length);
        this.zoneCode = fields[0].substring(1, 11);
        // From Table CAS003
        this.allHouseholdsTotal = Math_Integer.parseInt(fields[1]);
        this.allHouseholdsMarried = Math_Integer.parseInt(fields[2]);
        this.allHouseholdsSingle = Math_Integer.parseInt(fields[3]);
        this.maleHRPHouseholdsTotal = Math_Integer.parseInt(fields[4]);
        this.maleHRPHouseholdsMarried = Math_Integer.parseInt(fields[5]);
        this.maleHRPHouseholdsSingle = Math_Integer.parseInt(fields[6]);
        this.femaleHRPHouseholdsTotal = Math_Integer.parseInt(fields[7]);
        this.femaleHRPHouseholdsMarried = Math_Integer.parseInt(fields[8]);
        this.femaleHRPHouseholdsSingle = Math_Integer.parseInt(fields[9]);
        this.allHouseholdsTotalAge19AndUnder = Math_Integer.parseInt(fields[10]);
        this.allHouseholdsMarriedAge19AndUnder = Math_Integer.parseInt(fields[11]);
        this.allHouseholdsSingleAge19AndUnder = Math_Integer.parseInt(fields[12]);
        this.maleHRPHouseholdsTotalAge19AndUnder = Math_Integer.parseInt(fields[13]);
        this.maleHRPHouseholdsMarriedAge19AndUnder = Math_Integer.parseInt(fields[14]);
        this.maleHRPHouseholdsSingleAge19AndUnder = Math_Integer.parseInt(fields[15]);
        this.femaleHRPHouseholdsTotalAge19AndUnder = Math_Integer.parseInt(fields[16]);
        this.femaleHRPHouseholdsMarriedAge19AndUnder = Math_Integer.parseInt(fields[17]);
        this.femaleHRPHouseholdsSingleAge19AndUnder = Math_Integer.parseInt(fields[18]);
        this.allHouseholdsTotalAge20to24 = Math_Integer.parseInt(fields[19]);
        this.allHouseholdsMarriedAge20to24 = Math_Integer.parseInt(fields[20]);
        this.allHouseholdsSingleAge20to24 = Math_Integer.parseInt(fields[21]);
        this.maleHRPHouseholdsTotalAge20to24 = Math_Integer.parseInt(fields[22]);
        this.maleHRPHouseholdsMarriedAge20to24 = Math_Integer.parseInt(fields[23]);
        this.maleHRPHouseholdsSingleAge20to24 = Math_Integer.parseInt(fields[24]);
        this.femaleHRPHouseholdsTotalAge20to24 = Math_Integer.parseInt(fields[25]);
        this.femaleHRPHouseholdsMarriedAge20to24 = Math_Integer.parseInt(fields[26]);
        this.femaleHRPHouseholdsSingleAge20to24 = Math_Integer.parseInt(fields[27]);
        this.allHouseholdsTotalAge25to29 = Math_Integer.parseInt(fields[28]);
        this.allHouseholdsMarriedAge25to29 = Math_Integer.parseInt(fields[29]);
        this.allHouseholdsSingleAge25to29 = Math_Integer.parseInt(fields[30]);
        this.maleHRPHouseholdsTotalAge25to29 = Math_Integer.parseInt(fields[31]);
        this.maleHRPHouseholdsMarriedAge25to29 = Math_Integer.parseInt(fields[32]);
        this.maleHRPHouseholdsSingleAge25to29 = Math_Integer.parseInt(fields[33]);
        this.femaleHRPHouseholdsTotalAge25to29 = Math_Integer.parseInt(fields[34]);
        this.femaleHRPHouseholdsMarriedAge25to29 = Math_Integer.parseInt(fields[35]);
        this.femaleHRPHouseholdsSingleAge25to29 = Math_Integer.parseInt(fields[36]);
        this.allHouseholdsTotalAge30to44 = Math_Integer.parseInt(fields[37]);
        this.allHouseholdsMarriedAge30to44 = Math_Integer.parseInt(fields[38]);
        this.allHouseholdsSingleAge30to44 = Math_Integer.parseInt(fields[39]);
        this.maleHRPHouseholdsTotalAge30to44 = Math_Integer.parseInt(fields[40]);
        this.maleHRPHouseholdsMarriedAge30to44 = Math_Integer.parseInt(fields[41]);
        this.maleHRPHouseholdsSingleAge30to44 = Math_Integer.parseInt(fields[42]);
        this.femaleHRPHouseholdsTotalAge30to44 = Math_Integer.parseInt(fields[43]);
        this.femaleHRPHouseholdsMarriedAge30to44 = Math_Integer.parseInt(fields[44]);
        this.femaleHRPHouseholdsSingleAge30to44 = Math_Integer.parseInt(fields[45]);
        this.allHouseholdsTotalAge45to59 = Math_Integer.parseInt(fields[46]);
        this.allHouseholdsMarriedAge45to59 = Math_Integer.parseInt(fields[47]);
        this.allHouseholdsSingleAge45to59 = Math_Integer.parseInt(fields[48]);
        this.maleHRPHouseholdsTotalAge45to59 = Math_Integer.parseInt(fields[49]);
        this.maleHRPHouseholdsMarriedAge45to59 = Math_Integer.parseInt(fields[50]);
        this.maleHRPHouseholdsSingleAge45to59 = Math_Integer.parseInt(fields[51]);
        this.femaleHRPHouseholdsTotalAge45to59 = Math_Integer.parseInt(fields[52]);
        this.femaleHRPHouseholdsMarriedAge45to59 = Math_Integer.parseInt(fields[53]);
        this.femaleHRPHouseholdsSingleAge45to59 = Math_Integer.parseInt(fields[54]);
        this.allHouseholdsTotalAge60to64 = Math_Integer.parseInt(fields[55]);
        this.allHouseholdsMarriedAge60to64 = Math_Integer.parseInt(fields[56]);
        this.allHouseholdsSingleAge60to64 = Math_Integer.parseInt(fields[57]);
        this.maleHRPHouseholdsTotalAge60to64 = Math_Integer.parseInt(fields[58]);
        this.maleHRPHouseholdsMarriedAge60to64 = Math_Integer.parseInt(fields[59]);
        this.maleHRPHouseholdsSingleAge60to64 = Math_Integer.parseInt(fields[60]);
        this.femaleHRPHouseholdsTotalAge60to64 = Math_Integer.parseInt(fields[61]);
        this.femaleHRPHouseholdsMarriedAge60to64 = Math_Integer.parseInt(fields[62]);
        this.femaleHRPHouseholdsSingleAge60to64 = Math_Integer.parseInt(fields[63]);
        this.allHouseholdsTotalAge65to74 = Math_Integer.parseInt(fields[64]);
        this.allHouseholdsMarriedAge65to74 = Math_Integer.parseInt(fields[65]);
        this.allHouseholdsSingleAge65to74 = Math_Integer.parseInt(fields[66]);
        this.maleHRPHouseholdsTotalAge65to74 = Math_Integer.parseInt(fields[67]);
        this.maleHRPHouseholdsMarriedAge65to74 = Math_Integer.parseInt(fields[68]);
        this.maleHRPHouseholdsSingleAge65to74 = Math_Integer.parseInt(fields[69]);
        this.femaleHRPHouseholdsTotalAge65to74 = Math_Integer.parseInt(fields[70]);
        this.femaleHRPHouseholdsMarriedAge65to74 = Math_Integer.parseInt(fields[71]);
        this.femaleHRPHouseholdsSingleAge65to74 = Math_Integer.parseInt(fields[72]);
        this.allHouseholdsTotalAge75to84 = Math_Integer.parseInt(fields[73]);
        this.allHouseholdsMarriedAge75to84 = Math_Integer.parseInt(fields[74]);
        this.allHouseholdsSingleAge75to84 = Math_Integer.parseInt(fields[75]);
        this.maleHRPHouseholdsTotalAge75to84 = Math_Integer.parseInt(fields[76]);
        this.maleHRPHouseholdsMarriedAge75to84 = Math_Integer.parseInt(fields[77]);
        this.maleHRPHouseholdsSingleAge75to84 = Math_Integer.parseInt(fields[78]);
        this.femaleHRPHouseholdsTotalAge75to84 = Math_Integer.parseInt(fields[79]);
        this.femaleHRPHouseholdsMarriedAge75to84 = Math_Integer.parseInt(fields[80]);
        this.femaleHRPHouseholdsSingleAge75to84 = Math_Integer.parseInt(fields[81]);
        this.allHouseholdsTotalAge85AndOver = Math_Integer.parseInt(fields[82]);
        this.allHouseholdsMarriedAge85AndOver = Math_Integer.parseInt(fields[83]);
        this.allHouseholdsSingleAge85AndOver = Math_Integer.parseInt(fields[84]);
        this.maleHRPHouseholdsTotalAge85AndOver = Math_Integer.parseInt(fields[85]);
        this.maleHRPHouseholdsMarriedAge85AndOver = Math_Integer.parseInt(fields[86]);
        this.maleHRPHouseholdsSingleAge85AndOver = Math_Integer.parseInt(fields[87]);
        this.femaleHRPHouseholdsTotalAge85AndOver = Math_Integer.parseInt(fields[88]);
        this.femaleHRPHouseholdsMarriedAge85AndOver = Math_Integer.parseInt(fields[89]);
        this.femaleHRPHouseholdsSingleAge85AndOver = Math_Integer.parseInt(fields[90]);
    }

    /**
     * @return A String description of this.
     */
    @Override
    public String toString() {
        String r = super.toString() 
                + ", allHouseholdsTotal " + allHouseholdsTotal
                + ", allHouseholdsMarried " + allHouseholdsMarried 
                + ", allHouseholdsSingle " + allHouseholdsSingle
                + ", maleHRPHouseholdsTotal " + maleHRPHouseholdsTotal 
                + ", maleHRPHouseholdsMarried " + maleHRPHouseholdsMarried 
                + ", maleHRPHouseholdsSingle " + maleHRPHouseholdsSingle 
                + ", femaleHRPHouseholdsTotal " + femaleHRPHouseholdsTotal
                + ", femaleHRPHouseholdsMarried " + femaleHRPHouseholdsMarried 
                + ", femaleHRPHouseholdsSingle " + femaleHRPHouseholdsSingle
                + ", allHouseholdsTotalAge19AndUnder " + allHouseholdsTotalAge19AndUnder 
                + ", allHouseholdsMarriedAge19AndUnder " + allHouseholdsMarriedAge19AndUnder
                + ", allHouseholdsSingleAge19AndUnder " + allHouseholdsSingleAge19AndUnder
                + ", maleHRPHouseholdsTotalAge19AndUnder " + maleHRPHouseholdsTotalAge19AndUnder
                + ", maleHRPHouseholdsMarriedAge19AndUnder " + maleHRPHouseholdsMarriedAge19AndUnder 
                + ", maleHRPHouseholdsSingleAge19AndUnder " + maleHRPHouseholdsSingleAge19AndUnder 
                + ", femaleHRPHouseholdsTotalAge19AndUnder " + femaleHRPHouseholdsTotalAge19AndUnder 
                + ", femaleHRPHouseholdsMarriedAge19AndUnder " + femaleHRPHouseholdsMarriedAge19AndUnder
                + ", femaleHRPHouseholdsSingleAge19AndUnder " + femaleHRPHouseholdsSingleAge19AndUnder 
                + ", allHouseholdsTotalAge20to24 " + allHouseholdsTotalAge20to24 
                + ", allHouseholdsMarriedAge20to24 " + allHouseholdsMarriedAge20to24 
                + ", allHouseholdsSingleAge20to24 " + allHouseholdsSingleAge20to24 
                + ", maleHRPHouseholdsTotalAge20to24 " + maleHRPHouseholdsTotalAge20to24 
                + ", maleHRPHouseholdsMarriedAge20to24 " + maleHRPHouseholdsMarriedAge20to24
                + ", maleHRPHouseholdsSingleAge20to24 " + maleHRPHouseholdsSingleAge20to24 
                + ", femaleHRPHouseholdsTotalAge20to24 " + femaleHRPHouseholdsTotalAge20to24
                + ", femaleHRPHouseholdsMarriedAge20to24 " + femaleHRPHouseholdsMarriedAge20to24
                + ", femaleHRPHouseholdsSingleAge20to24 " + femaleHRPHouseholdsSingleAge20to24
                + ", allHouseholdsTotalAge25to29 " + allHouseholdsTotalAge25to29
                + ", allHouseholdsMarriedAge25to29 " + allHouseholdsMarriedAge25to29 
                + ", allHouseholdsSingleAge25to29 " + allHouseholdsSingleAge25to29
                + ", maleHRPHouseholdsTotalAge25to29 " + maleHRPHouseholdsTotalAge25to29
                + ", maleHRPHouseholdsMarriedAge25to29 " + maleHRPHouseholdsMarriedAge25to29
                + ", maleHRPHouseholdsSingleAge25to29 " + maleHRPHouseholdsSingleAge25to29 
                + ", femaleHRPHouseholdsTotalAge25to29 " + femaleHRPHouseholdsTotalAge25to29
                + ", femaleHRPHouseholdsMarriedAge25to29 " + femaleHRPHouseholdsMarriedAge25to29
                + ", femaleHRPHouseholdsSingleAge25to29 " + femaleHRPHouseholdsSingleAge25to29
                + ", allHouseholdsTotalAge30to44 " + allHouseholdsTotalAge30to44 
                + ", allHouseholdsMarriedAge30to44 " + allHouseholdsMarriedAge30to44 
                + ", allHouseholdsSingleAge30to44 " + allHouseholdsSingleAge30to44 
                + ", maleHRPHouseholdsTotalAge30to44 " + maleHRPHouseholdsTotalAge30to44
                + ", maleHRPHouseholdsMarriedAge30to44 " + maleHRPHouseholdsMarriedAge30to44
                + ", maleHRPHouseholdsSingleAge30to44 " + maleHRPHouseholdsSingleAge30to44
                + ", femaleHRPHouseholdsTotalAge30to44 " + femaleHRPHouseholdsTotalAge30to44 
                + ", femaleHRPHouseholdsMarriedAge30to44 " + femaleHRPHouseholdsMarriedAge30to44
                + ", femaleHRPHouseholdsSingleAge30to44 " + femaleHRPHouseholdsSingleAge30to44 
                + ", allHouseholdsTotalAge45to59 " + allHouseholdsTotalAge45to59
                + ", allHouseholdsMarriedAge45to59 " + allHouseholdsMarriedAge45to59
                + ", allHouseholdsSingleAge45to59 " + allHouseholdsSingleAge45to59
                + ", maleHRPHouseholdsTotalAge45to59 " + maleHRPHouseholdsTotalAge45to59
                + ", maleHRPHouseholdsMarriedAge45to59 " + maleHRPHouseholdsMarriedAge45to59
                + ", maleHRPHouseholdsSingleAge45to59 " + maleHRPHouseholdsSingleAge45to59
                + ", femaleHRPHouseholdsTotalAge45to59 " + femaleHRPHouseholdsTotalAge45to59
                + ", femaleHRPHouseholdsMarriedAge45to59 " + femaleHRPHouseholdsMarriedAge45to59
                + ", femaleHRPHouseholdsSingleAge45to59 " + femaleHRPHouseholdsSingleAge45to59
                + ", allHouseholdsTotalAge60to64 " + allHouseholdsTotalAge60to64 
                + ", allHouseholdsMarriedAge60to64 " + allHouseholdsMarriedAge60to64
                + ", allHouseholdsSingleAge60to64 " + allHouseholdsSingleAge60to64 
                + ", maleHRPHouseholdsTotalAge60to64 " + maleHRPHouseholdsTotalAge60to64 
                + ", maleHRPHouseholdsMarriedAge60to64 " + maleHRPHouseholdsMarriedAge60to64
                + ", maleHRPHouseholdsSingleAge60to64 " + maleHRPHouseholdsSingleAge60to64
                + ", femaleHRPHouseholdsTotalAge60to64 " + femaleHRPHouseholdsTotalAge60to64
                + ", femaleHRPHouseholdsMarriedAge60to64 " + femaleHRPHouseholdsMarriedAge60to64
                + ", femaleHRPHouseholdsSingleAge60to64 " + femaleHRPHouseholdsSingleAge60to64 
                + ", allHouseholdsTotalAge65to74 " + allHouseholdsTotalAge65to74 
                + ", allHouseholdsMarriedAge65to74 " + allHouseholdsMarriedAge65to74 
                + ", allHouseholdsSingleAge65to74 " + allHouseholdsSingleAge65to74 
                + ", maleHRPHouseholdsTotalAge65to74 " + maleHRPHouseholdsTotalAge65to74
                + ", maleHRPHouseholdsMarriedAge65to74 " + maleHRPHouseholdsMarriedAge65to74
                + ", maleHRPHouseholdsSingleAge65to74 " + maleHRPHouseholdsSingleAge65to74
                + ", femaleHRPHouseholdsTotalAge65to74 " + femaleHRPHouseholdsTotalAge65to74 
                + ", femaleHRPHouseholdsMarriedAge65to74 " + femaleHRPHouseholdsMarriedAge65to74
                + ", femaleHRPHouseholdsSingleAge65to74 " + femaleHRPHouseholdsSingleAge65to74
                + ", allHouseholdsTotalAge75to84 " + allHouseholdsTotalAge75to84 
                + ", allHouseholdsMarriedAge75to84 " + allHouseholdsMarriedAge75to84
                + ", allHouseholdsSingleAge75to84 " + allHouseholdsSingleAge75to84 
                + ", maleHRPHouseholdsTotalAge75to84 " + maleHRPHouseholdsTotalAge75to84
                + ", maleHRPHouseholdsMarriedAge75to84 " + maleHRPHouseholdsMarriedAge75to84
                + ", maleHRPHouseholdsSingleAge75to84 " + maleHRPHouseholdsSingleAge75to84
                + ", femaleHRPHouseholdsTotalAge75to84 " + femaleHRPHouseholdsTotalAge75to84
                + ", femaleHRPHouseholdsMarriedAge75to84 " + femaleHRPHouseholdsMarriedAge75to84 
                + ", femaleHRPHouseholdsSingleAge75to84 " + femaleHRPHouseholdsSingleAge75to84
                + ", allHouseholdsTotalAge85AndOver " + allHouseholdsTotalAge85AndOver
                + ", allHouseholdsMarriedAge85AndOver " + allHouseholdsMarriedAge85AndOver
                + ", allHouseholdsSingleAge85AndOver " + allHouseholdsSingleAge85AndOver
                + ", maleHRPHouseholdsTotalAge85AndOver " + maleHRPHouseholdsTotalAge85AndOver
                + ", maleHRPHouseholdsMarriedAge85AndOver " + maleHRPHouseholdsMarriedAge85AndOver
                + ", maleHRPHouseholdsSingleAge85AndOver " + maleHRPHouseholdsSingleAge85AndOver
                + ", femaleHRPHouseholdsTotalAge85AndOver " + femaleHRPHouseholdsTotalAge85AndOver
                + ", femaleHRPHouseholdsMarriedAge85AndOver " + femaleHRPHouseholdsMarriedAge85AndOver
                + ", femaleHRPHouseholdsSingleAge85AndOver " + femaleHRPHouseholdsSingleAge85AndOver;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        String r = super.toCSV();
        r += "," + this.allHouseholdsTotal;
        r += "," + this.allHouseholdsMarried;
        r += "," + this.allHouseholdsSingle;
        r += "," + this.maleHRPHouseholdsTotal;
        r += "," + this.maleHRPHouseholdsMarried;
        r += "," + this.maleHRPHouseholdsSingle;
        r += "," + this.femaleHRPHouseholdsTotal;
        r += "," + this.femaleHRPHouseholdsMarried;
        r += "," + this.femaleHRPHouseholdsSingle;
        r += "," + this.allHouseholdsTotalAge19AndUnder;
        r += "," + this.allHouseholdsMarriedAge19AndUnder;
        r += "," + this.allHouseholdsSingleAge19AndUnder;
        r += "," + this.maleHRPHouseholdsTotalAge19AndUnder;
        r += "," + this.maleHRPHouseholdsMarriedAge19AndUnder;
        r += "," + this.maleHRPHouseholdsSingleAge19AndUnder;
        r += "," + this.femaleHRPHouseholdsTotalAge19AndUnder;
        r += "," + this.femaleHRPHouseholdsMarriedAge19AndUnder;
        r += "," + this.femaleHRPHouseholdsSingleAge19AndUnder;
        r += "," + this.allHouseholdsTotalAge20to24;
        r += "," + this.allHouseholdsMarriedAge20to24;
        r += "," + this.allHouseholdsSingleAge20to24;
        r += "," + this.maleHRPHouseholdsTotalAge20to24;
        r += "," + this.maleHRPHouseholdsMarriedAge20to24;
        r += "," + this.maleHRPHouseholdsSingleAge20to24;
        r += "," + this.femaleHRPHouseholdsTotalAge20to24;
        r += "," + this.femaleHRPHouseholdsMarriedAge20to24;
        r += "," + this.femaleHRPHouseholdsSingleAge20to24;
        r += "," + this.allHouseholdsTotalAge25to29;
        r += "," + this.allHouseholdsMarriedAge25to29;
        r += "," + this.allHouseholdsSingleAge25to29;
        r += "," + this.maleHRPHouseholdsTotalAge25to29;
        r += "," + this.maleHRPHouseholdsMarriedAge25to29;
        r += "," + this.maleHRPHouseholdsSingleAge25to29;
        r += "," + this.femaleHRPHouseholdsTotalAge25to29;
        r += "," + this.femaleHRPHouseholdsMarriedAge25to29;
        r += "," + this.femaleHRPHouseholdsSingleAge25to29;
        r += "," + this.allHouseholdsTotalAge30to44;
        r += "," + this.allHouseholdsMarriedAge30to44;
        r += "," + this.allHouseholdsSingleAge30to44;
        r += "," + this.maleHRPHouseholdsTotalAge30to44;
        r += "," + this.maleHRPHouseholdsMarriedAge30to44;
        r += "," + this.maleHRPHouseholdsSingleAge30to44;
        r += "," + this.femaleHRPHouseholdsTotalAge30to44;
        r += "," + this.femaleHRPHouseholdsMarriedAge30to44;
        r += "," + this.femaleHRPHouseholdsSingleAge30to44;
        r += "," + this.allHouseholdsTotalAge45to59;
        r += "," + this.allHouseholdsMarriedAge45to59;
        r += "," + this.allHouseholdsSingleAge45to59;
        r += "," + this.maleHRPHouseholdsTotalAge45to59;
        r += "," + this.maleHRPHouseholdsMarriedAge45to59;
        r += "," + this.maleHRPHouseholdsSingleAge45to59;
        r += "," + this.femaleHRPHouseholdsTotalAge45to59;
        r += "," + this.femaleHRPHouseholdsMarriedAge45to59;
        r += "," + this.femaleHRPHouseholdsSingleAge45to59;
        r += "," + this.allHouseholdsTotalAge60to64;
        r += "," + this.allHouseholdsMarriedAge60to64;
        r += "," + this.allHouseholdsSingleAge60to64;
        r += "," + this.maleHRPHouseholdsTotalAge60to64;
        r += "," + this.maleHRPHouseholdsMarriedAge60to64;
        r += "," + this.maleHRPHouseholdsSingleAge60to64;
        r += "," + this.femaleHRPHouseholdsTotalAge60to64;
        r += "," + this.femaleHRPHouseholdsMarriedAge60to64;
        r += "," + this.femaleHRPHouseholdsSingleAge60to64;
        r += "," + this.allHouseholdsTotalAge65to74;
        r += "," + this.allHouseholdsMarriedAge65to74;
        r += "," + this.allHouseholdsSingleAge65to74;
        r += "," + this.maleHRPHouseholdsTotalAge65to74;
        r += "," + this.maleHRPHouseholdsMarriedAge65to74;
        r += "," + this.maleHRPHouseholdsSingleAge65to74;
        r += "," + this.femaleHRPHouseholdsTotalAge65to74;
        r += "," + this.femaleHRPHouseholdsMarriedAge65to74;
        r += "," + this.femaleHRPHouseholdsSingleAge65to74;
        r += "," + this.allHouseholdsTotalAge75to84;
        r += "," + this.allHouseholdsMarriedAge75to84;
        r += "," + this.allHouseholdsSingleAge75to84;
        r += "," + this.maleHRPHouseholdsTotalAge75to84;
        r += "," + this.maleHRPHouseholdsMarriedAge75to84;
        r += "," + this.maleHRPHouseholdsSingleAge75to84;
        r += "," + this.femaleHRPHouseholdsTotalAge75to84;
        r += "," + this.femaleHRPHouseholdsMarriedAge75to84;
        r += "," + this.femaleHRPHouseholdsSingleAge75to84;
        r += "," + this.allHouseholdsTotalAge85AndOver;
        r += "," + this.allHouseholdsMarriedAge85AndOver;
        r += "," + this.allHouseholdsSingleAge85AndOver;
        r += "," + this.maleHRPHouseholdsTotalAge85AndOver;
        r += "," + this.maleHRPHouseholdsMarriedAge85AndOver;
        r += "," + this.maleHRPHouseholdsSingleAge85AndOver;
        r += "," + this.femaleHRPHouseholdsTotalAge85AndOver;
        r += "," + this.femaleHRPHouseholdsMarriedAge85AndOver;
        r += "," + this.femaleHRPHouseholdsSingleAge85AndOver;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        String r = super.toCSVHeader();
        r += ",allHouseholdsTotal";
        r += ",allHouseholdsMarried";
        r += ",allHouseholdsSingle";
        r += ",maleHRPHouseholdsTotal";
        r += ",maleHRPHouseholdsMarried";
        r += ",maleHRPHouseholdsSingle";
        r += ",femaleHRPHouseholdsTotal";
        r += ",femaleHRPHouseholdsMarried";
        r += ",femaleHRPHouseholdsSingle";
        r += ",allHouseholdsTotalAge19AndUnder";
        r += ",allHouseholdsMarriedAge19AndUnder";
        r += ",allHouseholdsSingleAge19AndUnder";
        r += ",maleHRPHouseholdsTotalAge19AndUnder";
        r += ",maleHRPHouseholdsMarriedAge19AndUnder";
        r += ",maleHRPHouseholdsSingleAge19AndUnder";
        r += ",femaleHRPHouseholdsTotalAge19AndUnder";
        r += ",femaleHRPHouseholdsMarriedAge19AndUnder";
        r += ",femaleHRPHouseholdsSingleAge19AndUnder";
        r += ",allHouseholdsTotalAge20to24";
        r += ",allHouseholdsMarriedAge20to24";
        r += ",allHouseholdsSingleAge20to24";
        r += ",maleHRPHouseholdsTotalAge20to24";
        r += ",maleHRPHouseholdsMarriedAge20to24";
        r += ",maleHRPHouseholdsSingleAge20to24";
        r += ",femaleHRPHouseholdsTotalAge20to24";
        r += ",femaleHRPHouseholdsMarriedAge20to24";
        r += ",femaleHRPHouseholdsSingleAge20to24";
        r += ",allHouseholdsTotalAge25to29";
        r += ",allHouseholdsMarriedAge25to29";
        r += ",allHouseholdsSingleAge25to29";
        r += ",maleHRPHouseholdsTotalAge25to29";
        r += ",maleHRPHouseholdsMarriedAge25to29";
        r += ",maleHRPHouseholdsSingleAge25to29";
        r += ",femaleHRPHouseholdsTotalAge25to29";
        r += ",femaleHRPHouseholdsMarriedAge25to29";
        r += ",femaleHRPHouseholdsSingleAge25to29";
        r += ",allHouseholdsTotalAge30to44";
        r += ",allHouseholdsMarriedAge30to44";
        r += ",allHouseholdsSingleAge30to44";
        r += ",maleHRPHouseholdsTotalAge30to44";
        r += ",maleHRPHouseholdsMarriedAge30to44";
        r += ",maleHRPHouseholdsSingleAge30to44";
        r += ",femaleHRPHouseholdsTotalAge30to44";
        r += ",femaleHRPHouseholdsMarriedAge30to44";
        r += ",femaleHRPHouseholdsSingleAge30to44";
        r += ",allHouseholdsTotalAge45to59";
        r += ",allHouseholdsMarriedAge45to59";
        r += ",allHouseholdsSingleAge45to59";
        r += ",maleHRPHouseholdsTotalAge45to59";
        r += ",maleHRPHouseholdsMarriedAge45to59";
        r += ",maleHRPHouseholdsSingleAge45to59";
        r += ",femaleHRPHouseholdsTotalAge45to59";
        r += ",femaleHRPHouseholdsMarriedAge45to59";
        r += ",femaleHRPHouseholdsSingleAge45to59";
        r += ",allHouseholdsTotalAge60to64";
        r += ",allHouseholdsMarriedAge60to64";
        r += ",allHouseholdsSingleAge60to64";
        r += ",maleHRPHouseholdsTotalAge60to64";
        r += ",maleHRPHouseholdsMarriedAge60to64";
        r += ",maleHRPHouseholdsSingleAge60to64";
        r += ",femaleHRPHouseholdsTotalAge60to64";
        r += ",femaleHRPHouseholdsMarriedAge60to64";
        r += ",femaleHRPHouseholdsSingleAge60to64";
        r += ",allHouseholdsTotalAge65to74";
        r += ",allHouseholdsMarriedAge65to74";
        r += ",allHouseholdsSingleAge65to74";
        r += ",maleHRPHouseholdsTotalAge65to74";
        r += ",maleHRPHouseholdsMarriedAge65to74";
        r += ",maleHRPHouseholdsSingleAge65to74";
        r += ",femaleHRPHouseholdsTotalAge65to74";
        r += ",femaleHRPHouseholdsMarriedAge65to74";
        r += ",femaleHRPHouseholdsSingleAge65to74";
        r += ",allHouseholdsTotalAge75to84";
        r += ",allHouseholdsMarriedAge75to84";
        r += ",allHouseholdsSingleAge75to84";
        r += ",maleHRPHouseholdsTotalAge75to84";
        r += ",maleHRPHouseholdsMarriedAge75to84";
        r += ",maleHRPHouseholdsSingleAge75to84";
        r += ",femaleHRPHouseholdsTotalAge75to84";
        r += ",femaleHRPHouseholdsMarriedAge75to84";
        r += ",femaleHRPHouseholdsSingleAge75to84";
        r += ",allHouseholdsTotalAge85AndOver";
        r += ",allHouseholdsMarriedAge85AndOver";
        r += ",allHouseholdsSingleAge85AndOver";
        r += ",maleHRPHouseholdsTotalAge85AndOver";
        r += ",maleHRPHouseholdsMarriedAge85AndOver";
        r += ",maleHRPHouseholdsSingleAge85AndOver";
        r += ",femaleHRPHouseholdsTotalAge85AndOver";
        r += ",femaleHRPHouseholdsMarriedAge85AndOver";
        r += ",femaleHRPHouseholdsSingleAge85AndOver";
        return r;
    }

    /**
     * Returns a copy of this.allHouseholdsTotal
     *
     * @return
     */
    public int getAllHouseholdsTotal() {
        return this.allHouseholdsTotal;
    }

    /**
     * Returns a copy of this.allHouseholdsMarried
     *
     * @return
     */
    public int getAllHouseholdsMarried() {
        return this.allHouseholdsMarried;
    }

    /**
     * Returns a copy of this.allHouseholdsSingle
     *
     * @return
     */
    public int getAllHouseholdsSingle() {
        return this.allHouseholdsSingle;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotal
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotal() {
        return this.maleHRPHouseholdsTotal;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarried
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarried() {
        return this.maleHRPHouseholdsMarried;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingle
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingle() {
        return this.maleHRPHouseholdsSingle;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotal
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotal() {
        return this.femaleHRPHouseholdsTotal;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarried
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarried() {
        return this.femaleHRPHouseholdsMarried;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingle
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingle() {
        return this.femaleHRPHouseholdsSingle;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge19AndUnder
     *
     * @return
     */
    public int getAllHouseholdsTotalAge19AndUnder() {
        return this.allHouseholdsTotalAge19AndUnder;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge19AndUnder
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge19AndUnder() {
        return this.allHouseholdsMarriedAge19AndUnder;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge19AndUnder
     *
     * @return
     */
    public int getAllHouseholdsSingleAge19AndUnder() {
        return this.allHouseholdsSingleAge19AndUnder;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge19AndUnder
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge19AndUnder() {
        return this.maleHRPHouseholdsTotalAge19AndUnder;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge19AndUnder
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge19AndUnder() {
        return this.maleHRPHouseholdsMarriedAge19AndUnder;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge19AndUnder
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge19AndUnder() {
        return this.maleHRPHouseholdsSingleAge19AndUnder;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge19AndUnder
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge19AndUnder() {
        return this.femaleHRPHouseholdsTotalAge19AndUnder;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge19AndUnder
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge19AndUnder() {
        return this.femaleHRPHouseholdsMarriedAge19AndUnder;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge19AndUnder
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge19AndUnder() {
        return this.femaleHRPHouseholdsSingleAge19AndUnder;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge20to24
     *
     * @return
     */
    public int getAllHouseholdsTotalAge20to24() {
        return this.allHouseholdsTotalAge20to24;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge20to24
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge20to24() {
        return this.allHouseholdsMarriedAge20to24;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge20to24
     *
     * @return
     */
    public int getAllHouseholdsSingleAge20to24() {
        return this.allHouseholdsSingleAge20to24;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge20to24
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge20to24() {
        return this.maleHRPHouseholdsTotalAge20to24;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge20to24
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge20to24() {
        return this.maleHRPHouseholdsMarriedAge20to24;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge20to24
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge20to24() {
        return this.maleHRPHouseholdsSingleAge20to24;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge20to24
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge20to24() {
        return this.femaleHRPHouseholdsTotalAge20to24;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge20to24
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge20to24() {
        return this.femaleHRPHouseholdsMarriedAge20to24;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge20to24
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge20to24() {
        return this.femaleHRPHouseholdsSingleAge20to24;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge25to29
     *
     * @return
     */
    public int getAllHouseholdsTotalAge25to29() {
        return this.allHouseholdsTotalAge25to29;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge25to29
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge25to29() {
        return this.allHouseholdsMarriedAge25to29;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge25to29
     *
     * @return
     */
    public int getAllHouseholdsSingleAge25to29() {
        return this.allHouseholdsSingleAge25to29;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge25to29
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge25to29() {
        return this.maleHRPHouseholdsTotalAge25to29;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge25to29
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge25to29() {
        return this.maleHRPHouseholdsMarriedAge25to29;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge25to29
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge25to29() {
        return this.maleHRPHouseholdsSingleAge25to29;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge25to29
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge25to29() {
        return this.femaleHRPHouseholdsTotalAge25to29;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge25to29
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge25to29() {
        return this.femaleHRPHouseholdsMarriedAge25to29;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge25to29
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge25to29() {
        return this.femaleHRPHouseholdsSingleAge25to29;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge30to44
     *
     * @return
     */
    public int getAllHouseholdsTotalAge30to44() {
        return this.allHouseholdsTotalAge30to44;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge30to44
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge30to44() {
        return this.allHouseholdsMarriedAge30to44;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge30to44
     *
     * @return
     */
    public int getAllHouseholdsSingleAge30to44() {
        return this.allHouseholdsSingleAge30to44;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge30to44
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge30to44() {
        return this.maleHRPHouseholdsTotalAge30to44;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge30to44
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge30to44() {
        return this.maleHRPHouseholdsMarriedAge30to44;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge30to44
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge30to44() {
        return this.maleHRPHouseholdsSingleAge30to44;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge30to44
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge30to44() {
        return this.femaleHRPHouseholdsTotalAge30to44;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge30to44
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge30to44() {
        return this.femaleHRPHouseholdsMarriedAge30to44;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge30to44
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge30to44() {
        return this.femaleHRPHouseholdsSingleAge30to44;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge45to59
     *
     * @return
     */
    public int getAllHouseholdsTotalAge45to59() {
        return this.allHouseholdsTotalAge45to59;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge45to59
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge45to59() {
        return this.allHouseholdsMarriedAge45to59;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge45to59
     *
     * @return
     */
    public int getAllHouseholdsSingleAge45to59() {
        return this.allHouseholdsSingleAge45to59;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge45to59
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge45to59() {
        return this.maleHRPHouseholdsTotalAge45to59;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge45to59
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge45to59() {
        return this.maleHRPHouseholdsMarriedAge45to59;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge45to59
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge45to59() {
        return this.maleHRPHouseholdsSingleAge45to59;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge45to59
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge45to59() {
        return this.femaleHRPHouseholdsTotalAge45to59;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge45to59
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge45to59() {
        return this.femaleHRPHouseholdsMarriedAge45to59;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge45to59
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge45to59() {
        return this.femaleHRPHouseholdsSingleAge45to59;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge60to64
     *
     * @return
     */
    public int getAllHouseholdsTotalAge60to64() {
        return this.allHouseholdsTotalAge60to64;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge60to64
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge60to64() {
        return this.allHouseholdsMarriedAge60to64;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge60to64
     *
     * @return
     */
    public int getAllHouseholdsSingleAge60to64() {
        return this.allHouseholdsSingleAge60to64;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge60to64
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge60to64() {
        return this.maleHRPHouseholdsTotalAge60to64;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge60to64
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge60to64() {
        return this.maleHRPHouseholdsMarriedAge60to64;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge60to64
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge60to64() {
        return this.maleHRPHouseholdsSingleAge60to64;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge60to64
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge60to64() {
        return this.femaleHRPHouseholdsTotalAge60to64;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge60to64
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge60to64() {
        return this.femaleHRPHouseholdsMarriedAge60to64;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge60to64
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge60to64() {
        return this.femaleHRPHouseholdsSingleAge60to64;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge65to74
     *
     * @return
     */
    public int getAllHouseholdsTotalAge65to74() {
        return this.allHouseholdsTotalAge65to74;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge65to74
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge65to74() {
        return this.allHouseholdsMarriedAge65to74;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge65to74
     *
     * @return
     */
    public int getAllHouseholdsSingleAge65to74() {
        return this.allHouseholdsSingleAge65to74;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge65to74
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge65to74() {
        return this.maleHRPHouseholdsTotalAge65to74;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge65to74
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge65to74() {
        return this.maleHRPHouseholdsMarriedAge65to74;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge65to74
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge65to74() {
        return this.maleHRPHouseholdsSingleAge65to74;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge65to74
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge65to74() {
        return this.femaleHRPHouseholdsTotalAge65to74;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge65to74
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge65to74() {
        return this.femaleHRPHouseholdsMarriedAge65to74;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge65to74
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge65to74() {
        return this.femaleHRPHouseholdsSingleAge65to74;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge75to84
     *
     * @return
     */
    public int getAllHouseholdsTotalAge75to84() {
        return this.allHouseholdsTotalAge75to84;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge75to84
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge75to84() {
        return this.allHouseholdsMarriedAge75to84;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge75to84
     *
     * @return
     */
    public int getAllHouseholdsSingleAge75to84() {
        return this.allHouseholdsSingleAge75to84;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge75to84
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge75to84() {
        return this.maleHRPHouseholdsTotalAge75to84;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge75to84
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge75to84() {
        return this.maleHRPHouseholdsMarriedAge75to84;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge75to84
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge75to84() {
        return this.maleHRPHouseholdsSingleAge75to84;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge75to84
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge75to84() {
        return this.femaleHRPHouseholdsTotalAge75to84;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge75to84
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge75to84() {
        return this.femaleHRPHouseholdsMarriedAge75to84;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge75to84
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge75to84() {
        return this.femaleHRPHouseholdsSingleAge75to84;
    }

    /**
     * Returns a copy of this.allHouseholdsTotalAge85AndOver
     *
     * @return
     */
    public int getAllHouseholdsTotalAge85AndOver() {
        return this.allHouseholdsTotalAge85AndOver;
    }

    /**
     * Returns a copy of this.allHouseholdsMarriedAge85AndOver
     *
     * @return
     */
    public int getAllHouseholdsMarriedAge85AndOver() {
        return this.allHouseholdsMarriedAge85AndOver;
    }

    /**
     * Returns a copy of this.allHouseholdsSingleAge85AndOver
     *
     * @return
     */
    public int getAllHouseholdsSingleAge85AndOver() {
        return this.allHouseholdsSingleAge85AndOver;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsTotalAge85AndOver
     *
     * @return
     */
    public int getMaleHRPHouseholdsTotalAge85AndOver() {
        return this.maleHRPHouseholdsTotalAge85AndOver;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsMarriedAge85AndOver
     *
     * @return
     */
    public int getMaleHRPHouseholdsMarriedAge85AndOver() {
        return this.maleHRPHouseholdsMarriedAge85AndOver;
    }

    /**
     * Returns a copy of this.maleHRPHouseholdsSingleAge85AndOver
     *
     * @return
     */
    public int getMaleHRPHouseholdsSingleAge85AndOver() {
        return this.maleHRPHouseholdsSingleAge85AndOver;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsTotalAge85AndOver
     *
     * @return
     */
    public int getFemaleHRPHouseholdsTotalAge85AndOver() {
        return this.femaleHRPHouseholdsTotalAge85AndOver;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsMarriedAge85AndOver
     *
     * @return
     */
    public int getFemaleHRPHouseholdsMarriedAge85AndOver() {
        return this.femaleHRPHouseholdsMarriedAge85AndOver;
    }

    /**
     * Returns a copy of this.femaleHRPHouseholdsSingleAge85AndOver
     *
     * @return
     */
    public int getFemaleHRPHouseholdsSingleAge85AndOver() {
        return this.femaleHRPHouseholdsSingleAge85AndOver;
    }
}
