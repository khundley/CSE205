import java.util.ArrayList;
/**
 * Class: H01_31
 * Author: Kenyon Hundley, khundley, khundley@asu.edu
 */
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
