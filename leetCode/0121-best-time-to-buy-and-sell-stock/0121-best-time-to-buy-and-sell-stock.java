class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int least = Integer.MAX_VALUE;

        for (int i = 0 ; i < prices.length; i++) {
            if (prices[i] < least) {
                least = prices[i];
            }
            if (result < prices[i] - least) {
                result = prices[i] - least;
            }
        }
        return result;
    }
}