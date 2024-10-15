class Solution {
    public int solution(int n, int[][] results) {
        boolean[][] win = new boolean[n+1][n+1];
        boolean[][] lose = new boolean[n+1][n+1];
        
        for (int[] result : results) {
            win[result[0]][result[1]] = true;
            lose[result[1]][result[0]] = true;
        }
        
        for (int k = 1; k < n + 1; k++) {
            for (int i = 1; i < n+1; i++) {
                for (int j = 1; j < n+1; j++) {
                    if (win[i][k] && win[k][j]) {
                        win[i][j] = true;
                    }
                    if (lose[i][k] && lose[k][j]) {
                        lose[i][j] =  true;
                    }
                }
            }
        }
        
        int answer = 0;
        for (int i = 1; i < n + 1; i++) {
            int count = 0;
            for (int j = 1; j < n+1; j++) {
                if (win[i][j] || lose[i][j]) {
                    count++;
                }
            }
            if (count == n - 1) {
                answer++;
            }
        }
        return answer;
    }
}