import java.util.*;

class Solution {
    public String solution(String myString) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        
        for (char c : myString.toCharArray()) {
            if (set.contains(c)) continue;
            sb.append(c);
            set.add(c);
        }
        return sb.toString();
    }
}