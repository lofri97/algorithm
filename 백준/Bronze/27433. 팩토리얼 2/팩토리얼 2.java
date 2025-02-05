import java.io.*;
import java.util.*;

public class Main {
    private static long[] dp;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        dp = new long[n + 1];
        dp[0] = 1;

        System.out.println(factorial(n));
    }

    static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (dp[n-1] != 0) {
            dp[n] = n * dp[n-1];
            return dp[n];
        }
        return n * factorial(n - 1);
    }
}