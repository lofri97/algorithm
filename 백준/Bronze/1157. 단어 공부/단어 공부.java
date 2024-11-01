import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();

        int[] result = new int[26];
        for (char i = 'A'; i <= 'Z'; i++) {
            int tmp = str.length();
            str = str.replace(String.valueOf(i), "");
            int count = tmp - str.length();
            result[i - 'A'] = count;
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (result[max] < result[i]) {
                max = i;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (i != max && result[max] == result[i]) {
                System.out.println("?");
                return;
            }
        }
        System.out.println((char) (max + 'A'));
    }
}