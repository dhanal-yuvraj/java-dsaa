import java.util.*;
public class SumofTwo {

    public static int Addition(int a,int b){
        int sum = a+b;
        a++;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = Addition(num1 , num2);
        System.out.println("The value of " + num1  + "+" + num2 + " is "+sum);
    }
}
