import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                list.add(str);
            }
        }
        Collections.sort(list);
        StringBuilder sb = new StringBuilder(String.valueOf(list.size())).append("\n");

        for (String str : list) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
