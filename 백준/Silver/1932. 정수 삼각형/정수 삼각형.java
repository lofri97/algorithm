import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for (int y = 0; y < n; y++) {
            String[] sArr = br.readLine().split(" ");

            for (int x = 0; x < sArr.length; x++) {
                arr[y][x] = Integer.parseInt(sArr[x]);
            }
        }

        for (int y = n - 2; y >= 0; y--) {
            for (int x = 0; x <= y; x++) {
                arr[y][x] += Math.max(arr[y+1][x], arr[y+1][x+1]);
            }
        }
        System.out.println(arr[0][0]);
    }
}