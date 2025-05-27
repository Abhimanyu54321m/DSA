package company.Java;

public class UnboundedKnapsack {
    public static int UnboundedKnapsackTab(int profit[], int weight[], int W) {
        int n = profit.length;
        int dp[][] = new int[n + 1][W + 1];
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j < W+1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) { // rows denote to profit
            for (int j = 1; j < W + 1; j++) { // column denote to weight
                int v = profit[i - 1]; // ith item value
                int w = weight[i - 1]; // ith weight value

                if (weight[i - 1] <= j) { // valid
                    int include = profit[i-1] + dp[i][j - w]; // include
                    int exclude = dp[i - 1][j]; //exclude
                    dp[i][j] = Math.max(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        print(dp);
        return dp[n][W];
    }
    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
      int val[] = {15,14,10,45,30};
      int wt[] = {2,5,1,3,4};
      int W = 7;
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];
        System.out.println(UnboundedKnapsackTab(val,wt,W));
    }
}
