import java.util.*;
public class TransposeMatrix {
    public static void transposeMatrix(int arr[][]){
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},
                    {4,5,6}};
        transposeMatrix(arr);
    }
}
