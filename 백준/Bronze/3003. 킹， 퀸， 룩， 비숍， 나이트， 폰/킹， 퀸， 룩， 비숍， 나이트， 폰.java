import java.util.*;

public class Main {
    static int[] arr = new int[] {1,1,2,2,2,8};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] iArr = sc.nextLine().split(" ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] - Integer.parseInt(iArr[i]));
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}