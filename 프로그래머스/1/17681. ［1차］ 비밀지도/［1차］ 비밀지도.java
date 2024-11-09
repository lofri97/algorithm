import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        boolean[][] map = new boolean[n][n];
        
        for (int y = 0; y < arr1.length; y++) {
            
            char[] cArr1 = Integer.toString(arr1[y], 2).toCharArray();
            char[] cArr2 = Integer.toString(arr2[y], 2).toCharArray();
            
            int tmp = n;
            for (int i = cArr1.length - 1; i >= 0; i--) {
                tmp--;
                if (cArr1[i] == '1') {
                    map[y][tmp] = true;
                }
            }
            
            tmp = n;
            for (int i = cArr2.length - 1; i >= 0; i--) {
                tmp--;
                if (cArr2[i] == '1') {
                    map[y][tmp] = true;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        String[] answer = new String[n];
        for (int y = 0; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (map[y][x] == true) {
                    sb.append("#");
                } else {
                    sb.append(" ");
                }
            }
            answer[y] = sb.toString();
            sb.delete(0, sb.length());
        }
        return answer;
    }
}