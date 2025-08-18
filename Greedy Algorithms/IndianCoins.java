import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        int coins []= {1,2,10,5,20,50,500,100,2000};
        Arrays.sort(coins);


        int coinCount = 0;
        int amount = 60666;

        ArrayList<Integer> usedCoins = new ArrayList<>();

        for(int i=coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    coinCount++;
                    usedCoins.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }

        System.out.println("The numbers of coins are = "+ coinCount);

        for(int i=0;i<usedCoins.size();i++){
            System.out.print(usedCoins.get(i)+" ");
        }

        System.out.println();
    }
}
