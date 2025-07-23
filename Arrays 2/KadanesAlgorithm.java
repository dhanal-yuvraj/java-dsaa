
public class KadanesAlgorithm {
    public static int kadane(int arr[]){
        int maximum = Integer.MIN_VALUE;
        int current = 0;
        for(int i=0;i<arr.length;i++){
            current += arr[i];
            if(current < 0){
                current = 0;
            }

            maximum = Math.max(current, maximum);
        }
        return maximum;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        int result = kadane(arr);
        System.out.println("The maximum sub array is : "+ result);
    }
}
