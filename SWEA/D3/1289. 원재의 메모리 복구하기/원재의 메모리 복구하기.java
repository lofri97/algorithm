import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            String question = br.readLine();
            int index = question.indexOf('1');

            int cnt = 1;
            char prev = '1';
            for (int i = index + 1; i < question.length(); i++) {
                if (question.charAt(i) == prev) continue;
                prev = question.charAt(i);
                cnt++;
            }
            sb.append(String.format("#%d %d\n", t+1, cnt));
        }
        System.out.println(sb);
    }
}