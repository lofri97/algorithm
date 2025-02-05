import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Deque<int[]> deque = new ArrayDeque<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            deque.add(new int[] {Integer.parseInt(st.nextToken()), i + 1});
        }

        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            int[] balloon = deque.removeFirst();
            sb.append(balloon[1]).append(" ");

            if (deque.isEmpty()) break;

            int move = balloon[0];
            if (move > 0) {
                while (move != 1) {
                    move--;
                    deque.addLast(deque.removeFirst());
                }
            } else {
                while (move != 0) {
                    move++;
                    deque.addFirst(deque.removeLast());
                }
            }
        }
        System.out.println(sb);
    }
}
