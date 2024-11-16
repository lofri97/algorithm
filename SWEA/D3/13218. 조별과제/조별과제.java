import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int time = 0; time < T; time++) {
            System.out.printf("#%d %d\n", time + 1, sc.nextInt() / 3);
        }
    }
}