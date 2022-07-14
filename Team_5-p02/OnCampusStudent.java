//********************************************************************************************************
// CLASS: TuitionConstants
//
// DESCRIPTION
// This class maintains the constant values used to calcuate tuition.
//
// COURSE AND PROJECT INFO
// CSE205 Object Oriented Programming and Data Structures, Summer Session B 2022 // Project Number: 02
// TEAM: TEAM 5
// AUTHORS:
// ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
// KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
// ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
// ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
//********************************************************************************************************
public class OnCampusStudent extends Student {
    public static int RESIDENT = 1;
    public static int NON_RESIDENT = 2;
    private int mResident;
    private double mProgramFee;

    /**
     * Creates a OnCampusStudent object and initializes the mId, mFname, and mLname
     * instance variables.
     */
    public OnCampusStudent(String pId, String pFname, String pLname) {
        super(pId, pFname, pLname);
    }

    /** Calculates the student's tuition */
    @Override
    public void calcTuition() {
        double tuition = 0;
        int credits = getCredits();

        if (getResidency() == RESIDENT) {
            tuition += TuitionConstants.ONCAMP_RES_BASE;
        } else {
            tuition += TuitionConstants.ONCAMP_NONRES_BASE;
        }

        tuition += getProgramFee();

        if (credits > TuitionConstants.ONCAMP_MAX_CREDITS) {
            tuition += (credits - TuitionConstants.ONCAMP_MAX_CREDITS) * TuitionConstants.ONCAMP_ADD_CREDITS;
        }

        setTuition(tuition);
    }

    /** Accessor method for mProgramFee */
    public double getProgramFee() {
        return mProgramFee;
    }

    /** Accessor method for mResident */
    public int getResidency() {
        return mResident;
    }

    /** Mutator method for mProgramFee */
    public void setProgramFee(double pProgramFee) {
        mProgramFee = pProgramFee;
    }

    /** Mutator method for mResident */
    public void setResidency(int pResident) {
        mResident = pResident;
    }
}
