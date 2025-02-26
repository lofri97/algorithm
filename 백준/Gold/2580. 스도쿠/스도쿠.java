import java.io.*;
import java.util.*;

public class Main {

    static boolean flag = false;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] board = new int[9][9];

        for (int y = 0; y < 9; y++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int x = 0; x < 9; x++) {
                board[y][x] = Integer.parseInt(st.nextToken());
            }
        }

        recursion(0, board);

        StringBuilder sb = new StringBuilder();

        for (int[] row : board) {
            for (int point : row) {
                sb.append(point).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    static void recursion(int pos, int[][] board) {
        if (flag) return;
        if (pos == 81) {
            flag = true;
            return;
        }

        int y = pos / 9;
        int x = pos % 9;

        if (board[y][x] != 0) {
            recursion(pos + 1, board);
            return;
        }

        for (int i = 1; i <= 9; i++) {
            if (!isAvail(y, x, board, i)) continue;
            board[y][x] = i;
            recursion(pos + 1, board);
            if (flag) return;
            board[y][x] = 0;
        }
    }

    static boolean isAvail(int y, int x, int[][] board, int target) {
        for (int ny = 0; ny < 9; ny++) {
            if (board[ny][x] == target) return false;
        }

        for (int nx = 0; nx < 9; nx++) {
            if (board[y][nx] == target) return false;
        }

        for (int ny = y / 3 * 3; ny < y / 3 * 3 + 3; ny++) {
            for (int nx = x / 3 * 3; nx < x / 3 * 3 + 3; nx++) {
                if (board[ny][nx] == target) return false;
            }
        }
        return true;
    }
}