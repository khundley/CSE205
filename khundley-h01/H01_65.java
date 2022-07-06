/* 
CLASS: H01_31
TEAM: TEAM 5
AUTHORS:
    ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
    KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
    ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
    ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
*/

public class H01_65 {
    private int mX;
    private int mY = 0;
    final public int A = 100;
    final public int B = 200;
    
    //Default Constructor
    public H01_65() {
        mX = -1;
    }
    
    //Constructor
    public H01_65(int pX) {
        setX(pX);
    }
    
    //X Accessor
    public int getX() {
        return mX;
    }
    
    //X Mutator
    public void setX(int xValue) {
        mX = xValue;
    }
    
    //Y Accessor
    public int getY() {
        return mY;
    }
    
    //Y Mutator
    public void setY() {
        
    }
}