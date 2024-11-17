import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            if (arr[0] > 9 || arr[1] > 9) {
                System.out.printf("#%d %d\n", t+1, -1);
            } else {
                System.out.printf("#%d %d\n", t+1, arr[0] * arr[1]);
            }
        }
    }
}