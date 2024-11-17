import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            boolean[] b = new boolean[10];
            for (char c : br.readLine().toCharArray()) {
                b[c-'0'] = true;
            }
            int cnt = 0;

            for (boolean value : b) {
                if (value) cnt++;
            }
            sb.append(String.format("#%d %d\n", t+1, cnt));
        }
        System.out.println(sb);
    }
}