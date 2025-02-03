import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println(a > b ? a / getGCD(a, b) * b : b / getGCD(b, a) *a);
    }

    static long getGCD(long a, long b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a % b);
    }
}
