class Solution {
    public int maxProfit(int[] prices) {
        
        int sum=0;
        int left=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i] < left){
                left = prices[i];
            } else if(prices[i] - left > sum){
                sum = prices[i] - left;
            }
        }
        return sum;
    }
}