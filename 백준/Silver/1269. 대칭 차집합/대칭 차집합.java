import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            for (String str : br.readLine().split(" ")) {
                int num = Integer.parseInt(str);

                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        int cnt = 0;
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
