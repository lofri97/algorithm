import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n  = Integer.parseInt(sc.nextLine());

        for (int i  = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            StringBuilder sb = new StringBuilder();

            for (char c : input[1].toCharArray()) {
                for (int j = 0; j < Integer.parseInt(input[0]); j++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
    }
}