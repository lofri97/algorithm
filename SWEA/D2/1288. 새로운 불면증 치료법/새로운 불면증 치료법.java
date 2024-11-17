import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            boolean[] arr = new boolean[10];

            int n = Integer.parseInt(br.readLine());
            int i = 0;

            while (!check(arr)) {
                int tmp = n * ++i;
                for (char c : String.valueOf(tmp).toCharArray()) {
                    arr[c-'0'] = true;
                }
            }
            System.out.printf("#%d %d\n", t+1, n*i);
        }
    }

    static boolean check(boolean[] arr) {
        for (boolean a : arr) {
            if (!a) {
                return false;
            }
        }
        return true;
    }
}