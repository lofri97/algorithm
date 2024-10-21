import java.util.*;

class Solution {
    public String[] solution(int[][] line) {
        List<Point> list = new ArrayList<>();
        
        for (int i = 0; i < line.length; i++) {
            for (int j = i; j < line.length; j++) {
                Point point = getPoint((long) line[i][0], (long) line[i][1], (long) line[i][2],
                                       (long) line[j][0], (long) line[j][1], (long) line[j][2]);
                if (point != null) {
                    list.add(point);
                }
            }
        }
        
        long minX = Long.MAX_VALUE;
        long minY = Long.MAX_VALUE;
        long maxY = Long.MIN_VALUE;
        long maxX = Long.MIN_VALUE;
        
        for (Point point : list) {
            minY = Math.min(minY, point.y);
            minX = Math.min(minX, point.x);
            maxY = Math.max(maxY, point.y);
            maxX = Math.max(maxX, point.x);
        }
        
        int w = (int) (maxX - minX + 1);
        int h = (int) (maxY - minY + 1);
        
        char[][] arrs = new char[h][w];
        
        for (char[] arr : arrs) {
            Arrays.fill(arr, '.');
        }
        
        for (Point point : list) {
            int y = (int) (maxY - point.y);
            int x = (int) (point.x - minX);
            
            arrs[y][x] ='*';
        }
        
        String[] answer = new String[h];
        for (int y = 0; y < h; y++) {
            answer[y] = new String(arrs[y]);
        }
        
        
        return answer;
    }
    
    Point getPoint(long a1, long b1, long c1, long a2, long b2, long c2) {
        long adbc = a1*(long)b2 - a2*(long)b1;
        
        if (adbc ==0) {
            return null;
        }
        
        long bfed = b1*c2 - b2*c1;
        long ecaf = a2*c1 - a1*c2;
        
        double x = bfed / (double) adbc;
        double y = ecaf / (double) adbc;
        
        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        return new Point((long) y, (long) x);
    }
    
    class Point {
        long y;
        long x;
        
        Point(long y, long x) {
            this.y = y;
            this.x = x;
        }
        
        public String toString() {
            return String.format("{y:%d x:%d}\n", y, x);
        }
    }
}