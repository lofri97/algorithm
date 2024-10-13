import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<PriceInfo> history = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            int currentPrice = prices[i];
            
            while (!history.isEmpty() && history.peek().price > currentPrice) {
                PriceInfo priceInfo = history.pop();
                answer[priceInfo.idx] = i - priceInfo.idx;
            }
            history.push(new PriceInfo(i, currentPrice));
        }
        
        while (!history.isEmpty()) {
            PriceInfo priceInfo = history.pop();
            answer[priceInfo.idx] = prices.length - priceInfo.idx - 1;
        }
        return answer;
    }
    
    static class PriceInfo {
        int idx;
        int price;
        
        PriceInfo(int idx, int price) {
            this.idx = idx;
            this.price = price;
        }
        
        public String toString() {
            return String.format("idx: %d / price: %d\n", idx,price);
        }
    }
}