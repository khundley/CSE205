//********************************************************************************************************
// CLASS: Student
//
// DESCRIPTION
// This is the Student class for CSE205 Project 2. 
//  It is an abstract class that implements the java.lang.Comparable<T> interface
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Summer Session B 2022 // Project Number: 02
// TEAM: TEAM 5
// AUTHORS:
// ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
// KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
// ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
// ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
//********************************************************************************************************

import java.util.ArrayList;

public class OnlineStudent extends Student {
    private boolean mTechFee;

    /**
     * Creates a OnlineStudent object and initializes the mId, mFname, and mLname
     * instance variables.
     */
    public OnlineStudent(String pId, String pFname, String pLname) {
        super(pId, pFname, pLname);
    }

    /** * Calculates the student's tuition */
    @Override
    public void calcTuition() {
        double tuition = 0;

        tuition += getCredits() * TuitionConstants.ONLINE_CREDIT_RATE;

        if (getTechFee() == true) {
            tuition += TuitionConstants.ONLINE_TECH_FEE;
        }

        setTuition(tuition);
    }

    /** Accessor method for mTechFee */
    public boolean getTechFee() {
        return mTechFee;
    }

    /** Mutator method for mTechFee */
    public void setTechFee(boolean pTechFee) {
        mTechFee = pTechFee;
    }
}
