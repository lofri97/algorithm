class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for (int y = 0; y < arr1.length; y++) {
            for (int x = 0; x < arr2[0].length; x++) {
                int sum = 0;
                
                for (int i = 0; i < arr2.length; i++) {
                    sum += arr1[y][i] * arr2[i][x];
                }
                answer[y][x] = sum;
            }
        }
        
        return answer;
    }
}

/**
1,4  3,3
3,2  3,3
4,1 

2,3,2  5,4,3
4,2,4  2,4,1
3,1,4  3,1,1
**/