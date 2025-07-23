import java.util.*;


public class PositivieOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :- ");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("The number is neither positive nor negative");
        }
        else if (num>0) {
            System.out.println("The given number is positive number");
        } else {
            System.out.println("The given number is negative number");
        }
    }

     
}