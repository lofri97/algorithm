import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int times = Integer.parseInt(br.readLine());

        for (int t = 0; t < times; t++) {
            String[] sArr = br.readLine().split(" ");
            int n = Integer.parseInt(sArr[0]);
            int idx = Integer.parseInt(sArr[1]);

            Queue<int[]> queue = new LinkedList<>();

            sArr = br.readLine().split(" ");
            for (int i = 0; i < n; i++) {
                queue.offer(new int[] {Integer.parseInt(sArr[i]), i});
            }

            int cnt = 1;
            while (!queue.isEmpty()) {
                int[] doc = queue.remove();

                boolean isMax = true;

                for (int[] q : queue) {
                    if (doc[0] < q[0]) {
                        isMax = false;
                        break;
                    }
                }

                if (isMax) {
                    if (doc[1] == idx) {
                        sb.append(cnt).append("\n");
                        break;
                    }
                    cnt++;
                } else {
                    queue.add(doc);
                }
            }
        }

        System.out.println(sb);
    }
}
