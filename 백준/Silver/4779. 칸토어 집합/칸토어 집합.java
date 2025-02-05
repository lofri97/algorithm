import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = br.readLine()) != null && !str.isEmpty()){
            char[] cArr = new char[(int)Math.pow(3, Integer.parseInt(str))];
            Arrays.fill(cArr, '-');
            recursion(cArr, 0, cArr.length-1, false);
            sb.append(cArr).append("\n");
        }
        System.out.println(sb);
    }

    static void recursion(char[] cArr, int l, int r, boolean eraseFlag) {
        if (eraseFlag) {
            Arrays.fill(cArr, l, r + 1, ' ');
            return;
        }

        if (r - l <= 1) {
            return;
        }

        int div = (r - l + 1) / 3;
        recursion(cArr, l,  l + div - 1, false);
        recursion(cArr, l + div, l + div + div - 1, true);
        recursion(cArr, l + div + div, r, false);
    }
}