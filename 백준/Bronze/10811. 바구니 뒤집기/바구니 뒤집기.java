import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] iArr = br.readLine().split(" ");

        int n = Integer.parseInt(iArr[0]);
        int m = Integer.parseInt(iArr[1]);

        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            answer[i] = i + 1;
        }
        for (int t = 0; t < m; t++) {
            String[] tArr = br.readLine().split(" ");
            int from = Integer.parseInt(tArr[0]);
            int to = Integer.parseInt(tArr[1]);

            from--;
            to--;

            for (int i = from; i <= from + (to - from) / 2 ; i++) {
                int tmp = answer[i];
                answer[i] = answer[to - (i - from)];
                answer[to - (i - from)] = tmp;
            }
        }
        StringBuilder sb = new StringBuilder();

        for (int a : answer) {
            sb.append(a);
            sb.append(" ");
        }
        System.out.println(sb);
    }
}