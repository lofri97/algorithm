import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            int change = Integer.parseInt(br.readLine());

            int qNum = change / 25;
            change %= 25;
            int dNum = change / 10;
            change %= 10;
            int nNum = change / 5;
            change %= 5;
            int pNum = change;
            System.out.printf("%d %d %d %d\n", qNum, dNum, nNum, pNum);
        }
    }
}