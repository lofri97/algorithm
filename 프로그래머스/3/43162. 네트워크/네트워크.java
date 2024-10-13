import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] dp = new boolean[n];
        
        for (int i = 0; i < n; i++) {
           if (!dp[i]) {
               dfs(computers, i, dp);
               answer++;
           } 
        }
        return answer;
    }
    
    void dfs(int[][] computers, int i, boolean[] dp) {
        if (dp[i]) {
            return;
        }
        dp[i] = true;
        
        for (int j = 0; j < computers[i].length; j++) {
            if (computers[i][j] == 1) {
                dfs(computers, j, dp);
            }
        }
    }
}