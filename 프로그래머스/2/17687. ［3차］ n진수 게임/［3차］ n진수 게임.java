class Solution {
    public String solution(int n, int t, int m, int p) {
        StringBuilder answer = new StringBuilder();
        StringBuilder targetStr = new StringBuilder();
        
        int start = 0;
        while (targetStr.length() < m * t) {
            targetStr.append(Integer.toString(start++, n));
        }
        
        for (int i = p - 1; answer.length() < t; i += m) {
            answer.append(targetStr.charAt(i));
        }
        return answer.toString().toUpperCase();
    }
}