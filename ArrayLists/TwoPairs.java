import java.util.*;
public class TwoPairs {

    public static boolean towPairs(ArrayList<Integer> numbers,int target){
        int lp = 0;
        int rp = numbers.size()-1;
        while(lp<rp){
            if(numbers.get(rp)+numbers.get(lp)==target){
                return true;
            }
            else if(numbers.get(rp)+numbers.get(lp)>target){
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;

    }
    public static void main(String args[]){
        ArrayList <Integer> numbers = new ArrayList<>();
        for(int i=1;i<6;i++){
            numbers.add(i);
        }
        int target = 3;

        if(towPairs(numbers, target)){
            System.out.println("The target was found");
        }
        else{
            System.out.println("The target was not found");
        }

    }
}
