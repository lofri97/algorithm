import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String[] strArr = br.readLine().split(" ");

            if (strArr[1].equals("enter")) {
                set.add(strArr[0]);
            } else {
                set.remove(strArr[0]);
            }
        }

        List<String> list = new ArrayList<>(set);
        Collections.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();

        for (String str : list) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
