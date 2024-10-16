import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = { 0, 0 };
        
        // 단어 중복 검사를 위한 HashSet 생성
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            // 전 단어의 끝과 현 단어의 처음이 다를 경우 answer 업데이트.
            if (words[i-1].charAt(words[i-1].length() -1) != words[i].charAt(0)) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
            
            // 단어가 이미 나왔을 경우
            if (set.contains(words[i])) {
                // i%n + 1 을 통해 몇번째 사람인지 구하고
                answer[0] = i % n + 1;
                
                // i/n + 1 을 통해 몇번째 루프인지를 확인한다.
                answer[1] = i / n + 1;
                break;
            }
            set.add(words[i]);
        }
        return answer;
    }
}