import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int sum = 0;

            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n%i == 0) {
                    list.add(i);
                    sum += i;
                    if (i != n / i) {
                        list.add(n/i);
                        sum += n/i;
                    }
                }
            }

            if (sum + 1 != n) {
                System.out.printf("%d is NOT perfect.\n", n);
            } else {
                StringBuilder sb = new StringBuilder(String.format("%d = 1", n));

                Collections.sort(list);

                for (int l : list) {
                    sb.append(" + ");
                    sb.append(l);
                }
                System.out.println(sb);
            }
            list.clear();
        }
    }
}