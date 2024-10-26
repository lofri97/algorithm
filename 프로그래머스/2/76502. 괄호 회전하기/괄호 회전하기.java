import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        
        char[] arr = s.toCharArray();
        for (int j = 0; j < s.length(); j++) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                
                char val = arr[(i + j) % s.length()];
                if (val == '[' || val == '{' || val == '(') {
                    st.add(val);
                } else if (val == ']') {
                    if (st.isEmpty() || st.peek() != '[') break;
                    st.pop();
                } else if (val == '}') {
                    if (st.isEmpty() || st.peek() != '{') break;
                    st.pop();
                } else if (val == ')') {
                    if (st.isEmpty() || st.peek() != '(') break;
                    st.pop();
                }
                if (st.isEmpty() && i == s.length() - 1) answer++;
            }
        }
        
        return answer;
    }
}