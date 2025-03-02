import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][];
        int[] dp = new int[n]; // dp[i] 는 dp[i] 에서의 최대 전깃줄 숫자.

        for (int i = 0; i < n; i++) {
            String[] sArr = br.readLine().split(" ");
            int from = Integer.parseInt(sArr[0]);
            int to = Integer.parseInt(sArr[1]);
            arr[i] = new int[] {from, to};
        }

        Arrays.sort(arr, (v1, v2) -> v1[1] - v2[1]);

        int max = 0;
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[j][0] < arr[i][0]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(dp[i], max);
        }
        System.out.println(n - max);
    }
}
