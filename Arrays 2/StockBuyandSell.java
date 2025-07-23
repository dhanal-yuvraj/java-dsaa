import java.util.*;

public class StockBuyandSell{
    public static int MaximumPrice(int prices[]){
        int buyPrice = Integer.MAX_VALUE;
        int maxPrice = 0;
        for(int i=0 ;i<prices.length;i++){
            if(buyPrice < prices[i]){//check that is profit or not
                int profit = prices[i]-buyPrice;//Todays profit
                maxPrice = Math.max(maxPrice, profit);
            }
            else{
                buyPrice = prices[i];
            }
        }
        return maxPrice;
    }

    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int result = MaximumPrice(arr);
        System.out.println("The maximum profit is : "+ result);
    }
}