package Recursion;
public class DecresingNumber {

    public static void Decreasing(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        Decreasing(n-1);
    }
    public static void main(String[] args) {
        Decreasing(10);
    }
}
