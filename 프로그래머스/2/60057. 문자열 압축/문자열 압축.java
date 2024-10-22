import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = Integer.MAX_VALUE;
        
        for (int length = 1; length <= s.length(); length++) {
            
            int count = 0;
            String prev = "";
            StringBuilder sb = new StringBuilder();
            
            for (String token : tokenize(s, length)) {
                
                if (token.equals(prev)) {
                    count++;
                } else {
                    if (count > 1) sb.append(count);
                    sb.append(prev);
                    prev = token;
                    count = 1;
                }
            }
            if (count > 1) sb.append(count);
            sb.append(prev);
            
            answer = Math.min(answer, sb.toString().length());
        }
        
        return answer;
    }
    
    List<String> tokenize(String str, int length) {
        List<String> result = new ArrayList<>();
        
        for (int s = 0; s < str.length(); s+=length) {
            int e = s + length;
            if (e > str.length()) e = str.length();
            result.add(str.substring(s, e));
        }
        return result;
    }
}