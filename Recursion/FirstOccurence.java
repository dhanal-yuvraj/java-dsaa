public class FirstOccurence {
    public static int FindIdx(int arr[],int key,int i){
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return FindIdx(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        int key = 4;
        System.out.println(FindIdx(arr, key, 0));
    }
}
