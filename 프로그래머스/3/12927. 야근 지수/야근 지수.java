import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int work : works) {
            pq.add(work);
        }
        
        while (n-- != 0 && !pq.isEmpty()) {
            int val = pq.poll();
            
            if (val == 1) continue;
            pq.add(val - 1);
        }
        
        if (pq.isEmpty()) return 0;
        while (!pq.isEmpty()) {
            answer += pq.peek() * pq.poll();
        }
        
        return answer;
    }
}

/**
**/