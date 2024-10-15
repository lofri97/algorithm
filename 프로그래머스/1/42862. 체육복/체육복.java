import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        
        for (int l : lost) {
            for (int r : reserve) {
                if (l == r) {
                    set.add(r);
                    break;
                }
            }
            queue.add(l);
        }
        
        int count = 0;
        for (int r : reserve) {
            if (set.contains(r)) {
                continue;   
            }
            
            while (!queue.isEmpty() && queue.peek() < r - 1 || set.contains(queue.peek())) {
                queue.poll();
            }
            
            if (!queue.isEmpty() && queue.peek() <= r + 1) {
                queue.poll();
                count++;
            }
        }
        return n - lost.length + set.size() + count;
    }
}