public class SortedChecking {
    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }

        return isSorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 0;
        System.out.println(isSorted(arr, n));
    }
}
