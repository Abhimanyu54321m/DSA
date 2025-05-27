package company.Java;
import java.util.*;
public class climbing_stairs {
    public static int countWays(int n){   // recursion technique
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }

        return countWays(n-1) + countWays(n-2);
    }
    public static int Memoization(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        dp[n] = Memoization(n-1,dp) + Memoization(n-2,dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        //System.out.println(countWays(n));
        System.out.println(Memoization(n,dp));
    }
}
