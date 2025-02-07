import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dfs(n, m, 0, new int[m]);
        System.out.println(sb);
    }

    static void dfs(int n, int r, int depth, int[] out) {
        if (depth == r) {
            for (int o : out) {
                sb.append(o).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            out[depth] = i;
            dfs(n, r, depth + 1, out);
        }
    }
}