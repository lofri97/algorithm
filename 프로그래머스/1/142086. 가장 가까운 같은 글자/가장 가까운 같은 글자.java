import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] arr = new int[26];
        int[] answer = new int[s.length()];
        
        Arrays.fill(arr, -1);
        char[] cArr = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = cArr[i];
            
            if (arr[c - 'a'] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - arr[c - 'a'];
            }
            arr[c-'a'] = i;
        }
        return answer;
    }
}