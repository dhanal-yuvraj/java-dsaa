public class PowerOfn {
    public static int Power(int x,int n){
        if(n==0){
            return 1;
        }

        return x*Power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(Power(2, 5));
    }
}
