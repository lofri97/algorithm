import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> queue1 = new PriorityQueue<>((v1, v2) -> v2 - v1);
        Queue<Integer> queue2 = new PriorityQueue<>();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i<n; i++) {
            int tmp = Integer.parseInt(br.readLine());

            if (queue1.size() == queue2.size()) {
                queue1.add(tmp);
            } else {
                queue2.add(tmp);
            }

            if (queue1.size() > 0 && queue2.size() > 0 && queue1.peek() > queue2.peek()) {
                int tmp1 = queue1.poll();
                int tmp2 = queue2.poll();
                queue1.add(tmp2);
                queue2.add(tmp1);
            }

            sb.append(queue1.peek()).append("\n");
        }
        System.out.println(sb);
    }
}