package company.Java;
import java.util.*;
public class prefix_sum {
    public static int[] prefixSum(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }


        int[] results = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0], R = queries[i][1];
            if (L == 0) {
                results[i] = prefix[R];
            } else {
                results[i] = prefix[R] - prefix[L - 1];
            }
        }

        return results;
    }
        public static void main(String[] args) {
//            int[] arr = {1, 2, 3, 4, 5};
//            int[][] queries = {{1, 3}, {0, 4}, {2, 4}};
//
//            int[] results = prefixSum(arr, queries);
//            System.out.println(Arrays.toString(results));
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int sum1 = 0;
            int sum2 = 0;
            for(int i=1; i<=n; i++){
                sum1 += i;
            }
            for(int i=1; i<=n; i++){
                sum2 += i*i;
            }
            if(sum2%sum1 == 0){
                System.out.print("YES" +" "+(sum2/sum1));
            }else{
                System.out.print("NO");
            }

        }
}
