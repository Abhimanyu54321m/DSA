package company.Java;
import java.util.*;
public class Catalans_number {
    public static int catalan(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            ans+=catalan(i)*catalan(n-i-1);
        }
        return ans;
    }
    public static int CatalanMemo(int n, int dp[]){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            ans+=CatalanMemo(i,dp)*CatalanMemo(n-i-1,dp);
        }
        dp[n] = ans;
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 2;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(catalan(n));
        System.out.println(CatalanMemo(n,dp));
    }
}
