public class PrintSubarray {
    public static void SubArray(int arr[]){
        for(int i = 0 ;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        SubArray(arr);
    }
}
