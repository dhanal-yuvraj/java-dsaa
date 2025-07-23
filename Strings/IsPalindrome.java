import java.util.*;
public class IsPalindrome {
    
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check it was palindrome or not :- ");
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+ " is Palindrome");
        }
        else{
            System.out.println(str+" is not Palindrome");
        }
        sc.close();
    }
}
