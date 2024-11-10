import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> answer = new ArrayList<>();
        
        for (int s : score) {
            pq.add(s);
            
            if (pq.size() > k) {
                pq.poll();
            }
            answer.add(pq.peek());
        }
        return answer.stream().mapToInt(v->v).toArray();
    }
}