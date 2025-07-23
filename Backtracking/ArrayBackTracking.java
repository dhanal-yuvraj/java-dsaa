public class ArrayBackTracking {
    public static void changeArr(int arr[],int i,int value){
        //Base case
        if(i==arr.length){
            PrintArray(arr);
            return;
        }
        //Recursion 
        arr[i] = value;//filling the value in array
        changeArr(arr, i+1, value+1);//recursing the array
        arr[i]=arr[i]-2;//Backtracking
    }

    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
      public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        PrintArray(arr);

      }  
}
