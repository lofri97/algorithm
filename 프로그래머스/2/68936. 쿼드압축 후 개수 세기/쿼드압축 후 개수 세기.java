class Solution {
    private int oneCnt = 0;
    private int zeroCnt = 0;
    
    public int[] solution(int[][] arr) {
        
        dfs(arr, 0, 0, arr.length);
        
        return new int[] { zeroCnt, oneCnt };
    }
    
    void dfs(int[][] arr, int y, int x, int size) {
        int curOneCnt = 0;
        for (int cy = y; cy < y + size; cy++) {
            for (int cx = x; cx < x + size; cx++) {
                if (arr[cy][cx] == 1) {
                    curOneCnt++;
                }
            }
        }
        
        if (curOneCnt == 0) {
            zeroCnt++;
            return;
        }
        if (curOneCnt == size * size) {
            oneCnt++;
            return;
        }
        
        if (size == 2) {
            zeroCnt += 4 - curOneCnt;
            oneCnt += curOneCnt;
            return;
        }
        
        dfs(arr, y, x, size / 2);
        dfs(arr, y, x + size / 2, size / 2);
        dfs(arr, y + size / 2, x, size / 2);
        dfs(arr, y + size / 2, x + size / 2, size / 2);
    }
}