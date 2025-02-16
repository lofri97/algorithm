import java.io.*;
import java.util.*;

public class Main {
    static int mCnt = 0;
    static int zCnt = 0;
    static int pCnt = 0;

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
        System.out.println(mCnt);
        System.out.println(zCnt);
        System.out.println(pCnt);
    }

    static void dfs(int sy, int sx, int length, int[][] board) {
        boolean flag = true;
        int target = board[sy][sx];

        for (int y = sy; y < sy + length; y++) {
            for (int x = sx; x < sx + length; x++) {
                if (board[y][x] == target) continue;
                flag = false;
                break;
            }
        }

        if (flag) {
            if (target == -1) {
                mCnt++;
            } else if (target == 0) {
                zCnt++;
            } else {
                pCnt++;
            }
        } else {
            for (int i = 0; i < 3; i++) {
                dfs(sy + (length / 3 * i), sx, length / 3, board);
                dfs(sy + (length / 3 * i), sx + length / 3, length / 3, board);
                dfs(sy + (length / 3 * i), sx + length / 3 * 2, length / 3, board);
            }
        }
    }
}