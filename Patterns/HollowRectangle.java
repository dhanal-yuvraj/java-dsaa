import java.util.*;
public class HollowRectangle {
    public static void hollowRectangle(int totalRows, int totalColumns){
        for(int i=1;i<=totalRows;i++){
            for(int j=1;j<=totalColumns;j++){
                if(i==1 || j==1 || i==totalRows || j==totalColumns){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :- ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns :- ");
        int columns = sc.nextInt();
        hollowRectangle(rows, columns);
        sc.close();
    }
}
