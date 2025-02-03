import java.io.*;
import java.util.*;

public class Main {
    private static final int MAX = 1_000_000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] prime = new boolean[MAX + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        for (int i = 2; i <= Math.sqrt(MAX); i++) {
            if (!prime[i]) continue;

            for (int j = i * i; j <= MAX; j += i) {
                prime[j] = false;
            }
        }

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int cnt = 0;
            int n = Integer.parseInt(br.readLine());

            for (int j = 2; j <= n / 2; j++) {
                if (prime[j] && prime[n - j]) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
