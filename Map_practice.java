package company.Java;
import java.util.*;
public class Map_practice {
    public static void main(String[] args) {
        //int arr[] = {15,-2,2,-8,1,7,10,23};

//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        int sum = 0;
//        int len = 0;
//
//        for(int i=0; i<arr.length; i++){
//            sum+=arr[i];
//            if(map.containsKey(sum)){
//                len = Math.max(len,i-map.get(sum));
//            }else{
//                map.put(sum,i);
//            }
//        }
//        System.out.println(len);

        int arr[] = {1,1,2,2,3,3,4,5,5};
        int result = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        Set<Integer> keys = map.keySet();
        for(Integer k : keys){
            if(map.get(k) <= 1){
                result = k;
            }
        }
        System.out.println(result);
    }
}
