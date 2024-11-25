import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < i; j++) {
                sb.append("*");
            }

            for (int j = 0; j < i - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }


        for (int i = n -1; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < i; j++) {
                sb.append("*");
            }

            for (int j = 0; j < i - 1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}