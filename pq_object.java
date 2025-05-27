package company.Java;
import java.util.*;
public class pq_object {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 3));
        pq.add(new Student("B", 4));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 7));
        pq.add(new Student("E", 6));

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name +" -> "+pq.peek().rank);
            pq.remove();
        }
//        List<List<Integer>> a = new ArrayList();
//        for(int i=1;i<10; i++){
//            // your logic here make use of Arrays.asList()
//            a.add(Arrays.asList(2, i+1));
//        }
//        for(int i=0; i<a.size(); i++){
//            System.out.println(a.get(i));
//        }
    }
}
