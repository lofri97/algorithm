import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<int[]> st = new Stack<>();
        
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            
            while (!st.isEmpty() && st.peek()[0] > price) {
                int[] history = st.pop();
                answer[history[1]] = i - history[1];
            }
            st.push(new int[] { price, i});
        }
        
        while (!st.isEmpty()) {
            int[] history = st.pop();
            answer[history[1]] = prices.length -1 - history[1];
        }
        
        return answer;
    }
}