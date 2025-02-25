import java.io.*;
import java.util.StringTokenizer;

public class Main {

    static int[] unf;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        unf = new int[n+1];

        for (int i = 0; i <= n; i++) {
            unf[i] = i;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());

            int type = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int pa = find(a);
            int pb = find(b);

            if (type == 1) {
                sb.append(pa == pb ? "YES" : "NO").append("\n");
            } else {
                if (pa != pb) {
                    unf[pb] = pa;
                }
            }
        }
        System.out.println(sb);
    }

    static int find(int a) {
        if (unf[a] == a) {
            return a;
        }
        return unf[a] = find(unf[a]);
    }
}