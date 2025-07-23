import java.util.*;

public class MaximumSubarrayPrefix {
    public static int SubarrayPrefix(int arr[]){
        int maximum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=arr[i] + prefix[i-1];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentSum = i==0 ? prefix[j] : prefix[j] - prefix[i - 1];

                if(currentSum>maximum){
                    maximum = currentSum; 
                }
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        int result = SubarrayPrefix(arr);
        System.out.println("The maximum subarray is : "+ result);
    }
}
