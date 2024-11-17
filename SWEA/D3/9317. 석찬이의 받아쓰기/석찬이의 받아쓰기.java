import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            int n = Integer.parseInt(br.readLine());
            char[] question = br.readLine().toCharArray();
            char[] answer = br.readLine().toCharArray();
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (question[i] == answer[i]) count++;
            }
            System.out.printf("#%d %d\n", t+1, count);
        }
    }
}