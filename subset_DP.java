package company.Java;

public class subset_DP {
    public static boolean subset(int arr[], int target, int i, int N, int dp[][]){
         if(target == 0){
             return true;
         }
         if(target < 0){
             return false;
         }
         if(i >=N ){
             return false;
         }
         if(dp[i][target] != -1){
             return dp[i][target] == 1;
         }
         boolean include = subset(arr,target-arr[i],i+1,N,dp);
         boolean exclude = subset(arr,target,i+1,N,dp);
        dp[i][target] = (include || exclude) ? 1 : 0;
        return include || exclude;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 11, 5};
        int target = 11;
        int N = arr.length;
        int dp[][] = new int[N+1][target+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
            }
        }

       // System.out.println(subset(arr,target,0,N));
        System.out.println(subset(arr,target,0,N,dp));
    }
}
