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

            int upMax = 0;
            int downMax = 0;


            for (int i = 1; i < n; i++) {
                if (arr[i-1] < arr[i]) {
                    upMax = Math.max(upMax, arr[i] - arr[i-1]);
                } else {
                    downMax = Math.max(downMax, arr[i-1] - arr[i]);
                }
            }
            System.out.printf("#%d %d %d\n", t+1, upMax, downMax);
        }
    }
}