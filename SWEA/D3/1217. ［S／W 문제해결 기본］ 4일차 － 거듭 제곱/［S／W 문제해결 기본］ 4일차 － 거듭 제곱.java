import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);


        for (int t = 0; t < 10; t++) {
            int tt = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(String.format("#%d %d\n", t+1, recursive(n, m)));
        }


    }

    static int recursive(int n, int m) {
        if (m == 0) return 1;
        if (m == 1) return n;

        return n * recursive(n, m-1);
    }
}