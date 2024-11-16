import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int time = 0; time < T; time++) {
            int r = sc.nextInt();
            System.out.printf("#%d %d\n", time + 1, r*r);
        }
    }
}