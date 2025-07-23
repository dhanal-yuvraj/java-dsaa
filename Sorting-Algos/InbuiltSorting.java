import java.util.*;

public class InbuiltSorting {
    public static void ascArr(int arr[]){
        Arrays.sort(arr);
        Printarr(arr);
    }

    public static void ascIdxArr(int arr[]){
        Arrays.sort(arr,0,3);
        Printarr(arr);
    }

    public static void decArr(Integer num[]){
        Arrays.sort(num,Collections.reverseOrder());
        ObPrintarr(num);
    }

    public static void decIdxArr(Integer num[]){
        Arrays.sort(num,0,3,Collections.reverseOrder());
        ObPrintarr(num);
    }



    public static void ObPrintarr(Integer arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " "); // Correct way
    }
    System.out.println();
}



    public static void Printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,5,4,2,3};
        Integer num[] = {1,5,4,2,3};
        ascIdxArr(arr);
        decIdxArr(num);
    }
}
