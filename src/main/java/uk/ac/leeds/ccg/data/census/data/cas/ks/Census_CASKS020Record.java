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
package uk.ac.leeds.ccg.data.census.data.cas.ks;

import uk.ac.leeds.ccg.data.census.data.Census_AreaRecord;
import uk.ac.leeds.ccg.data.id.Data_RecordID;
import uk.ac.leeds.ccg.data.census.data.id.Census_RecordID;
import uk.ac.leeds.ccg.math.Math_Integer;

/**
 * For storing a CASKS020 Record.
 *
 * @author Andy Turner
 * @version 1.0.0
 */
public class Census_CASKS020Record extends Census_AreaRecord {

    /*
     * Table KS020 Household composition: All households Footnotes and Comments
     * for Table KS020 1. A dependent child is a person in a household aged 0 to
     * 15 (whether or not in a family) or a person aged 16 to 18 who is a
     * full-time student in a family with parent(s).
     */
    /**
     * KS0200001 = allHouseholds
     */
    protected int allHouseholds;
    /**
     * KS0200002 = householdsComprisingOnePensioner
     */
    protected int householdsComprisingOnePensioner;
    /**
     * KS0200003 = householdsComprisingOnePersonOtherThanPensioner
     */
    protected int householdsComprisingOnePersonOtherThanPensioner;
    /**
     * KS0200004 = householdsComprisingOneFamilyAndNoOthersAllPensioners
     */
    protected int householdsComprisingOneFamilyAndNoOthersAllPensioners;
    /**
     * KS0200005 =
     * householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren
     */
    protected int householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren;
    /**
     * KS0200006
     * =householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren
     */
    protected int householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren;
    /**
     * KS0200007
     * =householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent
     */
    protected int householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent;
    /**
     * KS0200020 =
     * householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren
     */
    protected int householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren;
    /**
     * KS0200009
     * =householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren
     */
    protected int householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren;
    /**
     * KS0200010
     * =householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent
     */
    protected int householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent;
    /**
     * KS0200011
     * =householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren
     */
    protected int householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren;
    /**
     * KS0200012
     * =householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent
     */
    protected int householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent;
    /**
     * KS0200013 = householdsComprisingOtherThanOneFamilyWithDependentChildren
     */
    protected int householdsComprisingOtherThanOneFamilyWithDependentChildren;
    /**
     * KS0200014 = householdsComprisingOtherThanOneFamilyAllStudent
     */
    protected int householdsComprisingOtherThanOneFamilyAllStudent;
    /**
     * KS0200015 = householdsComprisingOtherThanOneFamilyAllPensioner
     */
    protected int householdsComprisingOtherThanOneFamilyAllPensioner;
    /**
     * KS0200016 = householdsComprisingOtherThanOneFamilyOther
     */
    protected int householdsComprisingOtherThanOneFamilyOther;

    /**
     * Creates a new record with all numerical fields set to 0.
     *
     * @param rID What {@link #ID} is set to.
     */
    public Census_CASKS020Record(Census_RecordID rID) {
        super(rID);
    }

    /**
     * Creates a new record with fields set from line.
     *
     * @param rID What {@link #ID} is set to.
     * @param line A line for a CSV file.
     */
    public Census_CASKS020Record(Census_RecordID rID, String line) {
        super(rID);
        String[] fieldsDummy = line.split(",");
        // System.out.println(fieldsDummy.length);
        // for (int i = 0; i < fieldsDummy.length; i ++ ){
        // System.out.println(fieldsDummy[i]);
        // }
        String[] fields = new String[17];
        for (int i = 0; i < fields.length; i++) {
            fields[i] = "";
        }
        System.arraycopy(fieldsDummy, 0, fields, 0, fields.length);
        zoneCode = fields[0].substring(1, 11);
        // From Table KS020
        this.allHouseholds = Math_Integer.parseInt(fields[1]);
        this.householdsComprisingOnePensioner = Math_Integer.parseInt(fields[2]);
        this.householdsComprisingOnePersonOtherThanPensioner = Math_Integer.parseInt(fields[3]);
        this.householdsComprisingOneFamilyAndNoOthersAllPensioners = Math_Integer.parseInt(fields[4]);
        this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren = Math_Integer.parseInt(fields[5]);
        this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren = Math_Integer.parseInt(fields[6]);
        this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent = Math_Integer.parseInt(fields[7]);
        this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren = Math_Integer.parseInt(fields[8]);
        this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren = Math_Integer.parseInt(fields[9]);
        this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent = Math_Integer.parseInt(fields[10]);
        this.householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren = Math_Integer.parseInt(fields[11]);
        this.householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent = Math_Integer.parseInt(fields[12]);
        this.householdsComprisingOtherThanOneFamilyWithDependentChildren = Math_Integer.parseInt(fields[13]);
        this.householdsComprisingOtherThanOneFamilyAllStudent = Math_Integer.parseInt(fields[14]);
        this.householdsComprisingOtherThanOneFamilyAllPensioner = Math_Integer.parseInt(fields[15]);
        this.householdsComprisingOtherThanOneFamilyOther = Math_Integer.parseInt(fields[16]);
    }

