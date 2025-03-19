import java.io.*;
import java.util.*;

public class Main {
    static int[] unf;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        unf = new int[n];

        for (int i = 0; i < n; i++) {
            unf[i] = i;
        }

        for (int i = 0; i < n; i++) {
            String[] sArr = br.readLine().split(" ");
            int pFrom = find(i);
            for (int j = 0; j < n; j++) {
                int isConnected = Integer.parseInt(sArr[j]);

                if (isConnected == 0) continue;
                int pTo = find(j);

                if (pFrom != pTo) {
                    unf[pTo] = pFrom;
                }
            }
        }

        StringTokenizer st = new StringTokenizer(br.readLine());
        int parent = find(Integer.parseInt(st.nextToken()) - 1);

        while (st.hasMoreTokens()) {
            if (parent != find(Integer.parseInt(st.nextToken()) - 1)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }

    static int find(int a) {
        if (unf[a] == a) {
            return a;
        }
        return unf[a] = find(unf[a]);
    }
}