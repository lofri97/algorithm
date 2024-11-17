import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int sum = 0;
            for (int a : arr) {
                sum += a;
            }
            int cnt = 0;
            for (int a : arr) {
                if (sum / n >= a) cnt++;
            }
            System.out.printf("#%d %d\n", t + 1, cnt);
        }
    }
}