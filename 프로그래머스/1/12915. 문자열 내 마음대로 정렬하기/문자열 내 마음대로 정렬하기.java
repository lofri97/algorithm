import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        Arrays.sort(strings, (v1, v2) -> {
            if (v1.charAt(n) - v2.charAt(n) == 0) {
                return v1.compareTo(v2);
            }
            return v1.charAt(n) - v2.charAt(n);
        });
        return strings;
    }
}