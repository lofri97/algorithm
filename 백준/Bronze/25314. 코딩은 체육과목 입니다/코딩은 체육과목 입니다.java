import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        for (int i = 0; i < n / 4; i++) {
            sb.append("long ");
        }
        System.out.println(sb.toString()+"int");
    }
}