import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        boolean[] visited = new boolean[n + 1];
        permutation(n, m, 1, 0, visited, new StringBuilder());

    }

    static void permutation(int n, int r, int s, int depth, boolean[] visited, StringBuilder sb) {
        if (depth == r) {
            System.out.println(sb);
            return;
        }

        for (int i = s; i <= n; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            permutation(n, r, i + 1,depth + 1, visited, sb.append(i).append(" "));
            sb.delete(sb.length() - 2, sb.length());
            visited[i] = false;
        }
    }
}