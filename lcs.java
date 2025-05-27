package company.Java;
import java.util.*;
public class lcs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int prev[] = new int[m];
        int curr[] = new int[n+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                   curr[j] = 1+prev[j-1];
                }else{
                    curr[j] = Math.max(prev[j],curr[j-1]);
                }
            }
            prev = curr.clone();
        }
    }
}
