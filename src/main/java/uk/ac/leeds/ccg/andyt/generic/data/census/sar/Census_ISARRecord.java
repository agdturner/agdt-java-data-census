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
package uk.ac.leeds.ccg.andyt.generic.data.census.sar;

import uk.ac.leeds.ccg.andyt.generic.data.census.data.Census_Record;
import uk.ac.leeds.ccg.andyt.generic.data.census.data.id.Census_RecordID;

/**
 * For representing an Individual SAR Data Record and providing safe access to
 * the data.
 */
public class Census_ISARRecord extends Census_Record {

    /*
     * Individual
     */
    /**
     * Age of respondents grouped
     */
    protected short AGE0;
    /**
     * Status in communal establishment
     */
    protected short CESTATUS;
    /**
     * Type of communal establishment
     */
    protected short CETYPE;
    /**
     * Country of birth
     */
    protected short COBIRT0;
    /**
     * Community background-religion or religion brought up in (Northern
     * Ireland)
     */
    protected short COMBGN;
    /**
     * Country of usual residence
     */
    protected short COUNTRY;
    /**
     * Distance of move of migrant-banded
     */
    protected short DISTMOV0;
    /**
     * Distance to work
     */
    protected short DISTWRK0;
    /**
     * Ethnic group for England and Wales
     */
    protected short ETHEW;
    /**
     * Ethnic group for Northern Ireland
     */
    protected short ETHN;
    /**
     * Ethnic group for Scotland
     */
    protected short ETHS;
    /**
     * Whether reads Gaelic (Scotland);
     */
    protected short GAELREAD;
    /**
     * Whether speaks Gaelic (Scotland)
     */
    protected short GAELSPK;
    /**
     * Whether understands Gaelic (Scotland)
     */
    protected short GAELSTND;
    /**
     * Whether writes Gaelic (Scotland)
     */
    protected short GAELWRIT;
    /**
     * Generation indicator
     */
    protected short GENIND;
    /**
     * General health over last twelve months
     */
    protected short HEALTH;
    /**
     * Person's unique identifier
     */
    protected long ID2;
    /**
     * Whether reads/speaks/understands/writes Irish (Northern Ireland)
     */
    protected short IRISLANG;
    /**
     * Limiting long term illness
     */
    protected short LLTI;
    /**
     * Marital status
     */
    protected short MARSTAT;
    /**
     * Migration indicator
     */
    protected short MIGIND;
    /**
     * Migrants: area of former residence
     */
    protected short MIGORGN;
    /**
     * Record identifier
     */
    protected long PNUM;
    /**
     * Profesional qualification (England and Wales)
     */
    protected short PROFQUAL;
    /**
     * Number of hours care provided per week
     */
    protected short PROVCARE;
    /**
     * Level of highest qualifications (aged 16-74) (England, Wales and Northern
     * Ireland)
     */
    protected short QUALVEWN; //
    /**
     * Level of highest qualifications (aged 16-74) (Scotland)
     */
    protected short QUALVS;
    /**
     * Religion (England and Wales)
     */
    protected short RELGEW;
    /**
     * Religion belongs to (Scotland)
     */
    protected short RELGS1;
    /**
     * Religion (Northern Ireland)
     */
    protected short RELIGN;
    /**
     * Relationship to Household Reference Person
     */
    protected short RELTOHR;
    /**
     * Gender
     */
    protected boolean SEX;
    /**
     * Schoolchild or student in full-time education
     */
    protected boolean STUDENT;
    /**
     * Term time address of students or schoolchildren
     */
    protected short TERMTIME;
    /**
     * Whether reads Welsh (England and Wales)
     */
    protected short WLSHREAD;
    /**
     * Whether speaks Welsh (England and Wales)
     */
    protected short WLSHSPK;
    /**
     * Whether understands Welsh (England and Wales)
     */
    protected short WLSHSTND;
    /**
     * Whether writes Welsh (England and Wales)
     */
    protected short WLSHWRIT;

