class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        int st = 0;
        for (int i = 0; i < section.length; i++) {
            if (st < section[i]) {
                answer++;
                st = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}