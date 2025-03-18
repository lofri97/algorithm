import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Set<Integer>> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());
        int[] parents = new int[n+1];

        for (int i = 0; i < n - 1; i++) {
            String[] sArr = br.readLine().split(" ");
            int node1 = Integer.parseInt(sArr[0]);
            int node2 = Integer.parseInt(sArr[1]);

            Set<Integer> node1Links = map.getOrDefault(node1, new HashSet<>());
            Set<Integer> node2Links = map.getOrDefault(node2, new HashSet<>());

            node1Links.add(node2);
            node2Links.add(node1);

            map.put(node1, node1Links);
            map.put(node2, node2Links);
        }

        recursion(1, map, parents);

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            sb.append(parents[i]).append("\n");
        }
        System.out.println(sb);
    }

    static void recursion(int node, Map<Integer, Set<Integer>> map, int[] parents) {
        if (map.get(node).isEmpty()) return;

        for (Integer key : map.get(node)) {
            if (parents[key] != 0) continue;
            parents[key] = node;
            recursion(key, map, parents);
        }
    }
}