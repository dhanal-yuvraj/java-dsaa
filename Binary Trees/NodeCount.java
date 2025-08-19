import java.util.*;
public class NodeCount {
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void PreOrder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");

            PreOrder(root.left);
            PreOrder(root.right);
        }

        public static int NodeCount(Node root){
            if(root == null){
                return 0;
            }
            int lh = NodeCount(root.left);
            int rh = NodeCount(root.right);
            return lh+rh+1;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.PreOrder(root);
        System.out.println();
        
        System.out.println("The Node count of the tree is "+ tree.NodeCount(root));
    }
}
