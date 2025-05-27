package company.Java;
import java.util.*;
public class Indian_Coins {
    public static void main(String[] args) {
        int coins[] = {2000,500,200,100,50,20,10,5,2,1};
        ArrayList<Integer> list = new ArrayList<>();
        int V = 43;
        for(int i=0; i<coins.length; i++){
            while(coins[i]<=V){
                list.add(coins[i]);
                V=V-coins[i];
            }
        }
        System.out.println("number of coins is :" +list);
    }
}
