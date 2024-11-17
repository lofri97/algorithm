import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

            int cnt = 0;
            if (arr[0] > 484) cnt -= 5;
            else if (arr[0] > 121) cnt -= 4;
            else if (arr[0] > 9) cnt -= 3;
            else if (arr[0] > 4) cnt -= 2;
            else if (arr[0] > 1) cnt -= 1;

            if (arr[1] >= 484) cnt += 5;
            else if (arr[1] >= 121) cnt += 4;
            else if (arr[1] >= 9) cnt += 3;
            else if (arr[1] >= 4) cnt += 2;
            else if (arr[1] >= 1) cnt += 1;

            sb.append(String.format("#%d %d\n", t+1, cnt));
        }
        System.out.println(sb);
    }
}