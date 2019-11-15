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
package uk.ac.leeds.ccg.andyt.generic.data.census.data.cas;

import uk.ac.leeds.ccg.andyt.generic.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_RecordID;

/**
 * For storing a CAS001 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CAS001Record extends Census_AreaRecord {

    /*
     * Table CS001 Age by Sex and Resident Type: All People Footnotes and
     * Comments for Table CS001 1 Communal Establishment residents includes
     * staff and their families, other residents and people sleeping rough.
     */
    /**
     * CS0010001 = allPeople
     */
    protected int allPeople;
    /**
     * CS0010002 = householdResidentsMales
     */
    protected int householdResidentsMales;
    /**
     * CS0010003 = householdResidentsFemales
     */
    protected int householdResidentsFemales;
    /**
     * CS0010004 = communalEstablishmentResidentsMales
     */
    protected int communalEstablishmentResidentsMales;
    /**
     * CS0010005 = communalEstablishmentResidentsFemales
     */
    protected int communalEstablishmentResidentsFemales;
    /**
     * CS0010006 = allPeopleAge0to4
     */
    protected int allPeopleAge0to4;
    /**
     * CS0010007 = householdResidentsMalesAge0to4
     */
    protected int householdResidentsMalesAge0to4;
    /**
     * CS0010008 = householdResidentsFemalesAge0to4
     */
    protected int householdResidentsFemalesAge0to4;
    /**
     * CS0010009 = communalEstablishmentResidentsMalesAge0to4
     */
    protected int communalEstablishmentResidentsMalesAge0to4;
    /**
     * CS0010010 = communalEstablishmentResidentsFemalesAge0to4
     */
    protected int communalEstablishmentResidentsFemalesAge0to4;
    /**
     * CS0010011 = allPeopleAge0
     */
    protected int allPeopleAge0;
    /**
     * CS0010012 = householdResidentsMalesAge0
     */
    protected int householdResidentsMalesAge0;
    /**
     * CS0010013 = householdResidentsFemalesAge0
     */
    protected int householdResidentsFemalesAge0;
    /**
     * CS0010014 = communalEstablishmentResidentsMalesAge0
     */
    protected int communalEstablishmentResidentsMalesAge0;
    /**
     * CS0010015 = communalEstablishmentResidentsFemalesAge0
     */
    protected int communalEstablishmentResidentsFemalesAge0;
    /**
     * CS0010016 = allPeopleAge1
     */
    protected int allPeopleAge1;
    /**
     * CS0010017 = householdResidentsMalesAge1
     */
    protected int householdResidentsMalesAge1;
    /**
     * CS0010018 = householdResidentsFemalesAge1
     */
    protected int householdResidentsFemalesAge1;
    /**
     * CS0010019 = communalEstablishmentResidentsMalesAge1
     */
    protected int communalEstablishmentResidentsMalesAge1;
    /**
     * CS0010020 = communalEstablishmentResidentsFemalesAge1
     */
    protected int communalEstablishmentResidentsFemalesAge1;
    /**
     * CS0010021 = allPeopleAge2
     */
    protected int allPeopleAge2;
    /**
     * CS0010022 = householdResidentsMalesAge2
     */
    protected int householdResidentsMalesAge2;
    /**
     * CS0010023 = householdResidentsFemalesAge2
     */
    protected int householdResidentsFemalesAge2;
    /**
     * CS0010024 = communalEstablishmentResidentsMalesAge2
     */
    protected int communalEstablishmentResidentsMalesAge2;
    /**
     * CS0010025 = communalEstablishmentResidentsFemalesAge2
     */
    protected int communalEstablishmentResidentsFemalesAge2;
    /**
     * CS0010026 = allPeopleAge3
     */
    protected int allPeopleAge3;
    /**
     * CS0010027 = householdResidentsMalesAge3
     */
    protected int householdResidentsMalesAge3;
    /**
     * CS0010028 = householdResidentsFemalesAge3
     */
    protected int householdResidentsFemalesAge3;
    /**
     * CS0010029 = communalEstablishmentResidentsMalesAge3
     */
    protected int communalEstablishmentResidentsMalesAge3;
    /**
     * CS0010030 = communalEstablishmentResidentsFemalesAge3
     */
    protected int communalEstablishmentResidentsFemalesAge3;
    /**
     * CS0010031 = allPeopleAge4
     */
    protected int allPeopleAge4;
    /**
     * CS0010032 = householdResidentsMalesAge4
     */
    protected int householdResidentsMalesAge4;
    /**
     * CS0010033 = householdResidentsFemalesAge4
     */
    protected int householdResidentsFemalesAge4;
    /**
     * CS0010034 = communalEstablishmentResidentsMalesAge4
     */
    protected int communalEstablishmentResidentsMalesAge4;
    /**
     * CS0010035 = communalEstablishmentResidentsFemalesAge4
     */
    protected int communalEstablishmentResidentsFemalesAge4;
    /**
     * CS0010036 = allPeopleAge5to9
     */
    protected int allPeopleAge5to9;
    /**
     * CS0010037 = householdResidentsMalesAge5to9
     */
    protected int householdResidentsMalesAge5to9;
    /**
     * CS0010038 = householdResidentsFemalesAge5to9
     */
    protected int householdResidentsFemalesAge5to9;
    /**
     * CS0010039 = communalEstablishmentResidentsMalesAge5to9
     */
    protected int communalEstablishmentResidentsMalesAge5to9;
    /**
     * CS0010040 = communalEstablishmentResidentsFemalesAge5to9
     */
    protected int communalEstablishmentResidentsFemalesAge5to9;
    /**
     * CS0010041 = allPeopleAge5
     */
    protected int allPeopleAge5;
    /**
     * CS0010042 = householdResidentsMalesAge5
     */
    protected int householdResidentsMalesAge5;
    /**
     * CS0010043 = householdResidentsFemalesAge5
     */
    protected int householdResidentsFemalesAge5;
    /**
     * CS0010044 = communalEstablishmentResidentsMalesAge5
     */
    protected int communalEstablishmentResidentsMalesAge5;
    /**
     * CS0010045 = communalEstablishmentResidentsFemalesAge5
     */
    protected int communalEstablishmentResidentsFemalesAge5;
    /**
     * CS0010046 = allPeopleAge6
     */
    protected int allPeopleAge6;
    /**
     * CS0010047 = householdResidentsMalesAge6
     */
    protected int householdResidentsMalesAge6;
    /**
     * CS0010048 = householdResidentsFemalesAge6
     */
    protected int householdResidentsFemalesAge6;
    /**
     * CS0010049 = communalEstablishmentResidentsMalesAge6
     */
    protected int communalEstablishmentResidentsMalesAge6;
    /**
     * CS0010050 = communalEstablishmentResidentsFemalesAge6
     */
    protected int communalEstablishmentResidentsFemalesAge6;
    /**
     * CS0010051 = allPeopleAge7
     */
    protected int allPeopleAge7;
    /**
     * CS0010052 = householdResidentsMalesAge7
     */
    protected int householdResidentsMalesAge7;
    /**
     * CS0010053 = householdResidentsFemalesAge7
     */
    protected int householdResidentsFemalesAge7;
    /**
     * CS0010054 = communalEstablishmentResidentsMalesAge7
     */
    protected int communalEstablishmentResidentsMalesAge7;
    /**
     * CS0010055 = communalEstablishmentResidentsFemalesAge7
     */
    protected int communalEstablishmentResidentsFemalesAge7;
    /**
     * CS0010056 = allPeopleAge8
     */
    protected int allPeopleAge8;
    /**
     * CS0010057 = householdResidentsMalesAge8
     */
    protected int householdResidentsMalesAge8;
    /**
     * CS0010058 = householdResidentsFemalesAge8
     */
    protected int householdResidentsFemalesAge8;
    /**
     * CS0010059 = communalEstablishmentResidentsMalesAge8
     */
    protected int communalEstablishmentResidentsMalesAge8;
    /**
     * CS0010060 = communalEstablishmentResidentsFemalesAge8
     */
    protected int communalEstablishmentResidentsFemalesAge8;
    /**
     * CS0010061 = allPeopleAge9
     */
    protected int allPeopleAge9;
    /**
     * CS0010062 = householdResidentsMalesAge9
     */
    protected int householdResidentsMalesAge9;
    /**
     * CS0010063 = householdResidentsFemalesAge9
     */
    protected int householdResidentsFemalesAge9;
    /**
     * CS0010064 = communalEstablishmentResidentsMalesAge9
     */
    protected int communalEstablishmentResidentsMalesAge9;
    /**
     * CS0010065 = communalEstablishmentResidentsFemalesAge9
     */
    protected int communalEstablishmentResidentsFemalesAge9;
    /**
     * CS0010066 = allPeopleAge10to14
     */
    protected int allPeopleAge10to14;
    /**
     * CS0010067 = householdResidentsMalesAge10to14
     */
    protected int householdResidentsMalesAge10to14;
    /**
     * CS0010068 = householdResidentsFemalesAge10to14
     */
    protected int householdResidentsFemalesAge10to14;
    /**
     * CS0010069 = communalEstablishmentResidentsMalesAge10to14
     */
    protected int communalEstablishmentResidentsMalesAge10to14;
    /**
     * CS0010070 = communalEstablishmentResidentsFemalesAge10to14
     */
    protected int communalEstablishmentResidentsFemalesAge10to14;
    /**
     * CS0010071 = allPeopleAge10
     */
    protected int allPeopleAge10;
    /**
     * CS0010072 = householdResidentsMalesAge10
     */
    protected int householdResidentsMalesAge10;
    /**
     * CS0010073 = householdResidentsFemalesAge10
     */
    protected int householdResidentsFemalesAge10;
    /**
     * CS0010074 = communalEstablishmentResidentsMalesAge10
     */
    protected int communalEstablishmentResidentsMalesAge10;
    /**
     * CS0010075 = communalEstablishmentResidentsFemalesAge10
     */
    protected int communalEstablishmentResidentsFemalesAge10;
    /**
     * CS0010076 = allPeopleAge11
     */
    protected int allPeopleAge11;
    /**
     * CS0010077 = householdResidentsMalesAge11
     */
    protected int householdResidentsMalesAge11;
    /**
     * CS0010078 = householdResidentsFemalesAge11
     */
    protected int householdResidentsFemalesAge11;
    /**
     * CS0010079 = communalEstablishmentResidentsMalesAge11
     */
    protected int communalEstablishmentResidentsMalesAge11;
    /**
     * CS0010080 = communalEstablishmentResidentsFemalesAge11
     */
    protected int communalEstablishmentResidentsFemalesAge11;
    /**
     * CS0010081 = allPeopleAge12
     */
    protected int allPeopleAge12;
    /**
     * CS0010082 = householdResidentsMalesAge12
     */
    protected int householdResidentsMalesAge12;
    /**
     * CS0010083 = householdResidentsFemalesAge12
     */
    protected int householdResidentsFemalesAge12;
    /**
     * CS0010084 = communalEstablishmentResidentsMalesAge12
     */
    protected int communalEstablishmentResidentsMalesAge12;
    /**
     * CS0010085 = communalEstablishmentResidentsFemalesAge12
     */
    protected int communalEstablishmentResidentsFemalesAge12;
    /**
     * CS0010086 = allPeopleAge13
     */
    protected int allPeopleAge13;
    /**
     * CS0010087 = householdResidentsMalesAge13
     */
    protected int householdResidentsMalesAge13;
    /**
     * CS0010088 = householdResidentsFemalesAge13
     */
    protected int householdResidentsFemalesAge13;
    /**
     * CS0010089 = communalEstablishmentResidentsMalesAge13
     */
    protected int communalEstablishmentResidentsMalesAge13;
    /**
     * CS0010090 = communalEstablishmentResidentsFemalesAge13
     */
    protected int communalEstablishmentResidentsFemalesAge13;
    /**
     * CS0010091 = allPeopleAge14
     */
    protected int allPeopleAge14;
    /**
     * CS0010092 = householdResidentsMalesAge14
     */
    protected int householdResidentsMalesAge14;
    /**
     * CS0010093 = householdResidentsFemalesAge14
     */
    protected int householdResidentsFemalesAge14;
    /**
     * CS0010094 = communalEstablishmentResidentsMalesAge14
     */
    protected int communalEstablishmentResidentsMalesAge14;
    /**
     * CS0010095 = communalEstablishmentResidentsFemalesAge14
     */
    protected int communalEstablishmentResidentsFemalesAge14;
    /**
     * CS0010096 = allPeopleAge15to19
     */
    protected int allPeopleAge15to19;
    /**
     * CS0010097 = householdResidentsMalesAge15to19
     */
    protected int householdResidentsMalesAge15to19;
    /**
     * CS0010098 = householdResidentsFemalesAge15to19
     */
    protected int householdResidentsFemalesAge15to19;
    /**
     * CS0010099 = communalEstablishmentResidentsMalesAge15to19
     */
    protected int communalEstablishmentResidentsMalesAge15to19;
    /**
     * CS0010100 = communalEstablishmentResidentsFemalesAge15to19
     */
    protected int communalEstablishmentResidentsFemalesAge15to19;
    /**
     * CS0010101 = allPeopleAge15
     */
    protected int allPeopleAge15;
    /**
     * CS0010102 = householdResidentsMalesAge15
     */
    protected int householdResidentsMalesAge15;
    /**
     * CS0010103 = householdResidentsFemalesAge15
     */
    protected int householdResidentsFemalesAge15;
    /**
     * CS0010104 = communalEstablishmentResidentsMalesAge15
     */
    protected int communalEstablishmentResidentsMalesAge15;
    /**
     * CS0010105 = communalEstablishmentResidentsFemalesAge15
     */
    protected int communalEstablishmentResidentsFemalesAge15;
    /**
     * CS0010106 = allPeopleAge16
     */
    protected int allPeopleAge16;
    /**
     * CS0010107 = householdResidentsMalesAge16
     */
    protected int householdResidentsMalesAge16;
    /**
     * CS0010108 = householdResidentsFemalesAge16
     */
    protected int householdResidentsFemalesAge16;
    /**
     * CS0010109 = communalEstablishmentResidentsMalesAge16
     */
    protected int communalEstablishmentResidentsMalesAge16;
    /**
     * CS0010110 = communalEstablishmentResidentsFemalesAge16
     */
    protected int communalEstablishmentResidentsFemalesAge16;
    /**
     * CS0010111 = allPeopleAge17
     */
    protected int allPeopleAge17;
    /**
     * CS0010112 = householdResidentsMalesAge17
     */
    protected int householdResidentsMalesAge17;
    /**
     * CS0010113 = householdResidentsFemalesAge17
     */
    protected int householdResidentsFemalesAge17;
    /**
     * CS0010114 = communalEstablishmentResidentsMalesAge17
     */
    protected int communalEstablishmentResidentsMalesAge17;
    /**
     * CS0010115 = communalEstablishmentResidentsFemalesAge17
     */
    protected int communalEstablishmentResidentsFemalesAge17;
    /**
     * CS0010116 = allPeopleAge18
     */
    protected int allPeopleAge18;
    /**
     * CS0010117 = householdResidentsMalesAge18
     */
    protected int householdResidentsMalesAge18;
    /**
     * CS0010118 = householdResidentsFemalesAge18
     */
    protected int householdResidentsFemalesAge18;
    /**
     * CS0010119 = communalEstablishmentResidentsMalesAge18
     */
    protected int communalEstablishmentResidentsMalesAge18;
    /**
     * CS0010120 = communalEstablishmentResidentsFemalesAge18
     */
    protected int communalEstablishmentResidentsFemalesAge18;
    /**
     * CS0010121 = allPeopleAge19
     */
    protected int allPeopleAge19;
    /**
     * CS0010122 = householdResidentsMalesAge19
     */
    protected int householdResidentsMalesAge19;
    /**
     * CS0010123 = householdResidentsFemalesAge19
     */
    protected int householdResidentsFemalesAge19;
    /**
     * CS0010124 = communalEstablishmentResidentsMalesAge19
     */
    protected int communalEstablishmentResidentsMalesAge19;
    /**
     * CS0010125 = communalEstablishmentResidentsFemalesAge19
     */
    protected int communalEstablishmentResidentsFemalesAge19;
    /**
     * CS0010126 = allPeopleAge20to24
     */
    protected int allPeopleAge20to24;
    /**
     * CS0010127 = householdResidentsMalesAge20to24
     */
    protected int householdResidentsMalesAge20to24;
    /**
     * CS0010128 = householdResidentsFemalesAge20to24
     */
    protected int householdResidentsFemalesAge20to24;
    /**
     * CS0010129 = communalEstablishmentResidentsMalesAge20to24
     */
    protected int communalEstablishmentResidentsMalesAge20to24;
    /**
     * CS0010130 = communalEstablishmentResidentsFemalesAge20to24
     */
    protected int communalEstablishmentResidentsFemalesAge20to24;
    /**
     * CS0010131 = allPeopleAge20
     */
    protected int allPeopleAge20;
    /**
     * CS0010132 = householdResidentsMalesAge20
     */
    protected int householdResidentsMalesAge20;
    /**
     * CS0010133 = householdResidentsFemalesAge20
     */
    protected int householdResidentsFemalesAge20;
    /**
     * CS0010134 = communalEstablishmentResidentsMalesAge20
     */
    protected int communalEstablishmentResidentsMalesAge20;
    /**
     * CS0010135 = communalEstablishmentResidentsFemalesAge20
     */
    protected int communalEstablishmentResidentsFemalesAge20;
    /**
     * CS0010136 = allPeopleAge21
     */
    protected int allPeopleAge21;
    /**
     * CS0010137 = householdResidentsMalesAge21
     */
    protected int householdResidentsMalesAge21;
    /**
     * CS0010138 = householdResidentsFemalesAge21
     */
    protected int householdResidentsFemalesAge21;
    /**
     * CS0010139 = communalEstablishmentResidentsMalesAge21
     */
    protected int communalEstablishmentResidentsMalesAge21;
    /**
     * CS0010140 = communalEstablishmentResidentsFemalesAge21
     */
    protected int communalEstablishmentResidentsFemalesAge21;
    /**
     * CS0010141 = allPeopleAge22
     */
    protected int allPeopleAge22;
    /**
     * CS0010142 = householdResidentsMalesAge22
     */
    protected int householdResidentsMalesAge22;
    /**
     * CS0010143 = householdResidentsFemalesAge22
     */
    protected int householdResidentsFemalesAge22;
    /**
     * CS0010144 = communalEstablishmentResidentsMalesAge22
     */
    protected int communalEstablishmentResidentsMalesAge22;
    /**
     * CS0010145 = communalEstablishmentResidentsFemalesAge22
     */
    protected int communalEstablishmentResidentsFemalesAge22;
    /**
     * CS0010146 = allPeopleAge23
     */
    protected int allPeopleAge23;
    /**
     * CS0010147 = householdResidentsMalesAge23
     */
    protected int householdResidentsMalesAge23;
    /**
     * CS0010148 = householdResidentsFemalesAge23
     */
    protected int householdResidentsFemalesAge23;
    /**
     * CS0010149 = communalEstablishmentResidentsMalesAge23
     */
    protected int communalEstablishmentResidentsMalesAge23;
    /**
     * CS0010150 = communalEstablishmentResidentsFemalesAge23
     */
    protected int communalEstablishmentResidentsFemalesAge23;
    /**
     * CS0010151 = allPeopleAge24
     */
    protected int allPeopleAge24;
    /**
     * CS0010152 = householdResidentsMalesAge24
     */
    protected int householdResidentsMalesAge24;
    /**
     * CS0010153 = householdResidentsFemalesAge24
     */
    protected int householdResidentsFemalesAge24;
    /**
     * CS0010154 = communalEstablishmentResidentsMalesAge24
     */
    protected int communalEstablishmentResidentsMalesAge24;
    /**
     * CS0010155 = communalEstablishmentResidentsFemalesAge24
     */
    protected int communalEstablishmentResidentsFemalesAge24;
    /**
     * CS0010156 = allPeopleAge25to29
     */
    protected int allPeopleAge25to29;
    /**
     * CS0010157 = householdResidentsMalesAge25to29
     */
    protected int householdResidentsMalesAge25to29;
    /**
     * CS0010158 = householdResidentsFemalesAge25to29
     */
    protected int householdResidentsFemalesAge25to29;
    /**
     * CS0010159 = communalEstablishmentResidentsMalesAge25to29
     */
    protected int communalEstablishmentResidentsMalesAge25to29;
    /**
     * CS0010160 = communalEstablishmentResidentsFemalesAge25to29
     */
    protected int communalEstablishmentResidentsFemalesAge25to29;
    /**
     * CS0010161 = allPeopleAge30to34
     */
    protected int allPeopleAge30to34;
    /**
     * CS0010162 = householdResidentsMalesAge30to34
     */
    protected int householdResidentsMalesAge30to34;
    /**
     * CS0010163 = householdResidentsFemalesAge30to34
     */
    protected int householdResidentsFemalesAge30to34;
    /**
     * CS0010164 = communalEstablishmentResidentsMalesAge30to34
     */
    protected int communalEstablishmentResidentsMalesAge30to34;
    /**
     * CS0010165 = communalEstablishmentResidentsFemalesAge30to34
     */
    protected int communalEstablishmentResidentsFemalesAge30to34;
    /**
     * CS0010166 = allPeopleAge35to39
     */
    protected int allPeopleAge35to39;
    /**
     * CS0010167 = householdResidentsMalesAge35to39
     */
    protected int householdResidentsMalesAge35to39;
    /**
     * CS0010168 = householdResidentsFemalesAge35to39
     */
    protected int householdResidentsFemalesAge35to39;
    /**
     * CS0010169 = communalEstablishmentResidentsMalesAge35to39
     */
    protected int communalEstablishmentResidentsMalesAge35to39;
    /**
     * CS0010170 = communalEstablishmentResidentsFemalesAge35to39
     */
    protected int communalEstablishmentResidentsFemalesAge35to39;
    /**
     * CS0010171 = allPeopleAge40to44
     */
    protected int allPeopleAge40to44;
    /**
     * CS0010172 = householdResidentsMalesAge40to44
     */
    protected int householdResidentsMalesAge40to44;
    /**
     * CS0010173 = householdResidentsFemalesAge40to44
     */
    protected int householdResidentsFemalesAge40to44;
    /**
     * CS0010174 = communalEstablishmentResidentsMalesAge40to44
     */
    protected int communalEstablishmentResidentsMalesAge40to44;
    /**
     * CS0010175 = communalEstablishmentResidentsFemalesAge40to44
     */
    protected int communalEstablishmentResidentsFemalesAge40to44;
    /**
     * CS0010176 = allPeopleAge45to49
     */
    protected int allPeopleAge45to49;
    /**
     * CS0010177 = householdResidentsMalesAge45to49
     */
    protected int householdResidentsMalesAge45to49;
    /**
     * CS0010178 = householdResidentsFemalesAge45to49
     */
    protected int householdResidentsFemalesAge45to49;
    /**
     * CS0010179 = communalEstablishmentResidentsMalesAge45to49
     */
    protected int communalEstablishmentResidentsMalesAge45to49;
    /**
     * CS0010180 = communalEstablishmentResidentsFemalesAge45to49
     */
    protected int communalEstablishmentResidentsFemalesAge45to49;
    /**
     * CS0010181 = allPeopleAge50to54
     */
    protected int allPeopleAge50to54;
    /**
     * CS0010182 = householdResidentsMalesAge50to54
     */
    protected int householdResidentsMalesAge50to54;
    /**
     * CS0010183 = householdResidentsFemalesAge50to54
     */
    protected int householdResidentsFemalesAge50to54;
    /**
     * CS0010184 = communalEstablishmentResidentsMalesAge50to54
     */
    protected int communalEstablishmentResidentsMalesAge50to54;
    /**
     * CS0010185 = communalEstablishmentResidentsFemalesAge50to54
     */
    protected int communalEstablishmentResidentsFemalesAge50to54;
    /**
     * CS0010186 = allPeopleAge55to59
     */
    protected int allPeopleAge55to59;
    /**
     * CS0010187 = householdResidentsMalesAge55to59
     */
    protected int householdResidentsMalesAge55to59;
    /**
     * CS0010188 = householdResidentsFemalesAge55to59
     */
    protected int householdResidentsFemalesAge55to59;
    /**
     * CS0010189 = communalEstablishmentResidentsMalesAge55to59
     */
    protected int communalEstablishmentResidentsMalesAge55to59;
    /**
     * CS0010190 = communalEstablishmentResidentsFemalesAge55to59
     */
    protected int communalEstablishmentResidentsFemalesAge55to59;
    /**
     * CS0010191 = allPeopleAge60to64
     */
    protected int allPeopleAge60to64;
    /**
     * CS0010192 = householdResidentsMalesAge60to64
     */
    protected int householdResidentsMalesAge60to64;
    /**
     * CS0010193 = householdResidentsFemalesAge60to64
     */
    protected int householdResidentsFemalesAge60to64;
    /**
     * CS0010194 = communalEstablishmentResidentsMalesAge60to64
     */
    protected int communalEstablishmentResidentsMalesAge60to64;
    /**
     * CS0010195 = communalEstablishmentResidentsFemalesAge60to64
     */
    protected int communalEstablishmentResidentsFemalesAge60to64;
    /**
     * CS0010196 = allPeopleAge65to69
     */
    protected int allPeopleAge65to69;
    /**
     * CS0010197 = householdResidentsMalesAge65to69
     */
    protected int householdResidentsMalesAge65to69;
    /**
     * CS0010198 = householdResidentsFemalesAge65to69
     */
    protected int householdResidentsFemalesAge65to69;
    /**
     * CS0010199 = communalEstablishmentResidentsMalesAge65to69
     */
    protected int communalEstablishmentResidentsMalesAge65to69;
    /**
     * CS0010200 = communalEstablishmentResidentsFemalesAge65to69
     */
    protected int communalEstablishmentResidentsFemalesAge65to69;
    /**
     * CS0010201 = allPeopleAge70to74
     */
    protected int allPeopleAge70to74;
    /**
     * CS0010202 = householdResidentsMalesAge70to74
     */
    protected int householdResidentsMalesAge70to74;
    /**
     * CS0010203 = householdResidentsFemalesAge70to74
     */
    protected int householdResidentsFemalesAge70to74;
    /**
     * CS0010204 = communalEstablishmentResidentsMalesAge70to74
     */
    protected int communalEstablishmentResidentsMalesAge70to74;
    /**
     * CS0010205 = communalEstablishmentResidentsFemalesAge70to74
     */
    protected int communalEstablishmentResidentsFemalesAge70to74;
    /**
     * CS0010206 = allPeopleAge75to79
     */
    protected int allPeopleAge75to79;
    /**
     * CS0010207 = householdResidentsMalesAge75to79
     */
    protected int householdResidentsMalesAge75to79;
    /**
     * CS0010208 = householdResidentsFemalesAge75to79
     */
    protected int householdResidentsFemalesAge75to79;
    /**
     * CS0010209 = communalEstablishmentResidentsMalesAge75to79
     */
    protected int communalEstablishmentResidentsMalesAge75to79;
    /**
     * CS0010210 = communalEstablishmentResidentsFemalesAge75to79
     */
    protected int communalEstablishmentResidentsFemalesAge75to79;
    /**
     * CS0010211 = allPeopleAge80to84
     */
    protected int allPeopleAge80to84;
    /**
     * CS0010212 = householdResidentsMalesAge80to84
     */
    protected int householdResidentsMalesAge80to84;
    /**
     * CS0010213 = householdResidentsFemalesAge80to84
     */
    protected int householdResidentsFemalesAge80to84;
    /**
     * CS0010214 = communalEstablishmentResidentsMalesAge80to84
     */
    protected int communalEstablishmentResidentsMalesAge80to84;
    /**
     * CS0010215 = communalEstablishmentResidentsFemalesAge80to84
     */
    protected int communalEstablishmentResidentsFemalesAge80to84;
    /**
     * CS0010216 = allPeopleAge85to89
     */
    protected int allPeopleAge85to89;
    /**
     * CS0010217 = householdResidentsMalesAge85to89
     */
    protected int householdResidentsMalesAge85to89;
    /**
     * CS0010218 = householdResidentsFemalesAge85to89
     */
    protected int householdResidentsFemalesAge85to89;
    /**
     * CS0010219 = communalEstablishmentResidentsMalesAge85to89
     */
    protected int communalEstablishmentResidentsMalesAge85to89;
    /**
     * CS0010220 = communalEstablishmentResidentsFemalesAge85to89
     */
    protected int communalEstablishmentResidentsFemalesAge85to89;
    /**
     * CS0010221 = allPeopleAge90AndOver
     */
    protected int allPeopleAge90AndOver;
    /**
     * CS0010222 = householdResidentsMalesAge90AndOver
     */
    protected int householdResidentsMalesAge90AndOver;
    /**
     * CS0010223 = householdResidentsFemalesAge90AndOver
     */
    protected int householdResidentsFemalesAge90AndOver;
    /**
     * CS0010224 = communalEstablishmentResidentsMalesAge90AndOver
     */
    protected int communalEstablishmentResidentsMalesAge90AndOver;
    /**
     * CS0010225 = communalEstablishmentResidentsFemalesAge90AndOver
     */
    protected int communalEstablishmentResidentsFemalesAge90AndOver;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CAS001Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CAS001Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fields = line.split(",");
        this.zoneCode = fields[0].substring(1, 11);
        // From Table CAS001
        this.allPeople = Integer.valueOf(fields[1]);
        this.householdResidentsMales = Integer.valueOf(fields[2]);
        this.householdResidentsFemales = Integer.valueOf(fields[3]);
        this.communalEstablishmentResidentsMales = Integer.valueOf(fields[4]);
        this.communalEstablishmentResidentsFemales = Integer.valueOf(fields[5]);
        this.allPeopleAge0to4 = Integer.valueOf(fields[6]);
        this.householdResidentsMalesAge0to4 = Integer.valueOf(fields[7]);
        this.householdResidentsFemalesAge0to4 = Integer.valueOf(fields[8]);
        this.communalEstablishmentResidentsMalesAge0to4 = Integer.valueOf(fields[9]);
        this.communalEstablishmentResidentsFemalesAge0to4 = Integer.valueOf(fields[10]);
        this.allPeopleAge0 = Integer.valueOf(fields[11]);
        this.householdResidentsMalesAge0 = Integer.valueOf(fields[12]);
        this.householdResidentsFemalesAge0 = Integer.valueOf(fields[13]);
        this.communalEstablishmentResidentsMalesAge0 = Integer.valueOf(fields[14]);
        this.communalEstablishmentResidentsFemalesAge0 = Integer.valueOf(fields[15]);
        this.allPeopleAge1 = Integer.valueOf(fields[16]);
        this.householdResidentsMalesAge1 = Integer.valueOf(fields[17]);
        this.householdResidentsFemalesAge1 = Integer.valueOf(fields[18]);
        this.communalEstablishmentResidentsMalesAge1 = Integer.valueOf(fields[19]);
        this.communalEstablishmentResidentsFemalesAge1 = Integer.valueOf(fields[20]);
        this.allPeopleAge2 = Integer.valueOf(fields[21]);
        this.householdResidentsMalesAge2 = Integer.valueOf(fields[22]);
        this.householdResidentsFemalesAge2 = Integer.valueOf(fields[23]);
        this.communalEstablishmentResidentsMalesAge2 = Integer.valueOf(fields[24]);
        this.communalEstablishmentResidentsFemalesAge2 = Integer.valueOf(fields[25]);
        this.allPeopleAge3 = Integer.valueOf(fields[26]);
        this.householdResidentsMalesAge3 = Integer.valueOf(fields[27]);
        this.householdResidentsFemalesAge3 = Integer.valueOf(fields[28]);
        this.communalEstablishmentResidentsMalesAge3 = Integer.valueOf(fields[29]);
        this.communalEstablishmentResidentsFemalesAge3 = Integer.valueOf(fields[30]);
        this.allPeopleAge4 = Integer.valueOf(fields[31]);
        this.householdResidentsMalesAge4 = Integer.valueOf(fields[32]);
        this.householdResidentsFemalesAge4 = Integer.valueOf(fields[33]);
        this.communalEstablishmentResidentsMalesAge4 = Integer.valueOf(fields[34]);
        this.communalEstablishmentResidentsFemalesAge4 = Integer.valueOf(fields[35]);
        this.allPeopleAge5to9 = Integer.valueOf(fields[36]);
        this.householdResidentsMalesAge5to9 = Integer.valueOf(fields[37]);
        this.householdResidentsFemalesAge5to9 = Integer.valueOf(fields[38]);
        this.communalEstablishmentResidentsMalesAge5to9 = Integer.valueOf(fields[39]);
        this.communalEstablishmentResidentsFemalesAge5to9 = Integer.valueOf(fields[40]);
        this.allPeopleAge5 = Integer.valueOf(fields[41]);
        this.householdResidentsMalesAge5 = Integer.valueOf(fields[42]);
        this.householdResidentsFemalesAge5 = Integer.valueOf(fields[43]);
        this.communalEstablishmentResidentsMalesAge5 = Integer.valueOf(fields[44]);
        this.communalEstablishmentResidentsFemalesAge5 = Integer.valueOf(fields[45]);
        this.allPeopleAge6 = Integer.valueOf(fields[46]);
        this.householdResidentsMalesAge6 = Integer.valueOf(fields[47]);
        this.householdResidentsFemalesAge6 = Integer.valueOf(fields[48]);
        this.communalEstablishmentResidentsMalesAge6 = Integer.valueOf(fields[49]);
        this.communalEstablishmentResidentsFemalesAge6 = Integer.valueOf(fields[50]);
        this.allPeopleAge7 = Integer.valueOf(fields[51]);
        this.householdResidentsMalesAge7 = Integer.valueOf(fields[52]);
        this.householdResidentsFemalesAge7 = Integer.valueOf(fields[53]);
        this.communalEstablishmentResidentsMalesAge7 = Integer.valueOf(fields[54]);
        this.communalEstablishmentResidentsFemalesAge7 = Integer.valueOf(fields[55]);
        this.allPeopleAge8 = Integer.valueOf(fields[56]);
        this.householdResidentsMalesAge8 = Integer.valueOf(fields[57]);
        this.householdResidentsFemalesAge8 = Integer.valueOf(fields[58]);
        this.communalEstablishmentResidentsMalesAge8 = Integer.valueOf(fields[59]);
        this.communalEstablishmentResidentsFemalesAge8 = Integer.valueOf(fields[60]);
        this.allPeopleAge9 = Integer.valueOf(fields[61]);
        this.householdResidentsMalesAge9 = Integer.valueOf(fields[62]);
        this.householdResidentsFemalesAge9 = Integer.valueOf(fields[63]);
        this.communalEstablishmentResidentsMalesAge9 = Integer.valueOf(fields[64]);
        this.communalEstablishmentResidentsFemalesAge9 = Integer.valueOf(fields[65]);
        this.allPeopleAge10to14 = Integer.valueOf(fields[66]);
        this.householdResidentsMalesAge10to14 = Integer.valueOf(fields[67]);
        this.householdResidentsFemalesAge10to14 = Integer.valueOf(fields[68]);
        this.communalEstablishmentResidentsMalesAge10to14 = Integer.valueOf(fields[69]);
        this.communalEstablishmentResidentsFemalesAge10to14 = Integer.valueOf(fields[70]);
        this.allPeopleAge10 = Integer.valueOf(fields[71]);
        this.householdResidentsMalesAge10 = Integer.valueOf(fields[72]);
        this.householdResidentsFemalesAge10 = Integer.valueOf(fields[73]);
        this.communalEstablishmentResidentsMalesAge10 = Integer.valueOf(fields[74]);
        this.communalEstablishmentResidentsFemalesAge10 = Integer.valueOf(fields[75]);
        this.allPeopleAge11 = Integer.valueOf(fields[76]);
        this.householdResidentsMalesAge11 = Integer.valueOf(fields[77]);
        this.householdResidentsFemalesAge11 = Integer.valueOf(fields[78]);
        this.communalEstablishmentResidentsMalesAge11 = Integer.valueOf(fields[79]);
        this.communalEstablishmentResidentsFemalesAge11 = Integer.valueOf(fields[80]);
        this.allPeopleAge12 = Integer.valueOf(fields[81]);
        this.householdResidentsMalesAge12 = Integer.valueOf(fields[82]);
        this.householdResidentsFemalesAge12 = Integer.valueOf(fields[83]);
        this.communalEstablishmentResidentsMalesAge12 = Integer.valueOf(fields[84]);
        this.communalEstablishmentResidentsFemalesAge12 = Integer.valueOf(fields[85]);
        this.allPeopleAge13 = Integer.valueOf(fields[86]);
        this.householdResidentsMalesAge13 = Integer.valueOf(fields[87]);
        this.householdResidentsFemalesAge13 = Integer.valueOf(fields[88]);
        this.communalEstablishmentResidentsMalesAge13 = Integer.valueOf(fields[89]);
        this.communalEstablishmentResidentsFemalesAge13 = Integer.valueOf(fields[90]);
        this.allPeopleAge14 = Integer.valueOf(fields[91]);
        this.householdResidentsMalesAge14 = Integer.valueOf(fields[92]);
        this.householdResidentsFemalesAge14 = Integer.valueOf(fields[93]);
        this.communalEstablishmentResidentsMalesAge14 = Integer.valueOf(fields[94]);
        this.communalEstablishmentResidentsFemalesAge14 = Integer.valueOf(fields[95]);
        this.allPeopleAge15to19 = Integer.valueOf(fields[96]);
        this.householdResidentsMalesAge15to19 = Integer.valueOf(fields[97]);
        this.householdResidentsFemalesAge15to19 = Integer.valueOf(fields[98]);
        this.communalEstablishmentResidentsMalesAge15to19 = Integer.valueOf(fields[99]);
        this.communalEstablishmentResidentsFemalesAge15to19 = Integer.valueOf(fields[100]);
        this.allPeopleAge15 = Integer.valueOf(fields[101]);
        this.householdResidentsMalesAge15 = Integer.valueOf(fields[102]);
        this.householdResidentsFemalesAge15 = Integer.valueOf(fields[103]);
        this.communalEstablishmentResidentsMalesAge15 = Integer.valueOf(fields[104]);
        this.communalEstablishmentResidentsFemalesAge15 = Integer.valueOf(fields[105]);
        this.allPeopleAge16 = Integer.valueOf(fields[106]);
        this.householdResidentsMalesAge16 = Integer.valueOf(fields[107]);
        this.householdResidentsFemalesAge16 = Integer.valueOf(fields[108]);
        this.communalEstablishmentResidentsMalesAge16 = Integer.valueOf(fields[109]);
        this.communalEstablishmentResidentsFemalesAge16 = Integer.valueOf(fields[110]);
        this.allPeopleAge17 = Integer.valueOf(fields[111]);
        this.householdResidentsMalesAge17 = Integer.valueOf(fields[112]);
        this.householdResidentsFemalesAge17 = Integer.valueOf(fields[113]);
        this.communalEstablishmentResidentsMalesAge17 = Integer.valueOf(fields[114]);
        this.communalEstablishmentResidentsFemalesAge17 = Integer.valueOf(fields[115]);
        this.allPeopleAge18 = Integer.valueOf(fields[116]);
        this.householdResidentsMalesAge18 = Integer.valueOf(fields[117]);
        this.householdResidentsFemalesAge18 = Integer.valueOf(fields[118]);
        this.communalEstablishmentResidentsMalesAge18 = Integer.valueOf(fields[119]);
        this.communalEstablishmentResidentsFemalesAge18 = Integer.valueOf(fields[120]);
        this.allPeopleAge19 = Integer.valueOf(fields[121]);
        this.householdResidentsMalesAge19 = Integer.valueOf(fields[122]);
        this.householdResidentsFemalesAge19 = Integer.valueOf(fields[123]);
        this.communalEstablishmentResidentsMalesAge19 = Integer.valueOf(fields[124]);
        this.communalEstablishmentResidentsFemalesAge19 = Integer.valueOf(fields[125]);
        this.allPeopleAge20to24 = Integer.valueOf(fields[126]);
        this.householdResidentsMalesAge20to24 = Integer.valueOf(fields[127]);
        this.householdResidentsFemalesAge20to24 = Integer.valueOf(fields[128]);
        this.communalEstablishmentResidentsMalesAge20to24 = Integer.valueOf(fields[129]);
        this.communalEstablishmentResidentsFemalesAge20to24 = Integer.valueOf(fields[130]);
        this.allPeopleAge20 = Integer.valueOf(fields[131]);
        this.householdResidentsMalesAge20 = Integer.valueOf(fields[132]);
        this.householdResidentsFemalesAge20 = Integer.valueOf(fields[133]);
        this.communalEstablishmentResidentsMalesAge20 = Integer.valueOf(fields[134]);
        this.communalEstablishmentResidentsFemalesAge20 = Integer.valueOf(fields[135]);
        this.allPeopleAge21 = Integer.valueOf(fields[136]);
        this.householdResidentsMalesAge21 = Integer.valueOf(fields[137]);
        this.householdResidentsFemalesAge21 = Integer.valueOf(fields[138]);
        this.communalEstablishmentResidentsMalesAge21 = Integer.valueOf(fields[139]);
        this.communalEstablishmentResidentsFemalesAge21 = Integer.valueOf(fields[140]);
        this.allPeopleAge22 = Integer.valueOf(fields[141]);
        this.householdResidentsMalesAge22 = Integer.valueOf(fields[142]);
        this.householdResidentsFemalesAge22 = Integer.valueOf(fields[143]);
        this.communalEstablishmentResidentsMalesAge22 = Integer.valueOf(fields[144]);
        this.communalEstablishmentResidentsFemalesAge22 = Integer.valueOf(fields[145]);
        this.allPeopleAge23 = Integer.valueOf(fields[146]);
        this.householdResidentsMalesAge23 = Integer.valueOf(fields[147]);
        this.householdResidentsFemalesAge23 = Integer.valueOf(fields[148]);
        this.communalEstablishmentResidentsMalesAge23 = Integer.valueOf(fields[149]);
        this.communalEstablishmentResidentsFemalesAge23 = Integer.valueOf(fields[150]);
        this.allPeopleAge24 = Integer.valueOf(fields[151]);
        this.householdResidentsMalesAge24 = Integer.valueOf(fields[152]);
        this.householdResidentsFemalesAge24 = Integer.valueOf(fields[153]);
        this.communalEstablishmentResidentsMalesAge24 = Integer.valueOf(fields[154]);
        this.communalEstablishmentResidentsFemalesAge24 = Integer.valueOf(fields[155]);
        this.allPeopleAge25to29 = Integer.valueOf(fields[156]);
        this.householdResidentsMalesAge25to29 = Integer.valueOf(fields[157]);
        this.householdResidentsFemalesAge25to29 = Integer.valueOf(fields[158]);
        this.communalEstablishmentResidentsMalesAge25to29 = Integer.valueOf(fields[159]);
        this.communalEstablishmentResidentsFemalesAge25to29 = Integer.valueOf(fields[160]);
        this.allPeopleAge30to34 = Integer.valueOf(fields[161]);
        this.householdResidentsMalesAge30to34 = Integer.valueOf(fields[162]);
        this.householdResidentsFemalesAge30to34 = Integer.valueOf(fields[163]);
        this.communalEstablishmentResidentsMalesAge30to34 = Integer.valueOf(fields[164]);
        this.communalEstablishmentResidentsFemalesAge30to34 = Integer.valueOf(fields[165]);
        this.allPeopleAge35to39 = Integer.valueOf(fields[166]);
        this.householdResidentsMalesAge35to39 = Integer.valueOf(fields[167]);
        this.householdResidentsFemalesAge35to39 = Integer.valueOf(fields[168]);
        this.communalEstablishmentResidentsMalesAge35to39 = Integer.valueOf(fields[169]);
        this.communalEstablishmentResidentsFemalesAge35to39 = Integer.valueOf(fields[170]);
        this.allPeopleAge40to44 = Integer.valueOf(fields[171]);
        this.householdResidentsMalesAge40to44 = Integer.valueOf(fields[172]);
        this.householdResidentsFemalesAge40to44 = Integer.valueOf(fields[173]);
        this.communalEstablishmentResidentsMalesAge40to44 = Integer.valueOf(fields[174]);
        this.communalEstablishmentResidentsFemalesAge40to44 = Integer.valueOf(fields[175]);
        this.allPeopleAge45to49 = Integer.valueOf(fields[176]);
        this.householdResidentsMalesAge45to49 = Integer.valueOf(fields[177]);
        this.householdResidentsFemalesAge45to49 = Integer.valueOf(fields[178]);
        this.communalEstablishmentResidentsMalesAge45to49 = Integer.valueOf(fields[179]);
        this.communalEstablishmentResidentsFemalesAge45to49 = Integer.valueOf(fields[180]);
        this.allPeopleAge50to54 = Integer.valueOf(fields[181]);
        this.householdResidentsMalesAge50to54 = Integer.valueOf(fields[182]);
        this.householdResidentsFemalesAge50to54 = Integer.valueOf(fields[183]);
        this.communalEstablishmentResidentsMalesAge50to54 = Integer.valueOf(fields[184]);
        this.communalEstablishmentResidentsFemalesAge50to54 = Integer.valueOf(fields[185]);
        this.allPeopleAge55to59 = Integer.valueOf(fields[186]);
        this.householdResidentsMalesAge55to59 = Integer.valueOf(fields[187]);
        this.householdResidentsFemalesAge55to59 = Integer.valueOf(fields[188]);
        this.communalEstablishmentResidentsMalesAge55to59 = Integer.valueOf(fields[189]);
        this.communalEstablishmentResidentsFemalesAge55to59 = Integer.valueOf(fields[190]);
        this.allPeopleAge60to64 = Integer.valueOf(fields[191]);
        this.householdResidentsMalesAge60to64 = Integer.valueOf(fields[192]);
        this.householdResidentsFemalesAge60to64 = Integer.valueOf(fields[193]);
        this.communalEstablishmentResidentsMalesAge60to64 = Integer.valueOf(fields[194]);
        this.communalEstablishmentResidentsFemalesAge60to64 = Integer.valueOf(fields[195]);
        this.allPeopleAge65to69 = Integer.valueOf(fields[196]);
        this.householdResidentsMalesAge65to69 = Integer.valueOf(fields[197]);
        this.householdResidentsFemalesAge65to69 = Integer.valueOf(fields[198]);
        this.communalEstablishmentResidentsMalesAge65to69 = Integer.valueOf(fields[199]);
        this.communalEstablishmentResidentsFemalesAge65to69 = Integer.valueOf(fields[200]);
        this.allPeopleAge70to74 = Integer.valueOf(fields[201]);
        this.householdResidentsMalesAge70to74 = Integer.valueOf(fields[202]);
        this.householdResidentsFemalesAge70to74 = Integer.valueOf(fields[203]);
        this.communalEstablishmentResidentsMalesAge70to74 = Integer.valueOf(fields[204]);
        this.communalEstablishmentResidentsFemalesAge70to74 = Integer.valueOf(fields[205]);
        this.allPeopleAge75to79 = Integer.valueOf(fields[206]);
        this.householdResidentsMalesAge75to79 = Integer.valueOf(fields[207]);
        this.householdResidentsFemalesAge75to79 = Integer.valueOf(fields[208]);
        this.communalEstablishmentResidentsMalesAge75to79 = Integer.valueOf(fields[209]);
        this.communalEstablishmentResidentsFemalesAge75to79 = Integer.valueOf(fields[210]);
        this.allPeopleAge80to84 = Integer.valueOf(fields[211]);
        this.householdResidentsMalesAge80to84 = Integer.valueOf(fields[212]);
        this.householdResidentsFemalesAge80to84 = Integer.valueOf(fields[213]);
        this.communalEstablishmentResidentsMalesAge80to84 = Integer.valueOf(fields[214]);
        this.communalEstablishmentResidentsFemalesAge80to84 = Integer.valueOf(fields[215]);
        this.allPeopleAge85to89 = Integer.valueOf(fields[216]);
        this.householdResidentsMalesAge85to89 = Integer.valueOf(fields[217]);
        this.householdResidentsFemalesAge85to89 = Integer.valueOf(fields[218]);
        this.communalEstablishmentResidentsMalesAge85to89 = Integer.valueOf(fields[219]);
        this.communalEstablishmentResidentsFemalesAge85to89 = Integer.valueOf(fields[220]);
        this.allPeopleAge90AndOver = Integer.valueOf(fields[221]);
        this.householdResidentsMalesAge90AndOver = Integer.valueOf(fields[222]);
        this.householdResidentsFemalesAge90AndOver = Integer.valueOf(fields[223]);
        this.communalEstablishmentResidentsMalesAge90AndOver = Integer.valueOf(fields[224]);
        this.communalEstablishmentResidentsFemalesAge90AndOver = Integer.valueOf(fields[225]);
    }

    /**
     * @return A String description of this.
     */
    @Override
    public String toString() {
        String r = super.toString() +  ", allPeople=" + allPeople
                + ", householdResidentsMales=" + householdResidentsMales
                + ", householdResidentsFemales=" + householdResidentsFemales
                + ", communalEstablishmentResidentsMales=" + communalEstablishmentResidentsMales
                + ", communalEstablishmentResidentsFemales=" + communalEstablishmentResidentsFemales
                + ", allPeopleAge0to4=" + allPeopleAge0to4
                + ", householdResidentsMalesAge0to4=" + householdResidentsMalesAge0to4
                + ", householdResidentsFemalesAge0to4=" + householdResidentsFemalesAge0to4
                + ", communalEstablishmentResidentsMalesAge0to4=" + communalEstablishmentResidentsMalesAge0to4
                + ", communalEstablishmentResidentsFemalesAge0to4=" + communalEstablishmentResidentsFemalesAge0to4
                + ", allPeopleAge0=" + allPeopleAge0
                + ", householdResidentsMalesAge0=" + householdResidentsMalesAge0
                + ", householdResidentsFemalesAge0=" + householdResidentsFemalesAge0
                + ", communalEstablishmentResidentsMalesAge0=" + communalEstablishmentResidentsMalesAge0
                + ", communalEstablishmentResidentsFemalesAge0=" + communalEstablishmentResidentsFemalesAge0
                + ", allPeopleAge1=" + allPeopleAge1
                + ", householdResidentsMalesAge1=" + householdResidentsMalesAge1
                + ", householdResidentsFemalesAge1=" + householdResidentsFemalesAge1
                + ", communalEstablishmentResidentsMalesAge1=" + communalEstablishmentResidentsMalesAge1
                + ", communalEstablishmentResidentsFemalesAge1=" + communalEstablishmentResidentsFemalesAge1
                + ", allPeopleAge2=" + allPeopleAge2
                + ", householdResidentsMalesAge2=" + householdResidentsMalesAge2
                + ", householdResidentsFemalesAge2=" + householdResidentsFemalesAge2
                + ", communalEstablishmentResidentsMalesAge2=" + communalEstablishmentResidentsMalesAge2
                + ", communalEstablishmentResidentsFemalesAge2=" + communalEstablishmentResidentsFemalesAge2
                + ", allPeopleAge3=" + allPeopleAge3
                + ", householdResidentsMalesAge3=" + householdResidentsMalesAge3
                + ", householdResidentsFemalesAge3=" + householdResidentsFemalesAge3
                + ", communalEstablishmentResidentsMalesAge3=" + communalEstablishmentResidentsMalesAge3
                + ", communalEstablishmentResidentsFemalesAge3=" + communalEstablishmentResidentsFemalesAge3
                + ", allPeopleAge4=" + allPeopleAge4
                + ", householdResidentsMalesAge4=" + householdResidentsMalesAge4
                + ", householdResidentsFemalesAge4=" + householdResidentsFemalesAge4
                + ", communalEstablishmentResidentsMalesAge4=" + communalEstablishmentResidentsMalesAge4
                + ", communalEstablishmentResidentsFemalesAge4=" + communalEstablishmentResidentsFemalesAge4
                + ", allPeopleAge5to9=" + allPeopleAge5to9
                + ", householdResidentsMalesAge5to9=" + householdResidentsMalesAge5to9
                + ", householdResidentsFemalesAge5to9=" + householdResidentsFemalesAge5to9
                + ", communalEstablishmentResidentsMalesAge5to9=" + communalEstablishmentResidentsMalesAge5to9
                + ", communalEstablishmentResidentsFemalesAge5to9=" + communalEstablishmentResidentsFemalesAge5to9
                + ", allPeopleAge5=" + allPeopleAge5
                + ", householdResidentsMalesAge5=" + householdResidentsMalesAge5
                + ", householdResidentsFemalesAge5=" + householdResidentsFemalesAge5
                + ", communalEstablishmentResidentsMalesAge5=" + communalEstablishmentResidentsMalesAge5
                + ", communalEstablishmentResidentsFemalesAge5=" + communalEstablishmentResidentsFemalesAge5
                + ", allPeopleAge6=" + allPeopleAge6
                + ", householdResidentsMalesAge6=" + householdResidentsMalesAge6
                + ", householdResidentsFemalesAge6=" + householdResidentsFemalesAge6
                + ", communalEstablishmentResidentsMalesAge6=" + communalEstablishmentResidentsMalesAge6
                + ", communalEstablishmentResidentsFemalesAge6=" + communalEstablishmentResidentsFemalesAge6
                + ", allPeopleAge7=" + allPeopleAge7
                + ", householdResidentsMalesAge7=" + householdResidentsMalesAge7
                + ", householdResidentsFemalesAge7=" + householdResidentsFemalesAge7
                + ", communalEstablishmentResidentsMalesAge7=" + communalEstablishmentResidentsMalesAge7
                + ", communalEstablishmentResidentsFemalesAge7=" + communalEstablishmentResidentsFemalesAge7
                + ", allPeopleAge8=" + allPeopleAge8
                + ", householdResidentsMalesAge8=" + householdResidentsMalesAge8
                + ", householdResidentsFemalesAge8=" + householdResidentsFemalesAge8
                + ", communalEstablishmentResidentsMalesAge8=" + communalEstablishmentResidentsMalesAge8
                + ", communalEstablishmentResidentsFemalesAge8=" + communalEstablishmentResidentsFemalesAge8
                + ", allPeopleAge9=" + allPeopleAge9
                + ", householdResidentsMalesAge9=" + householdResidentsMalesAge9
                + ", householdResidentsFemalesAge9=" + householdResidentsFemalesAge9
                + ", communalEstablishmentResidentsMalesAge9=" + communalEstablishmentResidentsMalesAge9
                + ", communalEstablishmentResidentsFemalesAge9=" + communalEstablishmentResidentsFemalesAge9
                + ", allPeopleAge10to14=" + allPeopleAge10to14
                + ", householdResidentsMalesAge10to14=" + householdResidentsMalesAge10to14
                + ", householdResidentsFemalesAge10to14=" + householdResidentsFemalesAge10to14
                + ", communalEstablishmentResidentsMalesAge10to14=" + communalEstablishmentResidentsMalesAge10to14
                + ", communalEstablishmentResidentsFemalesAge10to14=" + communalEstablishmentResidentsFemalesAge10to14
                + ", allPeopleAge10=" + allPeopleAge10
                + ", householdResidentsMalesAge10=" + householdResidentsMalesAge10
                + ", householdResidentsFemalesAge10=" + householdResidentsFemalesAge10
                + ", communalEstablishmentResidentsMalesAge10=" + communalEstablishmentResidentsMalesAge10
                + ", communalEstablishmentResidentsFemalesAge10=" + communalEstablishmentResidentsFemalesAge10
                + ", allPeopleAge11=" + allPeopleAge11
                + ", householdResidentsMalesAge11=" + householdResidentsMalesAge11
                + ", householdResidentsFemalesAge11=" + householdResidentsFemalesAge11
                + ", communalEstablishmentResidentsMalesAge11=" + communalEstablishmentResidentsMalesAge11
                + ", communalEstablishmentResidentsFemalesAge11=" + communalEstablishmentResidentsFemalesAge11
                + ", allPeopleAge12=" + allPeopleAge12
                + ", householdResidentsMalesAge12=" + householdResidentsMalesAge12
                + ", householdResidentsFemalesAge12=" + householdResidentsFemalesAge12
                + ", communalEstablishmentResidentsMalesAge12=" + communalEstablishmentResidentsMalesAge12
                + ", communalEstablishmentResidentsFemalesAge12=" + communalEstablishmentResidentsFemalesAge12
                + ", allPeopleAge13=" + allPeopleAge13
                + ", householdResidentsMalesAge13=" + householdResidentsMalesAge13
                + ", householdResidentsFemalesAge13=" + householdResidentsFemalesAge13
                + ", communalEstablishmentResidentsMalesAge13=" + communalEstablishmentResidentsMalesAge13
                + ", communalEstablishmentResidentsFemalesAge13=" + communalEstablishmentResidentsFemalesAge13
                + ", allPeopleAge14=" + allPeopleAge14
                + ", householdResidentsMalesAge14=" + householdResidentsMalesAge14
                + ", householdResidentsFemalesAge14=" + householdResidentsFemalesAge14
                + ", communalEstablishmentResidentsMalesAge14=" + communalEstablishmentResidentsMalesAge14
                + ", communalEstablishmentResidentsFemalesAge14=" + communalEstablishmentResidentsFemalesAge14
                + ", allPeopleAge15to19=" + allPeopleAge15to19
                + ", householdResidentsMalesAge15to19=" + householdResidentsMalesAge15to19
                + ", householdResidentsFemalesAge15to19=" + householdResidentsFemalesAge15to19
                + ", communalEstablishmentResidentsMalesAge15to19=" + communalEstablishmentResidentsMalesAge15to19
                + ", communalEstablishmentResidentsFemalesAge15to19=" + communalEstablishmentResidentsFemalesAge15to19
                + ", allPeopleAge15=" + allPeopleAge15
                + ", householdResidentsMalesAge15=" + householdResidentsMalesAge15
                + ", householdResidentsFemalesAge15=" + householdResidentsFemalesAge15
                + ", communalEstablishmentResidentsMalesAge15=" + communalEstablishmentResidentsMalesAge15
                + ", communalEstablishmentResidentsFemalesAge15=" + communalEstablishmentResidentsFemalesAge15
                + ", allPeopleAge16=" + allPeopleAge16
                + ", householdResidentsMalesAge16=" + householdResidentsMalesAge16
                + ", householdResidentsFemalesAge16=" + householdResidentsFemalesAge16
                + ", communalEstablishmentResidentsMalesAge16=" + communalEstablishmentResidentsMalesAge16
                + ", communalEstablishmentResidentsFemalesAge16=" + communalEstablishmentResidentsFemalesAge16
                + ", allPeopleAge17=" + allPeopleAge17
                + ", householdResidentsMalesAge17=" + householdResidentsMalesAge17
                + ", householdResidentsFemalesAge17=" + householdResidentsFemalesAge17
                + ", communalEstablishmentResidentsMalesAge17=" + communalEstablishmentResidentsMalesAge17
                + ", communalEstablishmentResidentsFemalesAge17=" + communalEstablishmentResidentsFemalesAge17
                + ", allPeopleAge18=" + allPeopleAge18
                + ", householdResidentsMalesAge18=" + householdResidentsMalesAge18
                + ", householdResidentsFemalesAge18=" + householdResidentsFemalesAge18
                + ", communalEstablishmentResidentsMalesAge18=" + communalEstablishmentResidentsMalesAge18
                + ", communalEstablishmentResidentsFemalesAge18=" + communalEstablishmentResidentsFemalesAge18
                + ", allPeopleAge19=" + allPeopleAge19
                + ", householdResidentsMalesAge19=" + householdResidentsMalesAge19
                + ", householdResidentsFemalesAge19=" + householdResidentsFemalesAge19
                + ", communalEstablishmentResidentsMalesAge19=" + communalEstablishmentResidentsMalesAge19
                + ", communalEstablishmentResidentsFemalesAge19=" + communalEstablishmentResidentsFemalesAge19
                + ", allPeopleAge20to24=" + allPeopleAge20to24
                + ", householdResidentsMalesAge20to24=" + householdResidentsMalesAge20to24
                + ", householdResidentsFemalesAge20to24=" + householdResidentsFemalesAge20to24
                + ", communalEstablishmentResidentsMalesAge20to24=" + communalEstablishmentResidentsMalesAge20to24
                + ", communalEstablishmentResidentsFemalesAge20to24=" + communalEstablishmentResidentsFemalesAge20to24
                + ", allPeopleAge20=" + allPeopleAge20
                + ", householdResidentsMalesAge20=" + householdResidentsMalesAge20
                + ", householdResidentsFemalesAge20=" + householdResidentsFemalesAge20
                + ", communalEstablishmentResidentsMalesAge20=" + communalEstablishmentResidentsMalesAge20
                + ", communalEstablishmentResidentsFemalesAge20=" + communalEstablishmentResidentsFemalesAge20
                + ", allPeopleAge21=" + allPeopleAge21
                + ", householdResidentsMalesAge21=" + householdResidentsMalesAge21
                + ", householdResidentsFemalesAge21=" + householdResidentsFemalesAge21
                + ", communalEstablishmentResidentsMalesAge21=" + communalEstablishmentResidentsMalesAge21
                + ", communalEstablishmentResidentsFemalesAge21=" + communalEstablishmentResidentsFemalesAge21
                + ", allPeopleAge22=" + allPeopleAge22
                + ", householdResidentsMalesAge22=" + householdResidentsMalesAge22
                + ", householdResidentsFemalesAge22=" + householdResidentsFemalesAge22
                + ", communalEstablishmentResidentsMalesAge22=" + communalEstablishmentResidentsMalesAge22
                + ", communalEstablishmentResidentsFemalesAge22=" + communalEstablishmentResidentsFemalesAge22
                + ", allPeopleAge23=" + allPeopleAge23
                + ", householdResidentsMalesAge23=" + householdResidentsMalesAge23
                + ", householdResidentsFemalesAge23=" + householdResidentsFemalesAge23
                + ", communalEstablishmentResidentsMalesAge23=" + communalEstablishmentResidentsMalesAge23
                + ", communalEstablishmentResidentsFemalesAge23=" + communalEstablishmentResidentsFemalesAge23
                + ", allPeopleAge24=" + allPeopleAge24
                + ", householdResidentsMalesAge24=" + householdResidentsMalesAge24
                + ", householdResidentsFemalesAge24=" + householdResidentsFemalesAge24
                + ", communalEstablishmentResidentsMalesAge24=" + communalEstablishmentResidentsMalesAge24
                + ", communalEstablishmentResidentsFemalesAge24=" + communalEstablishmentResidentsFemalesAge24
                + ", allPeopleAge25to29=" + allPeopleAge25to29
                + ", householdResidentsMalesAge25to29=" + householdResidentsMalesAge25to29
                + ", householdResidentsFemalesAge25to29=" + householdResidentsFemalesAge25to29
                + ", communalEstablishmentResidentsMalesAge25to29=" + communalEstablishmentResidentsMalesAge25to29
                + ", communalEstablishmentResidentsFemalesAge25to29=" + communalEstablishmentResidentsFemalesAge25to29
                + ", allPeopleAge30to34=" + allPeopleAge30to34
                + ", householdResidentsMalesAge30to34=" + householdResidentsMalesAge30to34
                + ", householdResidentsFemalesAge30to34=" + householdResidentsFemalesAge30to34
                + ", communalEstablishmentResidentsMalesAge30to34=" + communalEstablishmentResidentsMalesAge30to34
                + ", communalEstablishmentResidentsFemalesAge30to34=" + communalEstablishmentResidentsFemalesAge30to34
                + ", allPeopleAge35to39=" + allPeopleAge35to39
                + ", householdResidentsMalesAge35to39=" + householdResidentsMalesAge35to39
                + ", householdResidentsFemalesAge35to39=" + householdResidentsFemalesAge35to39
                + ", communalEstablishmentResidentsMalesAge35to39=" + communalEstablishmentResidentsMalesAge35to39
                + ", communalEstablishmentResidentsFemalesAge35to39=" + communalEstablishmentResidentsFemalesAge35to39
                + ", allPeopleAge40to44=" + allPeopleAge40to44
                + ", householdResidentsMalesAge40to44=" + householdResidentsMalesAge40to44
                + ", householdResidentsFemalesAge40to44=" + householdResidentsFemalesAge40to44
                + ", communalEstablishmentResidentsMalesAge40to44=" + communalEstablishmentResidentsMalesAge40to44
                + ", communalEstablishmentResidentsFemalesAge40to44=" + communalEstablishmentResidentsFemalesAge40to44
                + ", allPeopleAge45to49=" + allPeopleAge45to49
                + ", householdResidentsMalesAge45to49=" + householdResidentsMalesAge45to49
                + ", householdResidentsFemalesAge45to49=" + householdResidentsFemalesAge45to49
                + ", communalEstablishmentResidentsMalesAge45to49=" + communalEstablishmentResidentsMalesAge45to49
                + ", communalEstablishmentResidentsFemalesAge45to49=" + communalEstablishmentResidentsFemalesAge45to49
                + ", allPeopleAge50to54=" + allPeopleAge50to54
                + ", householdResidentsMalesAge50to54=" + householdResidentsMalesAge50to54
                + ", householdResidentsFemalesAge50to54=" + householdResidentsFemalesAge50to54
                + ", communalEstablishmentResidentsMalesAge50to54=" + communalEstablishmentResidentsMalesAge50to54
                + ", communalEstablishmentResidentsFemalesAge50to54=" + communalEstablishmentResidentsFemalesAge50to54
                + ", allPeopleAge55to59=" + allPeopleAge55to59
                + ", householdResidentsMalesAge55to59=" + householdResidentsMalesAge55to59
                + ", householdResidentsFemalesAge55to59=" + householdResidentsFemalesAge55to59
                + ", communalEstablishmentResidentsMalesAge55to59=" + communalEstablishmentResidentsMalesAge55to59
                + ", communalEstablishmentResidentsFemalesAge55to59=" + communalEstablishmentResidentsFemalesAge55to59
                + ", allPeopleAge60to64=" + allPeopleAge60to64
                + ", householdResidentsMalesAge60to64=" + householdResidentsMalesAge60to64
                + ", householdResidentsFemalesAge60to64=" + householdResidentsFemalesAge60to64
                + ", communalEstablishmentResidentsMalesAge60to64=" + communalEstablishmentResidentsMalesAge60to64
                + ", communalEstablishmentResidentsFemalesAge60to64=" + communalEstablishmentResidentsFemalesAge60to64
                + ", allPeopleAge65to69=" + allPeopleAge65to69
                + ", householdResidentsMalesAge65to69=" + householdResidentsMalesAge65to69
                + ", householdResidentsFemalesAge65to69=" + householdResidentsFemalesAge65to69
                + ", communalEstablishmentResidentsMalesAge65to69=" + communalEstablishmentResidentsMalesAge65to69
                + ", communalEstablishmentResidentsFemalesAge65to69=" + communalEstablishmentResidentsFemalesAge65to69
                + ", allPeopleAge70to74=" + allPeopleAge70to74
                + ", householdResidentsMalesAge70to74=" + householdResidentsMalesAge70to74
                + ", householdResidentsFemalesAge70to74=" + householdResidentsFemalesAge70to74
                + ", communalEstablishmentResidentsMalesAge70to74=" + communalEstablishmentResidentsMalesAge70to74
                + ", communalEstablishmentResidentsFemalesAge70to74=" + communalEstablishmentResidentsFemalesAge70to74
                + ", allPeopleAge75to79=" + allPeopleAge75to79
                + ", householdResidentsMalesAge75to79=" + householdResidentsMalesAge75to79
                + ", householdResidentsFemalesAge75to79=" + householdResidentsFemalesAge75to79
                + ", communalEstablishmentResidentsMalesAge75to79=" + communalEstablishmentResidentsMalesAge75to79
                + ", communalEstablishmentResidentsFemalesAge75to79=" + communalEstablishmentResidentsFemalesAge75to79
                + ", allPeopleAge80to84=" + allPeopleAge80to84
                + ", householdResidentsMalesAge80to84=" + householdResidentsMalesAge80to84
                + ", householdResidentsFemalesAge80to84=" + householdResidentsFemalesAge80to84
                + ", communalEstablishmentResidentsMalesAge80to84=" + communalEstablishmentResidentsMalesAge80to84
                + ", communalEstablishmentResidentsFemalesAge80to84=" + communalEstablishmentResidentsFemalesAge80to84
                + ", allPeopleAge85to89=" + allPeopleAge85to89
                + ", householdResidentsMalesAge85to89=" + householdResidentsMalesAge85to89
                + ", householdResidentsFemalesAge85to89=" + householdResidentsFemalesAge85to89
                + ", communalEstablishmentResidentsMalesAge85to89=" + communalEstablishmentResidentsMalesAge85to89
                + ", communalEstablishmentResidentsFemalesAge85to89=" + communalEstablishmentResidentsFemalesAge85to89
                + ", allPeopleAge90AndOver=" + allPeopleAge90AndOver
                + ", householdResidentsMalesAge90AndOver=" + householdResidentsMalesAge90AndOver
                + ", householdResidentsFemalesAge90AndOver=" + householdResidentsFemalesAge90AndOver
                + ", communalEstablishmentResidentsMalesAge90AndOver=" + communalEstablishmentResidentsMalesAge90AndOver
                + ", communalEstablishmentResidentsFemalesAge90AndOver=" + communalEstablishmentResidentsFemalesAge90AndOver;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        String r = super.toCSV();
        r += "," + this.allPeople;
        r += "," + this.householdResidentsMales;
        r += "," + this.householdResidentsFemales;
        r += "," + this.communalEstablishmentResidentsMales;
        r += "," + this.communalEstablishmentResidentsFemales;
        r += "," + this.allPeopleAge0to4;
        r += "," + this.householdResidentsMalesAge0to4;
        r += "," + this.householdResidentsFemalesAge0to4;
        r += "," + this.communalEstablishmentResidentsMalesAge0to4;
        r += "," + this.communalEstablishmentResidentsFemalesAge0to4;
        r += "," + this.allPeopleAge0;
        r += "," + this.householdResidentsMalesAge0;
        r += "," + this.householdResidentsFemalesAge0;
        r += "," + this.communalEstablishmentResidentsMalesAge0;
        r += "," + this.communalEstablishmentResidentsFemalesAge0;
        r += "," + this.allPeopleAge1;
        r += "," + this.householdResidentsMalesAge1;
        r += "," + this.householdResidentsFemalesAge1;
        r += "," + this.communalEstablishmentResidentsMalesAge1;
        r += "," + this.communalEstablishmentResidentsFemalesAge1;
        r += "," + this.allPeopleAge2;
        r += "," + this.householdResidentsMalesAge2;
        r += "," + this.householdResidentsFemalesAge2;
        r += "," + this.communalEstablishmentResidentsMalesAge2;
        r += "," + this.communalEstablishmentResidentsFemalesAge2;
        r += "," + this.allPeopleAge3;
        r += "," + this.householdResidentsMalesAge3;
        r += "," + this.householdResidentsFemalesAge3;
        r += "," + this.communalEstablishmentResidentsMalesAge3;
        r += "," + this.communalEstablishmentResidentsFemalesAge3;
        r += "," + this.allPeopleAge4;
        r += "," + this.householdResidentsMalesAge4;
        r += "," + this.householdResidentsFemalesAge4;
        r += "," + this.communalEstablishmentResidentsMalesAge4;
        r += "," + this.communalEstablishmentResidentsFemalesAge4;
        r += "," + this.allPeopleAge5to9;
        r += "," + this.householdResidentsMalesAge5to9;
        r += "," + this.householdResidentsFemalesAge5to9;
        r += "," + this.communalEstablishmentResidentsMalesAge5to9;
        r += "," + this.communalEstablishmentResidentsFemalesAge5to9;
        r += "," + this.allPeopleAge5;
        r += "," + this.householdResidentsMalesAge5;
        r += "," + this.householdResidentsFemalesAge5;
        r += "," + this.communalEstablishmentResidentsMalesAge5;
        r += "," + this.communalEstablishmentResidentsFemalesAge5;
        r += "," + this.allPeopleAge6;
        r += "," + this.householdResidentsMalesAge6;
        r += "," + this.householdResidentsFemalesAge6;
        r += "," + this.communalEstablishmentResidentsMalesAge6;
        r += "," + this.communalEstablishmentResidentsFemalesAge6;
        r += "," + this.allPeopleAge7;
        r += "," + this.householdResidentsMalesAge7;
        r += "," + this.householdResidentsFemalesAge7;
        r += "," + this.communalEstablishmentResidentsMalesAge7;
        r += "," + this.communalEstablishmentResidentsFemalesAge7;
        r += "," + this.allPeopleAge8;
        r += "," + this.householdResidentsMalesAge8;
        r += "," + this.householdResidentsFemalesAge8;
        r += "," + this.communalEstablishmentResidentsMalesAge8;
        r += "," + this.communalEstablishmentResidentsFemalesAge8;
        r += "," + this.allPeopleAge9;
        r += "," + this.householdResidentsMalesAge9;
        r += "," + this.householdResidentsFemalesAge9;
        r += "," + this.communalEstablishmentResidentsMalesAge9;
        r += "," + this.communalEstablishmentResidentsFemalesAge9;
        r += "," + this.allPeopleAge10to14;
        r += "," + this.householdResidentsMalesAge10to14;
        r += "," + this.householdResidentsFemalesAge10to14;
        r += "," + this.communalEstablishmentResidentsMalesAge10to14;
        r += "," + this.communalEstablishmentResidentsFemalesAge10to14;
        r += "," + this.allPeopleAge10;
        r += "," + this.householdResidentsMalesAge10;
        r += "," + this.householdResidentsFemalesAge10;
        r += "," + this.communalEstablishmentResidentsMalesAge10;
        r += "," + this.communalEstablishmentResidentsFemalesAge10;
        r += "," + this.allPeopleAge11;
        r += "," + this.householdResidentsMalesAge11;
        r += "," + this.householdResidentsFemalesAge11;
        r += "," + this.communalEstablishmentResidentsMalesAge11;
        r += "," + this.communalEstablishmentResidentsFemalesAge11;
        r += "," + this.allPeopleAge12;
        r += "," + this.householdResidentsMalesAge12;
        r += "," + this.householdResidentsFemalesAge12;
        r += "," + this.communalEstablishmentResidentsMalesAge12;
        r += "," + this.communalEstablishmentResidentsFemalesAge12;
        r += "," + this.allPeopleAge13;
        r += "," + this.householdResidentsMalesAge13;
        r += "," + this.householdResidentsFemalesAge13;
        r += "," + this.communalEstablishmentResidentsMalesAge13;
        r += "," + this.communalEstablishmentResidentsFemalesAge13;
        r += "," + this.allPeopleAge14;
        r += "," + this.householdResidentsMalesAge14;
        r += "," + this.householdResidentsFemalesAge14;
        r += "," + this.communalEstablishmentResidentsMalesAge14;
        r += "," + this.communalEstablishmentResidentsFemalesAge14;
        r += "," + this.allPeopleAge15to19;
        r += "," + this.householdResidentsMalesAge15to19;
        r += "," + this.householdResidentsFemalesAge15to19;
        r += "," + this.communalEstablishmentResidentsMalesAge15to19;
        r += "," + this.communalEstablishmentResidentsFemalesAge15to19;
        r += "," + this.allPeopleAge15;
        r += "," + this.householdResidentsMalesAge15;
        r += "," + this.householdResidentsFemalesAge15;
        r += "," + this.communalEstablishmentResidentsMalesAge15;
        r += "," + this.communalEstablishmentResidentsFemalesAge15;
        r += "," + this.allPeopleAge16;
        r += "," + this.householdResidentsMalesAge16;
        r += "," + this.householdResidentsFemalesAge16;
        r += "," + this.communalEstablishmentResidentsMalesAge16;
        r += "," + this.communalEstablishmentResidentsFemalesAge16;
        r += "," + this.allPeopleAge17;
        r += "," + this.householdResidentsMalesAge17;
        r += "," + this.householdResidentsFemalesAge17;
        r += "," + this.communalEstablishmentResidentsMalesAge17;
        r += "," + this.communalEstablishmentResidentsFemalesAge17;
        r += "," + this.allPeopleAge18;
        r += "," + this.householdResidentsMalesAge18;
        r += "," + this.householdResidentsFemalesAge18;
        r += "," + this.communalEstablishmentResidentsMalesAge18;
        r += "," + this.communalEstablishmentResidentsFemalesAge18;
        r += "," + this.allPeopleAge19;
        r += "," + this.householdResidentsMalesAge19;
        r += "," + this.householdResidentsFemalesAge19;
        r += "," + this.communalEstablishmentResidentsMalesAge19;
        r += "," + this.communalEstablishmentResidentsFemalesAge19;
        r += "," + this.allPeopleAge20to24;
        r += "," + this.householdResidentsMalesAge20to24;
        r += "," + this.householdResidentsFemalesAge20to24;
        r += "," + this.communalEstablishmentResidentsMalesAge20to24;
        r += "," + this.communalEstablishmentResidentsFemalesAge20to24;
        r += "," + this.allPeopleAge20;
        r += "," + this.householdResidentsMalesAge20;
        r += "," + this.householdResidentsFemalesAge20;
        r += "," + this.communalEstablishmentResidentsMalesAge20;
        r += "," + this.communalEstablishmentResidentsFemalesAge20;
        r += "," + this.allPeopleAge21;
        r += "," + this.householdResidentsMalesAge21;
        r += "," + this.householdResidentsFemalesAge21;
        r += "," + this.communalEstablishmentResidentsMalesAge21;
        r += "," + this.communalEstablishmentResidentsFemalesAge21;
        r += "," + this.allPeopleAge22;
        r += "," + this.householdResidentsMalesAge22;
        r += "," + this.householdResidentsFemalesAge22;
        r += "," + this.communalEstablishmentResidentsMalesAge22;
        r += "," + this.communalEstablishmentResidentsFemalesAge22;
        r += "," + this.allPeopleAge23;
        r += "," + this.householdResidentsMalesAge23;
        r += "," + this.householdResidentsFemalesAge23;
        r += "," + this.communalEstablishmentResidentsMalesAge23;
        r += "," + this.communalEstablishmentResidentsFemalesAge23;
        r += "," + this.allPeopleAge24;
        r += "," + this.householdResidentsMalesAge24;
        r += "," + this.householdResidentsFemalesAge24;
        r += "," + this.communalEstablishmentResidentsMalesAge24;
        r += "," + this.communalEstablishmentResidentsFemalesAge24;
        r += "," + this.allPeopleAge25to29;
        r += "," + this.householdResidentsMalesAge25to29;
        r += "," + this.householdResidentsFemalesAge25to29;
        r += "," + this.communalEstablishmentResidentsMalesAge25to29;
        r += "," + this.communalEstablishmentResidentsFemalesAge25to29;
        r += "," + this.allPeopleAge30to34;
        r += "," + this.householdResidentsMalesAge30to34;
        r += "," + this.householdResidentsFemalesAge30to34;
        r += "," + this.communalEstablishmentResidentsMalesAge30to34;
        r += "," + this.communalEstablishmentResidentsFemalesAge30to34;
        r += "," + this.allPeopleAge35to39;
        r += "," + this.householdResidentsMalesAge35to39;
        r += "," + this.householdResidentsFemalesAge35to39;
        r += "," + this.communalEstablishmentResidentsMalesAge35to39;
        r += "," + this.communalEstablishmentResidentsFemalesAge35to39;
        r += "," + this.allPeopleAge40to44;
        r += "," + this.householdResidentsMalesAge40to44;
        r += "," + this.householdResidentsFemalesAge40to44;
        r += "," + this.communalEstablishmentResidentsMalesAge40to44;
        r += "," + this.communalEstablishmentResidentsFemalesAge40to44;
        r += "," + this.allPeopleAge45to49;
        r += "," + this.householdResidentsMalesAge45to49;
        r += "," + this.householdResidentsFemalesAge45to49;
        r += "," + this.communalEstablishmentResidentsMalesAge45to49;
        r += "," + this.communalEstablishmentResidentsFemalesAge45to49;
        r += "," + this.allPeopleAge50to54;
        r += "," + this.householdResidentsMalesAge50to54;
        r += "," + this.householdResidentsFemalesAge50to54;
        r += "," + this.communalEstablishmentResidentsMalesAge50to54;
        r += "," + this.communalEstablishmentResidentsFemalesAge50to54;
        r += "," + this.allPeopleAge55to59;
        r += "," + this.householdResidentsMalesAge55to59;
        r += "," + this.householdResidentsFemalesAge55to59;
        r += "," + this.communalEstablishmentResidentsMalesAge55to59;
        r += "," + this.communalEstablishmentResidentsFemalesAge55to59;
        r += "," + this.allPeopleAge60to64;
        r += "," + this.householdResidentsMalesAge60to64;
        r += "," + this.householdResidentsFemalesAge60to64;
        r += "," + this.communalEstablishmentResidentsMalesAge60to64;
        r += "," + this.communalEstablishmentResidentsFemalesAge60to64;
        r += "," + this.allPeopleAge65to69;
        r += "," + this.householdResidentsMalesAge65to69;
        r += "," + this.householdResidentsFemalesAge65to69;
        r += "," + this.communalEstablishmentResidentsMalesAge65to69;
        r += "," + this.communalEstablishmentResidentsFemalesAge65to69;
        r += "," + this.allPeopleAge70to74;
        r += "," + this.householdResidentsMalesAge70to74;
        r += "," + this.householdResidentsFemalesAge70to74;
        r += "," + this.communalEstablishmentResidentsMalesAge70to74;
        r += "," + this.communalEstablishmentResidentsFemalesAge70to74;
        r += "," + this.allPeopleAge75to79;
        r += "," + this.householdResidentsMalesAge75to79;
        r += "," + this.householdResidentsFemalesAge75to79;
        r += "," + this.communalEstablishmentResidentsMalesAge75to79;
        r += "," + this.communalEstablishmentResidentsFemalesAge75to79;
        r += "," + this.allPeopleAge80to84;
        r += "," + this.householdResidentsMalesAge80to84;
        r += "," + this.householdResidentsFemalesAge80to84;
        r += "," + this.communalEstablishmentResidentsMalesAge80to84;
        r += "," + this.communalEstablishmentResidentsFemalesAge80to84;
        r += "," + this.allPeopleAge85to89;
        r += "," + this.householdResidentsMalesAge85to89;
        r += "," + this.householdResidentsFemalesAge85to89;
        r += "," + this.communalEstablishmentResidentsMalesAge85to89;
        r += "," + this.communalEstablishmentResidentsFemalesAge85to89;
        r += "," + this.allPeopleAge90AndOver;
        r += "," + this.householdResidentsMalesAge90AndOver;
        r += "," + this.householdResidentsFemalesAge90AndOver;
        r += "," + this.communalEstablishmentResidentsMalesAge90AndOver;
        r += "," + this.communalEstablishmentResidentsFemalesAge90AndOver;
        return r;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        String r = super.toCSVHeader();
        r += ",allPeople";
        r += ",householdResidentsMales";
        r += ",householdResidentsFemales";
        r += ",communalEstablishmentResidentsMales";
        r += ",communalEstablishmentResidentsFemales";
        r += ",allPeopleAge0to4";
        r += ",householdResidentsMalesAge0to4";
        r += ",householdResidentsFemalesAge0to4";
        r += ",communalEstablishmentResidentsMalesAge0to4";
        r += ",communalEstablishmentResidentsFemalesAge0to4";
        r += ",allPeopleAge0";
        r += ",householdResidentsMalesAge0";
        r += ",householdResidentsFemalesAge0";
        r += ",communalEstablishmentResidentsMalesAge0";
        r += ",communalEstablishmentResidentsFemalesAge0";
        r += ",allPeopleAge1";
        r += ",householdResidentsMalesAge1";
        r += ",householdResidentsFemalesAge1";
        r += ",communalEstablishmentResidentsMalesAge1";
        r += ",communalEstablishmentResidentsFemalesAge1";
        r += ",allPeopleAge2";
        r += ",householdResidentsMalesAge2";
        r += ",householdResidentsFemalesAge2";
        r += ",communalEstablishmentResidentsMalesAge2";
        r += ",communalEstablishmentResidentsFemalesAge2";
        r += ",allPeopleAge3";
        r += ",householdResidentsMalesAge3";
        r += ",householdResidentsFemalesAge3";
        r += ",communalEstablishmentResidentsMalesAge3";
        r += ",communalEstablishmentResidentsFemalesAge3";
        r += ",allPeopleAge4";
        r += ",householdResidentsMalesAge4";
        r += ",householdResidentsFemalesAge4";
        r += ",communalEstablishmentResidentsMalesAge4";
        r += ",communalEstablishmentResidentsFemalesAge4";
        r += ",allPeopleAge5to9";
        r += ",householdResidentsMalesAge5to9";
        r += ",householdResidentsFemalesAge5to9";
        r += ",communalEstablishmentResidentsMalesAge5to9";
        r += ",communalEstablishmentResidentsFemalesAge5to9";
        r += ",allPeopleAge5";
        r += ",householdResidentsMalesAge5";
        r += ",householdResidentsFemalesAge5";
        r += ",communalEstablishmentResidentsMalesAge5";
        r += ",communalEstablishmentResidentsFemalesAge5";
        r += ",allPeopleAge6";
        r += ",householdResidentsMalesAge6";
        r += ",householdResidentsFemalesAge6";
        r += ",communalEstablishmentResidentsMalesAge6";
        r += ",communalEstablishmentResidentsFemalesAge6";
        r += ",allPeopleAge7";
        r += ",householdResidentsMalesAge7";
        r += ",householdResidentsFemalesAge7";
        r += ",communalEstablishmentResidentsMalesAge7";
        r += ",communalEstablishmentResidentsFemalesAge7";
        r += ",allPeopleAge8";
        r += ",householdResidentsMalesAge8";
        r += ",householdResidentsFemalesAge8";
        r += ",communalEstablishmentResidentsMalesAge8";
        r += ",communalEstablishmentResidentsFemalesAge8";
        r += ",allPeopleAge9";
        r += ",householdResidentsMalesAge9";
        r += ",householdResidentsFemalesAge9";
        r += ",communalEstablishmentResidentsMalesAge9";
        r += ",communalEstablishmentResidentsFemalesAge9";
        r += ",allPeopleAge10to14";
        r += ",householdResidentsMalesAge10to14";
        r += ",householdResidentsFemalesAge10to14";
        r += ",communalEstablishmentResidentsMalesAge10to14";
        r += ",communalEstablishmentResidentsFemalesAge10to14";
        r += ",allPeopleAge10";
        r += ",householdResidentsMalesAge10";
        r += ",householdResidentsFemalesAge10";
        r += ",communalEstablishmentResidentsMalesAge10";
        r += ",communalEstablishmentResidentsFemalesAge10";
        r += ",allPeopleAge11";
        r += ",householdResidentsMalesAge11";
        r += ",householdResidentsFemalesAge11";
        r += ",communalEstablishmentResidentsMalesAge11";
        r += ",communalEstablishmentResidentsFemalesAge11";
        r += ",allPeopleAge12";
        r += ",householdResidentsMalesAge12";
        r += ",householdResidentsFemalesAge12";
        r += ",communalEstablishmentResidentsMalesAge12";
        r += ",communalEstablishmentResidentsFemalesAge12";
        r += ",allPeopleAge13";
        r += ",householdResidentsMalesAge13";
        r += ",householdResidentsFemalesAge13";
        r += ",communalEstablishmentResidentsMalesAge13";
        r += ",communalEstablishmentResidentsFemalesAge13";
        r += ",allPeopleAge14";
        r += ",householdResidentsMalesAge14";
        r += ",householdResidentsFemalesAge14";
        r += ",communalEstablishmentResidentsMalesAge14";
        r += ",communalEstablishmentResidentsFemalesAge14";
        r += ",allPeopleAge15to19";
        r += ",householdResidentsMalesAge15to19";
        r += ",householdResidentsFemalesAge15to19";
        r += ",communalEstablishmentResidentsMalesAge15to19";
        r += ",communalEstablishmentResidentsFemalesAge15to19";
        r += ",allPeopleAge15";
        r += ",householdResidentsMalesAge15";
        r += ",householdResidentsFemalesAge15";
        r += ",communalEstablishmentResidentsMalesAge15";
        r += ",communalEstablishmentResidentsFemalesAge15";
        r += ",allPeopleAge16";
        r += ",householdResidentsMalesAge16";
        r += ",householdResidentsFemalesAge16";
        r += ",communalEstablishmentResidentsMalesAge16";
        r += ",communalEstablishmentResidentsFemalesAge16";
        r += ",allPeopleAge17";
        r += ",householdResidentsMalesAge17";
        r += ",householdResidentsFemalesAge17";
        r += ",communalEstablishmentResidentsMalesAge17";
        r += ",communalEstablishmentResidentsFemalesAge17";
        r += ",allPeopleAge18";
        r += ",householdResidentsMalesAge18";
        r += ",householdResidentsFemalesAge18";
        r += ",communalEstablishmentResidentsMalesAge18";
        r += ",communalEstablishmentResidentsFemalesAge18";
        r += ",allPeopleAge19";
        r += ",householdResidentsMalesAge19";
        r += ",householdResidentsFemalesAge19";
        r += ",communalEstablishmentResidentsMalesAge19";
        r += ",communalEstablishmentResidentsFemalesAge19";
        r += ",allPeopleAge20to24";
        r += ",householdResidentsMalesAge20to24";
        r += ",householdResidentsFemalesAge20to24";
        r += ",communalEstablishmentResidentsMalesAge20to24";
        r += ",communalEstablishmentResidentsFemalesAge20to24";
        r += ",allPeopleAge20";
        r += ",householdResidentsMalesAge20";
        r += ",householdResidentsFemalesAge20";
        r += ",communalEstablishmentResidentsMalesAge20";
        r += ",communalEstablishmentResidentsFemalesAge20";
        r += ",allPeopleAge21";
        r += ",householdResidentsMalesAge21";
        r += ",householdResidentsFemalesAge21";
        r += ",communalEstablishmentResidentsMalesAge21";
        r += ",communalEstablishmentResidentsFemalesAge21";
        r += ",allPeopleAge22";
        r += ",householdResidentsMalesAge22";
        r += ",householdResidentsFemalesAge22";
        r += ",communalEstablishmentResidentsMalesAge22";
        r += ",communalEstablishmentResidentsFemalesAge22";
        r += ",allPeopleAge23";
        r += ",householdResidentsMalesAge23";
        r += ",householdResidentsFemalesAge23";
        r += ",communalEstablishmentResidentsMalesAge23";
        r += ",communalEstablishmentResidentsFemalesAge23";
        r += ",allPeopleAge24";
        r += ",householdResidentsMalesAge24";
        r += ",householdResidentsFemalesAge24";
        r += ",communalEstablishmentResidentsMalesAge24";
        r += ",communalEstablishmentResidentsFemalesAge24";
        r += ",allPeopleAge25to29";
        r += ",householdResidentsMalesAge25to29";
        r += ",householdResidentsFemalesAge25to29";
        r += ",communalEstablishmentResidentsMalesAge25to29";
        r += ",communalEstablishmentResidentsFemalesAge25to29";
        r += ",allPeopleAge30to34";
        r += ",householdResidentsMalesAge30to34";
        r += ",householdResidentsFemalesAge30to34";
        r += ",communalEstablishmentResidentsMalesAge30to34";
        r += ",communalEstablishmentResidentsFemalesAge30to34";
        r += ",allPeopleAge35to39";
        r += ",householdResidentsMalesAge35to39";
        r += ",householdResidentsFemalesAge35to39";
        r += ",communalEstablishmentResidentsMalesAge35to39";
        r += ",communalEstablishmentResidentsFemalesAge35to39";
        r += ",allPeopleAge40to44";
        r += ",householdResidentsMalesAge40to44";
        r += ",householdResidentsFemalesAge40to44";
        r += ",communalEstablishmentResidentsMalesAge40to44";
        r += ",communalEstablishmentResidentsFemalesAge40to44";
        r += ",allPeopleAge45to49";
        r += ",householdResidentsMalesAge45to49";
        r += ",householdResidentsFemalesAge45to49";
        r += ",communalEstablishmentResidentsMalesAge45to49";
        r += ",communalEstablishmentResidentsFemalesAge45to49";
        r += ",allPeopleAge50to54";
        r += ",householdResidentsMalesAge50to54";
        r += ",householdResidentsFemalesAge50to54";
        r += ",communalEstablishmentResidentsMalesAge50to54";
        r += ",communalEstablishmentResidentsFemalesAge50to54";
        r += ",allPeopleAge55to59";
        r += ",householdResidentsMalesAge55to59";
        r += ",householdResidentsFemalesAge55to59";
        r += ",communalEstablishmentResidentsMalesAge55to59";
        r += ",communalEstablishmentResidentsFemalesAge55to59";
        r += ",allPeopleAge60to64";
        r += ",householdResidentsMalesAge60to64";
        r += ",householdResidentsFemalesAge60to64";
        r += ",communalEstablishmentResidentsMalesAge60to64";
        r += ",communalEstablishmentResidentsFemalesAge60to64";
        r += ",allPeopleAge65to69";
        r += ",householdResidentsMalesAge65to69";
        r += ",householdResidentsFemalesAge65to69";
        r += ",communalEstablishmentResidentsMalesAge65to69";
        r += ",communalEstablishmentResidentsFemalesAge65to69";
        r += ",allPeopleAge70to74";
        r += ",householdResidentsMalesAge70to74";
        r += ",householdResidentsFemalesAge70to74";
        r += ",communalEstablishmentResidentsMalesAge70to74";
        r += ",communalEstablishmentResidentsFemalesAge70to74";
        r += ",allPeopleAge75to79";
        r += ",householdResidentsMalesAge75to79";
        r += ",householdResidentsFemalesAge75to79";
        r += ",communalEstablishmentResidentsMalesAge75to79";
        r += ",communalEstablishmentResidentsFemalesAge75to79";
        r += ",allPeopleAge80to84";
        r += ",householdResidentsMalesAge80to84";
        r += ",householdResidentsFemalesAge80to84";
        r += ",communalEstablishmentResidentsMalesAge80to84";
        r += ",communalEstablishmentResidentsFemalesAge80to84";
        r += ",allPeopleAge85to89";
        r += ",householdResidentsMalesAge85to89";
        r += ",householdResidentsFemalesAge85to89";
        r += ",communalEstablishmentResidentsMalesAge85to89";
        r += ",communalEstablishmentResidentsFemalesAge85to89";
        r += ",allPeopleAge90AndOver";
        r += ",householdResidentsMalesAge90AndOver";
        r += ",householdResidentsFemalesAge90AndOver";
        r += ",communalEstablishmentResidentsMalesAge90AndOver";
        r += ",communalEstablishmentResidentsFemalesAge90AndOver";
        return r;
    }

    /**
     * Returns a copy of this.allPeople
     *
     * @return
     */
    public int getAllPeople() {
        return this.allPeople;
    }

    /**
     * Returns a copy of this.householdResidentsMales
     *
     * @return
     */
    public int getHouseholdResidentsMales() {
        return this.householdResidentsMales;
    }

    /**
     * Returns a copy of this.householdResidentsFemales
     *
     * @return
     */
    public int getHouseholdResidentsFemales() {
        return this.householdResidentsFemales;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMales
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMales() {
        return this.communalEstablishmentResidentsMales;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemales
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemales() {
        return this.communalEstablishmentResidentsFemales;
    }

// It seems this is not worth having as the age groups in the census are a bit of a muddle... 
//
//    /**
//     * Returns a count of all people in the age group (startAge, endAge);
//     */
//    public int getAllPeople(
//            int startAge,
//            int endAge) {
//        if (startAge == 0) {
//            if (endAge == 0)
//        }
//        return this.allPeopleAge0to4;
//    }
    /**
     * Returns a copy of this.allPeopleAge0to4
     *
     * @return
     */
    public int getAllPeopleAge0to4() {
        return this.allPeopleAge0to4;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge0to4
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge0to4() {
        return this.householdResidentsMalesAge0to4;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge0to4
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge0to4() {
        return this.householdResidentsFemalesAge0to4;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge0to4
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge0to4() {
        return this.communalEstablishmentResidentsMalesAge0to4;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge0to4
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge0to4() {
        return this.communalEstablishmentResidentsFemalesAge0to4;
    }

    /**
     * Returns a copy of this.allPeopleAge0
     *
     * @return
     */
    public int getAllPeopleAge0() {
        return this.allPeopleAge0;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge0
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge0() {
        return this.householdResidentsMalesAge0;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge0
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge0() {
        return this.householdResidentsFemalesAge0;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge0
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge0() {
        return this.communalEstablishmentResidentsMalesAge0;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge0
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge0() {
        return this.communalEstablishmentResidentsFemalesAge0;
    }

    /**
     * Returns a copy of this.allPeopleAge1
     *
     * @return
     */
    public int getAllPeopleAge1() {
        return this.allPeopleAge1;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge1
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge1() {
        return this.householdResidentsMalesAge1;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge1
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge1() {
        return this.householdResidentsFemalesAge1;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge1
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge1() {
        return this.communalEstablishmentResidentsMalesAge1;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge1
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge1() {
        return this.communalEstablishmentResidentsFemalesAge1;
    }

    /**
     * Returns a copy of this.allPeopleAge2
     *
     * @return
     */
    public int getAllPeopleAge2() {
        return this.allPeopleAge2;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge2
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge2() {
        return this.householdResidentsMalesAge2;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge2
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge2() {
        return this.householdResidentsFemalesAge2;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge2
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge2() {
        return this.communalEstablishmentResidentsMalesAge2;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge0
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge2() {
        return this.communalEstablishmentResidentsFemalesAge2;
    }

    /**
     * Returns a copy of this.allPeopleAge3
     *
     * @return
     */
    public int getAllPeopleAge3() {
        return this.allPeopleAge3;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge3
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge3() {
        return this.householdResidentsMalesAge3;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge3
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge3() {
        return this.householdResidentsFemalesAge3;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge3
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge3() {
        return this.communalEstablishmentResidentsMalesAge3;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge3
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge3() {
        return this.communalEstablishmentResidentsFemalesAge3;
    }

    /**
     * Returns a copy of this.allPeopleAge0
     *
     * @return
     */
    public int getAllPeopleAge4() {
        return this.allPeopleAge4;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge4
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge4() {
        return this.householdResidentsMalesAge4;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge4
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge4() {
        return this.householdResidentsFemalesAge4;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge4
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge4() {
        return this.communalEstablishmentResidentsMalesAge4;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge4
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge4() {
        return this.communalEstablishmentResidentsFemalesAge4;
    }

    /**
     * Returns a copy of this.allPeopleAge5to9
     *
     * @return
     */
    public int getAllPeopleAge5to9() {
        return this.allPeopleAge5to9;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge5to9
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge5to9() {
        return this.householdResidentsMalesAge5to9;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge5to9
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge5to9() {
        return this.householdResidentsFemalesAge5to9;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge5to9
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge5to9() {
        return this.communalEstablishmentResidentsMalesAge5to9;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge5to9
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge5to9() {
        return this.communalEstablishmentResidentsFemalesAge5to9;
    }

    /**
     * Returns a copy of this.allPeopleAge5
     *
     * @return
     */
    public int getAllPeopleAge5() {
        return this.allPeopleAge5;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge5
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge5() {
        return this.householdResidentsMalesAge5;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge5
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge5() {
        return this.householdResidentsFemalesAge5;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge5
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge5() {
        return this.communalEstablishmentResidentsMalesAge5;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge5
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge5() {
        return this.communalEstablishmentResidentsFemalesAge5;
    }

    /**
     * Returns a copy of this.allPeopleAge6
     *
     * @return
     */
    public int getAllPeopleAge6() {
        return this.allPeopleAge6;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge6
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge6() {
        return this.householdResidentsMalesAge6;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge6
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge6() {
        return this.householdResidentsFemalesAge6;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge6
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge6() {
        return this.communalEstablishmentResidentsMalesAge6;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge6
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge6() {
        return this.communalEstablishmentResidentsFemalesAge6;
    }

    /**
     * Returns a copy of this.allPeopleAge7
     *
     * @return
     */
    public int getAllPeopleAge7() {
        return this.allPeopleAge7;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge7
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge7() {
        return this.householdResidentsMalesAge7;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge7
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge7() {
        return this.householdResidentsFemalesAge7;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge7
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge7() {
        return this.communalEstablishmentResidentsMalesAge7;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge7
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge7() {
        return this.communalEstablishmentResidentsFemalesAge7;
    }

    /**
     * Returns a copy of this.allPeopleAge8
     *
     * @return
     */
    public int getAllPeopleAge8() {
        return this.allPeopleAge8;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge8
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge8() {
        return this.householdResidentsMalesAge8;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge8
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge8() {
        return this.householdResidentsFemalesAge8;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge8
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge8() {
        return this.communalEstablishmentResidentsMalesAge8;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge8
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge8() {
        return this.communalEstablishmentResidentsFemalesAge8;
    }

    /**
     * Returns a copy of this.allPeopleAge9
     *
     * @return
     */
    public int getAllPeopleAge9() {
        return this.allPeopleAge9;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge9
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge9() {
        return this.householdResidentsMalesAge9;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge9
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge9() {
        return this.householdResidentsFemalesAge9;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge9
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge9() {
        return this.communalEstablishmentResidentsMalesAge9;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge9
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge9() {
        return this.communalEstablishmentResidentsFemalesAge9;
    }

    /**
     * Returns a copy of this.allPeopleAge10to14
     *
     * @return
     */
    public int getAllPeopleAge10to14() {
        return this.allPeopleAge10to14;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge10to14
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge10to14() {
        return this.householdResidentsMalesAge10to14;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge10to14
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge10to14() {
        return this.householdResidentsFemalesAge10to14;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge10to14
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge10to14() {
        return this.communalEstablishmentResidentsMalesAge10to14;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge10to14
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge10to14() {
        return this.communalEstablishmentResidentsFemalesAge10to14;
    }

    /**
     * Returns a copy of this.allPeopleAge10
     *
     * @return
     */
    public int getAllPeopleAge10() {
        return this.allPeopleAge10;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge10
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge10() {
        return this.householdResidentsMalesAge10;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge10
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge10() {
        return this.householdResidentsFemalesAge10;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge10
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge10() {
        return this.communalEstablishmentResidentsMalesAge10;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge10
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge10() {
        return this.communalEstablishmentResidentsFemalesAge10;
    }

    /**
     * Returns a copy of this.allPeopleAge11
     *
     * @return
     */
    public int getAllPeopleAge11() {
        return this.allPeopleAge11;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge11
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge11() {
        return this.householdResidentsMalesAge11;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge11
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge11() {
        return this.householdResidentsFemalesAge11;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge11
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge11() {
        return this.communalEstablishmentResidentsMalesAge11;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge11
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge11() {
        return this.communalEstablishmentResidentsFemalesAge11;
    }

    /**
     * Returns a copy of this.allPeopleAge12
     *
     * @return
     */
    public int getAllPeopleAge12() {
        return this.allPeopleAge12;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge12
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge12() {
        return this.householdResidentsMalesAge12;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge12
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge12() {
        return this.householdResidentsFemalesAge12;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge12
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge12() {
        return this.communalEstablishmentResidentsMalesAge12;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge12
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge12() {
        return this.communalEstablishmentResidentsFemalesAge12;
    }

    /**
     * Returns a copy of this.allPeopleAge13
     *
     * @return
     */
    public int getAllPeopleAge13() {
        return this.allPeopleAge13;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge13
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge13() {
        return this.householdResidentsMalesAge13;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge13
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge13() {
        return this.householdResidentsFemalesAge13;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge13
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge13() {
        return this.communalEstablishmentResidentsMalesAge13;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge13
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge13() {
        return this.communalEstablishmentResidentsFemalesAge13;
    }

    /**
     * Returns a copy of this.allPeopleAge14
     *
     * @return
     */
    public int getAllPeopleAge14() {
        return this.allPeopleAge14;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge14
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge14() {
        return this.householdResidentsMalesAge14;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge14
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge14() {
        return this.householdResidentsFemalesAge14;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge14
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge14() {
        return this.communalEstablishmentResidentsMalesAge14;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge14
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge14() {
        return this.communalEstablishmentResidentsFemalesAge14;
    }

    /**
     * Returns a copy of this.allPeopleAge15to19
     *
     * @return
     */
    public int getAllPeopleAge15to19() {
        return this.allPeopleAge15to19;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge15to19
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge15to19() {
        return this.householdResidentsMalesAge15to19;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge15to19
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge15to19() {
        return this.householdResidentsFemalesAge15to19;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge15to19
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge15to19() {
        return this.communalEstablishmentResidentsMalesAge15to19;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge15to19
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge15to19() {
        return this.communalEstablishmentResidentsFemalesAge15to19;
    }

    /**
     * Returns a copy of this.allPeopleAge15
     *
     * @return
     */
    public int getAllPeopleAge15() {
        return this.allPeopleAge15;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge15
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge15() {
        return this.householdResidentsMalesAge15;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge15
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge15() {
        return this.householdResidentsFemalesAge15;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge15
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge15() {
        return this.communalEstablishmentResidentsMalesAge15;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge15
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge15() {
        return this.communalEstablishmentResidentsFemalesAge15;
    }

    /**
     * Returns a copy of this.allPeopleAge16
     *
     * @return
     */
    public int getAllPeopleAge16() {
        return this.allPeopleAge16;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge16
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge16() {
        return this.householdResidentsMalesAge16;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge16
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge16() {
        return this.householdResidentsFemalesAge16;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge16
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge16() {
        return this.communalEstablishmentResidentsMalesAge16;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge16
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge16() {
        return this.communalEstablishmentResidentsFemalesAge16;
    }

    /**
     * Returns a copy of this.allPeopleAge17
     *
     * @return
     */
    public int getAllPeopleAge17() {
        return this.allPeopleAge17;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge17
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge17() {
        return this.householdResidentsMalesAge17;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge17
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge17() {
        return this.householdResidentsFemalesAge17;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge17
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge17() {
        return this.communalEstablishmentResidentsMalesAge17;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge17
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge17() {
        return this.communalEstablishmentResidentsFemalesAge17;
    }

    /**
     * Returns a copy of this.allPeopleAge18
     *
     * @return
     */
    public int getAllPeopleAge18() {
        return this.allPeopleAge18;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge18
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge18() {
        return this.householdResidentsMalesAge18;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge18
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge18() {
        return this.householdResidentsFemalesAge18;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge18
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge18() {
        return this.communalEstablishmentResidentsMalesAge18;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge18
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge18() {
        return this.communalEstablishmentResidentsFemalesAge18;
    }

    /**
     * Returns a copy of this.allPeopleAge19
     *
     * @return
     */
    public int getAllPeopleAge19() {
        return this.allPeopleAge19;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge19
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge19() {
        return this.householdResidentsMalesAge19;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge19
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge19() {
        return this.householdResidentsFemalesAge19;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge19
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge19() {
        return this.communalEstablishmentResidentsMalesAge19;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge19
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge19() {
        return this.communalEstablishmentResidentsFemalesAge19;
    }

    /**
     * Returns a copy of this.allPeopleAge20to24
     *
     * @return
     */
    public int getAllPeopleAge20to24() {
        return this.allPeopleAge20to24;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge20to24
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge20to24() {
        return this.householdResidentsMalesAge20to24;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge20to24
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge20to24() {
        return this.householdResidentsFemalesAge20to24;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge20to24
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge20to24() {
        return this.communalEstablishmentResidentsMalesAge20to24;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge20to24
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge20to24() {
        return this.communalEstablishmentResidentsFemalesAge20to24;
    }

    /**
     * Returns a copy of this.allPeopleAge20
     *
     * @return
     */
    public int getAllPeopleAge20() {
        return this.allPeopleAge20;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge20
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge20() {
        return this.householdResidentsMalesAge20;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge20
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge20() {
        return this.householdResidentsFemalesAge20;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge20
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge20() {
        return this.communalEstablishmentResidentsMalesAge20;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge20
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge20() {
        return this.communalEstablishmentResidentsFemalesAge20;
    }

    /**
     * Returns a copy of this.allPeopleAge21
     *
     * @return
     */
    public int getAllPeopleAge21() {
        return this.allPeopleAge21;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge21
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge21() {
        return this.householdResidentsMalesAge21;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge21
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge21() {
        return this.householdResidentsFemalesAge21;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge21
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge21() {
        return this.communalEstablishmentResidentsMalesAge21;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge21
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge21() {
        return this.communalEstablishmentResidentsFemalesAge21;
    }

    /**
     * Returns a copy of this.allPeopleAge22
     *
     * @return
     */
    public int getAllPeopleAge22() {
        return this.allPeopleAge22;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge22
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge22() {
        return this.householdResidentsMalesAge22;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge22
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge22() {
        return this.householdResidentsFemalesAge22;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge22
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge22() {
        return this.communalEstablishmentResidentsMalesAge22;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge22
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge22() {
        return this.communalEstablishmentResidentsFemalesAge22;
    }

    /**
     * Returns a copy of this.allPeopleAge23
     *
     * @return
     */
    public int getAllPeopleAge23() {
        return this.allPeopleAge23;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge23
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge23() {
        return this.householdResidentsMalesAge23;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge23
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge23() {
        return this.householdResidentsFemalesAge23;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge23
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge23() {
        return this.communalEstablishmentResidentsMalesAge23;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge23
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge23() {
        return this.communalEstablishmentResidentsFemalesAge23;
    }

    /**
     * Returns a copy of this.allPeopleAge24
     *
     * @return
     */
    public int getAllPeopleAge24() {
        return this.allPeopleAge24;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge24
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge24() {
        return this.householdResidentsMalesAge24;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge24
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge24() {
        return this.householdResidentsFemalesAge24;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge24
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge24() {
        return this.communalEstablishmentResidentsMalesAge24;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge24
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge24() {
        return this.communalEstablishmentResidentsFemalesAge24;
    }

    /**
     * Returns a copy of this.allPeopleAge25to29
     *
     * @return
     */
    public int getAllPeopleAge25to29() {
        return this.allPeopleAge25to29;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge25to29
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge25to29() {
        return this.householdResidentsMalesAge25to29;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge25to29
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge25to29() {
        return this.householdResidentsFemalesAge25to29;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge25to29
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge25to29() {
        return this.communalEstablishmentResidentsMalesAge25to29;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge25to29
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge25to29() {
        return this.communalEstablishmentResidentsFemalesAge25to29;
    }

    /**
     * Returns a copy of this.allPeopleAge30to34
     *
     * @return
     */
    public int getAllPeopleAge30to34() {
        return this.allPeopleAge30to34;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge30to34
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge30to34() {
        return this.householdResidentsMalesAge30to34;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge30to34
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge30to34() {
        return this.householdResidentsFemalesAge30to34;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge30to34
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge30to34() {
        return this.communalEstablishmentResidentsMalesAge30to34;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge30to34
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge30to34() {
        return this.communalEstablishmentResidentsFemalesAge30to34;
    }

    /**
     * Returns a copy of this.allPeopleAge35to39
     *
     * @return
     */
    public int getAllPeopleAge35to39() {
        return this.allPeopleAge35to39;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge35to39
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge35to39() {
        return this.householdResidentsMalesAge35to39;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge35to39
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge35to39() {
        return this.householdResidentsFemalesAge35to39;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge35to39
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge35to39() {
        return this.communalEstablishmentResidentsMalesAge35to39;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge35to39
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge35to39() {
        return this.communalEstablishmentResidentsFemalesAge35to39;
    }

    /**
     * Returns a copy of this.allPeopleAge40to44
     *
     * @return
     */
    public int getAllPeopleAge40to44() {
        return this.allPeopleAge40to44;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge40to44
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge40to44() {
        return this.householdResidentsMalesAge40to44;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge40to44
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge40to44() {
        return this.householdResidentsFemalesAge40to44;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge40to44
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge40to44() {
        return this.communalEstablishmentResidentsMalesAge40to44;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge40to44
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge40to44() {
        return this.communalEstablishmentResidentsFemalesAge40to44;
    }

    /**
     * Returns a copy of this.allPeopleAge45to49
     *
     * @return
     */
    public int getAllPeopleAge45to49() {
        return this.allPeopleAge45to49;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge45to49
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge45to49() {
        return this.householdResidentsMalesAge45to49;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge45to49
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge45to49() {
        return this.householdResidentsFemalesAge45to49;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge45to49
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge45to49() {
        return this.communalEstablishmentResidentsMalesAge45to49;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge45to49
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge45to49() {
        return this.communalEstablishmentResidentsFemalesAge45to49;
    }

    /**
     * Returns a copy of this.allPeopleAge50to54
     *
     * @return
     */
    public int getAllPeopleAge50to54() {
        return this.allPeopleAge50to54;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge50to54
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge50to54() {
        return this.householdResidentsMalesAge50to54;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge50to54
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge50to54() {
        return this.householdResidentsFemalesAge50to54;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge50to54
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge50to54() {
        return this.communalEstablishmentResidentsMalesAge50to54;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge50to54
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge50to54() {
        return this.communalEstablishmentResidentsFemalesAge50to54;
    }

    /**
     * Returns a copy of this.allPeopleAge55to59
     *
     * @return
     */
    public int getAllPeopleAge55to59() {
        return this.allPeopleAge55to59;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge55to59
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge55to59() {
        return this.householdResidentsMalesAge55to59;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge55to59
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge55to59() {
        return this.householdResidentsFemalesAge55to59;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge55to59
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge55to59() {
        return this.communalEstablishmentResidentsMalesAge55to59;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge55to59
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge55to59() {
        return this.communalEstablishmentResidentsFemalesAge55to59;
    }

    /**
     * Returns a copy of this.allPeopleAge60to64
     *
     * @return
     */
    public int getAllPeopleAge60to64() {
        return this.allPeopleAge60to64;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge60to64
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge60to64() {
        return this.householdResidentsMalesAge60to64;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge60to64
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge60to64() {
        return this.householdResidentsFemalesAge60to64;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge60to64
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge60to64() {
        return this.communalEstablishmentResidentsMalesAge60to64;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge60to64
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge60to64() {
        return this.communalEstablishmentResidentsFemalesAge60to64;
    }

    /**
     * Returns a copy of this.allPeopleAge65to69
     *
     * @return
     */
    public int getAllPeopleAge65to69() {
        return this.allPeopleAge65to69;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge65to69
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge65to69() {
        return this.householdResidentsMalesAge65to69;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge65to69
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge65to69() {
        return this.householdResidentsFemalesAge65to69;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge65to69
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge65to69() {
        return this.communalEstablishmentResidentsMalesAge65to69;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge65to69
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge65to69() {
        return this.communalEstablishmentResidentsFemalesAge65to69;
    }

    /**
     * Returns a copy of this.allPeopleAge70to74
     *
     * @return
     */
    public int getAllPeopleAge70to74() {
        return this.allPeopleAge70to74;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge70to74
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge70to74() {
        return this.householdResidentsMalesAge70to74;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge70to74
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge70to74() {
        return this.householdResidentsFemalesAge70to74;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge70to74
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge70to74() {
        return this.communalEstablishmentResidentsMalesAge70to74;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge70to74
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge70to74() {
        return this.communalEstablishmentResidentsFemalesAge70to74;
    }

    /**
     * Returns a copy of this.allPeopleAge75to79
     *
     * @return
     */
    public int getAllPeopleAge75to79() {
        return this.allPeopleAge75to79;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge75to79
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge75to79() {
        return this.householdResidentsMalesAge75to79;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge75to79
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge75to79() {
        return this.householdResidentsFemalesAge75to79;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge75to79
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge75to79() {
        return this.communalEstablishmentResidentsMalesAge75to79;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge75to79
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge75to79() {
        return this.communalEstablishmentResidentsFemalesAge75to79;
    }

    /**
     * Returns a copy of this.allPeopleAge80to84
     *
     * @return
     */
    public int getAllPeopleAge80to84() {
        return this.allPeopleAge80to84;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge80to84
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge80to84() {
        return this.householdResidentsMalesAge80to84;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge80to84
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge80to84() {
        return this.householdResidentsFemalesAge80to84;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge80to84
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge80to84() {
        return this.communalEstablishmentResidentsMalesAge80to84;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge80to84
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge80to84() {
        return this.communalEstablishmentResidentsFemalesAge80to84;
    }

    /**
     * Returns a copy of this.allPeopleAge85to89
     *
     * @return
     */
    public int getAllPeopleAge85to89() {
        return this.allPeopleAge85to89;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge85to89
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge85to89() {
        return this.householdResidentsMalesAge85to89;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge85to89
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge85to89() {
        return this.householdResidentsFemalesAge85to89;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge85to89
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge85to89() {
        return this.communalEstablishmentResidentsMalesAge85to89;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge85to89
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge85to89() {
        return this.communalEstablishmentResidentsFemalesAge85to89;
    }

    /**
     * Returns a copy of this.allPeopleAge90AndOver
     *
     * @return
     */
    public int getAllPeopleAge90AndOver() {
        return this.allPeopleAge90AndOver;
    }

    /**
     * Returns a copy of this.householdResidentsMalesAge90AndOver
     *
     * @return
     */
    public int getHouseholdResidentsMalesAge90AndOver() {
        return this.householdResidentsMalesAge90AndOver;
    }

    /**
     * Returns a copy of this.householdResidentsFemalesAge90AndOver
     *
     * @return
     */
    public int getHouseholdResidentsFemalesAge90AndOver() {
        return this.householdResidentsFemalesAge90AndOver;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsMalesAge90AndOver
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsMalesAge90AndOver() {
        return this.communalEstablishmentResidentsMalesAge90AndOver;
    }

    /**
     * Returns a copy of this.communalEstablishmentResidentsFemalesAge90AndOver
     *
     * @return
     */
    public int getCommunalEstablishmentResidentsFemalesAge90AndOver() {
        return this.communalEstablishmentResidentsFemalesAge90AndOver;
    }
}
