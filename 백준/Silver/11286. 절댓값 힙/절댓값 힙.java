import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>((v1, v2) -> {
            return Math.abs(v1) == Math.abs(v2) ? v1 - v2 : Math.abs(v1) - Math.abs(v2);
        });
        
        int n = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < n; t++) {
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