import java.util.ArrayList;
/**
 * Class: H01_34
 * Author: Kenyon Hundley, khundley, khundley@asu.edu
 */
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