package company.Java;
import java.util.*;
public class practice {
    public static void main(String[] args) {
//        int meetings[][] = {{5,7},{1,3},{9,10}};
//        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0],b[0]));
//        int count = 0;
//        int min = 0;
//        int max = 0;
//        int days = 10;
//        int x = 0;
//        for(int i=0; i<meetings.length; i++){
//            for(int j=0; j<meetings[0].length; j++){
//               min = Math.min(min,((meetings[i+1][j] - meetings[i][j])-1));
//               max = Math.max(max,meetings[i][j]);
//            }
//            count += min;
//        }
//        x = days-max;
//       count = count + x;
//        //System.out.println(count);
        int mat[][] = {{1,2,3},
                       {4,5,6},
                        {7,8,9}};
        //System.out.println(mat.length);
        String s = "absbcdbebfbr";
        int ans = 0;
        ans = Integer.parseInt(s.substring(0,4));
        System.out.println(ans);

    }
}
