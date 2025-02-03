import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<String[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split(" ");
            list.add(new String[] {strArr[0], strArr[1]});
        }

        Collections.sort(list, (v1, v2) -> {
            return Integer.parseInt(v1[0]) - Integer.parseInt(v2[0]);
        });

        StringBuilder sb = new StringBuilder();
        for (String[] arr : list) {
            sb.append(arr[0]).append(" ").append(arr[1]).append("\n");
        }
        System.out.println(sb);
    }
}
