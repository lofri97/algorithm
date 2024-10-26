import java.util.*;

class Solution {
    int[] dy = new int[] {1,-1,0,0};
    int[] dx = new int[] {0,0,-1,1};
    
    public int solution(String[] board) {
        char[][] cb = new char[board.length][board[0].length()];
        boolean[][] visited = new boolean[board.length][board[0].length()];
        Queue<int[]> queue = new LinkedList<>();
        
        int ry = -1, rx = -1, gy = -1, gx = -1;
        
        for (int i = 0; i < board.length; i++) {
            cb[i] = board[i].toCharArray();
            
            if (board[i].contains("R")) {
                ry = i;
                rx = board[i].indexOf("R");
            }
            if (board[i].contains("G")) {
                gy = i;
                gx = board[i].indexOf("G");
            }
        }
        
        visited[ry][rx] = true;
        queue.add(new int[] {ry, rx, 0});
        while(!queue.isEmpty()) {
            int[] point = queue.poll();
            int cy = point[0];
            int cx = point[1];
            int count = point[2];
            
            if (cy == gy && cx == gx) {
                return count;
            }
            
            for (int i = 0; i < 4; i++) {
                int[] newPoint = getNewPoint(cy, cx, i, cb);
                int ny = newPoint[0];
                int nx = newPoint[1];
                if (visited[ny][nx]) continue;
                visited[ny][nx] = true;
                queue.add(new int[] {ny,nx,count+1});
            }
        }
        
        return -1;
    }
    
    int[] getNewPoint(int cy, int cx, int path, char[][] board) {
        int ny = cy;
        int nx = cx;
        
        while (isMovable(ny + dy[path], nx + dx[path], board)) {
            ny += dy[path];
            nx += dx[path];
        }
        return new int[] { ny, nx };
    }
    
    boolean isMovable(int y, int x, char[][] board) {
        if (y < 0 || y >= board.length || x < 0 || x >= board[0].length) return false;
        if (board[y][x] == 'D') return false;
        return true;
    }
}