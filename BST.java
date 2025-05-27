package company.Java;
import java.util.*;
public class BST {
    static class Node{
       int data;
       Node right;
       Node left;

       Node(int data){
           this.data = data;
       }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data +" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int val){
        if(root == null){
            return false;
        }
        if(root.data == val){
            return true;
        }
        if(root.data > val){
            return search(root.left, val);
        }else{
            return search(root.right, val);
        }
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }
        else{
            if(root.left == null && root.right == null){
                return null;
            }

            //case 2 - single child
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // case 3 - both children
            Node Is = findInorderSuccessor(root.right);
            root.data = Is.data;
            root.right = delete(root.right, Is.data);
        }
        return root;
    }

    public static void InRangePrint(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            InRangePrint(root.left, k1, k2);
            System.out.print(root.data +" ");
            InRangePrint(root.right, k1, k2);
        }
        else if(root.data < k2){
            InRangePrint(root.right, k1, k2);
        }else{
            InRangePrint(root.left, k1, k2);
        }
    }
    public static boolean isValid(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left, min, root) && isValid(root.right,root,max);
    }
    public static void main(String[] args) {
     int value[] = {5, 1, 3, 2, 7};
     Node root = null;

     for(int i=0; i<value.length; i++){
         root = insert(root, value[i]);
     }
//       inorder(root);
//        System.out.println();
//        System.out.println(search(root, 9));
       // root = delete(root, 1);
       // System.out.println();

        //inorder(root);
       // InRangePrint(root, 1, 7);
       if(isValid(root,null,null)){
           System.out.println("is valid");
       }else{
           System.out.println("not valid");
       }
    }
}
