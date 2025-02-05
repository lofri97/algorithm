import java.io.*;

public class Main {
    private static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String str = br.readLine();
            cnt = 0;
            sb.append(recursion(str.toCharArray(), 0, str.length() - 1)).append(" ").append(cnt).append("\n");
        }
        System.out.println(sb);
    }

    static int recursion(char[] cArr, int l, int r) {
        cnt++;
        if (l >= r) return 1;
        if (cArr[l] != cArr[r]) return 0;
        return recursion(cArr, l + 1, r - 1);
    }
}