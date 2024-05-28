package mwa.leetcode.topInterview;

public class BestTimeToBuyAndSellStock {
    BestTimeToBuyAndSellStock(){
        maxProfit(new int[]{7,6,4,3,1});
    };
    public int maxProfit(int[] prices) {
        int maxProfitTillDate= 0;
        int smallestBuyDate = 0;
        int currentIndex = 1;

        while(currentIndex< prices.length){
            if(prices[smallestBuyDate] > prices[currentIndex]){
                smallestBuyDate = currentIndex;
                continue;
            }

            if(prices[currentIndex] - prices[smallestBuyDate] > maxProfitTillDate){
                maxProfitTillDate = prices[currentIndex] - prices[smallestBuyDate];
            }
            currentIndex ++;
        }
        System.out.println(maxProfitTillDate);
        return maxProfitTillDate;

    }

    public static void main(String[] args) {
        new BestTimeToBuyAndSellStock();
    }
}
