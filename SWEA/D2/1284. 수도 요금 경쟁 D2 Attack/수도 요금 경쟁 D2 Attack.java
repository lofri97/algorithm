import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int p = arr[0];
            int q = arr[1];
            int r = arr[2];
            int s = arr[3];
            int w = arr[4];

            int result = q;
            if (w > r) result = q + (w-r) * s;

            result = Math.min(p * w, result);

            System.out.printf("#%d %d\n", t+1, result);
        }
    }
}