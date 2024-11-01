import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = sc.nextInt();
        int num = sc.nextInt();
        
        for (int i = 0; i < num; i++) {
            int price = sc.nextInt();
            int amount = sc.nextInt();
            total -= price * amount;
        }
        System.out.println(total==0 ? "Yes" : "No");
    }
}