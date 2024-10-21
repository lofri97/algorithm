import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < m; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            int k = sc.nextInt();
            
            for (int j = f - 1; j < t; j++) {
                arr[j] = k;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}