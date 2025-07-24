
import java.util.ArrayList;

public class IncreaseOrDecrease {
    public static boolean result(ArrayList<Integer> arr){
        boolean inc = true;
        boolean dec = true;

        for(int i=0;i<arr.size()-1;i++){
            if(arr.get(i)>arr.get(i+1)){
                inc = false;
            }
            if(arr.get(i)<arr.get(i+1)){
                dec = false;
            }
        }
        return inc||dec;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);        
        arr.add(2);        
        arr.add(5);        
        arr.add(4);        
        arr.add(5);
        
        
        System.out.println(result(arr));
    }
}
