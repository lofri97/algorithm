import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int t = 0; t < n; t++) {
            pq.add(Integer.parseInt(br.readLine()));
        }

        while (pq.size() != 1) {
            int val = pq.remove() + pq.remove();
            cnt += val;
            pq.add(val);
        }

        System.out.println(cnt);
    }
}