package company.Java;

public class knapsack {
    public static int knapsack(int profit[], int weight[], int W, int n,int dp[][]){
        if( W == 0 || n == 0){
            return 0;
        }
        if(weight[n-1] <= W){
            int ans1 = profit[n-1]+knapsack(profit,weight,W-weight[n-1],n-1,dp);
            int ans2 = knapsack(profit,weight,W,n-1,dp);
          dp[n][W] = Math.max(ans1,ans2);
        }else{
           dp[n][W] = knapsack(profit,weight,W,n-1,dp);
        }
        return dp[n][W];
    }
    public static int knapsackTab(int profit[], int weight[], int W){
        int n = profit.length;
        int dp[][] = new int[n+1][W+1];
        for(int i=0; i<dp.length; i++){
            dp[i][0] = 0;
        }
        for(int j=0; j<dp.length; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){ // rows denote to profit
            for(int j=1; j<W+1; j++){ // column denote to weight
                int v = profit[i-1]; // ith item value
                int w = weight[i-1]; // ith weight value

                if(w <= j){ // valid
                    int include = v+dp[i-1][j-w]; // include
                    int exclude = dp[i-1][j]; //exclude
                    dp[i][j] = Math.max(include,exclude);
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
       int profit[] = {30,50,60};
       int weight[] = {3,4,5};
       int W = 8;
       // System.out.println(knapsack(profit,weight,W,profit.length));
        int dp[][] = new int[profit.length+1][W+1];
//        for(int i=0; i<dp.length; i++){
//            for(int j=0; j<dp[0].length; j++){
//                dp[i][j] = -1;
//            }
//        }
        //System.out.println(knapsack(profit,weight,W,profit.length,dp));
        System.out.println(knapsackTab(profit,weight,W));
    }
}
