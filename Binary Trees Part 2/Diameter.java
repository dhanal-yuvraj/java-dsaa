import java.util.*;

class Diameter{
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int heigth(Node root){
        if(root == null){
            return 0;
        }

        int lh = heigth(root.left);
        int rh = heigth(root.right);

        return Math.max(lh,rh)+1;

    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int leftdiam = diameter(root.left);
        int leftheight = heigth(root.left);
        int rightdiam = diameter(root.right);
        int rightheight = heigth(root.right);

        int selfdiam = leftheight+rightheight+1;
        return Math.max(rightdiam, Math.max(leftdiam, selfdiam));
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println("The height of the tree is "+ heigth(root));
        System.out.println("The maximum diameter of the tree is "+ diameter(root));
    }
}