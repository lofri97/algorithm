import java.util.*;

class Solution {
    public int[] solution(int n, int s) {
        int[] answer = new int[n];
        
        int val = s / n;
        int i = s % n;
        
        if (val == 0) return new int[] {-1};
        
        Arrays.fill(answer, val);
        for (int j = answer.length -1; j >= answer.length - i; j--) {
            answer[j]++;
        }
        
        return answer;
    }
}