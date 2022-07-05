/* 
CLASS: H01_37

TEAM: TEAM 5
AUTHORS:
    ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
    KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
    ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
    ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
*/

import java.util.ArrayList;

public class H01_37 {
	
    //CONSTRUCTOR
    public H01_37() {
    }
	
    //SOLUTION METHOD
    public void arrayListRemove(ArrayList<Integer> pList, int pValue) {
        for (int index = 0; index < pList.size(); index++) {
            if (pList.get(index) == pValue) {
                pList.remove(index);
                index--;
            }
        }
    }
}
