/* 
CLASS: H01_35

TEAM: TEAM 5
AUTHORS:
    ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
    KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
    ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
    ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
*/

import java.util.ArrayList;

public class H01_35 {
    
    public H01_35(){
    }
    public ArrayList<Integer> arrayListCreate(int pLen, int pInitValue){
        ArrayList<Integer> list = new ArrayList<>();
        int count = pLen;
        while(count > 0){
            list.add(pInitValue);
            count--;
        }
        return list;
    }
}