    /*
     * Employment
     */
    /**
     * Economic activity (last week)
     */
    protected short ECONACT;
    /**
     * Ever worked
     */
    protected short EVERWORK;
    /**
     * Hours worked weekly
     */
    protected short HOURSPW;
    /**
     * Hours worked weekly-grouped
     */
    protected short HOURSPWG;
    /**
     * Industry
     */
    protected short INDSTRY0;
    /**
     * International standard classification of occupations
     */
    protected short ISCO;
    /**
     * Year last worked
     */
    protected short LASTWORK;
    /**
     * NS-SEC Socio-economic classifications
     */
    protected short NSSEC;
    /**
     * Standard occupational classification 2000-minor
     */
    protected short SOCMIN;
    /**
     * SOC (sub-mjor)
     */
    protected short SOCSUBMJ;
    /**
     * Supervisor/foreman
     */
    protected short SUPERVSR;
    /**
     * Transport to work, UK (including to study Scotland)
     */
    protected short TRANWRK0;
    /**
     * Size of workforce
     */
    protected short WORKFORC;
    /**
     * Workplace (England, Wales and Scotland)
     */
    protected short WRKPLCE0;
    /**
     * Family
     */
    /**
     * Family type
     */
    protected short FAMTYP;
    /**
     * Dependent children in family
     */
    protected short FNDEPCH;
    /**
     * Economic position of family reference person (FRP)
     */
    protected short FRECONAC;
    /**
     * NS-SEC socio-economic classification of family reference person
     */
    protected short FRNSSEC;
    /**
     * Sex of family reference person
     */
    protected short FRSEX;

    /*
     * Household
     */
    /**
     * Accomodation type
     */
    protected short ACCTYPE;
    /**
     * Use of bath/shower/toilet
     */
    protected short BATHWC;
    /**
     * Cars/vans owned or available for use
     */
    protected short CARS0;
    /**
     * Central heating
     */
    protected short CENHEAT0;
    /**
     * Household density: number of residents per room
     */
    protected short DENSITY;
    /**
     * Accomodation furnished (Scotland)
     */
    protected short FURN;
    /**
     * Household education indicator (England, Wales and Northern Ireland)
     */
    protected short HEDIND;
    /**
     * Household employment indicator (England, Wales and Northern Ireland)
     */
    protected short HEMPIND;
    /**
     * Household health and disability indicator (England, Wales and Northern
     * Ireland)
     */
    protected short HHLTHIND;
    /**
     * Household housing indicator
     */
    protected short HHSGIND;
    /**
     * Number of carers in household
     */
    protected short HNCARERS;
    /**
     * Number of employed adults in household
     */
    protected short HNEARNRS;
    /**
     * Number of persons in household aged 65 or over
     */
    protected short HNELDERS;
    /**
     * Number of families in household
     */
    protected short HNFAMS;
    /**
     * Number in household with limiting long-term illness
     */
    protected short HNLLTI;
    /**
     * Number of household members with poor health
     */
    protected short HNPRHLTH;
    /**
     * Number of usual residents in household
     */
    protected short HNRESDNT;
    /**
     * Social grade of household reference person
     */
    protected short HRSOCGRD;
    /**
     * Lowest floor level of household living accomodation
     */
    protected short LOWFLOR0;
    /**
     * Multiple ethnicity household indicator
     */
    protected short MULTETH;
    /**
     * Occupancy rating of household
     */
    protected short OCCUPNCY;
    /**
     * Region of usual residence
     */
    protected short REGION;
    /**
     * Number of floor levels (Northern Ireland)
     */
    protected short ROOMSFLR;
    /**
     * Number of rooms in occupied household space
     */
    protected short ROOMSNUM;
    /**
     * Accomodation self contained
     */
    protected short SELFCONT;
    /**
     * Households with students away during term time
     */
    protected short STAHUK;
    /**
     * Tenure of accomodation (England and Wales)
     */
    protected short TENUREW;
    /**
     * Tenure of accomodation (Scotland and Northern Ireland)
     */
    protected short TENURSN;

