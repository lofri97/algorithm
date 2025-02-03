import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Set<Integer> set = new HashSet<>();

        for (String str : br.readLine().split(" ")) {
            set.add(Integer.parseInt(str));
        }

        int m = Integer.parseInt(br.readLine());
        int[] answer = new int[m];
        String[] mArr = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {
            answer[i] = set.contains(Integer.parseInt(mArr[i])) ? 1 : 0;
        }

        StringBuilder sb = new StringBuilder();
        for (int a : answer) {
            sb.append(a).append(" ");
        }
        System.out.println(sb);
    }
}
