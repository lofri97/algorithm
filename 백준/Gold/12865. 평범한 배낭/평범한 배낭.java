import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            arr[i] = new int[] {w, v};
        }

        int[] dp = new int[k + 1]; // dp[i] 는 무게가 i 일 때 최대 값
        for (int i = 0; i < n; i++) {
            for (int w = k; w > 0; w--) {
                if (arr[i][0] <= w) {
                    dp[w] = Math.max(dp[w], dp[w-arr[i][0]] + arr[i][1]);
                }
            }
        }
        System.out.println(dp[k]);
    }
}