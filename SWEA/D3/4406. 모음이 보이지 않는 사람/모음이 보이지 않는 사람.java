import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            String str = br.readLine().replaceAll("a|e|i|o|u", "");
            System.out.printf("#%d %s\n", t+1, str);
        }
    }
}