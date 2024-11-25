import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] strings = new String[5][];

        int maxX = 0;
        for (int i = 0; i < 5; i++) {
            strings[i] = br.readLine().split("");
            maxX = Math.max(strings[i].length, maxX);

        }

        StringBuilder sb = new StringBuilder();

        for (int x = 0; x < maxX; x++) {
            for (int y = 0; y < 5; y++) {
                if (x >= strings[y].length) continue;
                sb.append(strings[y][x]);
            }
        }
        System.out.println(sb);
    }
}