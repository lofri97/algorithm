import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, (v1, v2) -> {
            return v1.length() == v2.length() ? v1.compareTo(v2) : v1.length() - v2.length();
        });

        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
