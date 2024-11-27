import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int from = Integer.parseInt(br.readLine());
        int to = Integer.parseInt(br.readLine());

        int first = -1;
        int sum = 0;
        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                if (first == -1) {
                    first = i;
                }
                sum += i;
            }
        }
        if (first != -1) {
            System.out.println(sum);
        }
        System.out.println(first);
    }

    static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else if (n % 2 == 0) {
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}