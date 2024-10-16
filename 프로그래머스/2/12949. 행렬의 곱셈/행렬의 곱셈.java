class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int ay = 0; ay < answer.length; ay++) {
            for (int ax = 0; ax < answer[0].length; ax++) {
                int val = 0;
                
                for (int i = 0; i < arr2.length; i++) {
                    val += arr1[ay][i] * arr2[i][ax];
                }
                
                answer[ay][ax] = val;
            }
        }
        return answer;
    }
}