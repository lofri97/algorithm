import java.io.*;
import java.util.*;

public class Main {
    static int max = Integer.MIN_VALUE;
    static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] operator = new int[4];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        dfs(arr, operator, 0, arr[0]);

        System.out.println(max);
        System.out.println(min);
    }

    static void dfs(int[] arr, int[] operator, int idx, int result) {
        if (idx == arr.length - 1) {
            max = Math.max(max, result);
            min = Math.min(min, result);
            return;
        }

        for (int op = 0; op < operator.length; op++) {
            if (operator[op] == 0) continue;
            operator[op]--;
            dfs(arr, operator, idx + 1, calc(result, arr[idx + 1], op));
            operator[op]++;
        }
    }

    static int calc(int a, int b, int op) {
        int result = 0;
        switch (op) {
            case 0:
                result = a + b;
                break;
            case 1:
                result = a - b;
                break;
            case 2:
                result = a * b;
                break;
            case 3:
                result = a / b;
                break;
        }
        return result;
    }
}