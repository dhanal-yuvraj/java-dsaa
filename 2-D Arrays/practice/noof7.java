import java.util.*;
public class noof7 {
    public static int finding(int arr[][]){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==7){
                    count+=1;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[][]=  { {4,7,8},{8,8,7},{3,7,5} };
        int result = finding(arr);
        System.out.println(result);
    }
}
