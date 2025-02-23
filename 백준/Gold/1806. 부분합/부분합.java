import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = Integer.MAX_VALUE;

        int left = 0;
        int right = 0;
        int sum = arr[0];

        while (left < n) {
            if (sum >= s) {
                answer = Math.min(answer, right - left + 1);
            }

            if (left == right) {
                if (right == n - 1) {
                    break;
                }
                right++;
                sum += arr[right];
                continue;
            }

            if (sum <= s && right < n-1) {
                right++;
                sum += arr[right];
            } else {
                sum -= arr[left];
                left++;
            }
        }

        System.out.println(answer == Integer.MAX_VALUE ? 0 : answer);
    }
}