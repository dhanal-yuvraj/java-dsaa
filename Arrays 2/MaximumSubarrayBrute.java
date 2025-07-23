import java.util.*;

public class MaximumSubarrayBrute {
    public static int MaximumSubarray(int arr[]){
        int maximum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentSum = 0;
                for(int k=i;k<=j;k++){
                    currentSum += arr[k];
                }
                if(currentSum>maximum){
                    maximum = currentSum;
                }
            }
        }
        return maximum;
    }

    public static void main(String[] args) {
        int arr[]= {1,-2,6,-1,3};
        int result = MaximumSubarray(arr);
        System.out.println("The maximum sub array sum is :- " + result);

    }
}
