/* 
CLASS: H01_31

TEAM: TEAM 5
AUTHORS:
    ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
    KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
    ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
    ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
*/

import java.util.ArrayList;

public class H01_31 {
    
    public H01_31(){
    }
    public ArrayList<Integer> arrayListInit() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++){
            list.add(i%5);
        }
        
        return list;
    }
}
