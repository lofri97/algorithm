import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[m];

        int sum = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            sum = (sum + Integer.parseInt(st.nextToken())) % m;
            arr[sum]++;
        }

        long cnt = arr[0];
        for (int i = 0; i < m; i++) {
            cnt += (long) arr[i] * (arr[i] - 1) / 2;
        }
        System.out.println(cnt);
    }
}