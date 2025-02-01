import java.io.*;
import java.util.*;

public class Main {
    static int[] unf;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        unf = new int[v + 1];

        for (int i = 0; i <= v; i++) {
            unf[i] = i;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((v1, v2) -> {
            return v1[2] - v2[2];
        });

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            pq.add(new int[] {from, to, weight});
        }

        int answer = 0;
        while (!pq.isEmpty()) {
            int[] edge = pq.remove();

            if (find(edge[0]) != find(edge[1])) {
                union(edge[0], edge[1]);
                answer += edge[2];
            }
        }

        System.out.println(answer);
    }

    static void union(int a, int b) {
        int pa = find(a);
        int pb = find(b);

        if (pa != pb) {
            unf[pa] = pb;
        }
    }

    static int find(int a) {
        if (unf[a] == a) {
            return a;
        }
        return unf[a] = find(unf[a]);
    }
}