    /*
     * Imputation
     */
    /**
     * Number of times information donated
     */
    protected short EDISDONO;
    /**
     * One number census status
     */
    protected short ONCPERIM;

    /**
     * Creates a new ISARRecord
     * @param rID
     */
    public Census_ISARRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new ISARRecord
     *
     * @param rID
     * @param line
     */
    public Census_ISARRecord(Census_RecordID rID, String line) {
        super(rID);
        String csvline = line.replace('\t', ',');
        String[] fieldsDummy = csvline.split(" ,");
        String[] fields = new String[88];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fieldsDummy.length);
        this.ID2 = Long.valueOf(fields[0]);
        this.PNUM = Long.valueOf(fields[1]);
        this.ACCTYPE = Short.valueOf(fields[2]);
        this.AGE0 = Short.valueOf(fields[3]);
        this.BATHWC = Short.valueOf(fields[4]);
        this.CARS0 = Short.valueOf(fields[5]);
        this.CENHEAT0 = Short.valueOf(fields[6]);
        this.CESTATUS = Short.valueOf(fields[7]);
        this.CETYPE = Short.valueOf(fields[8]);
        this.COBIRT0 = Short.valueOf(fields[9]);
        this.COMBGN = Short.valueOf(fields[10]);
        this.COUNTRY = Short.valueOf(fields[11]);
        this.DENSITY = Short.valueOf(fields[12]);
        this.DISTMOV0 = Short.valueOf(fields[13]);
        this.DISTWRK0 = Short.valueOf(fields[14]);
        this.ECONACT = Short.valueOf(fields[15]);
        this.EDISDONO = Short.valueOf(fields[16]);
        this.ETHEW = Short.valueOf(fields[17]);
        this.ETHN = Short.valueOf(fields[18]);
        this.ETHS = Short.valueOf(fields[19]);
        this.EVERWORK = Short.valueOf(fields[20]);
        this.FAMTYP = Short.valueOf(fields[21]);
        this.FNDEPCH = Short.valueOf(fields[22]);
        this.FRECONAC = Short.valueOf(fields[23]);
        this.FRNSSEC = Short.valueOf(fields[24]);
        this.FRSEX = Short.valueOf(fields[25]);
        this.FURN = Short.valueOf(fields[26]);
        this.GAELREAD = Short.valueOf(fields[27]);
        this.GAELSPK = Short.valueOf(fields[28]);
        this.GAELSTND = Short.valueOf(fields[29]);
        this.GAELWRIT = Short.valueOf(fields[30]);
        this.GENIND = Short.valueOf(fields[31]);
        this.HEALTH = Short.valueOf(fields[32]);
        this.HEDIND = Short.valueOf(fields[33]);
        this.HEMPIND = Short.valueOf(fields[34]);
        this.HHLTHIND = Short.valueOf(fields[35]);
        this.HHSGIND = Short.valueOf(fields[36]);
        this.HNCARERS = Short.valueOf(fields[37]);
        this.HNEARNRS = Short.valueOf(fields[38]);
        this.HNELDERS = Short.valueOf(fields[39]);
        this.HNFAMS = Short.valueOf(fields[40]);
        this.HNLLTI = Short.valueOf(fields[41]);
        this.HNPRHLTH = Short.valueOf(fields[42]);
        this.HNRESDNT = Short.valueOf(fields[43]);
        this.HOURSPW = Short.valueOf(fields[44]);
        this.HOURSPWG = Short.valueOf(fields[45]);
        this.HRSOCGRD = Short.valueOf(fields[46]);
        this.INDSTRY0 = Short.valueOf(fields[47]);
        this.IRISLANG = Short.valueOf(fields[48]);
        this.ISCO = Short.valueOf(fields[49]);
        this.LASTWORK = Short.valueOf(fields[50]);
        this.LLTI = Short.valueOf(fields[51]);
        this.LOWFLOR0 = Short.valueOf(fields[52]);
        this.MARSTAT = Short.valueOf(fields[53]);
        this.MIGORGN = Short.valueOf(fields[54]);
        this.MULTETH = Short.valueOf(fields[55]);
        this.NSSEC = Short.valueOf(fields[56]);
        this.OCCUPNCY = Short.valueOf(fields[57]);
        this.ONCPERIM = Short.valueOf(fields[58]);
        this.PROFQUAL = Short.valueOf(fields[59]);
        this.PROVCARE = Short.valueOf(fields[60]);
        this.QUALVEWN = Short.valueOf(fields[61]);
        this.QUALVS = Short.valueOf(fields[62]);
        this.REGION = Short.valueOf(fields[63]);
        this.RELGEW = Short.valueOf(fields[64]);
        this.RELGS1 = Short.valueOf(fields[65]);
        this.RELIGN = Short.valueOf(fields[66]);
        this.RELTOHR = Short.valueOf(fields[67]);
        this.ROOMSFLR = Short.valueOf(fields[68]);
        this.ROOMSNUM = Short.valueOf(fields[69]);
        this.SELFCONT = Short.valueOf(fields[70]);
        if (fields[71].equalsIgnoreCase("1")) {
            this.SEX = true;
        }
        this.SOCMIN = Short.valueOf(fields[72]);
        this.SOCSUBMJ = Short.valueOf(fields[73]);
        this.STAHUK = Short.valueOf(fields[74]);
        if (fields[75].equalsIgnoreCase("1")) {
            this.STUDENT = true;
        }
        this.SUPERVSR = Short.valueOf(fields[76]);
        this.TENUREW = Short.valueOf(fields[77]);
        this.TENURSN = Short.valueOf(fields[78]);
        this.TERMTIME = Short.valueOf(fields[79]);
        this.TRANWRK0 = Short.valueOf(fields[80]);
        this.WLSHREAD = Short.valueOf(fields[81]);
        this.WLSHSPK = Short.valueOf(fields[82]);
        this.WLSHSTND = Short.valueOf(fields[83]);
        this.WLSHWRIT = Short.valueOf(fields[84]);
        this.WORKFORC = Short.valueOf(fields[85]);
        this.WRKPLCE0 = Short.valueOf(fields[86]);
        this.MIGIND = Short.valueOf(fields[87]);
    }

    /**
     * Returns a string description of this;
     *
     * @return
     */
    @Override
    public String toString() {
        return super.toString()
                + " ,ID=" + ID
                + " ,PNUM=" + PNUM
                + " ,SEX=" + SEX
                + " ,STUDENT=" + STUDENT
                + " ,ACCTYPE=" + ACCTYPE
                + " ,AGE0=" + AGE0
                + " ,BATHWC=" + BATHWC
                + " ,CARS0=" + CARS0
                + " ,CENHEAT0=" + CENHEAT0
                + " ,CESTATUS=" + CESTATUS
                + " ,CETYPE=" + CETYPE
                + " ,COBIRT0=" + COBIRT0
                + " ,COMBGN=" + COMBGN
                + " ,COUNTRY=" + COUNTRY
                + " ,DENSITY=" + DENSITY
                + " ,DISTMOV0=" + DISTMOV0
                + " ,DISTWRK0=" + DISTWRK0
                + " ,ECONACT=" + ECONACT
                + " ,EDISDONO=" + EDISDONO
                + " ,ETHEW=" + ETHEW
                + " ,ETHN=" + ETHN
                + " ,ETHS=" + ETHS
                + " ,EVERWORK=" + EVERWORK
                + " ,FAMTYP=" + FAMTYP
                + " ,FNDEPCH=" + FNDEPCH
                + " ,FRECONAC=" + FRECONAC
                + " ,FRNSSEC=" + FRNSSEC
                + " ,FRSEX=" + FRSEX
                + " ,FURN=" + FURN
                + " ,GAELREAD=" + GAELREAD
                + " ,GAELSPK=" + GAELSPK
                + " ,GAELSTND=" + GAELSTND
                + " ,GAELWRIT=" + GAELWRIT
                + " ,GENIND=" + GENIND
                + " ,HEALTH=" + HEALTH
                + " ,HEDIND=" + HEDIND
                + " ,HEMPIND=" + HEMPIND
                + " ,HHLTHIND=" + HHLTHIND
                + " ,HHSGIND=" + HHSGIND
                + " ,HNCARERS=" + HNCARERS
                + " ,HNEARNRS=" + HNEARNRS
                + " ,HNELDERS=" + HNELDERS
                + " ,HNFAMS=" + HNFAMS
                + " ,HNLLTI=" + HNLLTI
                + " ,HNPRHLTH=" + HNPRHLTH
                + " ,HNRESDNT=" + HNRESDNT
                + " ,HOURSPW=" + HOURSPW
                + " ,HOURSPWG=" + HOURSPWG
                + " ,HRSOCGRD=" + HRSOCGRD
                + " ,INDSTRY0=" + INDSTRY0
                + " ,IRISLANG=" + IRISLANG
                + " ,ISCO=" + ISCO
                + " ,LASTWORK=" + LASTWORK
                + " ,LLTI=" + LLTI
                + " ,LOWFLOR0=" + LOWFLOR0
                + " ,MARSTAT=" + MARSTAT
                + " ,MIGIND=" + MIGIND
                + " ,MIGORGN=" + MIGORGN
                + " ,MULTETH=" + MULTETH
                + " ,NSSEC=" + NSSEC
                + " ,OCCUPNCY=" + OCCUPNCY
                + " ,ONCPERIM=" + ONCPERIM
                + " ,PROFQUAL=" + PROFQUAL
                + " ,PROVCARE=" + PROVCARE
                + " ,QUALVEWN=" + QUALVEWN
                + " ,QUALVS=" + QUALVS
                + " ,REGION=" + REGION
                + " ,RELGEW=" + RELGEW
                + " ,RELGS1=" + RELGS1
                + " ,RELIGN=" + RELIGN
                + " ,RELTOHR=" + RELTOHR
                + " ,ROOMSFLR=" + ROOMSFLR
                + " ,ROOMSNUM=" + ROOMSNUM
                + " ,SELFCONT=" + SELFCONT
                + " ,SOCMIN=" + SOCMIN
                + " ,SOCSUBMJ=" + SOCSUBMJ
                + " ,STAHUK=" + STAHUK
                + " ,SUPERVSR=" + SUPERVSR
                + " ,TENUREW=" + TENUREW
                + " ,TENURSN=" + TENURSN
                + " ,TERMTIME=" + TERMTIME
                + " ,TRANWRK0=" + TRANWRK0
                + " ,WLSHREAD=" + WLSHREAD
                + " ,WLSHSPK=" + WLSHSPK
                + " ,WLSHSTND=" + WLSHSTND
                + " ,WLSHWRIT=" + WLSHWRIT
                + " ,WORKFORC=" + WORKFORC
                + " ,WRKPLCE0=" + WRKPLCE0;
    }

    /**
     * Returns a copy of this.PNUM
     *
     * @return
     */
    public long getPNUM() {
        return this.PNUM;
    }

    /**
     * Returns a copy of this.SEX
     *
     * @return
     */
    public boolean getSEX() {
        return this.SEX;
    }

    /**
     * Returns a copy of this.STUDENT
     *
     * @return
     */
    public boolean getSTUDENT() {
        return this.STUDENT;
    }

    /**
     * Returns a copy of this.ACCTYPE
     *
     * @return
     */
    public short getACCTYPE() {
        return this.ACCTYPE;
    }

    /**
     * Returns a copy of this.AGE0
     *
     * @return
     */
    public short getAGE0() {
        return this.AGE0;
    }

    /**
     * Returns a copy of this.BATHWC
     *
     * @return
     */
    public short getBATHWC() {
        return this.BATHWC;
    }

    /**
     * Returns a copy of this.CARS0
     *
     * @return
     */
    public short getCARS0() {
        return this.CARS0;
    }

    /**
     * Returns a copy of this.CENHEAT0
     *
     * @return
     */
    public short getCENHEAT0() {
        return this.CENHEAT0;
    }

    /**
     * Returns a copy of this.CESTATUS
     *
     * @return
     */
    public short getCESTATUS() {
        return this.CESTATUS;
    }

    /**
     * Returns a copy of this.CETYPE
     *
     * @return
     */
    public short getCETYPE() {
        return this.CETYPE;
    }

    /**
     * Returns a copy of this.COBIRT0
     *
     * @return
     */
    public short getCOBIRT0() {
        return this.COBIRT0;
    }

    /**
     * Returns a copy of this.COMBGN
     *
     * @return
     */
    public short getCOMBGN() {
        return this.COMBGN;
    }

    /**
     * Returns a copy of this.COUNTRY
     *
     * @return
     */
    public short getCOUNTRY() {
        return this.COUNTRY;
    }

    /**
     * Returns a copy of this.DENSITY
     *
     * @return
     */
    public short getDENSITY() {
        return this.DENSITY;
    }

    /**
     * Returns a copy of this.DISTMOV0
     *
     * @return
     */
    public short getDISTMOV0() {
        return this.DISTMOV0;
    }

    /**
     * Returns a copy of this.DISTWRK0
     *
     * @return
     */
    public short getDISTWRK0() {
        return this.DISTWRK0;
    }

    /**
     * Returns a copy of this.ECONACT
     *
     * @return
     */
    public short getECONACT() {
        return this.ECONACT;
    }

    /**
     * Returns a copy of this.EDISDONO
     *
     * @return
     */
    public short getEDISDONO() {
        return this.EDISDONO;
    }

    /**
     * Returns a copy of this.ETHEW
     *
     * @return
     */
    public short getETHEW() {
        return this.ETHEW;
    }

    /**
     * Returns a copy of this.ETHN
     *
     * @return
     */
    public short getETHN() {
        return this.ETHN;
    }

    /**
     * Returns a copy of this.ETHS
     *
     * @return
     */
    public short getETHS() {
        return this.ETHS;
    }

    /**
     * Returns a copy of this.EVERWORK
     *
     * @return
     */
    public short getEVERWORK() {
        return this.EVERWORK;
    }

    /**
     * Returns a copy of this.FAMTYP
     *
     * @return
     */
    public short getFAMTYP() {
        return this.FAMTYP;
    }

    /**
     * Returns a copy of this.FNDEPCH
     *
     * @return
     */
    public short getFNDEPCH() {
        return this.FNDEPCH;
    }

    /**
     * Returns a copy of this.FRECONAC
     *
     * @return
     */
    public short getFRECONAC() {
        return this.FRECONAC;
    }

    /**
     * Returns a copy of this.FRNSSEC
     *
     * @return
     */
    public short getFRNSSEC() {
        return this.FRNSSEC;
    }

    /**
     * Returns a copy of this.FRSEX
     *
     * @return
     */
    public short getFRSEX() {
        return this.FRSEX;
    }

    /**
     * Returns a copy of this.FURN
     *
     * @return
     */
    public short getFURN() {
        return this.FURN;
    }

    /**
     * Returns a copy of this.GAELREAD
     *
     * @return
     */
    public short getGAELREAD() {
        return this.GAELREAD;
    }

    /**
     * Returns a copy of this.GAELSPK
     *
     * @return
     */
    public short getGAELSPK() {
        return this.GAELSPK;
    }

    /**
     * Returns a copy of this.GAELSTND
     *
     * @return
     */
    public short getGAELSTND() {
        return this.GAELSTND;
    }

    /**
     * Returns a copy of this.GAELWRIT
     *
     * @return
     */
    public short getGAELWRIT() {
        return this.GAELWRIT;
    }

    /**
     * Returns a copy of this.GENIND
     *
     * @return
     */
    public short getGENIND() {
        return this.GENIND;
    }

    /**
     * Returns a copy of this.HEALTH
     *
     * @return
     */
    public short getHEALTH() {
        return this.HEALTH;
    }

    /**
     * Returns a copy of this.HEDIND
     *
     * @return
     */
    public short getHEDIND() {
        return this.HEDIND;
    }

    /**
     * Returns a copy of this.HEMPIND
     *
     * @return
     */
    public short getHEMPIND() {
        return this.HEMPIND;
    }

    /**
     * Returns a copy of this.HHLTHIND
     *
     * @return
     */
    public short getHHLTHIND() {
        return this.HHLTHIND;
    }

    /**
     * Returns a copy of this.HHSGIND
     *
     * @return
     */
    public short getHHSGIND() {
        return this.HHSGIND;
    }

    /**
     * Returns a copy of this.HNCARERS
     *
     * @return
     */
    public short getHNCARERS() {
        return this.HNCARERS;
    }

    /**
     * Returns a copy of this.HNEARNRS
     *
     * @return
     */
    public short getHNEARNRS() {
        return this.HNEARNRS;
    }

    /**
     * Returns a copy of this.HNELDERS
     *
     * @return
     */
    public short getHNELDERS() {
        return this.HNELDERS;
    }

    /**
     * Returns a copy of this.HNFAMS
     *
     * @return
     */
    public short getHNFAMS() {
        return this.HNFAMS;
    }

    /**
     * Returns a copy of this.HNLLTI
     *
     * @return
     */
    public short getHNLLTI() {
        return this.HNLLTI;
    }

    /**
     * Returns a copy of this.HNPRHLTH
     *
     * @return
     */
    public short getHNPRHLTH() {
        return this.HNPRHLTH;
    }

    /**
     * Returns a copy of this.HNRESDNT
     *
     * @return
     */
    public short getHNRESDNT() {
        return this.HNRESDNT;
    }

    /**
     * Returns a copy of this.HOURSPW
     *
     * @return
     */
    public short getHOURSPW() {
        return this.HOURSPW;
    }

    /**
     * Returns a copy of this.HOURSPWG
     *
     * @return
     */
    public short getHOURSPWG() {
        return this.HOURSPWG;
    }

    /**
     * Returns a copy of this.HRSOCGRD
     *
     * @return
     */
    public short getHRSOCGRD() {
        return this.HRSOCGRD;
    }

    /**
     * Returns a copy of this.INDSTRY0
     *
     * @return
     */
    public short getINDSTRY0() {
        return this.INDSTRY0;
    }

    /**
     * Returns a copy of this.IRISLANG
     *
     * @return
     */
    public short getIRISLANG() {
        return this.IRISLANG;
    }

    /**
     * Returns a copy of this.ISCO
     *
     * @return
     */
    public short getISCO() {
        return this.ISCO;
    }

    /**
     * Returns a copy of this.LASTWORK
     *
     * @return
     */
    public short getLASTWORK() {
        return this.LASTWORK;
    }

    /**
     * Returns a copy of this.LLTI
     *
     * @return
     */
    public short getLLTI() {
        return this.LLTI;
    }

    /**
     * Returns a copy of this.LOWFLOR0
     *
     * @return
     */
    public short getLOWFLOR0() {
        return this.LOWFLOR0;
    }

    /**
     * Returns a copy of this.MARSTAT
     *
     * @return
     */
    public short getMARSTAT() {
        return this.MARSTAT;
    }

    /**
     * Returns a copy of this.MIGIND
     *
     * @return
     */
    public short getMIGIND() {
        return this.MIGIND;
    }

    /**
     * Returns a copy of this.MIGORGN
     *
     * @return
     */
    public short getMIGORGN() {
        return this.MIGORGN;
    }

    /**
     * Returns a copy of this.MULTETH
     *
     * @return
     */
    public short getMULTETH() {
        return this.MULTETH;
    }

    /**
     * Returns a copy of this.NSSEC
     *
     * @return
     */
    public short getNSSEC() {
        return this.NSSEC;
    }

    /**
     * Returns a copy of this.OCCUPNCY
     *
     * @return
     */
    public short getOCCUPNCY() {
        return this.OCCUPNCY;
    }

    /**
     * Returns a copy of this.ONCPERIM
     *
     * @return
     */
    public short getONCPERIM() {
        return this.ONCPERIM;
    }

    /**
     * Returns a copy of this.PROFQUAL
     *
     * @return
     */
    public short getPROFQUAL() {
        return this.PROFQUAL;
    }

    /**
     * Returns a copy of this.PROVCARE
     *
     * @return
     */
    public short getPROVCARE() {
        return this.PROVCARE;
    }

    /**
     * Returns a copy of this.QUALVEWN
     *
     * @return
     */
    public short getQUALVEWN() {
        return this.QUALVEWN;
    }

    /**
     * Returns a copy of this.QUALVS
     *
     * @return
     */
    public short getQUALVS() {
        return this.QUALVS;
    }

    /**
     * Returns a copy of this.REGION
     *
     * @return
     */
    public short getREGION() {
        return this.REGION;
    }

    /**
     * Returns a copy of this.RELGEW
     *
     * @return
     */
    public short getRELGEW() {
        return this.RELGEW;
    }

    /**
     * Returns a copy of this.RELGS1
     *
     * @return
     */
    public short getRELGS1() {
        return this.RELGS1;
    }

    /**
     * Returns a copy of this.RELIGN
     *
     * @return
     */
    public short getRELIGN() {
        return this.RELIGN;
    }

    /**
     * Returns a copy of this.RELTOHR
     *
     * @return
     */
    public short getRELTOHR() {
        return this.RELTOHR;
    }

    /**
     * Returns a copy of this.ROOMSFLR
     *
     * @return
     */
    public short getROOMSFLR() {
        return this.ROOMSFLR;
    }

    /**
     * Returns a copy of this.ROOMSNUM
     *
     * @return
     */
    public short getROOMSNUM() {
        return this.ROOMSNUM;
    }

    /**
     * Returns a copy of this.SELFCONT
     *
     * @return
     */
    public short getSELFCONT() {
        return this.SELFCONT;
    }

    /**
     * Returns a copy of this.SOCMIN
     *
     * @return
     */
    public short getSOCMIN() {
        return this.SOCMIN;
    }

    /**
     * Returns a copy of this.SOCSUBMJ
     *
     * @return
     */
    public short getSOCSUBMJ() {
        return this.SOCSUBMJ;
    }

    /**
     * Returns a copy of this.STAHUK
     *
     * @return
     */
    public short getSTAHUK() {
        return this.STAHUK;
    }

    /**
     * Returns a copy of this.SUPERVSR
     *
     * @return
     */
    public short getSUPERVSR() {
        return this.SUPERVSR;
    }

    /**
     * Returns a copy of this.TENUREW
     *
     * @return
     */
    public short getTENUREW() {
        return this.TENUREW;
    }

    /**
     * Returns a copy of this.TENURSN
     *
     * @return
     */
    public short getTENURSN() {
        return this.TENURSN;
    }

    /**
     * Returns a copy of this.TERMTIME
     *
     * @return
     */
    public short getTERMTIME() {
        return this.TERMTIME;
    }

    /**
     * Returns a copy of this.TRANWRK0
     *
     * @return
     */
    public short getTRANWRK0() {
        return this.TRANWRK0;
    }

    /**
     * Returns a copy of this.WLSHREAD
     *
     * @return
     */
    public short getWLSHREAD() {
        return this.WLSHREAD;
    }

    /**
     * Returns a copy of this.WLSHSPK
     *
     * @return
     */
    public short getWLSHSPK() {
        return this.WLSHSPK;
    }

    /**
     * Returns a copy of this.WLSHSTND
     *
     * @return
     */
    public short getWLSHSTND() {
        return this.WLSHSTND;
    }

    /**
     * Returns a copy of this.WLSHWRIT
     *
     * @return
     */
    public short getWLSHWRIT() {
        return this.WLSHWRIT;
    }

    /**
     * Returns a copy of this.WORKFORC
     *
     * @return
     */
    public short getWORKFORC() {
        return this.WORKFORC;
    }

    /**
     * Returns a copy of this.WRKPLCE0
     *
     * @return
     */
    public short getWRKPLCE0() {
        return this.WRKPLCE0;
    }
}
