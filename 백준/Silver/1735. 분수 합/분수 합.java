import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st.nextToken());
        int a2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b1 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int v1 = a1 * b2 + b1 * a2;
        int v2 = a2 * b2;

        while (true) {
            int gcd = getGCD(v1, v2);
            if (gcd == 1) {
                break;
            }
            v1 /= gcd;
            v2 /= gcd;
        }
        System.out.printf("%d %d", v1, v2);
    }

    static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
