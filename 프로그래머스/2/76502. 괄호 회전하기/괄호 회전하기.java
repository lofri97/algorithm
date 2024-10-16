import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(')', '(');
        map.put(']', '[');
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> st = new Stack<>();
            boolean flag = false;
            
            for (int j = i; j < s.length() + i; j++) {
                int idx = j % s.length();
                char target = s.charAt(idx);
                if (st.isEmpty() && map.containsKey(target)) {
                    flag = true;
                    break;
                }
                if (st.isEmpty()) {
                    st.add(target);
                } else if (map.containsKey(target)) {
                    if (st.peek() != map.get(target)) {
                        flag = true;
                        break;
                    }
                    st.pop();
                } else {
                    st.add(target);
                }
            }
            
            if (!flag && st.isEmpty()) {
                answer++;
            }
        }
        return answer;
    }
}

/**
s1945
**/