import java.util.*;

class Solution {
    private static final int[] DOWN = new int[] {1, 0};
    private static final int[] UP = new int[] {-1, -1};
    private static final int[] RIGHT = new int[] {0, 1};

    public int[] solution(int n) {
        int[][] answer = new int[n][n];

        int y = 0;
        int x = 0;
        int v = 1;
        answer[0][0] = 1;
        while (true) {
            int sy = y;
            int sx = x;
            while (canMove(y, x, DOWN, answer)) {
                y += DOWN[0];
                x += DOWN[1];
                answer[y][x] = ++v;
            }

            while (canMove(y, x, RIGHT, answer)) {
                y += RIGHT[0];
                x += RIGHT[1];
                answer[y][x] = ++v;
            }

            while (canMove(y, x, UP, answer)) {
                y += UP[0];
                x += UP[1];
                answer[y][x] = ++v;
            }

            if (sy == y && sx == x) {
                break;
            }
        }

        int idx = 0;
        int[] result = new int[v];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                result[idx++] = answer[i][j];
            }
        }

        return result;
    }

    boolean canMove(int y, int x, int[] move, int[][] answer) {
        int ny = y + move[0];
        int nx = x + move[1];

        return (
                0 <= ny &&
                ny < answer.length &&
                0 <= nx &&
                nx < y + 1 &&
                answer[ny][nx] == 0
        );
    }
}