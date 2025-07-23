import java.util.ArrayList;

public class PairSum2 {
    public static boolean pairSum2(ArrayList<Integer> numbers,int target){
        int bp = -1;
        int n = numbers.size();
        //find the breaking point
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)>numbers.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        
        while(lp!=rp){
            if(numbers.get(lp)+numbers.get(rp) == target){
                return true;
            }
            else if(numbers.get(lp)+numbers.get(rp)>target){
                rp = (n+rp-1)%n;
            }else{
                lp = (lp+1)%n;
            }
        }
        return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(11);
        numbers.add(15);
        numbers.add(6);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        
        int target = 16;
        System.out.println(pairSum2(numbers, target));
    }
}
