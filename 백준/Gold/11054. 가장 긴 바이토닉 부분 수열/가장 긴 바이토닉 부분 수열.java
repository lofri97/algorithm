import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        int[] ascDp = new int[n];
        int[] descDp = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < n; i++) {
            ascDp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[i] && ascDp[j] + 1 > ascDp[i]) {
                    ascDp[i] = ascDp[j] + 1;
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            descDp[i] = 1;

            for (int j = n - 1; j > i; j--) {
                if (arr[j] < arr[i] && descDp[j] + 1 > descDp[i]) {
                    descDp[i] = descDp[j] + 1;
                }
            }
        }

        int answer = 0;

        for (int i = 0; i < n; i++) {
            answer = Math.max(answer, ascDp[i] + descDp[i] - 1);
        }
        System.out.println(answer);
    }
}