import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Trie trie = new Trie();

        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            int depth = Integer.parseInt(st.nextToken());
            String[] sArr = new String[depth];
            for (int j = 0; j < depth; j++) {
                sArr[j] = st.nextToken();
            }

            trie.add(sArr, 0);
        }

        StringBuilder sb = new StringBuilder();
        trie.print(0, sb);

        System.out.println(sb);
    }

    static class Trie {
        Map<String, Trie> children = new HashMap<>();

        void add(String[] sArr, int idx) {
            if (sArr.length == idx) return;

            if (children.containsKey(sArr[idx])) {
                children.get(sArr[idx]).add(sArr, idx + 1);
            } else {
                Trie trie = new Trie();
                children.put(sArr[idx], trie);
                trie.add(sArr, idx + 1);
            }
        }

        void print(int depth, StringBuilder sb) {
            List<String> list = new ArrayList<>(children.keySet());
            Collections.sort(list);

            for (String str : list) {
                for (int i = 0; i < depth; i++) {
                    sb.append("--");
                }
                sb.append(str).append("\n");
                children.get(str).print(depth + 1, sb);
            }
        }
    }
}