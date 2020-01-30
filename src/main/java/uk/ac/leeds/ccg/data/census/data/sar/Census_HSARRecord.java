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
package uk.ac.leeds.ccg.data.census.data.sar;

import uk.ac.leeds.ccg.data.census.data.Census_Record;
import uk.ac.leeds.ccg.data.census.data.id.Census_RecordID;
import uk.ac.leeds.ccg.math.Math_Boolean;
import uk.ac.leeds.ccg.math.Math_Integer;
import uk.ac.leeds.ccg.math.Math_Long;
import uk.ac.leeds.ccg.math.Math_Short;

/**
 * For representing a Household SAR DAta Record and providing safe access to the
 * data.
 */
public class Census_HSARRecord extends Census_Record {

    /**
     * A household identifier (int should be sufficient!)
     */
    protected int HHID;
    /**
     * A person number within the household (up to 11)
     */
    protected short PNUM;
    /**
     * A unique ID (Form of catenation of HHID and PNUM) (long should be fine!)
     */
    protected long ID2;

    /*
     * Alphabetical (Very similar to variables in the Individual SAR (which were
     * split between Individual, Employment, Family, Household and Imputed
     * variables and came ordered alphabetically). (Some of the names are
     * suffixed with "h" instead and there are additional variables and
     * ommisions). HSAR is all very intersting but it is not the
     * "one number census" that any sensible government would use it is an
     * aggregated product given to academics via wierd committees to keep them
     * quite. It is very difficult to evaluate if these data are fit for any
     * purpose whatsoever. Given the improvements in IT data security, surely we
     * can have the real census data... Now who would sanction that, er...
     * nobody, because it's politically too sensitive perhaps and loads of civil
     * service jobs would not be required and vested interests would prevent the
     * failed system from changing. Sigh! Time for a new system... Great! Yet
     * more work to do while our planet and society teeters worringly on the
     * brink of catastrophe! I guess this is not really the ideal place for a
     * rant, but nonetheless it is here...
     */
    /**
     * Accommodation type
     */
    protected short ACCTYPE;
    /**
     * Age of respondents grouped
     */
    protected short AGEH;
    /**
     * Use of bath/shower/toilet
     */
    protected short BATHWC;
    /**
     * Cars/vans owned or available for use
     */
    protected short CARSH;
    /**
     * Central heating
     */
    protected short CENHEAT0;
    /**
     * Country of birth
     */
    protected short COBIRT0;
    /**
     * Household density: number of residents per room
     */
    protected short DENSITY;
    /**
     * Distance of move of migrant-banded
     */
    protected short DISTMOV0;
    /**
     * Distance to work
     */
    protected short DISTWRK0;
    /**
     * Economic activity
     */
    protected short ECONACH;
    /**
     * Number of times information donated
     */
    protected short EDISDONO;
    /**
     * Ethnic group for England and Wales
     */
    protected short ETHEW;
    /**
     * Ever worked
     */
    protected short EVERWORK;
    /**
     * Family number
     */
    protected short FAMNUMB;
    /**
     * Family type
     */
    protected short FAMTYP;
    /**
     * Family Reference Person
     */
    protected short FRP;
    /**
     * Generation indicator
     */
    protected short GENIND;
    /**
     * General health over last twelve months
     */
    protected short HEALTH;
    /**
     * Household education indicator (England, Wales and Northern Ireland)
     */
    protected short HEDIND;
    /**
     * No. of hhd donations to edit imputation system
     */
    protected boolean HEDISDON;
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
     * Household migration indicator
     */
    protected short HMIGIND;
    /**
     * Number of persons in household?
     */
    protected short HNRESIDN;
    /**
     * Hours worked weekly
     */
    protected short HOURSPW;
    /**
     * Household reference person
     */
    protected boolean HRP;
    /**
     * Social grade of household reference person
     */
    protected short HRSOCGRD;
    /**
     * Industry
     */
    protected short INDSTRY0;
    /**
     * International standard classification of occupations (3 digit)
     */
    protected int ISCO3;
    /**
     * Year last worked
     */
    protected short LASTWORK;
    /**
     * Limiting long term illness
     */
    protected short LLTI;
    /**
     * Lowest floor level of household living accomodation
     */
    protected short LOWFLOR0;
    /**
     * Marital status
     */
    protected short MARSTAH;
    /**
     * Migration indicator
     */
    protected short MIGIND;
    /**
     * NS-SEC Socio-economic classifications
     */
    protected short NSSEC;
    /**
     * One number census status
     */
    protected short ONCPERIM;
    /**
     * Population base limiter
     */
    protected short POPBASE;
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
    protected short QUALVEWN;
    /**
     * Religion (England and Wales)
     */
    protected short RELGEW;
    /**
     * Relationship to HRP
     */
    protected short RELTOHR;
    /**
     * Rooms required
     */
    protected short ROOMREQ;
    /**
     * Number of rooms in occupied household space
     */
    protected short ROOMSNMH;
    /**
     * Accomodation self contained
     */
    protected boolean SELFCONT;
    /**
     * Sex
     */
    protected boolean SEX;
    /**
     * Standard occupational classification 2000-minor
     */
    protected int SOCMIN;
    /**
     * Households with students away during term time
     */
    protected short STAHUKH;
    /**
     * Student accomodation
     */
    protected short STAPUK;
    /**
     * Schoolchild or student in full-time education
     */
    protected boolean STUDENT;
    /**
     * Supervisor/foreman
     */
    protected short SUPERVSR;
    /**
     * Tenure of accomodation
     */
    protected short TENUREH;
    /**
     * Term time address of students or schoolchildren
     */
    protected short TERMTIME;
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

