import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        
        Queue<int []> queue = new LinkedList<>();
        queue.add(new int[] {x,0});
        boolean[] visited = new boolean[y+1];
        
        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int curNum = arr[0];
            int curCount = arr[1];
            
            if (curNum == y) {
                return curCount;
            }
            
            if (curNum + n <= y && !visited[curNum + n]) {
                queue.add(new int[] {curNum + n, curCount + 1});
                visited[curNum + n] = true;
            } 
            if (curNum * 2 <= y && !visited[curNum*2]) {
                queue.add(new int[] {curNum * 2, curCount + 1});
                visited[curNum * 2] = true;
            } 
            if (curNum * 3 <= y && !visited[curNum*3]) {
                queue.add(new int[] {curNum * 3, curCount + 1});
                visited[curNum * 3] = true;
            }
        }
        return -1;
    }
}