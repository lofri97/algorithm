import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            int val = Integer.parseInt(br.readLine());

            int l = 0;
            int r = list.size() - 1;

            int result = -1;
            while (l <= r) {
                int m = (l + r) / 2;

                if (list.get(m) >= val) {
                    result = m;
                    r = m - 1;
                } else {
                    l = m + 1;
                }
            }

            if (result == -1) {
                list.add(val);
            } else {
                list.add(result, val);
            }

            if (list.size() == 1) {
                sb.append(list.get(0));
            } else {
                sb.append(list.get((list.size() - 1) / 2));
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}