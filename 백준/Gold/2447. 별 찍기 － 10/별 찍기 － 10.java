import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] board = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '*');
        }

        dfs(n, 0, 0, board);

        StringBuilder sb = new StringBuilder();
        for (char[] row : board) {
            sb.append(new String(row)).append("\n");
        }
        System.out.println(sb);
    }

    static void dfs(int n, int y, int x, char[][] board) {
        for (int ty = y + (n/3); ty < y + (n/3) * 2; ty++) {
            for (int tx = x + (n/3); tx < x + (n/3) * 2; tx++) {
                board[ty][tx] = ' ';
            }
        }

        if (n == 3) return;
        for (int yi = 0; yi < 3; yi++) {
            for (int xi = 0; xi < 3; xi++) {
                if (yi == 1 && xi == 1) continue;
                dfs(n/3, y + (n / 3) * yi, x + (n / 3) * xi, board);
            }
        }
    }
}