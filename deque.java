package company.Java;
import java.util.*;
import java.util.LinkedList;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addFirst(4);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);

        System.out.println("first el = " +d.getFirst());
        System.out.println("last el = " +d.getLast());
    }
}
