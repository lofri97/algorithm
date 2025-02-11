import java.io.*;
import java.util.*;

public class Main {
    private final static int R = 0;
    private final static int G = 1;
    private final static int B = 2;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][3];

        StringTokenizer st = new StringTokenizer(br.readLine());
        dp[0][0] = Integer.parseInt(st.nextToken());
        dp[0][1] = Integer.parseInt(st.nextToken());
        dp[0][2] = Integer.parseInt(st.nextToken());

        for (int i = 1; i < n; i++) {
            String[] sArr = br.readLine().split(" ");
            int r = Integer.parseInt(sArr[0]);
            int g = Integer.parseInt(sArr[1]);
            int b = Integer.parseInt(sArr[2]);
            dp[i][R] = Math.min(dp[i-1][G], dp[i-1][B]) + r;
            dp[i][G] = Math.min(dp[i-1][R], dp[i-1][B]) + g;
            dp[i][B] = Math.min(dp[i-1][R], dp[i-1][G]) + b;
        }

        System.out.println(Math.min(dp[n-1][R], Math.min(dp[n-1][G], dp[n-1][B])));
    }
}