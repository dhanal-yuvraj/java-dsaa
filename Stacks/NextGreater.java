import java.util.*;
class NextGreater{
    public static void main(String[] args) {
        int arr[] = {1,5,8,2,5};
        Stack<Integer> s = new Stack<>();
        int nextgreater[] = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty()&& arr[s.peek()]<=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextgreater[i]=-1;
            }else{
                nextgreater[i]= arr[s.peek()];
            }

            s.push(i);
        } 

        for(int i=0;i<nextgreater.length;i++){
            System.out.print(nextgreater[i]+" ");
        }
        System.out.println();
    }
}