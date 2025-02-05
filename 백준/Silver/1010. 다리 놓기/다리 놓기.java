import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static final int MAX = 30;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(br.readLine());

        int[][] dp = new int[MAX][MAX];

        for (int i = 0; i < MAX; i++) {
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int n = 2; n < MAX; n++) {
            for (int r = 1; r < MAX; r++) {
                dp[n][r] = dp[n - 1][r - 1] + dp[n - 1][r];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < tt; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            sb.append(dp[n][r]).append("\n");
        }
        System.out.println(sb);
    }
}