import java.util.*;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> st = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (st.isEmpty()) {
                st.add(c);
                continue;
            }
            
            if (st.peek() == c) {
                st.pop();
            } else {
                st.add(c);
            }
        }
        return st.isEmpty() ? 1 : 0;
    }
}