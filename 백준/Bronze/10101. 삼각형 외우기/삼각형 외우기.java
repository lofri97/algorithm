import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if (a+b+c != 180) {
            System.out.println("Error");
        } else if (a == 60 && b == 60) {
            System.out.println("Equilateral");
        } else if (a != b && b != c && c != a) {
            System.out.println("Scalene");
        } else {
            System.out.println("Isosceles");
        }
    }
}