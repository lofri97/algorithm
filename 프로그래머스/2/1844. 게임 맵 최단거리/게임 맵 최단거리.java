import java.util.*;

class Solution {
    int[] dy = {1,-1,0,0};
    int[] dx = {0,0,-1,1};
    
    public int solution(int[][] maps) {
        int maxY = maps.length - 1;
        int maxX = maps[0].length - 1;
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0,0});
        int[][] visited = new int[maxY + 1][maxX + 1];
        visited[0][0] = 1;
        
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int y = point[0], x = point[1];
            if (y == maxY && x == maxX) {
                return visited[y][x];
            }
            
            for (int i = 0; i < 4; i++) {
                int nextY = y + dy[i];
                int nextX = x + dx[i];
                
                if (nextX < 0 || 
                    nextX > maxX || 
                    nextY < 0 || 
                    nextY > maxY ||
                    maps[nextY][nextX] != 1 ||
                    visited[nextY][nextX] != 0) {
                    continue;
                }
                queue.add(new int[] { nextY, nextX });
                visited[nextY][nextX] = visited[y][x] + 1;
            }
        }
        return -1;
    }
}