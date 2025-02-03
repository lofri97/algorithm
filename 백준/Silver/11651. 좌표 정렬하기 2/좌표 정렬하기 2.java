import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split(" ");
            arr[i] = new int[] {Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1])};
        }

        Arrays.sort(arr, (v1, v2) -> v1[1] == v2[1] ? v1[0] - v2[0] : v1[1] - v2[1]);

        StringBuilder sb = new StringBuilder();
        for (int[] a : arr) {
            sb.append(a[0]).append(" ").append(a[1]).append("\n");
        }
        System.out.println(sb);
    }
}
