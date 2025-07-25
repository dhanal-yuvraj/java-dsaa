import java.util.*;
public class NprimeNumbers {
     public static boolean isPrime(int n){

        if(n==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
             return false;   
            }
        }
        return true;
    }

    public static void printNnum(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the n :- ");
        int n = sc.nextInt();
        printNnum(n);
    }
}
