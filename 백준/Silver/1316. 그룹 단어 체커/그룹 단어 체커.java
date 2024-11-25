import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Character> set = new HashSet<>();

        int tt = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int t = 0; t < tt; t++) {
            set.clear();
            String word = br.readLine();

            char prev = '#';
            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (!Character.isAlphabetic(prev)) {
                    prev = c;
                    set.add(c);
                    continue;
                }

                if (prev != c) {
                    if (set.contains(c)) {
                        prev = '#';
                        break;
                    }

                    prev = c;
                    set.add(c);
                }
            }

            if (Character.isAlphabetic(prev)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}