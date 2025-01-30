import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        PriorityQueue<Integer> pq = new PriorityQueue<>((v1, v2) -> v2 - v1);

        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            String[] sArr = br.readLine().split(" ");

            if (sArr.length == 1) {
                if (pq.isEmpty()) {
                    result.append(-1);
                } else {
                    result.append(pq.remove());
                }
                result.append("\n");
            } else {
                for (int i = 1; i < sArr.length; i++) {
                    pq.add(Integer.parseInt(sArr[i]));
                }
            }
        }
        System.out.println(result);
    }
}