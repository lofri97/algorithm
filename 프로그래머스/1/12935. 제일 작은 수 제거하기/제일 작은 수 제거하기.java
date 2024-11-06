import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length -1];
        
        if (arr.length == 1) {
            return new int[] {-1};
        }
        
        int min = Integer.MAX_VALUE;
        int idx = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                idx = i;
            }
        }
        
        for (int i = 0; i < idx; i++) {
            answer[i] = arr[i];
        }
        
        for (int i = idx + 1; i < arr.length; i++) {
            answer[i - 1] = arr[i];
        }
        return answer;
    }
}