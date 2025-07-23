import java.util.*;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of the n :- ");
        int n = sc.nextInt();
        for(int line=0;line<n;line++){
            for(int star = 0;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
