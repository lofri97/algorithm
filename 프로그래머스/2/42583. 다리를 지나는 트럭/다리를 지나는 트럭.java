import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int cw = 0; // 다리 위 무게
        int ct = 0; // 시간
        
        int i = 0;
        
        int lt = 0;
        Queue<int[]> queue = new LinkedList<>();
        while (i < truck_weights.length) {
            int tw = truck_weights[i];
            ct++;
            
            if (!queue.isEmpty() && queue.peek()[1] == ct) {
                int[] info = queue.poll();
                cw -= truck_weights[info[0]];
            }
            
            while (!queue.isEmpty() && (cw + tw > weight || queue.size() == bridge_length)) {
                int[] info = queue.poll();
                cw -= truck_weights[info[0]];
                ct = info[1];
            }
            cw += truck_weights[i];
            queue.add(new int[] {i++, ct + bridge_length});
        }
        
        while (!queue.isEmpty()) {
            ct = queue.poll()[1];
        }
        
        return ct;
    }
    
    void printQueue(Queue<int[]> queue) {
        for (int[] e : queue) {
            System.out.println(Arrays.toString(e));
        }
    }
}

/**
queue 에다가 도착 시간, 트럭 idx 을 넣는다. int[] 0 = truckIdx, 1= 도착시간
cw 에다가 다리의 현재 무게를 넣는다.
**/