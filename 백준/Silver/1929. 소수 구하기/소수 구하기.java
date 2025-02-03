import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        prime[0] = prime[1] = false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (!prime[i]) continue;
            for (int j = i * i; j <= n; j += i) {
                prime[j] = false;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int i = m; i <= n; i++) {
            if (prime[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
