import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 2; n != 0 && i <= n; i++) {
            while (n % i == 0) {
                sb.append(String.format("%d\n", i));
                n /= i;
            }
        }
        System.out.println(sb);
    }
}