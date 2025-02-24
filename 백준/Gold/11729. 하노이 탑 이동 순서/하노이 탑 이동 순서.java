import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append((int) Math.pow(2, n) - 1).append("\n");
        System.out.println(hanoi(n, 1, 2, 3, sb));
    }

    static StringBuilder hanoi(int n, int start, int mid, int to, StringBuilder sb) {
        if (n == 1) {
            sb.append(start).append(" ").append(to).append("\n");
            return sb;
        }

        hanoi(n-1, start, to, mid, sb);
        sb.append(start).append(" ").append(to).append("\n");
        hanoi(n-1, mid, start, to, sb);
        return sb;
    }
}