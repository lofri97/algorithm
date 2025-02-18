import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n = Integer.parseInt(br.readLine());
        int[][] alpha = new int[str.length()]['z'-'a' + 1];

        alpha[0][str.charAt(0) - 'a'] = 1;

        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < 'z'-'a' + 1; j++) {
                alpha[i][j] = alpha[i-1][j];
            }
            alpha[i][str.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            char c = arr[0].charAt(0);
            int s = Integer.parseInt(arr[1]);
            int e = Integer.parseInt(arr[2]);

            if (s == 0) {
                sb.append(alpha[e][c - 'a']);
            } else {
                sb.append(alpha[e][c - 'a'] - alpha[s-1][c - 'a']);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}