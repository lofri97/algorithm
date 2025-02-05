import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Deque<String> deque = new ArrayDeque<>();

        String[] typeArr = br.readLine().split(" ");
        String[] initArr = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            if (typeArr[i].equals("1")) continue;
            deque.addFirst(initArr[i]);
        }

        int m = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            deque.add(st.nextToken());
            sb.append(deque.removeFirst()).append(" ");
        }
        System.out.println(sb);
    }
}
