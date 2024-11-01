import java.util.*;

public class Main {
    static String[] arr = new String[] {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int count = 0;
        while (sb.length() != 0) {
            boolean flag = false;
            for (String s : arr) {
                if (sb.toString().startsWith(s)) {
                    sb.delete(0, s.length());
                    count++;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                sb.delete(0, 1);
                count++;
            }
        }
        System.out.println(count);
    }
}