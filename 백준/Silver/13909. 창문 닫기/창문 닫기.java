import java.io.*;

public class Main {
    private static final int MAX = 1_000_000;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int cnt = 0;
        for (int i = 1; i * i <= n; i++) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
