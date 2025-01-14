class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        
        for (int y = 0; y < n; y++) {
            answer[y][y] = 1;
        }
        return answer;
    }
}