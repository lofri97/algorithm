import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int tt = Integer.parseInt(br.readLine());
        
        for (int t = 0; t < tt; t++) {
            String str = br.readLine();
            
            int count = 0;
            
            switch (str) {
                case "SUN" :
                    count = 7;
                    break;
                case "SAT" :
                    count = 1;
                    break;
                case "FRI" :
                    count = 2;
                    break;
                case "THU" :
                    count = 3;
                    break;
                case "WED":
                    count = 4;
                    break;
                case "TUE":
                    count = 5;
                    break;
                case "MON":
                    count = 6;
                    break;
            }
            System.out.printf("#%d %d\n", t+1, count);
        }
    }
}