import java.util.ArrayList;
/**
 * Class: H01_35
 * Author: Kenyon Hundley, khundley, khundley@asu.edu
 */
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
