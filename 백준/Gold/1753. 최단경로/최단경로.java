import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(br.readLine());

        Map<Integer, List<int[]>> graph = new HashMap<>();
        int[] dist = new int[v + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[k] = 0;

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());

            List<int[]> edges = graph.getOrDefault(from, new ArrayList<>());
            edges.add(new int[] {to, weight});
            graph.put(from, edges);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((v1,v2)->v1[1]-v2[1]);
        pq.add(new int[] {k, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.remove();

            for (int[] edge : graph.getOrDefault(cur[0], new ArrayList<>())) {
                if (dist[edge[0]] > cur[1] + edge[1]) {
                    dist[edge[0]] = cur[1] + edge[1];
                    pq.offer(new int[] {edge[0], cur[1] + edge[1]});
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= v; i++) {
            sb.append(dist[i] == Integer.MAX_VALUE ? "INF" : dist[i]).append("\n");
        }
        System.out.println(sb);
    }
}