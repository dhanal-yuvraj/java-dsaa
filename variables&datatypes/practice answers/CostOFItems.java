import java.util.*;
public class CostOFItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int item1 = sc.nextInt();
        int item2 = sc.nextInt();
        int item3 = sc.nextInt();
        int total = item1+item2+item3;
        System.out.println("The toal bill is " + total);
        float newbill = total * 0.18f;
        System.out.println("The bill including 18% Gst is " + (newbill + total));
    }
}
