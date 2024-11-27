import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int tmp = 1;

        while (n != 0) {
            tmp *= 2;
            n--;
        }
        System.out.println((int) Math.pow(tmp + 1, 2));
    }
}