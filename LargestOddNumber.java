package company.Java;
import java.util.*;
public class LargestOddNumber {
    public static void main(String[] args) {
        int l = -10;
        int r = 10;
        int k = 8;
        int max = 0;
        for(int i=l; i<=r; i++){
            if(i%2!=0){
                max = Math.max(max,i);
            }
        }
        if(max < k){
            max = 0;
        }
        System.out.println(max);
    }
}
