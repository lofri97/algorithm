import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        List<Integer> list = new ArrayList<>();
        int[] answer = new int[emergency.length];
        for (int e : emergency) {
            list.add(e);
        }
        Collections.sort(list, (v1, v2) -> v2 - v1);
        
        for (int i = 0; i < emergency.length; i++) {
            answer[i] = list.indexOf(emergency[i]) + 1;
        }
        return answer;
    }
}