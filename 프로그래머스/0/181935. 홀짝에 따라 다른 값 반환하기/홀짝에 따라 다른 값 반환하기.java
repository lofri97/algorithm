class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = n % 2 == 0 ? 2 : 1;
        
        for (; i <= n; i += 2) {
            if (i % 2 == 0) {
                answer += Math.pow(i, 2);
            } else {
                answer += i;
            }
        }
        return answer;
    }
}