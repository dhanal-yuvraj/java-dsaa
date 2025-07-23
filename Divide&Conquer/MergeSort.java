public class MergeSort {
    public static void mergeSort(int arr[] , int si,int ei){
        //base
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }

    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int[ei-si+1];
        int i = si;
        int j = mid+1;
        int k = 0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k]= arr[j];
                j++;
            }
            k++;
        }

        //remaining numbers

        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]= arr[j++];
        }

        //copy to main array

        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }

    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3,4,1,88,188,1,22};
        mergeSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
