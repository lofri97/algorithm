import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        int[] arr = new int[3];
        while (true) {
            String[] sArr = br.readLine().split(" ");
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(sArr[i]);
            }
            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) break;

            print(arr, sb);
        }
        System.out.println(sb);
    }

    static void print(int[] arr, StringBuilder sb) {
        Arrays.sort(arr);

        if (arr[2] >= arr[0] + arr[1]) {
            sb.append("Invalid");
        } else if (arr[0] == arr[1] && arr[1] == arr[2]) {
            sb.append("Equilateral");
        } else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[2] != arr[0]) {
            sb.append("Scalene");
        } else {
            sb.append("Isosceles");
        }

        sb.append("\n");
    }
}