import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[][] map = new boolean[100][100];

        int tt = Integer.parseInt(br.readLine());

        for (int t = 0; t < tt; t++) {
            String[] inputs = br.readLine().split(" ");
            int xs = Integer.parseInt(inputs[0]);
            int ys = Integer.parseInt(inputs[1]);

            for (int y = ys; y <ys + 10; y++) {
                for (int x = xs; x < xs + 10; x++) {
                    map[y][x] = true;
                }
            }
        }

        int answer = 0;

        for (int y = 0; y < 100; y++) {
            for (int x = 0; x < 100; x++) {
                if (map[y][x]) answer++;
            }
        }

        System.out.println(answer);
    }
}