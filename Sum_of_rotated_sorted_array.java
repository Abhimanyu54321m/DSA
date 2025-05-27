package company.Java;
import java.util.*;
public class Sum_of_rotated_sorted_array {
     public static boolean rotated_sum(int arr[], int x){
         for(int i=0; i<arr.length; i++){
             for(int j=i+1; j<arr.length; j++){
                  if(arr[i]+arr[j] == x){
                      return true;
                  }
             }
         }
         return false;
     }
    public static void main(String[] args) {
        int arr[] = {11, 15, 26, 38, 9, 10};
        int x = 16;
        System.out.println(rotated_sum(arr,x));
    }
}
