import java.util.*;
public class Factorial {
    public static int fact(int n){
        int res=1;
        for(int i=1;i<=n;i++){
            res = res*i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n :- ");
        int n = sc.nextInt();
        System.out.println("Enter the value of the r :- ");
        int r = sc.nextInt();
        int result = fact(n)/(fact(r)*fact(n-r));
        System.out.println("The result is "+result);
    }
}
