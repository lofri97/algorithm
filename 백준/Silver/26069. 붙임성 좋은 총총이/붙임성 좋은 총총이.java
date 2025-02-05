import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        set.add("ChongChong");
        for (int i = 0; i < n; i++) {
            String[] sArr = br.readLine().split(" ");

            if (set.contains(sArr[0])) {
                set.add(sArr[1]);
            } else if (set.contains(sArr[1])) {
                set.add(sArr[0]);
            }
        }
        System.out.println(set.size());
    }
}