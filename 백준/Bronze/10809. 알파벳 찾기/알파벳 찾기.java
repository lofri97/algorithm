import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int[] arr = new int[26];

        for (char i = 'a'; i <= 'z'; i++) {
            arr[i-'a'] = str.indexOf(i);
        }

        for (int val : arr) {
            System.out.printf("%d ", val);
        }
    }
}