package company.Java;
import java.util.*;
public class Assignment_array {
    // find duplicate value in array
    public static boolean duplicate(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    // find the target value in array

    public static int target_value(int arr[], int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    // find maximum profit for buy and sell problem

    public static int buyAndSell(int price[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i=0; i<price.length; i++){
            if(buyPrice < price[i]){
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else {
                buyPrice = price[i];
            }
        }
        return maxProfit;
    }
    // trapped rain water

    public static int trappedRainWater(int height[]){
        int n = height.length;
        int trappedWater = 0;
        int leftMax[] = new int[n];
        for(int i=1; i<n; i++){
            leftMax[0] = height[0];
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        int rightMax[] = new int[n];
        for(int i=n-2; i>=0; i--){
            rightMax[n-1] = height[n-1];
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        for(int i=0; i<n; i++){
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += WaterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {7, 1, 3, 5, 6, 4};
         //int price[] = {7, 1, 3, 5, 6, 4};
        //int arr[] = {1, 2, 3, 1};
        //int target = 0;
        //System.out.println(duplicate(arr));
        // System.out.println(target_value(arr, target));
       // System.out.println(buyAndSell(price));
        System.out.println(trappedRainWater(height));
    }
}
