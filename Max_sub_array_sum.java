package company.Java;
import java.util.*;
public class Max_sub_array_sum {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                sum = 0;
                for(int k=start; k<=end; k++){
                    sum+=arr[k];
                }
                if(sum > max){
                    max = sum;
                }
            }
        }
        System.out.println("Maximum subarray  sum is : " +max);

    }
}
