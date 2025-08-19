import java.util.*;
public class SumOfNodes {
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
                System.out.print(-1 + " ");
                return;
            }
            System.out.print(root.data + " ");

            PreOrder(root.left);
            PreOrder(root.right);
        }

        public static int Sum(Node root){
            if(root == null){
                return 0;
            }

            int leftSum = Sum(root.left);
            int rightSum = Sum(root.right);
            return leftSum+rightSum+root.data;
        }
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.PreOrder(root);
        System.out.println();
        System.out.println("The total sum of nodes is "+ tree.Sum(root));
    }
}
