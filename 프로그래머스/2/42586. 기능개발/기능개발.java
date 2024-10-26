import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remain = 100 - progresses[i];
            int days = remain / speeds[i];
            days += remain % speeds[i] == 0 ? 0 : 1;
            queue.add(days);
        }
        
        int day = 1;
        
        while (!queue.isEmpty()) {
            if (queue.peek() > day) day = queue.peek();
            int count = 0;
            while (!queue.isEmpty() && queue.peek() <= day) {
                queue.poll();
                count++;
            }
            answer.add(count);
        }
        return answer.stream().mapToInt(v -> v).toArray();
    }
}