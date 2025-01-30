import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(br.readLine());

            if (val == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.remove());
                }
            } else {
                pq.add(val);
            }
        }
    }
}