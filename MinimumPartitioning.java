package company.Java;

public class MinimumPartitioning {
    public static int helper(int arr[]){
        int n = arr.length;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }
        int W = sum/2;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<dp.length; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){ // rows denote to profit
            for(int j=1; j<W+1; j++){ // column denote to weight
                int v = arr[i-1]; // ith item value
                int w = arr[i-1]; // ith weight value

                if(w <= j){ // valid
                    int include = v+dp[i-1][j-w]; // include
                    int exclude = dp[i-1][j]; //exclude
                    dp[i][j] = Math.max(include,exclude);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        int sum1 = dp[n][W];
        int sum2 = sum - sum1;
        return Math.abs(sum1-sum2);
    }
    public static void main(String[] args) {
      int arr[] = {1, 6, 11, 5};
        System.out.println(helper(arr));
    }
}
