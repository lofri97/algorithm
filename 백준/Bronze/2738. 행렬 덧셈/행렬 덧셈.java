import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");

        int n = Integer.parseInt(inputs[0]);
        int m = Integer.parseInt(inputs[1]);

        int[][][] arr = new int[2][n][m];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                String[] iArr = br.readLine().split(" ");
                for (int k = 0; k < m; k++) {
                    arr[i][j][k] = Integer.parseInt(iArr[k]);
                }
            }
        }

        int[][] answer = new int[n][m];

        StringBuilder sb = new StringBuilder();
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < m; x++) {
                answer[y][x] = arr[0][y][x] + arr[1][y][x];
                sb.append(answer[y][x]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}