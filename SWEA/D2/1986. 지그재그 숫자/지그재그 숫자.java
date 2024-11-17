import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            System.out.printf("#%d %d\n", t+1, calc(Integer.parseInt(br.readLine())));
        }
    }

    static int calc(int n) {
        if (n == 1) return 1;
        if (n % 2 == 0) {
            return calc(n-1) - n;
        } else {
            return calc(n-1) + n;
        }
    }
}