import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> primes = getPrimes(n);

        if (primes.size() == 0) {
            System.out.println(0);
            return;
        }

        int l = 0;
        int r = 0;
        int sum = primes.get(0);

        int answer = 0;

        while (l <= r) {
            if (sum == n) {
                answer++;
                sum -= primes.get(l);
                l++;
            } else if (sum < n) {
                r++;
                if (r == primes.size()) break;
                sum += primes.get(r);
            } else {
                sum -= primes.get(l);
                l++;
            }
        }
        System.out.println(answer);
    }

    static List<Integer> getPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);

        for (int i = 2; i <= n; i++) {
            if (!isPrime[i]) continue;
            isPrime[i] = true;
            primes.add(i);

            for (int j = i + i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return primes;
    }
}