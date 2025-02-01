import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());

        int s = Integer.parseInt(br.readLine());
        Map<Integer, List<int[]>> graph = new HashMap<>();

        for (int i = 0; i < e; i++) {
            st = new StringTokenizer(br.readLine());
            int node = Integer.parseInt(st.nextToken());
            List<int[]> edges = graph.getOrDefault(node, new ArrayList<>());
            edges.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
            graph.put(node, edges);
        }

        int[] dist = new int[v + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((v1, v2) -> v1[1] - v2[1]);

        pq.offer(new int[] {s, 0});

        while (!pq.isEmpty()) {
            int[] cur = pq.remove();

            int curDist = cur[1];
            int curNode = cur[0];

            for (int[] edge : graph.getOrDefault(curNode, new ArrayList<>())) {
                int nextNode = edge[0];
                int nextDist = curDist + edge[1];

                if (dist[nextNode] > nextDist) {
                    dist[nextNode] = nextDist;
                    pq.offer(new int[] {nextNode, nextDist});
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
