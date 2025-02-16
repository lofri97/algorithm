import java.io.*;
import java.util.*;

public class Main {
    static int bCnt = 0;
    static int wCnt = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(arr[j]);
            }
        }

        dfs(0, 0, n, board);
        System.out.println(wCnt);
        System.out.println(bCnt);
    }

    static void dfs(int sy, int sx, int length, int[][] board) {
        int target = board[sy][sx];
        boolean flag = true;

        for (int y = sy; y < sy + length; y++) {
            for (int x = sx; x < sx + length; x++) {
                if (board[y][x] == target) continue;
                flag = false;
                break;
            }
        }

        if (flag) {
            if (target == 1) {
                bCnt++;
            } else {
                wCnt++;
            }
        } else {
            dfs(sy, sx, length / 2, board);
            dfs(sy, sx + length / 2, length / 2, board);
            dfs(sy + length / 2, sx, length / 2, board);
            dfs(sy + length / 2, sx + length / 2, length / 2, board);
        }
    }
}