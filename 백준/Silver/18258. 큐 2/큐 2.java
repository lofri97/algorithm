import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new LinkedList<>();
        while (n-- != 0) {
            String[] str = br.readLine().split(" ");

            switch (str[0]) {
                case "push" :
                    deque.add(Integer.parseInt(str[1]));
                    break;
                case "pop" :
                    if (deque.isEmpty()) sb.append(-1);
                    else sb.append(deque.removeFirst());
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if (deque.isEmpty()) sb.append(-1);
                    else sb.append(deque.peekFirst());
                    sb.append("\n");
                    break;
                case "back":
                    if (deque.isEmpty()) sb.append(-1);
                    else sb.append(deque.peekLast());
                    sb.append("\n");
            }
        }
        System.out.println(sb);
    }
}
