import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int[] counts = new int[26];
        
        for (char c : before.toCharArray()) {
            counts[c-'a']++;
        }
        
        for (char c : after.toCharArray()) {
            counts[c-'a']--;
            if (counts[c-'a'] < 0) return 0;
        }
        
        return 1;
    }
}