import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static int answer = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] board = new int[n];
        boolean[] visited = new boolean[n];
        dfs(n, 0, board, visited);

        System.out.println(answer);
    }

    static void dfs(int n, int depth, int[] board, boolean[] visited) {
        if (depth == n) {
            answer++;
            return;
        }

        for (int x = 0; x < n; x++) {
            boolean flag = true;
            for (int y = 0; y < depth; y++) {
                if (Math.abs(board[y] - x) == depth - y) {
                    flag = false;
                    break;
                }
            }
            if (!flag) continue;
            if (visited[x]) continue;
            board[depth] = x;
            visited[x] = true;
            dfs(n, depth + 1, board, visited);
            visited[x] = false;
        }
    }
}