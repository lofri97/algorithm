import java.io.*;
import java.util.*;

public class Main {
    static int result = Integer.MAX_VALUE;
    static int sum;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j];
            }
        }

        dfs(arr, 0, new HashSet<>());
        System.out.println(result);
    }

    static void dfs(int[][] arr, int idx, Set<Integer> set) {
        if (set.size() == arr.length / 2) {
            result = Math.min(result, calc(arr, set));
            return;
        }

        for (int i = idx; i < arr.length; i++) {
            if (set.contains(i)) continue;
            set.add(i);
            dfs(arr, i + 1, set);
            set.remove(Integer.valueOf(i));
        }
    }

    static int calc(int[][] arr, Set<Integer> set) {
        int r1 = 0;
        int r2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (set.contains(i) && set.contains(j)) {
                    r1 += arr[i][j];
                } else if (!set.contains(i) && !set.contains(j)) {
                    r2 += arr[i][j];
                }
            }
        }
        return Math.abs(r1 - r2);
    }
}