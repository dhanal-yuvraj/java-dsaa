import java.util.*;
public class SubTreeOfAnotherTree {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data= data;
            this.left = null;
            this.right=null;
        }
    }
    public static boolean isIdentical(Node node, Node subNode){
        if(node == null && subNode== null){
            return true;
        }
        else if(node == null || subNode == null|| subNode.data != node.data){
            return false;
        }

        if(!isIdentical(node.left, subNode.left)){
            return false;
        }
        if(!isIdentical(node.right, subNode.right)){
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root , Node subNode){
        if(root==null){
            return false;
        }

        if(root.data == subNode.data){
            if(isIdentical(root,subNode)){
                return true;
            }
        }

        return isSubtree(root.left, subNode)|| isSubtree(root.right, subNode);
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        System.out.println(isSubtree(root, subRoot));
    }
}
