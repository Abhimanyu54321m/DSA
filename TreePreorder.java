package company.Java;
import java.util.*;
import java.util.LinkedList;

import static company.Java.TreePreorder.BinaryTree.*;

public class TreePreorder {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data +" ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void Inorder(Node root){
            if(root == null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data +" ");
            Inorder(root.right);
        }

        public static void Postorder(Node root){
            if(root == null){
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data +" ");
        }
        //Level order Traversal
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }

            }
        }
        //height of tree
        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int leftDiam = diameter(root.left);
            int rightDim = diameter(root.right);
            int rightHt = height(root.right);
            int leftHt = height(root.left);
            int selfHt = leftHt+rightHt+1;

            return Math.max(selfHt, Math.max(leftDiam,rightDim));
        }

        public static boolean isIdentical(Node node, Node subRoot){
            if(node == null && subRoot == null){
                return true;
            }else if(node == null || subRoot == null || node.data != subRoot.data){
                return false;
            }

            if(!isIdentical(node.left, subRoot.left)){
                return false;
            }
            if(!isIdentical(node.right, subRoot.right)){
                return false;
            }
            return true;
        }
        public static boolean isSubtree(Node root, Node subRoot){
            if(root == null){
                return false;
            }
            if(root.data == subRoot.data){
                if(isIdentical(root, subRoot)){
                    return true;
                }
            }
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }
        public static void KthLevel(Node root, int level, int k){
              if(root == null){
                  return;
              }
              if(level == k){
                  System.out.print(root.data +" ");
                  return;
              }
              KthLevel(root.left,level+1,k);
              KthLevel(root.right,level+1,k);
        }
        public static boolean getPath(Node root, int n, ArrayList<Node> path){
            if(root == null){
                return false;
            }

            path.add(root);

            if(root.data == n){
                return true;
            }

            boolean foundLeft = getPath(root.left,n,path);
            boolean foundRight = getPath(root.right, n,path);

            if(foundLeft || foundRight){
                return true;
            }

            path.remove(path.size()-1);
            return false;
        }
        public static Node lca(Node root, int n1, int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);

            //last common ancestor
            int i =0;
            for(; i<path1.size() && i<path2.size(); i++){
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }
            //last equal node -> i-1th
            Node lca = path1.get(i-1);
            return lca;
        }
        public static Node lca2(Node root, int n1, int n2){
            if(root == null || root.data == n1 || root.data == n2){
                return root;
            }
            Node LeftNull = lca2(root.left,n1,n2);
            Node RightNull = lca2(root.right,n1,n2);

            if(LeftNull == null){
                return RightNull;
            }
            if(RightNull == null){
                return LeftNull;
            }
            return root;
        }
        public static int lcaDist(Node root, int n){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }
            int dist1 = lcaDist(root.left,n);
            int dist2 = lcaDist(root.right, n);
            if(dist1 == -1 && dist2 == -1){
                return -1;
            }else if(dist1 == -1){
                return dist2+1;
            }else{
                return dist1+1;
            }
        }
        public static int minDist(Node root, int n1, int n2){
            Node lca = lca2(root,n1,n2);
            int dist1 = lcaDist(lca,n1);
            int dist2 = lcaDist(lca,n2);

            return dist1+dist2;
        }
        public static int KAncestor(Node root, int n, int k){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }
            int leftDist = KAncestor(root.left,n,k);
            int rightDist = KAncestor(root.right,n,k);

            if(leftDist == -1 && rightDist == -1){
                return -1;
            }
            int max = Math.max(leftDist,rightDist);
            if(max+1 == k){
                System.out.println(root.data);
            }
            return max+1;
        }
        public static int transform(Node root){
            if(root == null){
                return 0;
            }
            int leftChild = transform(root.left);
            int rightChild = transform(root.right);

            int data = root.data;

            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;

            root.data = newLeft+leftChild+newRight+rightChild;
            return data;
        }

    }
    public static void main(String[] args) {
       int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
       BinaryTree tree = new BinaryTree();
       Node root = tree.buildTree(nodes);
//       // System.out.println(root.data);
//        //tree.preorder(root);
//        //tree.Inorder(root);
//        //tree.Postorder(root);
        tree.levelOrder(root);
        /*
                               1
                              / \
                             2   3
                            / \ / \
                           4  5 6  7
         */
       // Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
                   2
                  / \
                 4   5
         */
//        Node subRoot = new Node(2);
//        subRoot.left = new Node(4);
//        subRoot.right = new Node(5);
        //System.out.println(diameter(root));

        //System.out.println(isSubtree(root, subRoot));
        //int k = 4;
        //KthLevel(root,1,k);
        //System.out.println(lca(root,4,5).data);
       // System.out.println(lca2(root,4,5).data);
        //System.out.println(minDist(root,4,7));
       // KAncestor(root,4,2);
//        transform(root);
//        preorder(root);
    }
}
