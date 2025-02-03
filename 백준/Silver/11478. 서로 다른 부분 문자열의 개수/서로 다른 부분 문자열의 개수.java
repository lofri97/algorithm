import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        Set<String> set = new HashSet<>();
        for (int s = 0; s < str.length(); s++) {
            for (int e = s; e < str.length(); e++) {
                set.add(str.substring(s, e + 1));
            }
        }
        System.out.println(set.size());
    }
}
