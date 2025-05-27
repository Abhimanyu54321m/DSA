package company.Java;
import java.util.*;
public class HasMap {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India",150);
        hm.put("China",120);
        hm.put("bhutan",100);
        hm.put("nepal",50);
        //System.out.println(hm);

        // Get - O(1)
        //System.out.println(hm.get("India"));

        // Contains key - O(1)
        //System.out.println(hm.containsKey("India"));

        // Remove operation
//        System.out.println(hm.remove("China"));
//        System.out.println(hm);
        
        //size
        //System.out.println(hm.size());

        //Is Empty
        //hm.clear();
        //System.out.println(hm.isEmpty());

        //Iterate
        //hm.entrySet();
//        Set<String> keys = hm.keySet();
//        System.out.println(keys);
//
//        for (String k : keys) {
//            System.out.println("key="+k+ ",value="+hm.get(k));
//        }
        System.out.println(hm.get("nepal"));
        // iterator in hash set and find the value
//        Iterator<Integer> it = set.iterator();
//        while (it.hasNext()) {
//           // Print HashSet values
//            System.out.print(it.next() + " ");
//        }
    }
}
