import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());

        for (int t = 0; t < times; t++) {
            int n = Integer.parseInt(br.readLine());

            int a = 0, b = 0, c = 0, d = 0, e = 0;

            while (n % 2 == 0) {
                a++;
                n /= 2;
            }

            while (n % 3 == 0) {
                b++;
                n /= 3;
            }

            while (n % 5 == 0) {
                c++;
                n /= 5;
            }

            while (n % 7 == 0) {
                d ++;
                n /= 7;
            }

            while (n % 11 == 0) {
                e++;
                n /= 11;
            }
            System.out.printf("#%d %d %d %d %d %d\n", t + 1, a, b, c, d, e);
        }
    }
}
