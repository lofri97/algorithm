import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            map1.put(i + 1, name);
            map2.put(name, i + 1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String input = br.readLine();

            if (Character.isDigit(input.charAt(0))) {
                sb.append(map1.get(Integer.parseInt(input)));
            } else {
                sb.append(map2.get(input));
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