    /**
     * @return A String representation of this.
     */
    @Override
    public String toString() {
        return super.toString() + ", allHouseholds=" + allHouseholds
                + ", householdsComprisingOnePensioner=" + householdsComprisingOnePensioner
                + ", householdsComprisingOnePersonOtherThanPensioner=" + householdsComprisingOnePersonOtherThanPensioner
                + ", householdsComprisingOneFamilyAndNoOthersAllPensioners=" + householdsComprisingOneFamilyAndNoOthersAllPensioners
                + ", householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren=" + householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren
                + ", householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren=" + householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren
                + ", householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent=" + householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent
                + ", householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren=" + householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren
                + ", householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren=" + householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren
                + ", householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent=" + householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent
                + ", householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren=" + householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren
                + ", householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent=" + householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent
                + ", householdsComprisingOtherThanOneFamilyWithDependentChildren=" + householdsComprisingOtherThanOneFamilyWithDependentChildren
                + ", householdsComprisingOtherThanOneFamilyAllStudent=" + householdsComprisingOtherThanOneFamilyAllStudent
                + ", householdsComprisingOtherThanOneFamilyAllPensioner=" + householdsComprisingOtherThanOneFamilyAllPensioner
                + ", householdsComprisingOtherThanOneFamilyOther=" + householdsComprisingOtherThanOneFamilyOther;
    }

    /**
     * @return A Comma Separated Version (CSV) of this.
     */
    @Override
    public String toCSV() {
        return super.toCSV() + "," + allHouseholds + ","
                + householdsComprisingOnePensioner + ","
                + householdsComprisingOnePersonOtherThanPensioner + ","
                + householdsComprisingOneFamilyAndNoOthersAllPensioners + ","
                + householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren + ","
                + householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren + ","
                + householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent + ","
                + householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren + ","
                + householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren + ","
                + householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent + ","
                + householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren + ","
                + householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent + ","
                + householdsComprisingOtherThanOneFamilyWithDependentChildren + ","
                + householdsComprisingOtherThanOneFamilyAllStudent + ","
                + householdsComprisingOtherThanOneFamilyAllPensioner + ","
                + householdsComprisingOtherThanOneFamilyOther;
    }

    /**
     * @return A Comma Separated Version (CSV) of the names of the
     * fields/variables.
     */
    @Override
    public String toCSVHeader() {
        return super.toCSVHeader() + ",allHouseholds"
                + ",householdsComprisingOnePensioner"
                + ",householdsComprisingOnePersonOtherThanPensioner"
                + ",householdsComprisingOneFamilyAndNoOthersAllPensioners"
                + ",householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren"
                + ",householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren"
                + ",householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent"
                + ",householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren"
                + ",householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren"
                + ",householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent"
                + ",householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren"
                + ",householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent"
                + ",householdsComprisingOtherThanOneFamilyWithDependentChildren"
                + ",householdsComprisingOtherThanOneFamilyAllStudent"
                + ",householdsComprisingOtherThanOneFamilyAllPensioner"
                + ",householdsComprisingOtherThanOneFamilyOther";
    }

    /**
     * Returns a copy of this.allHouseholds
     *
     * @return
     */
    public int getAllHouseholds() {
        return this.allHouseholds;
    }

    /**
     * Returns a copy of this.householdsComprisingOnePensioner
     *
     * @return
     */
    public int getHouseholdsComprisingOnePensioner() {
        return this.householdsComprisingOnePensioner;
    }

    /**
     * Returns a copy of this.householdsComprisingOnePersonOtherThanPensioner
     *
     * @return
     */
    public int getHouseholdsComprisingOnePersonOtherThanPensioner() {
        return this.householdsComprisingOnePersonOtherThanPensioner;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOneFamilyAndNoOthersAllPensioners
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersAllPensioners() {
        return this.householdsComprisingOneFamilyAndNoOthersAllPensioners;
    }

    /**
     * Returns a copy of this.
     * householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren() {
        return this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsNoChildren;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren() {
        return this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsWithDependentChildren;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent() {
        return this.householdsComprisingOneFamilyAndNoOthersMarriedCoupleHouseholdsAllChildrenNonDependent;
    }

    /**
     * Returns a copy of this.
     * householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren() {
        return this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsNoChildren;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren() {
        return this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsWithDependentChildren;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent() {
        return this.householdsComprisingOneFamilyAndNoOthersCohabitingCoupleHouseholdsAllChildrenNonDependent;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren() {
        return this.householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsWithDependentChildren;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent
     *
     * @return
     */
    public int getHouseholdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent() {
        return this.householdsComprisingOneFamilyAndNoOthersLoneParentHouseholdsAllChildrenNonDependent;
    }

    /**
     * Returns a copy of
     * this.householdsComprisingOtherThanOneFamilyWithDependentChildren
     *
     * @return
     */
    public int getHouseholdsComprisingOtherThanOneFamilyWithDependentChildren() {
        return this.householdsComprisingOtherThanOneFamilyWithDependentChildren;
    }

    /**
     * Returns a copy of this.householdsComprisingOtherThanOneFamilyAllStudent
     *
     * @return
     */
    public int getHouseholdsComprisingOtherThanOneFamilyAllStudent() {
        return this.householdsComprisingOtherThanOneFamilyAllStudent;
    }

    /**
     * Returns a copy of this.householdsComprisingOtherThanOneFamilyAllPensioner
     *
     * @return
     */
    public int getHouseholdsComprisingOtherThanOneFamilyAllPensioner() {
        return this.householdsComprisingOtherThanOneFamilyAllPensioner;
    }

    /**
     * Returns a copy of this.householdsComprisingOtherThanOneFamilyOther
     *
     * @return
     */
    public int getHouseholdsComprisingOtherThanOneFamilyOther() {
        return this.householdsComprisingOtherThanOneFamilyOther;
    }
}
