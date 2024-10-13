import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int val = (100 - progresses[i]) / speeds[i];
            if ((100 - progresses[i]) % speeds[i] != 0) {
                val++;
            }
            queue.add(val);
        }
        
        int days = 1;
        while (!queue.isEmpty()) {
            int val = queue.poll();
            int count = 1;
            if (days < val) {
                days = val;
            }
            
            while (!queue.isEmpty()) {
                if (queue.peek() > days) {
                    break;
                }
                queue.poll();
                count++;
            }
            answer.add(count);
            days++;
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}