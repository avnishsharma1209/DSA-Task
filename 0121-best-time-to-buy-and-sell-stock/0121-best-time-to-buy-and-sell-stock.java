class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyprice = prices[0];
         for(int i = 0; i< prices.length; i++){
             if(buyprice > prices[i]){
                 buyprice = prices[i];
             }
             else{
                 maxProfit = Math.max(prices[i] - buyprice , maxProfit);
             }
        }
        return maxProfit;
        
    }
}