import java.util.*;
public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int pairs[][] = {{5,4},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o -> o[1]));

        int chainLength = 1;
        int chainEnd = pairs[0][1];
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chainLength++;
                chainEnd = pairs[i][1];
            }
        }

        System.out.println("The maximum length of chain of pairs is = "+ chainLength);
    }
}
