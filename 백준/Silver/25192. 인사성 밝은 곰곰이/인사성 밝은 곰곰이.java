import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int answer = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            if (str.equals("ENTER")) {
                set.clear();
            } else {
                if (set.add(str)) {
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}