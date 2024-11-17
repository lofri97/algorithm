import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            String question = br.readLine();

            int a = 1;
            int b = 1;

            for (char c : question.toCharArray()) {
                if (c == 'L') {
                    b = a + b;
                } else {
                    a = a + b;
                }
            }
            sb.append(String.format("#%d %d %d\n", t+1, a, b));
        }
        System.out.println(sb);
    }
}