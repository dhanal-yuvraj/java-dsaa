import java.util.*;
public class AverageofThree {
     public static int Averageof3(int a, int b,int c){
        int average = (a+b+c)/3;
        return average;
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The average of the three numbers is "+ Averageof3(a,b,c));
        sc.close();
     }
}
