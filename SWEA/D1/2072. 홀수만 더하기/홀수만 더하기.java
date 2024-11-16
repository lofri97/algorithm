
import java.util.*;
import java.io.*;
import java.io.FileInputStream;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            String[] sArr = br.readLine().split(" ");
            int sum = 0;
            for (int j = 0; j < sArr.length; j++) {
                if (Integer.parseInt(sArr[j]) % 2 == 1) sum += Integer.parseInt(sArr[j]);
            }
            System.out.printf("#%d %d\n", i + 1, sum);
        }
	}
}