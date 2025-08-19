import java.util.*;
public class HeightOfTree {
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

            System.out.print(root.data + " ");//root
            PreOrder(root.left);//left
            PreOrder(root.right);//right
        }

        public static int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return Math.max(lh,rh)+1;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.PreOrder(root);
        System.out.println();
        System.out.println("The height of the tree is "+ tree.height(root));
    }
}
