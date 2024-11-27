import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (--k == 0) {
                    answer = i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}