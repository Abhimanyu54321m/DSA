package company.Java;

public class LL_new {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public void addvalue(int idx, int data) {
        Node newnode = new Node(data);
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }

    public void delete() {
        if (head == null) {
            System.out.println("the node is empty");
            return;
        }
        head = head.next;
    }

    public void delete_index(int idx) {
        if (head == null) {
            System.out.println("the node is empty");
            return;
        }
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public int middle() {
        Node slow = head;
        Node fast = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node Next = null;
        while (curr != null) {
            Next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = Next;
        }
        Node temp = prev;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void duplicate() {
        Node temp = head;
        Node temp1 = head.next;
        while (temp.next != null && temp1 != null) {
            if (temp.data == temp1.data) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void shortlist() {
        Node current = head, index = null;
        int temp;
        if (head == null) {
            return;
        } else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                current = current.next;
            }

//        System.out.println("largest element is");
//        while(current!=null){
//            current = current.next;
//        }
//        System.out.println(current.data);
        }
    }

    public boolean cycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null) {
            slow = slow.next;
            if (fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
    public void zig_zag(){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        Node nextL,nextR;
        while(left!=null && right!=null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public void printvalue() {
        if (head == null) {
            System.out.println("the node is empty");
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL_new list = new LL_new();
        list.addfirst(6);
        list.addfirst(7);
        list.addfirst(9);
        list.addfirst(12);
        list.addfirst(3);
//        System.out.println("original value is");
//        list.printvalue();
//        list.addvalue(1, 2);
//        System.out.println("insert the value of any index ");
//        list.printvalue();
//        list.addfirst(4);
//        System.out.println("insert the value at first");
//        list.printvalue();
//        list.addlast(9);
//        System.out.println("insert the value at last");
//        list.printvalue();
//        list.delete();
//        System.out.println("delete the first value");
//        list.printvalue();
//        list.shortlist();
//        System.out.println("shorted value is");
//        list.printvalue();
//        System.out.println("reverse linked list is");
//        list.reverse();
//        list.printvalue();
//        System.out.println("cycle of the linked list is");
//        System.out.println(list.cycle());
////        System.out.println(list.middle());
////        list.delete_index(2);
////        list.printvalue();
           list.zig_zag();
           list.printvalue();
    }
}
