/* 
CLASS: H01_34

TEAM: TEAM 5
AUTHORS:
    ANDREW BRAND   | ABRAND3  | A.BRAND101691@YAHOO.COM
    KENYON HUNDLEY | KHUNDLEY | KENYONHUNDLEY@YAHOO.COM
    ISAIAH POTTS   | IPOTTS1  | ZAHPOTTS123@GMAIL.COM
    ANTHONY SPAUGH | ASPAUGH  | ASPAUGH@ASU.EDU
*/

import java.util.ArrayList;

public class H01_34 {
    
    public H01_34(){
    }
    public Integer arrayListSum(ArrayList<Integer> pList){
        int sum = 0;
        for(Integer element : pList){
            sum += element;
        }
        return sum;
    }
}
