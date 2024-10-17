import java.util.*;

class Solution {
    int solution(int[][] land) {
        
        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][3]));
            land[i][1] += Math.max(land[i-1][0], Math.max(land[i-1][2], land[i-1][3]));
            land[i][2] += Math.max(land[i-1][1], Math.max(land[i-1][0], land[i-1][3]));
            land[i][3] += Math.max(land[i-1][1], Math.max(land[i-1][2], land[i-1][0]));
        }
        
        int n = land.length - 1;
        
        return Math.max(land[n][0], Math.max(land[n][1], Math.max(land[n][2], land[n][3])));
    }
}