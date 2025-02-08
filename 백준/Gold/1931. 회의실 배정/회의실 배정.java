import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        PriorityQueue<int[]> pq = new PriorityQueue<>((v1, v2) -> v1[1] == v2[1] ? v1[0] - v2[0] : v1[1] - v2[1]);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pq.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())});
        }

        int prev = 0;
        int cnt = 0;
        while (!pq.isEmpty()) {
            int[] cur = pq.remove();
            if (prev > cur[0]) continue;
            prev = cur[1];
            cnt++;
        }
        System.out.println(cnt);
    }
}