import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);
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