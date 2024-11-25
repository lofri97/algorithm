import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = Integer.MIN_VALUE;
        int maxY = 0, maxX = 0;
        for (int y = 0; y < 9; y++) {
            String[] row = br.readLine().split(" ");

            for (int x = 0; x < 9; x++) {
                if (max < Integer.parseInt(row[x])) {
                    max = Integer.parseInt(row[x]);
                    maxX = x + 1;
                    maxY = y + 1;
                }
            }
        }
        System.out.printf("%d\n%d %d", max, maxY, maxX);
    }
}