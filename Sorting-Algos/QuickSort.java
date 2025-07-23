class QuickSort{
    public static void quickSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pivotIdx = partition(arr,si,ei);
        quickSort(arr, si, pivotIdx-1);
        quickSort(arr, pivotIdx+1, ei);
    }

    public static int partition(int arr[],int si,int ei){
        int pivot = arr[ei];//endig is pivot
        int i = si-1;// i-1 value

        //placing the left side values which are less then pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //setting pivot
        i++;
        int temp = pivot;
        arr[ei] =arr[i];
        arr[i] = temp;

        return i;
    }

    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,55,1,33,2,111,1,1};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}