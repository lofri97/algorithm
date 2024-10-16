import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int size = elements.length;
        int[][] dp  = new int[size][size];
        
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            dp[i][0] = elements[i];
            set.add(dp[i][0]);
        }
        
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size; j++) {
                dp[i][j] = dp[i][j-1] + elements[(i+j)%size];
                set.add(dp[i][j]);
            }
        }
        return set.size();
    }
}