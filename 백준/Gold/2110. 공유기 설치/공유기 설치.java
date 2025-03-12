import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int left = 1;
        int right = 1_000_000_000;

        int result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            boolean flag = getFlag(mid, c, arr);

            if (flag) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(result);
    }

    static boolean getFlag(int val, int cnt, int[] arr) {
        cnt--;

        int sum = 0;
        for (int i = 1; i < arr.length && cnt != 0; i++) {
            sum += arr[i] - arr[i-1];
            if (sum >= val) {
                sum = 0;
                cnt--;
            }
        }
        return cnt == 0;
    }
}
