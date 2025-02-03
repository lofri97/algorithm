import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();

        for (String str : br.readLine().split(" ")) {
            list.add(Integer.parseInt(str));
        }

        Collections.sort(list, Collections.reverseOrder());

        System.out.println(list.get(k - 1));
    }
}
