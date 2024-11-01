import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        StringBuilder sb1 = new StringBuilder(arr[0]);
        StringBuilder sb2 = new StringBuilder(arr[1]);

        sb1.reverse();
        sb2.reverse();

        System.out.println(Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString()) ? sb1.toString() : sb2.toString());
    }
}