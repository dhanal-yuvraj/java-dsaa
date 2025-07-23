public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int maximum = i;
            for(int j=i+1; j<arr.length;j++){
                if(arr[maximum]<arr[j]){
                    maximum=j;
                }
                //swapping
                int temp = arr[i];
                arr[i]= arr[maximum];
                arr[maximum]=temp;
            }
        }
    }

    public static void arrayPrinting(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,5,7,9,3,2};
        selectionSort(arr);
        arrayPrinting(arr);
    }
}
