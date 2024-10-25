class Solution {
    public int solution(int[] numbers) {
        boolean[] exists = new boolean[10];
        
        for (int n : numbers) {
            exists[n] = true;
        }
        
        int answer = 0;
        for (int i = 0; i < 10; i++) {
            if (exists[i]) continue;
            answer += i;
        }
        return answer;
    }
}