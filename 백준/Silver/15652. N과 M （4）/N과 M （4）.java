import java.io.*;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        dfs(n, m, 1, 0, new int[m]);
        System.out.println(sb);
    }

    static void dfs(int n, int r, int s, int depth, int[] out) {
        if (depth == r) {
            for (int o : out) {
                sb.append(o).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = s; i <= n; i++) {
            out[depth] = i;
            dfs(n, r,  i, depth + 1, out);
        }
    }
}