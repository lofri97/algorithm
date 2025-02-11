import java.io.*;

public class Main {
    static int[][][] dp = new int[21][21][21];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        dp[0][0][0] = 1;

        while (true) {
            String[] sArr = br.readLine().split(" ");
            int a = Integer.parseInt(sArr[0]);
            int b = Integer.parseInt(sArr[1]);
            int c = Integer.parseInt(sArr[2]);

            if (a == -1 && b == -1 && c == -1) {
                break;
            }

            sb.append(String.format("w(%d, %d, %d) = %d\n", a, b, c, w(a,b,c)));
        }
        System.out.println(sb);
    }

    static int w(int a, int b, int c) {
        if((a >= 0 && a <= 20 && b >= 0 && b <= 20 && c >= 0 && c <= 20) &&
            dp[a][b][c] != 0) {
            return dp[a][b][c];
        }

        if(a <= 0 || b <= 0 || c <= 0) {
            return 1;
        }

        if(a > 20 || b > 20 || c > 20) {
            return dp[20][20][20] = w(20, 20, 20);
        }

        if(a < b && b < c) {
            return dp[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c);
        }

        return dp[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1);
    }
}