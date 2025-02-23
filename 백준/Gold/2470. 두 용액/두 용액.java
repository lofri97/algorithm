import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int left = 0;
        int right = n-1;

        int answer = Integer.MAX_VALUE;
        int lIdx = -1;
        int rIdx = -1;

        while (left < right) {
            int res = arr[left] + arr[right];

            if (answer > Math.abs(res)) {
                answer = Math.abs(res);
                lIdx = left;
                rIdx = right;
            }

            if (res < 0) {
                left++;
            } else if (res > 0) {
                right--;
            } else {
                break;
            }
        }

        System.out.println(arr[lIdx]);
        System.out.println(arr[rIdx]);
    }
}