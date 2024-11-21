class Solution {
    public int solution(String s) {
        int answer = 0;
        
        int idx = 0;
        char x = ' ';
        int xCount = 0;
        int nonXCount = 0;
        
        while (idx < s.length()) {
            char val = s.charAt(idx++);
            if (xCount == 0) {
                x = val;
                xCount++;
                continue;
            }
            
            if (val == x) {
                xCount++;
            } else {
                nonXCount++;
            }
            
            if (xCount == nonXCount) {
                answer++;
                xCount = 0;
                nonXCount = 0;
            }
        }
        
        if (xCount != 0) {
            answer++;
        }
        
        return answer;
    }
}