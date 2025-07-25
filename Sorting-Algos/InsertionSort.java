public class InsertionSort {
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int prev = i-1;
            //sorting logic
            while(prev >= 0 && arr[prev]>curr){
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserting
            arr[prev+1]= curr;
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,3,2,1,5};
        System.out.println(arr.length);
        insertionSort(arr);
        printArray(arr);
    }
}
