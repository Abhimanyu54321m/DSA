package company.Java;
import java.util.*;
public class MaxLengthChain {
    public static void main(String[] args) {
        int Pair[][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(Pair, Comparator.comparingDouble( o -> o[1]));

        int maxLen = 1;
        int LastChain = Pair[0][1];

        for(int i=0; i<Pair.length; i++){
            if(Pair[i][0] > LastChain){
                maxLen++;
                LastChain = Pair[i][1];
            }
        }
        System.out.println("Maximum chain of length is : " +maxLen);
    }
}
