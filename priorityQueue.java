package company.Java;
import java.util.*;
public class priorityQueue {
    public static void main(String[] args) {
        int arr[][] = {{1,5,9},{10,11,13},{12,13,15}};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

//        pq.add(4);  // O(logn)
//        pq.add(3);
//        pq.add(1);
//        pq.add(7);
//
//        while(!pq.isEmpty()){
//            System.out.println(pq.peek()); // O(1)
//            pq.remove();//O(logn)

//        }
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                pq.add(arr[i][j]);
            }
        }
        while(!pq.isEmpty()){
          System.out.println(pq.peek()); // O(1)
           pq.remove();//O(logn)

       }
    }
}
