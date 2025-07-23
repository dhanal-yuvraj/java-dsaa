public class GridWaysTrick {
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }

        return n*factorial(n-1);
    }

    public static int gridWaysTrick(int n,int m){
        int ans = (factorial(n-1+m-1)/(factorial(n-1)*factorial(m-1)));
        return ans;
    }

    public static void main(String[] args) {
        int n=3,m=3;
        int ans = gridWaysTrick(n, m);
        System.out.println(ans);
    }
}
