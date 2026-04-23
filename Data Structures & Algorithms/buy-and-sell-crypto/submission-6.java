class Solution {
    public int maxProfit(int[] prices) {
    int maxP=0;
    int min=Integer.MAX_VALUE;
    int profit =0;
    for(int i =0; i < prices.length; i++){
        min = Math.min(prices[i],min);
        profit = prices[i] - min;
        maxP = Math.max(maxP,profit);
    }    
    return maxP;
    }
}
