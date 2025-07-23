import java.util.*;

public class PalindromeNumber {
    public static boolean isPalindrome(int n){
        int temp = n;
        int compare = 0;
        while(n>0){
            int lastnum = n%10;
            compare = (compare*10)+lastnum;
            n = n/10;
        }
        if(compare == temp){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number to check palindrome :- ");
        int n = sc.nextInt();
        boolean ans = isPalindrome(n);
        if(ans){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is not Palindrome");
        }
        sc.close();
    }
}
