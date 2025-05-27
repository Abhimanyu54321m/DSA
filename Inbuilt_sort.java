package company.Java;
import java.util.*;
public class Inbuilt_sort {
    public static void print(Integer arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        //int arr[] = {6, 5, 4, 7, 2, 8};
        Integer arr[] = {6, 5, 4, 7, 2, 8};
        //Arrays.sort(arr);
        //Arrays.sort(arr,0,3);
        Arrays.sort(arr,Collections.reverseOrder());
        print(arr);
    }
}
