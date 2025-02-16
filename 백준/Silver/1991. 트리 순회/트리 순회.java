import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Map<String, List<String>> tree = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] arr = br.readLine().split(" ");
            List<String> list = new ArrayList<>();
            list.add(arr[1]);
            list.add(arr[2]);
            tree.put(arr[0], list);
        }

        System.out.println(preOrder(tree, "A", new StringBuilder()));
        System.out.println(inOrder(tree, "A", new StringBuilder()));
        System.out.println(postOrder(tree, "A", new StringBuilder()));
    }

    static StringBuilder preOrder(Map<String, List<String>> tree, String target, StringBuilder sb) {
        sb.append(target);

        for (String child : tree.get(target)) {
            if (child.equals(".")) continue;
            preOrder(tree, child, sb);
        }
        return sb;
    }

    static StringBuilder inOrder(Map<String, List<String>> tree, String target, StringBuilder sb) {
        List<String> children = tree.get(target);
        if (!children.get(0).equals(".")) inOrder(tree, children.get(0), sb);
        sb.append(target);
        if (!children.get(1).equals(".")) inOrder(tree, children.get(1), sb);

        return sb;
    }

    static StringBuilder postOrder(Map<String, List<String>> tree, String target, StringBuilder sb) {
        for (String child : tree.get(target)) {
            if (child.equals(".")) continue;
            postOrder(tree, child, sb);
        }
        sb.append(target);
        return sb;
    }
}