package mwa.leetcode.topInterview;

public class BestTimeToBuySellStockII {
    BestTimeToBuySellStockII(){
        maxProfit(new int[]{1,2,3,4,5});
    }

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currentIndex = 1;
        int minimumIndex = 0;
        int currentMaxProfit = 0;

        while(currentIndex< prices.length){
            if(prices[currentIndex] < prices[minimumIndex] ){
                minimumIndex = currentIndex;
                continue;
            }
            if(currentMaxProfit < (prices[currentIndex] - prices[minimumIndex])){
                currentMaxProfit = prices[currentIndex] - prices[minimumIndex];
            }else{
                maxProfit += currentMaxProfit;
                currentMaxProfit = 0;
                minimumIndex = currentIndex;
            }
            currentIndex++;
        }
        maxProfit += currentMaxProfit;
        System.out.println(maxProfit);
        return  maxProfit;
    }

    public static void main(String[] args) {
        new BestTimeToBuySellStockII();
    }
}
