import java.util.*;

public class Main {
    static String[] arr = new String[] {"", "", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int answer = 0;
        for (char c : str.toCharArray()) {

            for (int i = 3; i < arr.length; i++) {
                if (arr[i].contains(String.valueOf(c))) {
                    answer += i;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}