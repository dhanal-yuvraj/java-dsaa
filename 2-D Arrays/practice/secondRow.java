import java.util.*;
public class secondRow {
    
    public static int SecondRow(int arr[][]){
        int row = 1;
        int sum=0;
        for(int col=0;col<arr[0].length;col++){
            sum+=arr[row][col];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][]=  { {1,4,9},{11,4,3},{2,2,3} };
        int result = SecondRow(arr);
        System.out.println(result);
    }
}
