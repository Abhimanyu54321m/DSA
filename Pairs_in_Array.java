package company.Java;
import java.util.*;
public class Pairs_in_Array {
    public static void main(String[] args) {
         int arr[] = {2, 4, 6, 8, 10};
         int count = 0;
         for(int i=0; i<arr.length; i++){
             int curr = arr[i];
             for(int j=i+1; j<arr.length; j++){
                 System.out.print("(" +curr +"," +arr[j] +")");
                 count++;
             }
             System.out.println();
         }
        System.out.println("total no of pairs is : " +count);

//        int arr[] = {9, 5, 8, 2, 4, 1};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("original array is : " + arr[i]);
//        }
//
//        int first = 0;
//        int last = arr.length - 1;
//
//        while (first < last) {
//            int temp = arr[last];
//            arr[last] = arr[first];
//            arr[first] = temp;
//
//            first++;
//            last--;
//        }
    }
}
