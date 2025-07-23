public class Tiling {
    public static int tilingProblem(int n){
        if(n==1||n==0){
            return 1;
        }

        //vertical 
        int fn1 = tilingProblem(n-1);
        //horizontal
        int fn2 = tilingProblem(n-2);
        //ans
        return fn1 + fn2;
    }

    public static void main(String[] args) {
        System.out.println(tilingProblem(4));
    }
}
