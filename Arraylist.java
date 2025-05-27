package company.Java;
import java.util.*;
public class Arraylist {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); //O(1)
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1,9);
        //System.out.println(list);
        // size
        //System.out.println(list.size());
        //get operation
//        int element = list.get(2); // O(1)
//        System.out.println(element);
//        //delete operation
//        list.remove(2);
//        System.out.println(list);
//        // set operation
//        list.set(2,5);
//        System.out.println(list);
//        //contains
//        System.out.println(list.contains(2));
        // print arraylist
//        for(int i=0; i<list.size(); i++){
//            System.out.println(list.get(i));
//        }
        // reverse a list
//        for(int i=list.size()-1; i>=0; i--){
//            System.out.print(list.get(i) +" ");
//        }
        //find max element in arraylist
//        int max = Integer.MIN_VALUE;
//        for(int i=0; i<list.size(); i++){
//            max = Math.max(max,list.get(i));
//        }
//        System.out.println("maximum element is : " +max);
        // swap element in arraylist
//        int idx1 = 1, idx2 = 3;
//        System.out.print(list +" ");
//        swap(list,idx1,idx2);
//        System.out.print(list +" ");
        // sort the arraylist
        System.out.println(list);
        Collections.sort(list);// ascending order
        System.out.println(list);

        //descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
