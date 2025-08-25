import java.util.*;

public class Topview {
    static class  Node{
        int data;
        Node left,right;
        Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }

    static class Info{
        Node node;
        int hd;
        Info(Node node,int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        if(root== null){
            return;
        }

        Queue<Info> q = new LinkedList<>();

        Map<Integer,Integer> map = new TreeMap<>();

        q.add(new Info(root, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();

            if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node.data);
            }

            if(curr.node.left != null){
                q.add(new Info(curr.node.left, curr.hd-1));
            }

            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd +1));
            }
        }

        for(int val : map.values()){
            System.out.print(val + " ");;
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

        topView(root);
    }
}