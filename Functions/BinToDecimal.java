import java.util.*;
public class BinToDecimal {
    public static void BtoD(int n){
        int mydec = n;
        int pow = 0;
        int decNum = 0;
        while(n>0){
            int lastDigit = n%10;
            decNum = decNum+(lastDigit*(int)Math.pow(2, pow));
            pow++;
            n = n/10;
        }
        System.out.println("The decimal conversion of "+mydec+" is "+decNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the value of the binary number :- ");
        int n = sc.nextInt();
        BtoD(n);
        sc.close();
    }
}

