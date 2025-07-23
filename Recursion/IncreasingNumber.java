package Recursion;
public class IncreasingNumber {
    public static void Increasing(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        Increasing(n-1);
        System.out.print(n+ " ");
    }
    public static void main(String[] args) {
        Increasing(10);
    }

}
