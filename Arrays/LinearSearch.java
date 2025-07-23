import java.util.*;

public class LinearSearch {

    public static int B_search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :- ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter the elements in the array :- ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the key you want to search :- ");
        int key = sc.nextInt();
        int result = B_search(arr,key);
        if(result == -1){
            System.out.println("The key was not found");
        }
        else{
            System.out.println("The key was found at the index "+result);
        }
        sc.close();
    }
    
}
