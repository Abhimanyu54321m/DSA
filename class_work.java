package company.Java;
import java.util.*;
public class class_work {
    public static boolean ischeck(int arr[], int target){
        Arrays.sort(arr);
        for(int i=0; i<arr.length-2; i++){
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                if(sum == target){
                    return true;
                }else if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return false;
    }

    public static int sum_closest(int arr[], int target){
        Arrays.sort(arr);
        int closest = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-2; i++){
            int j = i+1;
            int k = arr.length-1;
            while(j<k){
                int sum = arr[i]+arr[j]+arr[k];
                int diff = Math.abs(target-sum);
                if(diff < min){
                    min = diff;
                    closest = sum;
                }
                if(sum < target){
                    j++;
                }else if(sum > target){
                    k--;
                }else{
                    return sum;
                }
            }
        }
        return closest;
    }
     public static void rec(int n){
        if(n==0){
           // System.out.print(n +" ");
            return;
        }
         System.out.print(n +" ");
        rec(n-1);
         System.out.print(n +" ");
     }
     public static int pow(int k, int n){
        if(n==0){
            return 1;
        }
        return k*pow(k,n-1);
     }
     public static int optimize(int k, int n){
        if(n==0){
            return 1;
        }
        int halfpower = optimize(k,n/2);
        int halfpowersq = halfpower*halfpower;

        if(n%2 != 0){
            halfpowersq = k*halfpowersq;
        }
        return halfpowersq;
     }
    public static int max(int arr[], int start, int end){
        int max = Integer.MIN_VALUE;
        for(int i=start; i<=end; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static boolean closeStrings(String word1, String word2) {
        int sum1 = 0;
        int sum2 = 0;
        if(word1.length()!=word2.length()){
            return false;
        }
        for(int i=0; i<word1.length(); i++){
            sum1 += word1.charAt(i);
        }
        for(int i=0; i<word2.length(); i++){
            sum1 += word2.charAt(i);
        }
        if(sum1 == sum2){
            return true;
        }
        return false;
    }

    public static int maximum(int arr[], int idx, int max){
        if(idx == arr.length) {
            return max;
        }
        if(max < arr[idx]){
            max = arr[idx];
        }
        return maximum(arr,idx+1,max);
    }
    public static void main(String[] args) {

//        int arr[] = {16,17,4,3,5,2};
//        int target = 1;
//       // System.out.println(ischeck(arr,target));
//        //System.out.println(sum_closest(arr,target));
//        int start = 3;
//        int end = 4;
//        //rec(n);
//        //System.out.println(pow(5,2));
//        //System.out.print(optimize(k,n));
//        System.out.println(max(arr,start,end));
        String word1 = "abc";
        String word2 = "bca";
        //System.out.println(closeStrings(word1,word2));
//        int sum1 = 0;
//        int sum2 = 0;
//        for(int i=0; i<word1.length(); i++){
//            sum1 += word1.charAt(i);
//        }
//        System.out.println(sum1);
//        for(int i=0; i<word2.length(); i++){
//            sum2 += word2.charAt(i);
//        }
        int arr[] = {22, 34, 5, 20, 6};
        System.out.println(maximum(arr,0,0));
    }
}
