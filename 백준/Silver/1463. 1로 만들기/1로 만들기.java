import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] dp = new int[n + 1];

        int idx = 1;
        for (int i = n - 1; i >= 1; i--) {
            dp[i] = idx++;
        }

        for (int i = n - 1; i >= 1; i--) {
            // n / 3 case
            if (i * 3 <= n) dp[i] = Math.min(dp[i], dp[i * 3] + 1);
            // n / 2 case
            if (i * 2 <= n) dp[i] = Math.min(dp[i], dp[i * 2] + 1);
            // n - 1 case
            dp[i] = Math.min(dp[i], dp[i + 1] + 1);
        }

        System.out.println(dp[1]);
    }
}