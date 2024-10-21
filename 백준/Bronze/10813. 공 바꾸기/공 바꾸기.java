import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
        }
        
        for (int i=0; i<m; i++) {
            int f = sc.nextInt();
            int t = sc.nextInt();
            
            int tmp = arr[f - 1];
            arr[f-1] = arr[t-1];
            arr[t-1] = tmp;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", arr[i] + 1);   
        }
    }
}