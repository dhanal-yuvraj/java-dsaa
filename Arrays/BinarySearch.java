import java.util.*;
public class BinarySearch {
    public static int B_search(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid = (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid] > key){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of the array :- ");
        int size = sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter the array elements : - ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
    }
    System.out.println("Please enter the key you want to find :- ");
    int key = sc.nextInt();

    System.out.println("The index of the key is " + B_search(arr, key));
    sc.close();
 }
}
