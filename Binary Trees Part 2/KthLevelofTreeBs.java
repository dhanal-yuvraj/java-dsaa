import java.util.*;
public class KthLevelofTreeBs {
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void kthlevel(Node root, int k){
        if(root == null){
            return;
        }
        if(k==1){
            System.out.println(root.data);
            return;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);
        int level = 1;
        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr==null){
                if(level == k){
                    return;
                }
                level++;
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                if(level == k){
                    System.out.print(curr.data+" ");
                }
                
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }

            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kthlevel(root, 2);
    }
}
