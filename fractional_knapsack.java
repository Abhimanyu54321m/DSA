package company.Java;
import java.util.*;
public class fractional_knapsack {
    public static void main(String[] args) {
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];

        for(int i=0; i<val.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = (double)val[i]/weight[i];
        }
        //sort the array
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int fullVal = 0;

        for(int i=ratio.length-1; i>=0; i--){
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]){
                fullVal+=val[idx];
                capacity -= weight[idx];
            }else{
                fullVal+=(ratio[i][1]*capacity);
                break;
            }
        }
        System.out.println("total profit is " +fullVal);
    }
}
