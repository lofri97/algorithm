import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        int answer = sum;

        for (int i = k; i < n; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            answer = Math.max(answer, sum);
        }
        System.out.println(answer);
    }
}