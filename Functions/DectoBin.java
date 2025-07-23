import java.util.*;

public class DectoBin {
    public static void DtoB(int n){
        int mydec = n;
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n%2;
            bin = bin + (rem *(int)Math.pow(10,pow));
            pow++;
            n /= 2;
        }
        System.out.println("The Binary form of the number " +mydec+ " is "+bin);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the decimal number :- ");
        int n = sc.nextInt();
        DtoB(n);
        sc.close();       
    }
}
