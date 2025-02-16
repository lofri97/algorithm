import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split("");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(arr[j]);
            }
        }
        System.out.println(dfs(0, 0, n, board));
    }

    static String dfs(int sy, int sx, int length, int[][] board) {
        boolean flag = true;
        int target = board[sy][sx];
        for (int y = sy; y < sy + length; y++) {
            for (int x = sx; x < sx + length; x++) {
                if (target == board[y][x]) continue;
                flag = false;
                break;
            }
        }

        if (flag) {
            return String.valueOf(target);
        } else {
            return String.format("(%s%s%s%s)",
                    dfs(sy, sx, length / 2, board),
                    dfs(sy, sx + length / 2, length / 2, board),
                    dfs(sy + length / 2, sx, length / 2, board),
                    dfs(sy + length / 2, sx + length / 2, length / 2, board)
                    );
        }
    }
}