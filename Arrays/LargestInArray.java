import java.util.*;
public class LargestInArray {
    public static int LargestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the elements in the array :- ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The largest number in the array is : "+LargestNumber(arr));
        sc.close();
    }
}
