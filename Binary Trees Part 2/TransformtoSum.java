import java.util.*;
public class TransformtoSum {
    static class Node{
        int data;
        Node left,right;
        Node (int val){
            data = val;
            left = null;
            right = null;
        }
    }

    public static int transform(Node root){
        if(root == null){
            return 0 ;
        }

        int left = transform(root.left);
        int right = transform(root.right);

        int data = root.data;
        int newLeft = 0;
        int newRight = 0;

        if(root.left == null){
            newLeft = 0;
        }else{
            newLeft = root.left.data;
        }
        if(root.right == null){
            newRight = 0;
        }else{
            newRight = root.right.data;
        }

        root.data = left + newLeft + right + newRight;

        return data;
    }


    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        transform(root);
        preOrder(root);
    }
}
