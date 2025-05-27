package company.Java;
import java.util.*;
public class kadane_Algorithm {
     public static void kadane(int numbers[]){
         int ms = Integer.MIN_VALUE; // maximum sum
         int cs = 0; // current sum

         for(int i=0; i<numbers.length; i++){
             cs = cs + numbers[i];
             if(cs < 0){
                 cs = 0;
             }
             ms = Math.max(cs, ms);
         }
         System.out.println("our max subarrays sum is : " +ms);
     }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
         kadane(numbers);
    }
}
