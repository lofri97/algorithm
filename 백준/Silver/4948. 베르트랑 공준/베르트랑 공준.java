import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] prime = new boolean[123456 * 2 + 1];
        int max = 1;
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n == 0) break;

            if (max < n) {
                for (int i = max; i <= Math.sqrt(2 * n); i++) {
                    if (!prime[i]) continue;
                    for (int j = i * i; j <= 2 * n; j += i) {
                        prime[j] = false;
                    }
                }
            }

            int cnt = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (prime[i]) cnt++;
            }
            sb.append(cnt).append("\n");
        }
        System.out.println(sb);
    }
}
