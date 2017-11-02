/**
 * A component of a library for
 * <a href="http://www.geog.leeds.ac.uk/people/a.turner/projects/MoSeS">MoSeS</a>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 */
package uk.ac.leeds.ccg.andyt.census.sar;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_AbstractDataRecord;
import uk.ac.leeds.ccg.andyt.generic.math.StaticConverter;

/**
 * For representing an Individual SAR Data Record and providing safe access to
 * the data.
 */
public class Census_ISARDataRecord
        extends Generic_AbstractDataRecord {

    /*
     * Individual
     */
    /**
     * Age of respondents grouped
     */
    protected short _AGE0;
    /**
     * Status in communal establishment
     */
    protected short _CESTATUS;
    /**
     * Type of communal establishment
     */
    protected short _CETYPE;
    /**
     * Country of birth
     */
    protected short _COBIRT0;
    /**
     * Community background-religion or religion brought up in (Northern
     * Ireland)
     */
    protected short _COMBGN;
    /**
     * Country of usual residence
     */
    protected short _COUNTRY;
    /**
     * Distance of move of migrant-banded
     */
    protected short _DISTMOV0;
    /**
     * Distance to work
     */
    protected short _DISTWRK0;
    /**
     * Ethnic group for England and Wales
     */
    protected short _ETHEW;
    /**
     * Ethnic group for Northern Ireland
     */
    protected short _ETHN;
    /**
     * Ethnic group for Scotland
     */
    protected short _ETHS;
    /**
     * Whether reads Gaelic (Scotland);
     */
    protected short _GAELREAD;
    /**
     * Whether speaks Gaelic (Scotland)
     */
    protected short _GAELSPK;
    /**
     * Whether understands Gaelic (Scotland)
     */
    protected short _GAELSTND;
    /**
     * Whether writes Gaelic (Scotland)
     */
    protected short _GAELWRIT;
    /**
     * Generation indicator
     */
    protected short _GENIND;
    /**
     * General health over last twelve months
     */
    protected short _HEALTH;
    /**
     * Person's unique identifier
     */
    protected long _ID;
    /**
     * Whether reads/speaks/understands/writes Irish (Northern Ireland)
     */
    protected short _IRISLANG;
    /**
     * Limiting long term illness
     */
    protected short _LLTI;
    /**
     * Marital status
     */
    protected short _MARSTAT;
    /**
     * Migration indicator
     */
    protected short _MIGIND;
    /**
     * Migrants: area of former residence
     */
    protected short _MIGORGN;
    /**
     * Record identifier
     */
    protected long _PNUM;
    /**
     * Profesional qualification (England and Wales)
     */
    protected short _PROFQUAL;
    /**
     * Number of hours care provided per week
     */
    protected short _PROVCARE;
    /**
     * Level of highest qualifications (aged 16-74) (England, Wales and Northern
     * Ireland)
     */
    protected short _QUALVEWN; //
    /**
     * Level of highest qualifications (aged 16-74) (Scotland)
     */
    protected short _QUALVS;
    /**
     * Religion (England and Wales)
     */
    protected short _RELGEW;
    /**
     * Religion belongs to (Scotland)
     */
    protected short _RELGS1;
    /**
     * Religion (Northern Ireland)
     */
    protected short _RELIGN;
    /**
     * Relationship to Household Reference Person
     */
    protected short _RELTOHR;
    /**
     * Gender
     */
    protected boolean _SEX;
    /**
     * Schoolchild or student in full-time education
     */
    protected boolean _STUDENT;
    /**
     * Term time address of students or schoolchildren
     */
    protected short _TERMTIME;
    /**
     * Whether reads Welsh (England and Wales)
     */
    protected short _WLSHREAD;
    /**
     * Whether speaks Welsh (England and Wales)
     */
    protected short _WLSHSPK;
    /**
     * Whether understands Welsh (England and Wales)
     */
    protected short _WLSHSTND;
    /**
     * Whether writes Welsh (England and Wales)
     */
    protected short _WLSHWRIT;

    /*
     * Employment
     */
    /**
     * Economic activity (last week)
     */
    protected short _ECONACT;
    /**
     * Ever worked
     */
    protected short _EVERWORK;
    /**
     * Hours worked weekly
     */
    protected short _HOURSPW;
    /**
     * Hours worked weekly-grouped
     */
    protected short _HOURSPWG;
    /**
     * Industry
     */
    protected short _INDSTRY0;
    /**
     * International standard classification of occupations
     */
    protected short _ISCO;
    /**
     * Year last worked
     */
    protected short _LASTWORK;
    /**
     * NS-SEC Socio-economic classifications
     */
    protected short _NSSEC;
    /**
     * Standard occupational classification 2000-minor
     */
    protected short _SOCMIN;
    /**
     * _SOC (sub-mjor)
     */
    protected short _SOCSUBMJ;
    /**
     * Supervisor/foreman
     */
    protected short _SUPERVSR;
    /**
     * Transport to work, UK (including to study Scotland)
     */
    protected short _TRANWRK0;
    /**
     * Size of workforce
     */
    protected short _WORKFORC;
    /**
     * Workplace (England, Wales and Scotland)
     */
    protected short _WRKPLCE0;
    /**
     * Family
     */
    /**
     * Family type
     */
    protected short _FAMTYP;
    /**
     * Dependent children in family
     */
    protected short _FNDEPCH;
    /**
     * Economic position of family reference person (FRP)
     */
    protected short _FRECONAC;
    /**
     * NS-SEC socio-economic classification of family reference person
     */
    protected short _FRNSSEC;
    /**
     * Sex of family reference person
     */
    protected short _FRSEX;

    /*
     * Household
     */
    /**
     * Accomodation type
     */
    protected short _ACCTYPE;
    /**
     * Use of bath/shower/toilet
     */
    protected short _BATHWC;
    /**
     * Cars/vans owned or available for use
     */
    protected short _CARS0;
    /**
     * Central heating
     */
    protected short _CENHEAT0;
    /**
     * Household density: number of residents per room
     */
    protected short _DENSITY;
    /**
     * Accomodation furnished (Scotland)
     */
    protected short _FURN;
    /**
     * Household education indicator (England, Wales and Northern Ireland)
     */
    protected short _HEDIND;
    /**
     * Household employment indicator (England, Wales and Northern Ireland)
     */
    protected short _HEMPIND;
    /**
     * Household health and disability indicator (England, Wales and Northern
     * Ireland)
     */
    protected short _HHLTHIND;
    /**
     * Household housing indicator
     */
    protected short _HHSGIND;
    /**
     * Number of carers in household
     */
    protected short _HNCARERS;
    /**
     * Number of employed adults in household
     */
    protected short _HNEARNRS;
    /**
     * Number of persons in household aged 65 or over
     */
    protected short _HNELDERS;
    /**
     * Number of families in household
     */
    protected short _HNFAMS;
    /**
     * Number in household with limiting long-term illness
     */
    protected short _HNLLTI;
    /**
     * Number of household members with poor health
     */
    protected short _HNPRHLTH;
    /**
     * Number of usual residents in household
     */
    protected short _HNRESDNT;
    /**
     * Social grade of household reference person
     */
    protected short _HRSOCGRD;
    /**
     * Lowest floor level of household living accomodation
     */
    protected short _LOWFLOR0;
    /**
     * Multiple ethnicity household indicator
     */
    protected short _MULTETH;
    /**
     * Occupancy rating of household
     */
    protected short _OCCUPNCY;
    /**
     * Region of usual residence
     */
    protected short _REGION;
    /**
     * Number of floor levels (Northern Ireland)
     */
    protected short _ROOMSFLR;
    /**
     * Number of rooms in occupied household space
     */
    protected short _ROOMSNUM;
    /**
     * Accomodation self contained
     */
    protected short _SELFCONT;
    /**
     * Households with students away during term time
     */
    protected short _STAHUK;
    /**
     * Tenure of accomodation (England and Wales)
     */
    protected short _TENUREW;
    /**
     * Tenure of accomodation (Scotland and Northern Ireland)
     */
    protected short _TENURSN;

    /*
     * Imputation
     */
    /**
     * Number of times information donated
     */
    protected short _EDISDONO;
    /**
     * One number census status
     */
    protected short _ONCPERIM;

    /** Creates a new ISARRecord */
    public Census_ISARDataRecord() {
        _Init();
    }

    /** Creates a new ISARRecord
     * @param _RandomAccessFile */
    public Census_ISARDataRecord(RandomAccessFile _RandomAccessFile) {
        try {
            this._RecordID = _RandomAccessFile.readLong();
            this._ID = _RandomAccessFile.readLong();
            this._PNUM = _RandomAccessFile.readLong();
            this._SEX = _RandomAccessFile.readBoolean();
            this._STUDENT = _RandomAccessFile.readBoolean();
            this._ACCTYPE = _RandomAccessFile.readShort();
            this._AGE0 = _RandomAccessFile.readShort();
            this._BATHWC = _RandomAccessFile.readShort();
            this._CARS0 = _RandomAccessFile.readShort();
            this._CENHEAT0 = _RandomAccessFile.readShort();
            this._CESTATUS = _RandomAccessFile.readShort();
            this._CETYPE = _RandomAccessFile.readShort();
            this._COBIRT0 = _RandomAccessFile.readShort();
            this._COMBGN = _RandomAccessFile.readShort();
            this._COUNTRY = _RandomAccessFile.readShort();
            this._DENSITY = _RandomAccessFile.readShort();
            this._DISTMOV0 = _RandomAccessFile.readShort();
            this._DISTWRK0 = _RandomAccessFile.readShort();
            this._ECONACT = _RandomAccessFile.readShort();
            this._EDISDONO = _RandomAccessFile.readShort();
            this._ETHEW = _RandomAccessFile.readShort();
            this._ETHN = _RandomAccessFile.readShort();
            this._ETHS = _RandomAccessFile.readShort();
            this._EVERWORK = _RandomAccessFile.readShort();
            this._FAMTYP = _RandomAccessFile.readShort();
            this._FNDEPCH = _RandomAccessFile.readShort();
            this._FRECONAC = _RandomAccessFile.readShort();
            this._FRNSSEC = _RandomAccessFile.readShort();
            this._FRSEX = _RandomAccessFile.readShort();
            this._FURN = _RandomAccessFile.readShort();
            this._GAELREAD = _RandomAccessFile.readShort();
            this._GAELSPK = _RandomAccessFile.readShort();
            this._GAELSTND = _RandomAccessFile.readShort();
            this._GAELWRIT = _RandomAccessFile.readShort();
            this._GENIND = _RandomAccessFile.readShort();
            this._HEALTH = _RandomAccessFile.readShort();
            this._HEDIND = _RandomAccessFile.readShort();
            this._HEMPIND = _RandomAccessFile.readShort();
            this._HHLTHIND = _RandomAccessFile.readShort();
            this._HHSGIND = _RandomAccessFile.readShort();
            this._HNCARERS = _RandomAccessFile.readShort();
            this._HNEARNRS = _RandomAccessFile.readShort();
            this._HNELDERS = _RandomAccessFile.readShort();
            this._HNFAMS = _RandomAccessFile.readShort();
            this._HNLLTI = _RandomAccessFile.readShort();
            this._HNPRHLTH = _RandomAccessFile.readShort();
            this._HNRESDNT = _RandomAccessFile.readShort();
            this._HOURSPW = _RandomAccessFile.readShort();
            this._HOURSPWG = _RandomAccessFile.readShort();
            this._HRSOCGRD = _RandomAccessFile.readShort();
            this._INDSTRY0 = _RandomAccessFile.readShort();
            this._IRISLANG = _RandomAccessFile.readShort();
            this._ISCO = _RandomAccessFile.readShort();
            this._LASTWORK = _RandomAccessFile.readShort();
            this._LLTI = _RandomAccessFile.readShort();
            this._LOWFLOR0 = _RandomAccessFile.readShort();
            this._MARSTAT = _RandomAccessFile.readShort();
            this._MIGIND = _RandomAccessFile.readShort();
            this._MIGORGN = _RandomAccessFile.readShort();
            this._MULTETH = _RandomAccessFile.readShort();
            this._NSSEC = _RandomAccessFile.readShort();
            this._OCCUPNCY = _RandomAccessFile.readShort();
            this._ONCPERIM = _RandomAccessFile.readShort();
            this._PROFQUAL = _RandomAccessFile.readShort();
            this._PROVCARE = _RandomAccessFile.readShort();
            this._QUALVEWN = _RandomAccessFile.readShort();
            this._QUALVS = _RandomAccessFile.readShort();
            this._REGION = _RandomAccessFile.readShort();
            this._RELGEW = _RandomAccessFile.readShort();
            this._RELGS1 = _RandomAccessFile.readShort();
            this._RELIGN = _RandomAccessFile.readShort();
            this._RELTOHR = _RandomAccessFile.readShort();
            this._ROOMSFLR = _RandomAccessFile.readShort();
            this._ROOMSNUM = _RandomAccessFile.readShort();
            this._SELFCONT = _RandomAccessFile.readShort();
            this._SOCMIN = _RandomAccessFile.readShort();
            this._SOCSUBMJ = _RandomAccessFile.readShort();
            this._STAHUK = _RandomAccessFile.readShort();
            this._SUPERVSR = _RandomAccessFile.readShort();
            this._TENUREW = _RandomAccessFile.readShort();
            this._TENURSN = _RandomAccessFile.readShort();
            this._TERMTIME = _RandomAccessFile.readShort();
            this._TRANWRK0 = _RandomAccessFile.readShort();
            this._WLSHREAD = _RandomAccessFile.readShort();
            this._WLSHSPK = _RandomAccessFile.readShort();
            this._WLSHSTND = _RandomAccessFile.readShort();
            this._WLSHWRIT = _RandomAccessFile.readShort();
            this._WORKFORC = _RandomAccessFile.readShort();
            this._WRKPLCE0 = _RandomAccessFile.readShort();
        } catch (IOException ioe0) {
            ioe0.printStackTrace();
        }
    }

    /**
     * Initialises all values.
     */
    @Override
    protected void _Init() {
        super._Init();
        this._ID = Long.MIN_VALUE;
        this._PNUM = Long.MIN_VALUE;
        this._SEX = false;
        this._STUDENT = false;
        this._ACCTYPE = Short.MIN_VALUE;
        this._AGE0 = Short.MIN_VALUE;
        this._BATHWC = Short.MIN_VALUE;
        this._CARS0 = Short.MIN_VALUE;
        this._CENHEAT0 = Short.MIN_VALUE;
        this._CESTATUS = Short.MIN_VALUE;
        this._CETYPE = Short.MIN_VALUE;
        this._COBIRT0 = Short.MIN_VALUE;
        this._COMBGN = Short.MIN_VALUE;
        this._COUNTRY = Short.MIN_VALUE;
        this._DENSITY = Short.MIN_VALUE;
        this._DISTMOV0 = Short.MIN_VALUE;
        this._DISTWRK0 = Short.MIN_VALUE;
        this._ECONACT = Short.MIN_VALUE;
        this._EDISDONO = Short.MIN_VALUE;
        this._ETHEW = Short.MIN_VALUE;
        this._ETHN = Short.MIN_VALUE;
        this._ETHS = Short.MIN_VALUE;
        this._EVERWORK = Short.MIN_VALUE;
        this._FAMTYP = Short.MIN_VALUE;
        this._FNDEPCH = Short.MIN_VALUE;
        this._FRECONAC = Short.MIN_VALUE;
        this._FRNSSEC = Short.MIN_VALUE;
        this._FRSEX = Short.MIN_VALUE;
        this._FURN = Short.MIN_VALUE;
        this._GAELREAD = Short.MIN_VALUE;
        this._GAELSPK = Short.MIN_VALUE;
        this._GAELSTND = Short.MIN_VALUE;
        this._GAELWRIT = Short.MIN_VALUE;
        this._GENIND = Short.MIN_VALUE;
        this._HEALTH = Short.MIN_VALUE;
        this._HEDIND = Short.MIN_VALUE;
        this._HEMPIND = Short.MIN_VALUE;
        this._HHLTHIND = Short.MIN_VALUE;
        this._HHSGIND = Short.MIN_VALUE;
        this._HNCARERS = Short.MIN_VALUE;
        this._HNEARNRS = Short.MIN_VALUE;
        this._HNELDERS = Short.MIN_VALUE;
        this._HNFAMS = Short.MIN_VALUE;
        this._HNLLTI = Short.MIN_VALUE;
        this._HNPRHLTH = Short.MIN_VALUE;
        this._HNRESDNT = Short.MIN_VALUE;
        this._HOURSPW = Short.MIN_VALUE;
        this._HOURSPWG = Short.MIN_VALUE;
        this._HRSOCGRD = Short.MIN_VALUE;
        this._INDSTRY0 = Short.MIN_VALUE;
        this._IRISLANG = Short.MIN_VALUE;
        this._ISCO = Short.MIN_VALUE;
        this._LASTWORK = Short.MIN_VALUE;
        this._LLTI = Short.MIN_VALUE;
        this._LOWFLOR0 = Short.MIN_VALUE;
        this._MARSTAT = Short.MIN_VALUE;
        this._MIGIND = Short.MIN_VALUE;
        this._MIGORGN = Short.MIN_VALUE;
        this._MULTETH = Short.MIN_VALUE;
        this._NSSEC = Short.MIN_VALUE;
        this._OCCUPNCY = Short.MIN_VALUE;
        this._ONCPERIM = Short.MIN_VALUE;
        this._PROFQUAL = Short.MIN_VALUE;
        this._PROVCARE = Short.MIN_VALUE;
        this._QUALVEWN = Short.MIN_VALUE;
        this._QUALVS = Short.MIN_VALUE;
        this._REGION = Short.MIN_VALUE;
        this._RELGEW = Short.MIN_VALUE;
        this._RELGS1 = Short.MIN_VALUE;
        this._RELIGN = Short.MIN_VALUE;
        this._RELTOHR = Short.MIN_VALUE;
        this._ROOMSFLR = Short.MIN_VALUE;
        this._ROOMSNUM = Short.MIN_VALUE;
        this._SELFCONT = Short.MIN_VALUE;
        this._SOCMIN = Short.MIN_VALUE;
        this._SOCSUBMJ = Short.MIN_VALUE;
        this._STAHUK = Short.MIN_VALUE;
        this._SUPERVSR = Short.MIN_VALUE;
        this._TENUREW = Short.MIN_VALUE;
        this._TENURSN = Short.MIN_VALUE;
        this._TERMTIME = Short.MIN_VALUE;
        this._TRANWRK0 = Short.MIN_VALUE;
        this._WLSHREAD = Short.MIN_VALUE;
        this._WLSHSPK = Short.MIN_VALUE;
        this._WLSHSTND = Short.MIN_VALUE;
        this._WLSHWRIT = Short.MIN_VALUE;
        this._WORKFORC = Short.MIN_VALUE;
        this._WRKPLCE0 = Short.MIN_VALUE;
    }

    /**
     * Returns a string description of this;
     * @return 
     */
    @Override
    public String toString() {
        return super.toString() +
                ",_ID " + _ID +
                ",_PNUM " + _PNUM +
                ",_SEX " + _SEX +
                ",_STUDENT " + _STUDENT +
                ",_ACCTYPE " + _ACCTYPE +
                ",_AGE0 " + _AGE0 +
                ",_BATHWC " + _BATHWC +
                ",_CARS0 " + _CARS0 +
                ",_CENHEAT0 " + _CENHEAT0 +
                ",_CESTATUS " + _CESTATUS +
                ",_CETYPE " + _CETYPE +
                ",_COBIRT0 " + _COBIRT0 +
                ",_COMBGN " + _COMBGN +
                ",_COUNTRY " + _COUNTRY +
                ",_DENSITY " + _DENSITY +
                ",_DISTMOV0 " + _DISTMOV0 +
                ",_DISTWRK0 " + _DISTWRK0 +
                ",_ECONACT " + _ECONACT +
                ",_EDISDONO " + _EDISDONO +
                ",_ETHEW " + _ETHEW +
                ",_ETHN " + _ETHN +
                ",_ETHS " + _ETHS +
                ",_EVERWORK " + _EVERWORK +
                ",_FAMTYP " + _FAMTYP +
                ",_FNDEPCH " + _FNDEPCH +
                ",_FRECONAC " + _FRECONAC +
                ",_FRNSSEC " + _FRNSSEC +
                ",_FRSEX " + _FRSEX +
                ",_FURN " + _FURN +
                ",_GAELREAD " + _GAELREAD +
                ",_GAELSPK " + _GAELSPK +
                ",_GAELSTND " + _GAELSTND +
                ",_GAELWRIT " + _GAELWRIT +
                ",_GENIND " + _GENIND +
                ",_HEALTH " + _HEALTH +
                ",_HEDIND " + _HEDIND +
                ",_HEMPIND " + _HEMPIND +
                ",_HHLTHIND " + _HHLTHIND +
                ",_HHSGIND " + _HHSGIND +
                ",_HNCARERS " + _HNCARERS +
                ",_HNEARNRS " + _HNEARNRS +
                ",_HNELDERS " + _HNELDERS +
                ",_HNFAMS " + _HNFAMS +
                ",_HNLLTI " + _HNLLTI +
                ",_HNPRHLTH " + _HNPRHLTH +
                ",_HNRESDNT " + _HNRESDNT +
                ",_HOURSPW " + _HOURSPW +
                ",_HOURSPWG " + _HOURSPWG +
                ",_HRSOCGRD " + _HRSOCGRD +
                ",_INDSTRY0 " + _INDSTRY0 +
                ",_IRISLANG " + _IRISLANG +
                ",_ISCO " + _ISCO +
                ",_LASTWORK " + _LASTWORK +
                ",_LLTI " + _LLTI +
                ",_LOWFLOR0 " + _LOWFLOR0 +
                ",_MARSTAT " + _MARSTAT +
                ",_MIGIND " + _MIGIND +
                ",_MIGORGN " + _MIGORGN +
                ",_MULTETH " + _MULTETH +
                ",_NSSEC " + _NSSEC +
                ",_OCCUPNCY " + _OCCUPNCY +
                ",_ONCPERIM " + _ONCPERIM +
                ",_PROFQUAL " + _PROFQUAL +
                ",_PROVCARE " + _PROVCARE +
                ",_QUALVEWN " + _QUALVEWN +
                ",_QUALVS " + _QUALVS +
                ",_REGION " + _REGION +
                ",_RELGEW " + _RELGEW +
                ",_RELGS1 " + _RELGS1 +
                ",_RELIGN " + _RELIGN +
                ",_RELTOHR " + _RELTOHR +
                ",_ROOMSFLR " + _ROOMSFLR +
                ",_ROOMSNUM " + _ROOMSNUM +
                ",_SELFCONT " + _SELFCONT +
                ",_SOCMIN " + _SOCMIN +
                ",_SOCSUBMJ " + _SOCSUBMJ +
                ",_STAHUK " + _STAHUK +
                ",_SUPERVSR " + _SUPERVSR +
                ",_TENUREW " + _TENUREW +
                ",_TENURSN " + _TENURSN +
                ",_TERMTIME " + _TERMTIME +
                ",_TRANWRK0 " + _TRANWRK0 +
                ",_WLSHREAD " + _WLSHREAD +
                ",_WLSHSPK " + _WLSHSPK +
                ",_WLSHSTND " + _WLSHSTND +
                ",_WLSHWRIT " + _WLSHWRIT +
                ",_WORKFORC " + _WORKFORC +
                ",_WRKPLCE0 " + _WRKPLCE0;
    }

    /**
     * Parses line to modify this setting this._RecordID=_RecordID.
     * @param _RecordID
     * @param line
     *            The Comma Seperated Value <code>String</code>
     * @return 
     * @throws java.io.IOException 
     */
    public boolean parse(
            long _RecordID,
            String line) throws IOException {
        String csvline = line.replace('\t', ',');
        // System.out.println( "line(" + line + ")" );
        // System.out.println( "csvline(" + csvline + ")" );
        String[] fieldsDummy = csvline.split(",");
        String[] fields = new String[88];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fieldsDummy.length);
        this._RecordID = _RecordID;
        this._ID = StaticConverter.to_long(fields[0]);
        this._PNUM = StaticConverter.to_long(fields[1]);
        this._ACCTYPE = StaticConverter.to_short(fields[2]);
        this._AGE0 = StaticConverter.to_short(fields[3]);
        this._BATHWC = StaticConverter.to_short(fields[4]);
        this._CARS0 = StaticConverter.to_short(fields[5]);
        this._CENHEAT0 = StaticConverter.to_short(fields[6]);
        this._CESTATUS = StaticConverter.to_short(fields[7]);
        this._CETYPE = StaticConverter.to_short(fields[8]);
        this._COBIRT0 = StaticConverter.to_short(fields[9]);
        this._COMBGN = StaticConverter.to_short(fields[10]);
        this._COUNTRY = StaticConverter.to_short(fields[11]);
        this._DENSITY = StaticConverter.to_short(fields[12]);
        this._DISTMOV0 = StaticConverter.to_short(fields[13]);
        this._DISTWRK0 = StaticConverter.to_short(fields[14]);
        this._ECONACT = StaticConverter.to_short(fields[15]);
        this._EDISDONO = StaticConverter.to_short(fields[16]);
        this._ETHEW = StaticConverter.to_short(fields[17]);
        this._ETHN = StaticConverter.to_short(fields[18]);
        this._ETHS = StaticConverter.to_short(fields[19]);
        this._EVERWORK = StaticConverter.to_short(fields[20]);
        this._FAMTYP = StaticConverter.to_short(fields[21]);
        this._FNDEPCH = StaticConverter.to_short(fields[22]);
        this._FRECONAC = StaticConverter.to_short(fields[23]);
        this._FRNSSEC = StaticConverter.to_short(fields[24]);
        this._FRSEX = StaticConverter.to_short(fields[25]);
        this._FURN = StaticConverter.to_short(fields[26]);
        this._GAELREAD = StaticConverter.to_short(fields[27]);
        this._GAELSPK = StaticConverter.to_short(fields[28]);
        this._GAELSTND = StaticConverter.to_short(fields[29]);
        this._GAELWRIT = StaticConverter.to_short(fields[30]);
        this._GENIND = StaticConverter.to_short(fields[31]);
        this._HEALTH = StaticConverter.to_short(fields[32]);
        this._HEDIND = StaticConverter.to_short(fields[33]);
        this._HEMPIND = StaticConverter.to_short(fields[34]);
        this._HHLTHIND = StaticConverter.to_short(fields[35]);
        this._HHSGIND = StaticConverter.to_short(fields[36]);
        this._HNCARERS = StaticConverter.to_short(fields[37]);
        this._HNEARNRS = StaticConverter.to_short(fields[38]);
        this._HNELDERS = StaticConverter.to_short(fields[39]);
        this._HNFAMS = StaticConverter.to_short(fields[40]);
        this._HNLLTI = StaticConverter.to_short(fields[41]);
        this._HNPRHLTH = StaticConverter.to_short(fields[42]);
        this._HNRESDNT = StaticConverter.to_short(fields[43]);
        this._HOURSPW = StaticConverter.to_short(fields[44]);
        this._HOURSPWG = StaticConverter.to_short(fields[45]);
        this._HRSOCGRD = StaticConverter.to_short(fields[46]);
        this._INDSTRY0 = StaticConverter.to_short(fields[47]);
        this._IRISLANG = StaticConverter.to_short(fields[48]);
        this._ISCO = StaticConverter.to_short(fields[49]);
        this._LASTWORK = StaticConverter.to_short(fields[50]);
        this._LLTI = StaticConverter.to_short(fields[51]);
        this._LOWFLOR0 = StaticConverter.to_short(fields[52]);
        this._MARSTAT = StaticConverter.to_short(fields[53]);
        this._MIGORGN = StaticConverter.to_short(fields[54]);
        this._MULTETH = StaticConverter.to_short(fields[55]);
        this._NSSEC = StaticConverter.to_short(fields[56]);
        this._OCCUPNCY = StaticConverter.to_short(fields[57]);
        this._ONCPERIM = StaticConverter.to_short(fields[58]);
        this._PROFQUAL = StaticConverter.to_short(fields[59]);
        this._PROVCARE = StaticConverter.to_short(fields[60]);
        this._QUALVEWN = StaticConverter.to_short(fields[61]);
        this._QUALVS = StaticConverter.to_short(fields[62]);
        this._REGION = StaticConverter.to_short(fields[63]);
        this._RELGEW = StaticConverter.to_short(fields[64]);
        this._RELGS1 = StaticConverter.to_short(fields[65]);
        this._RELIGN = StaticConverter.to_short(fields[66]);
        this._RELTOHR = StaticConverter.to_short(fields[67]);
        this._ROOMSFLR = StaticConverter.to_short(fields[68]);
        this._ROOMSNUM = StaticConverter.to_short(fields[69]);
        this._SELFCONT = StaticConverter.to_short(fields[70]);
        this._SEX = StaticConverter.to_boolean(fields[71]);
        this._SOCMIN = StaticConverter.to_short(fields[72]);
        this._SOCSUBMJ = StaticConverter.to_short(fields[73]);
        this._STAHUK = StaticConverter.to_short(fields[74]);
        this._STUDENT = StaticConverter.to_boolean(fields[75]);
        this._SUPERVSR = StaticConverter.to_short(fields[76]);
        this._TENUREW = StaticConverter.to_short(fields[77]);
        this._TENURSN = StaticConverter.to_short(fields[78]);
        this._TERMTIME = StaticConverter.to_short(fields[79]);
        this._TRANWRK0 = StaticConverter.to_short(fields[80]);
        this._WLSHREAD = StaticConverter.to_short(fields[81]);
        this._WLSHSPK = StaticConverter.to_short(fields[82]);
        this._WLSHSTND = StaticConverter.to_short(fields[83]);
        this._WLSHWRIT = StaticConverter.to_short(fields[84]);
        this._WORKFORC = StaticConverter.to_short(fields[85]);
        this._WRKPLCE0 = StaticConverter.to_short(fields[86]);
        this._MIGIND = StaticConverter.to_short(fields[87]);
        return true;
    }

    /**
     * Returns a copy of this._ID
     * @return 
     */
    public long get_ID() {
        return this._ID;
    }

    /**
     * Returns a copy of this._PNUM
     * @return 
     */
    public long get_PNUM() {
        return this._PNUM;
    }

    /**
     * Returns a copy of this._SEX
     * @return 
     */
    public boolean get_SEX() {
        return this._SEX;
    }

    /**
     * Returns a copy of this._STUDENT
     * @return 
     */
    public boolean get_STUDENT() {
        return this._STUDENT;
    }

    /**
     * Returns a copy of this._ACCTYPE
     * @return 
     */
    public short get_ACCTYPE() {
        return this._ACCTYPE;
    }

    /**
     * Returns a copy of this._AGE0
     * @return 
     */
    public short get_AGE0() {
        return this._AGE0;
    }

    /**
     * Returns a copy of this._BATHWC
     * @return 
     */
    public short get_BATHWC() {
        return this._BATHWC;
    }

    /**
     * Returns a copy of this._CARS0
     * @return 
     */
    public short get_CARS0() {
        return this._CARS0;
    }

    /**
     * Returns a copy of this._CENHEAT0
     * @return 
     */
    public short get_CENHEAT0() {
        return this._CENHEAT0;
    }

    /**
     * Returns a copy of this._CESTATUS
     * @return 
     */
    public short get_CESTATUS() {
        return this._CESTATUS;
    }

    /**
     * Returns a copy of this._CETYPE
     * @return 
     */
    public short get_CETYPE() {
        return this._CETYPE;
    }

    /**
     * Returns a copy of this._COBIRT0
     * @return 
     */
    public short get_COBIRT0() {
        return this._COBIRT0;
    }

    /**
     * Returns a copy of this._COMBGN
     * @return 
     */
    public short get_COMBGN() {
        return this._COMBGN;
    }

    /**
     * Returns a copy of this._COUNTRY
     * @return 
     */
    public short get_COUNTRY() {
        return this._COUNTRY;
    }

    /**
     * Returns a copy of this._DENSITY
     * @return 
     */
    public short get_DENSITY() {
        return this._DENSITY;
    }

    /**
     * Returns a copy of this._DISTMOV0
     * @return 
     */
    public short get_DISTMOV0() {
        return this._DISTMOV0;
    }

    /**
     * Returns a copy of this._DISTWRK0
     * @return 
     */
    public short get_DISTWRK0() {
        return this._DISTWRK0;
    }

    /**
     * Returns a copy of this._ECONACT
     * @return 
     */
    public short get_ECONACT() {
        return this._ECONACT;
    }

    /**
     * Returns a copy of this._EDISDONO
     * @return 
     */
    public short get_EDISDONO() {
        return this._EDISDONO;
    }

    /**
     * Returns a copy of this._ETHEW
     * @return 
     */
    public short get_ETHEW() {
        return this._ETHEW;
    }

    /**
     * Returns a copy of this._ETHN
     * @return 
     */
    public short get_ETHN() {
        return this._ETHN;
    }

    /**
     * Returns a copy of this._ETHS
     * @return 
     */
    public short get_ETHS() {
        return this._ETHS;
    }

    /**
     * Returns a copy of this._EVERWORK
     * @return 
     */
    public short get_EVERWORK() {
        return this._EVERWORK;
    }

    /**
     * Returns a copy of this._FAMTYP
     * @return 
     */
    public short get_FAMTYP() {
        return this._FAMTYP;
    }

    /**
     * Returns a copy of this._FNDEPCH
     * @return 
     */
    public short get_FNDEPCH() {
        return this._FNDEPCH;
    }

    /**
     * Returns a copy of this._FRECONAC
     * @return 
     */
    public short get_FRECONAC() {
        return this._FRECONAC;
    }

    /**
     * Returns a copy of this._FRNSSEC
     * @return 
     */
    public short get_FRNSSEC() {
        return this._FRNSSEC;
    }

    /**
     * Returns a copy of this._FRSEX
     * @return 
     */
    public short get_FRSEX() {
        return this._FRSEX;
    }

    /**
     * Returns a copy of this._FURN
     * @return 
     */
    public short get_FURN() {
        return this._FURN;
    }

    /**
     * Returns a copy of this._GAELREAD
     * @return 
     */
    public short get_GAELREAD() {
        return this._GAELREAD;
    }

    /**
     * Returns a copy of this._GAELSPK
     * @return 
     */
    public short get_GAELSPK() {
        return this._GAELSPK;
    }

    /**
     * Returns a copy of this._GAELSTND
     * @return 
     */
    public short get_GAELSTND() {
        return this._GAELSTND;
    }

    /**
     * Returns a copy of this._GAELWRIT
     * @return 
     */
    public short get_GAELWRIT() {
        return this._GAELWRIT;
    }

    /**
     * Returns a copy of this._GENIND
     * @return 
     */
    public short get_GENIND() {
        return this._GENIND;
    }

    /**
     * Returns a copy of this._HEALTH
     * @return 
     */
    public short get_HEALTH() {
        return this._HEALTH;
    }

    /**
     * Returns a copy of this._HEDIND
     * @return 
     */
    public short get_HEDIND() {
        return this._HEDIND;
    }

    /**
     * Returns a copy of this._HEMPIND
     * @return 
     */
    public short get_HEMPIND() {
        return this._HEMPIND;
    }

    /**
     * Returns a copy of this._HHLTHIND
     * @return 
     */
    public short get_HHLTHIND() {
        return this._HHLTHIND;
    }

    /**
     * Returns a copy of this._HHSGIND
     * @return 
     */
    public short get_HHSGIND() {
        return this._HHSGIND;
    }

    /**
     * Returns a copy of this._HNCARERS
     * @return 
     */
    public short get_HNCARERS() {
        return this._HNCARERS;
    }

    /**
     * Returns a copy of this._HNEARNRS
     * @return 
     */
    public short get_HNEARNRS() {
        return this._HNEARNRS;
    }

    /**
     * Returns a copy of this._HNELDERS
     * @return 
     */
    public short get_HNELDERS() {
        return this._HNELDERS;
    }

    /**
     * Returns a copy of this._HNFAMS
     * @return 
     */
    public short get_HNFAMS() {
        return this._HNFAMS;
    }

    /**
     * Returns a copy of this._HNLLTI
     * @return 
     */
    public short get_HNLLTI() {
        return this._HNLLTI;
    }

    /**
     * Returns a copy of this._HNPRHLTH
     * @return 
     */
    public short get_HNPRHLTH() {
        return this._HNPRHLTH;
    }

    /**
     * Returns a copy of this._HNRESDNT
     * @return 
     */
    public short get_HNRESDNT() {
        return this._HNRESDNT;
    }

    /**
     * Returns a copy of this._HOURSPW
     * @return 
     */
    public short get_HOURSPW() {
        return this._HOURSPW;
    }

    /**
     * Returns a copy of this._HOURSPWG
     * @return 
     */
    public short get_HOURSPWG() {
        return this._HOURSPWG;
    }

    /**
     * Returns a copy of this._HRSOCGRD
     * @return 
     */
    public short get_HRSOCGRD() {
        return this._HRSOCGRD;
    }

    /**
     * Returns a copy of this._INDSTRY0
     * @return 
     */
    public short get_INDSTRY0() {
        return this._INDSTRY0;
    }

    /**
     * Returns a copy of this._IRISLANG
     * @return 
     */
    public short get_IRISLANG() {
        return this._IRISLANG;
    }

    /**
     * Returns a copy of this._ISCO
     * @return 
     */
    public short get_ISCO() {
        return this._ISCO;
    }

    /**
     * Returns a copy of this._LASTWORK
     * @return 
     */
    public short get_LASTWORK() {
        return this._LASTWORK;
    }

    /**
     * Returns a copy of this._LLTI
     * @return 
     */
    public short get_LLTI() {
        return this._LLTI;
    }

    /**
     * Returns a copy of this._LOWFLOR0
     * @return 
     */
    public short get_LOWFLOR0() {
        return this._LOWFLOR0;
    }

    /**
     * Returns a copy of this._MARSTAT
     * @return 
     */
    public short get_MARSTAT() {
        return this._MARSTAT;
    }

    /**
     * Returns a copy of this._MIGIND
     * @return 
     */
    public short get_MIGIND() {
        return this._MIGIND;
    }

    /**
     * Returns a copy of this._MIGORGN
     * @return 
     */
    public short get_MIGORGN() {
        return this._MIGORGN;
    }

    /**
     * Returns a copy of this._MULTETH
     * @return 
     */
    public short get_MULTETH() {
        return this._MULTETH;
    }

    /**
     * Returns a copy of this._NSSEC
     * @return 
     */
    public short get_NSSEC() {
        return this._NSSEC;
    }

    /**
     * Returns a copy of this._OCCUPNCY
     * @return 
     */
    public short get_OCCUPNCY() {
        return this._OCCUPNCY;
    }

    /**
     * Returns a copy of this._ONCPERIM
     * @return 
     */
    public short get_ONCPERIM() {
        return this._ONCPERIM;
    }

    /**
     * Returns a copy of this._PROFQUAL
     * @return 
     */
    public short get_PROFQUAL() {
        return this._PROFQUAL;
    }

    /**
     * Returns a copy of this._PROVCARE
     * @return 
     */
    public short get_PROVCARE() {
        return this._PROVCARE;
    }

    /**
     * Returns a copy of this._QUALVEWN
     * @return 
     */
    public short get_QUALVEWN() {
        return this._QUALVEWN;
    }

    /**
     * Returns a copy of this._QUALVS
     * @return 
     */
    public short get_QUALVS() {
        return this._QUALVS;
    }

    /**
     * Returns a copy of this._REGION
     * @return 
     */
    public short get_REGION() {
        return this._REGION;
    }

    /**
     * Returns a copy of this._RELGEW
     * @return 
     */
    public short get_RELGEW() {
        return this._RELGEW;
    }

    /**
     * Returns a copy of this._RELGS1
     * @return 
     */
    public short get_RELGS1() {
        return this._RELGS1;
    }

    /**
     * Returns a copy of this._RELIGN
     * @return 
     */
    public short get_RELIGN() {
        return this._RELIGN;
    }

    /**
     * Returns a copy of this._RELTOHR
     * @return 
     */
    public short get_RELTOHR() {
        return this._RELTOHR;
    }

    /**
     * Returns a copy of this._ROOMSFLR
     * @return 
     */
    public short get_ROOMSFLR() {
        return this._ROOMSFLR;
    }

    /**
     * Returns a copy of this._ROOMSNUM
     * @return 
     */
    public short get_ROOMSNUM() {
        return this._ROOMSNUM;
    }

    /**
     * Returns a copy of this._SELFCONT
     * @return 
     */
    public short get_SELFCONT() {
        return this._SELFCONT;
    }

    /**
     * Returns a copy of this._SOCMIN
     * @return 
     */
    public short get_SOCMIN() {
        return this._SOCMIN;
    }

    /**
     * Returns a copy of this._SOCSUBMJ
     * @return 
     */
    public short get_SOCSUBMJ() {
        return this._SOCSUBMJ;
    }

    /**
     * Returns a copy of this._STAHUK
     * @return 
     */
    public short get_STAHUK() {
        return this._STAHUK;
    }

    /**
     * Returns a copy of this._SUPERVSR
     * @return 
     */
    public short get_SUPERVSR() {
        return this._SUPERVSR;
    }

    /**
     * Returns a copy of this._TENUREW
     * @return 
     */
    public short get_TENUREW() {
        return this._TENUREW;
    }

    /**
     * Returns a copy of this._TENURSN
     * @return 
     */
    public short get_TENURSN() {
        return this._TENURSN;
    }

    /**
     * Returns a copy of this._TERMTIME
     * @return 
     */
    public short get_TERMTIME() {
        return this._TERMTIME;
    }

    /**
     * Returns a copy of this._TRANWRK0
     * @return 
     */
    public short get_TRANWRK0() {
        return this._TRANWRK0;
    }

    /**
     * Returns a copy of this.__WLSHREAD
     * @return 
     */
    public short get_WLSHREAD() {
        return this._WLSHREAD;
    }

    /**
     * Returns a copy of this._WLSHSPK
     * @return 
     */
    public short get_WLSHSPK() {
        return this._WLSHSPK;
    }

    /**
     * Returns a copy of this._WLSHSTND
     * @return 
     */
    public short get_WLSHSTND() {
        return this._WLSHSTND;
    }

    /**
     * Returns a copy of this._WLSHWRIT
     * @return 
     */
    public short get_WLSHWRIT() {
        return this._WLSHWRIT;
    }

    /**
     * Returns a copy of this._WORKFORC
     * @return 
     */
    public short get_WORKFORC() {
        return this._WORKFORC;
    }

    /**
     * Returns a copy of this._WRKPLCE0
     * @return 
     */
    public short get_WRKPLCE0() {
        return this._WRKPLCE0;
    }

    /**
     * _AGE0 is banded as follows: For ( 0 <= _AGE0 <= 15 ) or ( 75 <= _AGE0 <= 94
     * ) _AGE0 represent individual years of age. For _AGE0 = 16, ( 16 <= age <=
     * 20 ). Age range = 4. For _AGE0 = 20, ( 20 <= age <= 24 ). Age range = 4.
     * For _AGE0 = 25, ( 25 <= age <= 29 ). Age range = 4. For _AGE0 = 30, ( 30 <=
     * age <= 44 ). Age range = 14. For _AGE0 = 45, ( 45 <= age <= 59 ). Age
     * range = 14. For _AGE0 = 60, ( 60 <= age <= 64 ). Age range = 4. For _AGE0 =
     * 65, ( 65 <= age <= 69 ). Age range = 4. For _AGE0 = 70, ( 70 <= age <= 74
     * ). Age range = 4. For _AGE0 = 95, ( 95 <= age ). For any banded age a
     * random number between 0 and Age range is obtained and added to _AGE0. It
     * is assumed that the for the open ended age the Age range is 4, i.e.
     * people are less than 100 years old!
     * @return 
     */
    public int getAgeInt() {
        short AGE0 = this._AGE0;
        if ((0 <= AGE0 && AGE0 <= 15) || (75 <= AGE0 && AGE0 <= 94)) {
            return AGE0;
        } else {
            Random random = new Random();
            if (AGE0 == 45 || AGE0 == 30) {
                return AGE0 + random.nextInt(14);
            } else {
                return AGE0 + random.nextInt(4);
            }
        }
    }

    /**
     * Writes <code>this</code> to <code>aRandomAccessFile</code> at the current
     * position.
     *
     * @param aRandomAccessFile
     *            The <code>RandomAccessFile</code> this is written to.
     * @throws java.io.IOException
     */
    @Override
    public void write(
            RandomAccessFile aRandomAccessFile) throws IOException {
        super.write(aRandomAccessFile);
        aRandomAccessFile.writeLong(_ID);
        aRandomAccessFile.writeLong(_PNUM);
        aRandomAccessFile.writeBoolean(_SEX);
        aRandomAccessFile.writeBoolean(_STUDENT);
        aRandomAccessFile.writeShort(_ACCTYPE);
        aRandomAccessFile.writeShort(_AGE0);
        aRandomAccessFile.writeShort(_BATHWC);
        aRandomAccessFile.writeShort(_CARS0);
        aRandomAccessFile.writeShort(_CENHEAT0);
        aRandomAccessFile.writeShort(_CESTATUS);
        aRandomAccessFile.writeShort(_CETYPE);
        aRandomAccessFile.writeShort(_COBIRT0);
        aRandomAccessFile.writeShort(_COMBGN);
        aRandomAccessFile.writeShort(_COUNTRY);
        aRandomAccessFile.writeShort(_DENSITY);
        aRandomAccessFile.writeShort(_DISTMOV0);
        aRandomAccessFile.writeShort(_DISTWRK0);
        aRandomAccessFile.writeShort(_ECONACT);
        aRandomAccessFile.writeShort(_EDISDONO);
        aRandomAccessFile.writeShort(_ETHEW);
        aRandomAccessFile.writeShort(_ETHN);
        aRandomAccessFile.writeShort(_ETHS);
        aRandomAccessFile.writeShort(_EVERWORK);
        aRandomAccessFile.writeShort(_FAMTYP);
        aRandomAccessFile.writeShort(_FNDEPCH);
        aRandomAccessFile.writeShort(_FRECONAC);
        aRandomAccessFile.writeShort(_FRNSSEC);
        aRandomAccessFile.writeShort(_FRSEX);
        aRandomAccessFile.writeShort(_FURN);
        aRandomAccessFile.writeShort(_GAELREAD);
        aRandomAccessFile.writeShort(_GAELSPK);
        aRandomAccessFile.writeShort(_GAELSTND);
        aRandomAccessFile.writeShort(_GAELWRIT);
        aRandomAccessFile.writeShort(_GENIND);
        aRandomAccessFile.writeShort(_HEALTH);
        aRandomAccessFile.writeShort(_HEDIND);
        aRandomAccessFile.writeShort(_HEMPIND);
        aRandomAccessFile.writeShort(_HHLTHIND);
        aRandomAccessFile.writeShort(_HHSGIND);
        aRandomAccessFile.writeShort(_HNCARERS);
        aRandomAccessFile.writeShort(_HNEARNRS);
        aRandomAccessFile.writeShort(_HNELDERS);
        aRandomAccessFile.writeShort(_HNFAMS);
        aRandomAccessFile.writeShort(_HNLLTI);
        aRandomAccessFile.writeShort(_HNPRHLTH);
        aRandomAccessFile.writeShort(_HNRESDNT);
        aRandomAccessFile.writeShort(_HOURSPW);
        aRandomAccessFile.writeShort(_HOURSPWG);
        aRandomAccessFile.writeShort(_HRSOCGRD);
        aRandomAccessFile.writeShort(_INDSTRY0);
        aRandomAccessFile.writeShort(_IRISLANG);
        aRandomAccessFile.writeShort(_ISCO);
        aRandomAccessFile.writeShort(_LASTWORK);
        aRandomAccessFile.writeShort(_LLTI);
        aRandomAccessFile.writeShort(_LOWFLOR0);
        aRandomAccessFile.writeShort(_MARSTAT);
        aRandomAccessFile.writeShort(_MIGIND);
        aRandomAccessFile.writeShort(_MIGORGN);
        aRandomAccessFile.writeShort(_MULTETH);
        aRandomAccessFile.writeShort(_NSSEC);
        aRandomAccessFile.writeShort(_OCCUPNCY);
        aRandomAccessFile.writeShort(_ONCPERIM);
        aRandomAccessFile.writeShort(_PROFQUAL);
        aRandomAccessFile.writeShort(_PROVCARE);
        aRandomAccessFile.writeShort(_QUALVEWN);
        aRandomAccessFile.writeShort(_QUALVS);
        aRandomAccessFile.writeShort(_REGION);
        aRandomAccessFile.writeShort(_RELGEW);
        aRandomAccessFile.writeShort(_RELGS1);
        aRandomAccessFile.writeShort(_RELIGN);
        aRandomAccessFile.writeShort(_RELTOHR);
        aRandomAccessFile.writeShort(_ROOMSFLR);
        aRandomAccessFile.writeShort(_ROOMSNUM);
        aRandomAccessFile.writeShort(_SELFCONT);
        aRandomAccessFile.writeShort(_SOCMIN);
        aRandomAccessFile.writeShort(_SOCSUBMJ);
        aRandomAccessFile.writeShort(_STAHUK);
        aRandomAccessFile.writeShort(_SUPERVSR);
        aRandomAccessFile.writeShort(_TENUREW);
        aRandomAccessFile.writeShort(_TENURSN);
        aRandomAccessFile.writeShort(_TERMTIME);
        aRandomAccessFile.writeShort(_TRANWRK0);
        aRandomAccessFile.writeShort(_WLSHREAD);
        aRandomAccessFile.writeShort(_WLSHSPK);
        aRandomAccessFile.writeShort(_WLSHSTND);
        aRandomAccessFile.writeShort(_WLSHWRIT);
        aRandomAccessFile.writeShort(_WORKFORC);
        aRandomAccessFile.writeShort(_WRKPLCE0);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (int) (this._ID ^ (this._ID >>> 32));
        return hash;
    }

    /**
     * Overrides equals in Object
     * @return 
     */
    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if ((object == null) || (object.getClass() != this.getClass())) {
            return false;
        }
        Census_ISARDataRecord aISARDataRecord = (Census_ISARDataRecord) object;
        return this._RecordID == aISARDataRecord._RecordID;
        //return this._ID == aISARDataRecord._ID;
    }

    /**
     * Returns the size of record in bytes as a long 198
     * @return 
     */
    @Override
    public long getSizeInBytes() {
        long result = super.getSizeInBytes();
        result += (
                ((2L * (long) Long.SIZE) +
                (84L * (long) Short.SIZE)) / getNumberOfBitsInByte()) + 2L;
        return result;
    }
}