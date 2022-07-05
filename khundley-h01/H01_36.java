// CLASS: H01_036
// AUTHOR: ANTHONY SPAUGH, ASPAUGH, ASPAUGH@ASU.EDU

import java.util.ArrayList;

public class H01_36 {
	
    //CONSTRUCTOR
    public H01_36() {
    }
    
    //SOLUTION METHOD
    public void insertName(ArrayList<String> pList, String pName) {
        int index = 0;
        
        try {
            while (pList.get(index).compareToIgnoreCase(pName) < 0) {
            index++;
            }
            pList.add(index, pName);
        }
        catch (IndexOutOfBoundsException e) {
            pList.add(pName);
        }
    }
}
