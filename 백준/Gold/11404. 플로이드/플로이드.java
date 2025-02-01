import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());
        int times = Integer.parseInt(br.readLine());

        int[][] dist = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (i != j) dist[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int time = 0; time < times; time++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int f = Integer.parseInt(st.nextToken()) - 1;
            int t = Integer.parseInt(st.nextToken()) - 1;
            int w = Integer.parseInt(st.nextToken());

            dist[f][t] = Math.min(dist[f][t], w);
        }

        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if (dist[i][k] != Integer.MAX_VALUE && dist[k][j] != Integer.MAX_VALUE) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                sb.append(dist[i][j] == Integer.MAX_VALUE ? 0 : dist[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
