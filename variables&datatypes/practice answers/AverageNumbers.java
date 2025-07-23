import java.util.*;
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        float average = (a+b+c)/3f;
        System.out.println(average);
        sc.close();
    }
    
}
