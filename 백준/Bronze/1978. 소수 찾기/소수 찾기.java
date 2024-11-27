import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        br.readLine();
        String[] input = br.readLine().split(" ");

        int answer = 0;
        for (String i : input) {
            if (isPrime(i)) answer++;
        }
        System.out.println(answer);
    }

    static boolean isPrime(String num) {
        int n = Integer.parseInt(num);
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