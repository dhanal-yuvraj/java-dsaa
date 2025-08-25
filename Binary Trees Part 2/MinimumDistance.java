public class MinimumDistance {
    static class Node{
        int data;
        Node left,right;
        Node(int val){
            data = val;
            left = null;
            right = null;
        }
    }

    public static Node lca(Node root , int n1, int n2){
        if(root == null || root.data == n1 ||root.data == n2){
            return root;
        }

        Node leftlca = lca(root.left, n1, n2);
        Node rightlca = lca(root.right, n1, n2);
        
        if(leftlca==null && rightlca == null){
            return null;
        }

        if(leftlca == null){
            return rightlca;
        }
        if(rightlca == null){
            return leftlca;
        }

        return root;

    }
    public static int Distance(Node root,int n ){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftdist = Distance(root.left, n);
        int rightdist = Distance(root.right, n);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }

        if(leftdist == -1){
            return rightdist+1;
        }else{
            return leftdist +1;
        }

    }


    public static int minimumDistance(Node root, int n1,int n2){
        Node lca = lca(root, n1, n2);
        int dist1 = Distance(lca, n1);
        int dist2 = Distance(lca, n2);

        return dist1+dist2;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n1 = 4;
        int n2 = 7;
        
        System.out.println(minimumDistance(root, n1, n2));
    }
}
