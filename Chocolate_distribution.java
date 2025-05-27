package company.Java;
import java.util.*;
public class Chocolate_distribution {
    public static void main(String[] args) {
        int arr[] = {3, 4, 1, 9, 56, 7, 9, 12};
//        Arrays.sort(arr);
//        int m = 5;
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<arr.length-m+1; i++){
//            int diff = arr[i+m-1] - arr[i];
//            min = Math.min(min, diff);
//        }
//        System.out.println("The difference between no of chocolate is : " +min);
                // code here
                int ind = -1;
                int n = arr.length;

                for (int i = n - 2; i >= 0; i--) {
                    if (arr[i] < arr[i + 1]) {
                        ind = i;
                        break;
                    }
                }
                if (ind == -1) {
                    reverse(arr, 0, n - 1);
                } else {

                    for (int i = n - 1; i > ind; i--) {
                        if (arr[i] > arr[ind]) {
                            swap(arr, i, ind);
                            break;
                        }
                    }

                    reverse(arr, ind + 1, n - 1);
                }
//                for (int i = 0; i < n; i++) {
//                    res.add(arr[i]);
//                }
//                return res;

            }

            public static void swap(int[] arr, int st, int end) {
                int temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
            }

            public static void reverse(int[] arr, int st, int end) {
                while (st < end) {
                    int temp = arr[st];
                    arr[st] = arr[end];
                    arr[end] = temp;
                    st++;
                    end--;
                }
            }
        }
