import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][2];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < n; i++) {
            arr[i] = new int[] { Integer.parseInt(st.nextToken()), i};
        }
        
        Arrays.sort(arr, (v1, v2) -> v1[0] - v2[0]);
        
        int prev = arr[0][0];
        int cnt = 0;
        int[] answer = new int[n];
        for (int[] a : arr) {
            if (prev != a[0]) {
                cnt++;
            }
            answer[a[1]] = cnt;
            prev = a[0];
        }
        
        StringBuilder sb = new StringBuilder();
        for (int a : answer) {
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}
