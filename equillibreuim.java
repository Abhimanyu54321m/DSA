package company.Java;
import java.util.*;
public class equillibreuim {
    public static int EquillibriumSum(int arr[]) {
        int n = arr.length;
        int res = 0;
        if (n == 0) {
            return -1;
        }
        int leftSum = 0;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }

        for (int i = 0; i < n; i++) {
            totalSum -= arr[i];

            if (totalSum == leftSum) {
                res = i;
            }
            leftSum += arr[i];
        }
        return res;
    }

    public static boolean splitArray(int arr[]) {
        int totalSum = 0;
        int leftSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            totalSum -= arr[i];
            leftSum += arr[i];
            if (leftSum == totalSum) {
                return true;
            }
        }
        return false;
    }

    public static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return fact(n - 1) * n;
    }


        public static void main(String[] args) {
            int arr[] = {4, 3, 1, 1, 7};
            int k = 2;
            //System.out.println(EquillibriumSum(arr));
            //System.out.println(splitArray(arr));
//        int n = 5;
            //System.out.println(fact(0));
//        int a = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i]!=0){
//                arr[a] = arr[i];
//                a++;
//            }
//        }
//        for(int i=a; i<arr.length; i++){
//            arr[a] = 0;
//            a++;
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i] +" ");
//        }
            int index = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) {
                    arr[index] = arr[i - 1];
                    index++;
                }
            }
            for (int i = 0; i <arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

