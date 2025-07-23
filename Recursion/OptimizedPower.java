public class OptimizedPower{
    public static int power(int a,int n){
        if(n==0){
            return 1;
        }

        int Power = power(a, n/2);
        int Powersq = Power*Power;
        if(n%2!=0){
            Powersq= a*Powersq;
        }
        return Powersq;
    }


    public static void main(String[] args) {
        System.out.println(power(2, 10));
    }
}