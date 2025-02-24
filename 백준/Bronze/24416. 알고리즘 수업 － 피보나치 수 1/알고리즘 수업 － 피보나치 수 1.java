import java.io.*;

public class Main {
    static int cnt1 = 0;
    static int cnt2 = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        fib1(n);
        fib2(n);
        System.out.printf("%d %d\n", cnt1 + 1, cnt2);
    }

    static int fib1(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        cnt1++;
        return fib1(n-1) + fib1(n-2);
    }

    static int fib2(int n) {
        int[] arr = new int[n + 1];
        arr[1] = arr[2] = 1;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            cnt2++;
        }
        return arr[n];
    }
}