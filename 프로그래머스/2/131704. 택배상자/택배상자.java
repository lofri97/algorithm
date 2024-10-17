import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        int start = 1;
        int tIdx = 0;
        
        while (start <= order.length) {
            while(!st.isEmpty() && st.peek() == order[tIdx]) {
                st.pop();
                tIdx++;
                answer++;
            }
            st.add(start++);
        }
        
        while (!st.isEmpty() && st.peek() == order[tIdx]) {
            st.pop();
            tIdx++;
            answer++;
        }
        
        return answer;
    }
}