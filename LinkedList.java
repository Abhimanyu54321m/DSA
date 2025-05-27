package company.Java;
import java.util.*;
public class LinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addFirst(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = tail = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }
     public void print(){
         if(head == null){
             System.out.println("ll is empty");
             return;
         }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp = temp.next;
        }
         System.out.println();
     }
    public static void main(String[] args) {
       LinkedList ll = new LinkedList();
       ll.addFirst(3);
       ll.addFirst(4);
       ll.addFirst(5);
        ll.addFirst(6);
        ll.print();
    }
}
