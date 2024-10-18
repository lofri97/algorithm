

import java.util.Arrays;

class Solution {
    int[] answer = {0, 0};
    
    public int[] solution(int[][] arr) {

        dfs(arr, 0, arr.length, 0, arr.length);

        return answer;
    }

    void dfs(int[][] arr, int sy, int ey, int sx, int ex) {
        int tmp = arr[sy][sx];
        boolean flag = true;
        for (int y = sy; y < ey ; y++) {
            for (int x = sx; x < ex ; x++) {
                if (arr[y][x] != tmp) {
                    flag = false;
                    break;
                }
            }
        }

        if (flag) {
            answer[tmp] += 1;
            return;
        }

        if (ey-sy <= 2) {
            for (int y = sy; y < ey; y++) {
                for (int x = sx; x < ex; x++) {
                    answer[arr[y][x]] += 1;
                }
            }
        } else {
            dfs(arr, sy, sy + (ey - sy) / 2, sx, sx +(ex - sx) / 2);
            dfs(arr, sy, sy + (ey - sy) / 2, sx + (ex - sx) / 2, ex);
            dfs(arr, sy + (ey - sy) / 2, ey, sx, sx + (ex - sx) / 2);
            dfs(arr, sy + (ey - sy) / 2, ey, sx + (ex - sx) / 2, ex);
        }
    }
}