    /*
     * Imputation variables starting with Z are not used currently...
     */
    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_HSARRecord(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_HSARRecord(Census_RecordID rID, String line) {
        super(rID);
        String csvline = line.replace('\t', ',');
        String[] fields = csvline.split(",");
//        if (fields.length != 60) {
//            return false;
//        }
        this.AGEH = Math_Short.parseShort(fields[4]);
        if (fields[49].equalsIgnoreCase("1")) {
            this.SEX = true;
        }
        if (fields[29].equalsIgnoreCase("1")) {
            this.HRP = true;
        } else {
        }
        this.HHID = Integer.valueOf(fields[0]);
        this.PNUM = Math_Short.parseShort(fields[1]);
        this.ID2 = Math_Long.parseLong(fields[2]);
        this.ACCTYPE = Math_Short.parseShort(fields[3]);
        this.BATHWC = Math_Short.parseShort(fields[5]);
        this.CARSH = Math_Short.parseShort(fields[6]);
        this.CENHEAT0 = Math_Short.parseShort(fields[7]);
        this.COBIRT0 = Math_Short.parseShort(fields[8]);
        this.DENSITY = Math_Short.parseShort(fields[9]);
        this.DISTMOV0 = Math_Short.parseShort(fields[10]);
        this.DISTWRK0 = Math_Short.parseShort(fields[11]);
        this.ECONACH = Math_Short.parseShort(fields[12]);
        this.EDISDONO = Math_Short.parseShort(fields[13]);
        this.ETHEW = Math_Short.parseShort(fields[14]);
        this.EVERWORK = Math_Short.parseShort(fields[15]);
        this.FAMNUMB = Math_Short.parseShort(fields[16]);
        this.FAMTYP = Math_Short.parseShort(fields[17]);
        this.FRP = Math_Short.parseShort(fields[18]);
        this.GENIND = Math_Short.parseShort(fields[19]);
        this.HEALTH = Math_Short.parseShort(fields[20]);
        this.HEDIND = Math_Short.parseShort(fields[21]);
        this.HEDISDON = Math_Boolean.parseBoolean(fields[22]);
        this.HEMPIND = Math_Short.parseShort(fields[23]);
        this.HHLTHIND = Math_Short.parseShort(fields[24]);
        this.HHSGIND = Math_Short.parseShort(fields[25]);
        this.HMIGIND = Math_Short.parseShort(fields[26]);
        this.HNRESIDN = Math_Short.parseShort(fields[27]);
        this.HOURSPW = Math_Short.parseShort(fields[28]);
        this.HRSOCGRD = Math_Short.parseShort(fields[30]);
        this.INDSTRY0 = Math_Short.parseShort(fields[31]);
        this.ISCO3 = Integer.valueOf(fields[32]);
        this.LASTWORK = Math_Short.parseShort(fields[33]);
        this.LLTI = Math_Short.parseShort(fields[34]);
        this.LOWFLOR0 = Math_Short.parseShort(fields[35]);
        this.MARSTAH = Math_Short.parseShort(fields[36]);
        this.MIGIND = Math_Short.parseShort(fields[37]);
        this.NSSEC = Math_Short.parseShort(fields[38]);
        this.ONCPERIM = Math_Short.parseShort(fields[39]);
        this.POPBASE = Math_Short.parseShort(fields[40]);
        this.PROFQUAL = Math_Short.parseShort(fields[41]);
        this.PROVCARE = Math_Short.parseShort(fields[42]);
        this.QUALVEWN = Math_Short.parseShort(fields[43]);
        this.RELGEW = Math_Short.parseShort(fields[44]);
        this.RELTOHR = Math_Short.parseShort(fields[45]);
        this.ROOMREQ = Math_Short.parseShort(fields[46]);
        this.ROOMSNMH = Math_Short.parseShort(fields[47]);
        this.SELFCONT = Math_Boolean.parseBoolean(fields[48]);
        this.SOCMIN = Math_Integer.parseInt(fields[50]);
        this.STAHUKH = Math_Short.parseShort(fields[51]);
        this.STAPUK = Math_Short.parseShort(fields[52]);
        this.STUDENT = Math_Boolean.parseBoolean(fields[53]);
        this.SUPERVSR = Math_Short.parseShort(fields[54]);
        this.TERMTIME = Math_Short.parseShort(fields[56]);
        this.TRANWRK0 = Math_Short.parseShort(fields[57]);
        this.WORKFORC = Math_Short.parseShort(fields[58]);
        this.WRKPLCE0 = Math_Short.parseShort(fields[59]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString()
                + ", id=" + id
                + ", HHID=" + HHID
                + ", ISCO3=" + ISCO3
                + ", SOCMIN=" + SOCMIN
                + ", HEDISDON=" + HEDISDON
                + ", HRP=" + HRP
                + ", SELFCONT=" + SELFCONT
                + ", SEX=" + SEX
                + ", STUDENT=" + STUDENT
                + ", ACCTYPE=" + ACCTYPE
                + ", AGEH=" + AGEH
                + ", BATHWC=" + BATHWC
                + ", CARSH=" + CARSH
                + ", CENHEAT0=" + CENHEAT0
                + ", COBIRT0=" + COBIRT0
                + ", DENSITY=" + DENSITY
                + ", DISTMOV0=" + DISTMOV0
                + ", DISTWRK0=" + DISTWRK0
                + ", ECONACH=" + ECONACH
                + ", EDISDONO=" + EDISDONO
                + ", ETHEW=" + ETHEW
                + ", EVERWORK=" + EVERWORK
                + ", FAMNUMB=" + FAMNUMB
                + ", FAMTYP=" + FAMTYP
                + ", FRP=" + FRP
                + ", GENIND=" + GENIND
                + ", HEALTH=" + HEALTH
                + ", HEDIND=" + HEDIND
                + ", HEMPIND=" + HEMPIND
                + ", HHLTHIND=" + HHLTHIND
                + ", HHSGIND=" + HHSGIND
                + ", HMIGIND=" + HMIGIND
                + ", HNRESIDN=" + HNRESIDN
                + ", HOURSPW=" + HOURSPW
                + ", HRSOCGRD=" + HRSOCGRD
                + ", INDSTRY0=" + INDSTRY0
                + ", LASTWORK=" + LASTWORK
                + ", LLTI=" + LLTI
                + ", LOWFLOR0=" + LOWFLOR0
                + ", MARSTAH=" + MARSTAH
                + ", MIGIND=" + MIGIND
                + ", NSSEC=" + NSSEC
                + ", ONCPERIM=" + ONCPERIM
                + ", PNUM=" + PNUM
                + ", POPBASE=" + POPBASE
                + ", PROFQUAL=" + PROFQUAL
                + ", PROVCARE=" + PROVCARE
                + ", QUALVEWN=" + QUALVEWN
                + ", RELGEW=" + RELGEW
                + ", RELTOHR=" + RELTOHR
                + ", ROOMREQ=" + ROOMREQ
                + ", ROOMSNMH=" + ROOMSNMH
                + ", STAHUKH=" + STAHUKH
                + ", STAPUK=" + STAPUK
                + ", SUPERVSR=" + SUPERVSR
                + ", TENUREH=" + TENUREH
                + ", TERMTIME=" + TERMTIME
                + ", TRANWRK0=" + TRANWRK0
                + ", WORKFORC=" + WORKFORC
                + ", WRKPLCE0=" + WRKPLCE0;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + id + "," + HHID + "," + ISCO3 + "," 
                + SOCMIN + "," + HEDISDON + "," + HRP + "," + SELFCONT + "," 
                + SEX + "," + STUDENT + "," + ACCTYPE + "," + AGEH + "," 
                + BATHWC + "," + CARSH + "," + CENHEAT0 + "," + COBIRT0 + "," 
                + DENSITY + "," + DISTMOV0 + "," + DISTWRK0 + "," 
                + ECONACH + "," + EDISDONO + "," + ETHEW + "," + EVERWORK + "," 
                + FAMNUMB + "," + FAMTYP + "," + FRP + "," + GENIND + "," 
                + HEALTH + "," + HEDIND + "," + HEMPIND + "," + HHLTHIND + "," 
                + HHSGIND + "," + HMIGIND + "," + HNRESIDN + "," + HOURSPW + "," 
                + HRSOCGRD + "," + INDSTRY0 + "," + LASTWORK + "," + LLTI + "," 
                + LOWFLOR0 + "," + MARSTAH + "," + MIGIND + "," + NSSEC + "," 
                + ONCPERIM + "," + PNUM + "," + POPBASE + "," + PROFQUAL + "," 
                + PROVCARE + "," + QUALVEWN + "," + RELGEW + "," + RELTOHR + "," 
                + ROOMREQ + "," + ROOMSNMH + "," + STAHUKH + "," + STAPUK + "," 
                + SUPERVSR + "," + TENUREH + "," + TERMTIME + "," 
                + TRANWRK0 + "," + WORKFORC + "," + WRKPLCE0;
    }
    
    /**
     * Returns a copy of this.HHID
     *
     * @return
     */
    public int getHHID() {
        return this.HHID;
    }

    /**
     * Returns a copy of this.ISCO3
     *
     * @return
     */
    public int getISCO3() {
        return this.ISCO3;
    }

    /**
     * Returns a copy of this.SOCMIN
     *
     * @return
     */
    public int getSOCMIN() {
        return this.SOCMIN;
    }

    /**
     * Returns a copy of this.HEDISDON
     *
     * @return
     */
    public boolean getHEDISDON() {
        return this.HEDISDON;
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
     * Returns a copy of this.HRP
     *
     * @return
     */
    public boolean getHRP() {
        return this.HRP;
    }

    /**
     * Returns a copy of this.SELFCONT
     *
     * @return
     */
    public boolean getSELFCONT() {
        return this.SELFCONT;
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
     * Returns a copy of this.AGEH
     *
     * @return
     */
    public short getAGEH() {
        return this.AGEH;
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
     * Returns a copy of this.CARSH
     *
     * @return
     */
    public short getCARSH() {
        return this.CARSH;
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
     * Returns a copy of this.COBIRT0
     *
     * @return
     */
    public short getCOBIRT0() {
        return this.COBIRT0;
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
     * Returns a copy of this.ECONACH
     *
     * @return
     */
    public short getECONACH() {
        return this.ECONACH;
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
     * Returns a copy of this.EVERWORK
     *
     * @return
     */
    public short getEVERWORK() {
        return this.EVERWORK;
    }

    /**
     * Returns a copy of this.FAMNUMB
     *
     * @return
     */
    public short getFAMNUMB() {
        return this.FAMNUMB;
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
     * Returns a copy of this.FRP
     *
     * @return
     */
    public short getFRP() {
        return this.FRP;
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
     * Returns a copy of this.HMIGIND
     *
     * @return
     */
    public short getHMIGIND() {
        return this.HMIGIND;
    }

    /**
     * Returns a copy of this.HNRESIDN
     *
     * @return
     */
    public short getHNRESIDN() {
        return this.HNRESIDN;
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
     * Returns a copy of this.MARSTAH
     *
     * @return
     */
    public short getMARSTAH() {
        return this.MARSTAH;
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
     * Returns a copy of this.NSSEC
     *
     * @return
     */
    public short getNSSEC() {
        return this.NSSEC;
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
     * Returns a copy of this.PNUM
     *
     * @return
     */
    public short getPNUM() {
        return this.PNUM;
    }

    /**
     * Returns a copy of this.POPBASE
     *
     * @return
     */
    public short getPOPBASE() {
        return this.POPBASE;
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
     * Returns a copy of this.RELGEW
     *
     * @return
     */
    public short getRELGEW() {
        return this.RELGEW;
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
     * Returns a copy of this.ROOMREQ
     *
     * @return
     */
    public short getROOMREQ() {
        return this.ROOMREQ;
    }

    /**
     * Returns a copy of this.ROOMSNMH
     *
     * @return
     */
    public short getROOMSNMH() {
        return this.ROOMSNMH;
    }

    /**
     * Returns a copy of this.STAPUK
     *
     * @return
     */
    public short getSTAPUK() {
        return this.STAPUK;
    }

    /**
     * Returns a copy of this.STAHUKH
     *
     * @return
     */
    public short getSTAHUKH() {
        return this.STAHUKH;
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
     * Returns a copy of this.TENUREH
     *
     * @return
     */
    public short getTENUREH() {
        return this.TENUREH;
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
