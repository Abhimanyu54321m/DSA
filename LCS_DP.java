package company.Java;

public class LCS_DP {
    public static int lcs(String str1, String str2, int n, int m){ // recursion
        if(n == 0 || m == 0){
            return 0;
        }
        int ans1 =0;
        int ans2 = 0;
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            return lcs(str1,str2,n-1,m-1)+1;
        }else{
             ans1 = lcs(str1,str2,n-1,m);
             ans2 = lcs(str1,str2,n,m-1);
        }
        return Math.max(ans1,ans2);
    }
    public static int lcsMemo(String str1, String str2, int n, int m, int dp[][]){
        if(n == 0 || m == 0){
            return 0;
        }
        if(dp[n][m] != -1){
            return dp[n][m];
        }
        int ans1 =0;
        int ans2 = 0;
        if(str1.charAt(n-1) == str2.charAt(m-1)){
            dp[n][m] = lcsMemo(str1,str2,n-1,m-1,dp)+1;
        }else{
            ans1 = lcsMemo(str1,str2,n-1,m,dp);
            ans2 = lcsMemo(str1,str2,n,m-1,dp);
            dp[n][m] = Math.max(ans1,ans2);
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "aceb";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=1; i<dp.length; i++){
            for(int j=1; j<dp[0].length; j++){
                 dp[i][j] = -1;
            }
        }
        //System.out.println(lcs(str1,str2,str1.length()-1,str2.length()-1));
        System.out.println(lcsMemo(str1,str2,n-1,m-1,dp));
    }
}
