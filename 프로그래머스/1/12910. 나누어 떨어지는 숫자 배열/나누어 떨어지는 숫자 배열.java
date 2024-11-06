import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        
        for (int a : arr) {
            if (a % divisor == 0) {
                answer.add(a);
            }
        }
        Collections.sort(answer);
        
        if (answer.isEmpty()) {
            return new int[] {-1};
        }
        return answer.stream().mapToInt(v->v).toArray();
    }
}