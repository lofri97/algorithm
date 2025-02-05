import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("<");

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Queue<Integer> queue = new LinkedList<>();

        IntStream.range(1, n + 1).boxed().forEach(queue::add);

        int cnt = 0;
        while (!queue.isEmpty()) {
            int num = queue.remove();

            if (++cnt == k) {
                sb.append(num).append(", ");
                cnt = 0;
                continue;
            }
            queue.add(num);
        }

        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.println(sb);
    }
}
