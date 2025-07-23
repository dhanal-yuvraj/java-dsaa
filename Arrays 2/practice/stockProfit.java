import java.util.*;
public class stockProfit {
    public static int calProfit(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0;i<prices.length;i++){
            if(buyPrice < prices[i]){
                int profit = prices[i]- buyPrice;
                maxPrice = Math.max(maxPrice, profit);
            }
            else{
                buyPrice=prices[i];
            }
        }
        return maxPrice;
    }
    public static void main(String[] args) {
        int prices []= {7, 6, 4, 3, 1};
        int maxprice = calProfit(prices);
        System.out.println("The maximum profit is : "+ maxprice);
    }
}
