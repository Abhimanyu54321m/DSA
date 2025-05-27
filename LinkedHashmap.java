package company.Java;
import java. util.*;
public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("China",150);
        lhm.put("Us",50);

        //System.out.println(lhm);

        // Tree Map
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India",100);
        tm.put("China",150);
        tm.put("Us",50);

        //System.out.println(tm);

    }
}
