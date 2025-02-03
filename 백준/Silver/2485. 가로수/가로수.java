import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 0; i < n - 1; i++) {
            gcd = getGCD(arr[i + 1] - arr[i], gcd);
        }
        System.out.println((arr[n-1] - arr[0]) / gcd - n + 1);
    }

    static int getGCD(int a, int b) {
        if (b == 0) return a;
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
