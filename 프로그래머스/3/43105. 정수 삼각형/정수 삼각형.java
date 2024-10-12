import java.util.*;

class Solution {
    public int solution(int[][] triangle) {
        int maxY = triangle.length - 1;
        int maxX = triangle[maxY].length - 1;
        int[][] dp = new int[maxY+1][maxX+1];
        
        
        for (int i = 0; i <= maxX; i++) {
            dp[maxY][i] = triangle[maxY][i];
        }
        
        for (int y = maxY - 1; y >= 0; y--) {
            for (int x = 0; x < triangle[y].length; x++) {
                dp[y][x] = Math.max(dp[y+1][x], dp[y+1][x+1]) + triangle[y][x];
            }
        }
        return dp[0][0];
    }
}