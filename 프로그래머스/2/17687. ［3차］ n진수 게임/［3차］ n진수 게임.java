import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder sb = new StringBuilder();
        
        int curVal = 0;
        int curIdx = 0;
        while (sb.length() < t) {
            char[] chars = getChars(curVal, n);
            
            for (int i = 0; i < chars.length && sb.length() < t; i++) {
                if (curIdx % m == p - 1) {
                    sb.append(chars[i]);
                }
                curIdx++;
            }
            curVal++;
        }
        return sb.toString();
    }
    
    char[] getChars(int val, int n) {
        StringBuilder sb = new StringBuilder();
        
        if (val == 0) {
            return new char[] {'0'};
        }
        
        while (val > 0) {
            int mod = val % n;
            if (mod > 9) {
                sb.append((char) ('A' + mod - 10));
            } else {
                sb.append(mod);
            }
            val /= n;
        }
        return sb.reverse().toString().toCharArray();
    }
}