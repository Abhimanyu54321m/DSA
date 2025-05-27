package company.Java;

public class BST_1 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static Node createMirror(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = createMirror(root.left);
        Node rightMirror = createMirror(root.right);

        root.left = rightMirror;
        root.right = leftMirror;
        return root;
    }
    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data +" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static Node createBST(int arr[], int start, int end){
        if(start > end){
            return null;
        }
        int mid = (start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = createBST(arr,start,mid-1);
        root.right = createBST(arr,mid+1,end);
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {3,5,6,8,10,11,12};
     /*
                 8
                / \
               5   10
              / \    \
             3   6    11
      */
//        Node root = new Node(8);
//        root.left = new Node(5);
//        root.right = new Node(10);
//        root.left.left = new Node(3);
//        root.left.right = new Node(6);
//        root.right.right = new Node(11);

//        createMirror(root);
//        preorder(root);
        Node root = createBST(arr,0,arr.length-1);
        preorder(root);
    }
}
