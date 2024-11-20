import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        int prev = 0;
        
        String[] options = dartResult.split("\\d+");
        String[] scores = dartResult.split("\\D+");
        
        for (int i = 0; i < scores.length; i++) {
            int val = Integer.parseInt(scores[i]);
            
            for (char c : options[i+1].toCharArray()) {
                switch (c) {
                    case 'S':
                        break;
                    case 'D':
                        val = val * val;
                        break;
                    case 'T':
                        val = val * val * val;
                        break;
                    case '*':
                        answer += prev;
                        val = val + val;
                        break;
                    case '#':
                        val = val * -1;
                        break;
                }
            }
            answer += val;
            prev = val;
        }
        return answer;
    }
}