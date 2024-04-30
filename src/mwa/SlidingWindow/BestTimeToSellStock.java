package mwa.SlidingWindow;

import java.util.HashMap;

public class BestTimeToSellStock {
    BestTimeToSellStock(){
        System.out.println(maxProfit(new int[]{2,1,4}));
    }
    public int maxProfit(int[] prices) {
        int highestValueTillDate = 0;
        int leftIndex = 0;
        int rightIndex = 1;
        int currentSellPrice;
        while(rightIndex < prices.length){
            currentSellPrice = prices[rightIndex] - prices[leftIndex];
            if(currentSellPrice > highestValueTillDate){
                highestValueTillDate = currentSellPrice;
            }
            if(currentSellPrice < 0 ){
                leftIndex = rightIndex;
            }
            rightIndex++;
        }
        return highestValueTillDate;
    }

    public static void main(String[] args) {
        new BestTimeToSellStock();
    }
}
