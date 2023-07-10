import java.util.*;

class Solution {
    private static class Point {
        public final long x, y;
        public Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    private Point getIntersection(long a1, long b1, long c1, long a2, long b2, long c2) {
        double x = (double) (b1 * c2 - c1 * b2) / (a1 * b2 - a2 * b1);
        double y = (double) (c1 * a2 - c2 * a1) / (a1 * b2 - a2 * b1);
        
        if (x % 1 != 0 || y % 1 != 0)
            return null;
        return new Point((long) x, (long) y);
    }
    
    private Point getMinPoint(List<Point> points) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for (Point point : points) {
            x = point.x < x ? point.x : x;
            y = point.y < y ? point.y : y;
        }
        return new Point(x,y);
    }
    
    private Point getMaxPoint(List<Point> points) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for (Point point : points) {
            x = point.x > x ? point.x : x;
            y = point.y > y ? point.y : y;
        }
        return new Point(x,y);
    }
    
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        
        for (int i = 0; i < line.length; i++) {
            for (int j = i+1; j < line.length; j++) {
                Point point = getIntersection(line[i][0], line[i][1], line[i][2],
                               line[j][0], line[j][1], line[j][2]);
                if (point != null)
                    points.add(point);
            }
        }
        
        Point minPoint = getMinPoint(points);
        Point maxPoint = getMaxPoint(points);
        
        int width = (int) (maxPoint.x - minPoint.x + 1);
        int height = (int) (maxPoint.y - minPoint.y + 1);
        
        char[][] arr = new char[height][width];
        for (char[] row : arr)
            Arrays.fill(row, '.');
        
        for (Point point : points) {
            int x = (int) (point.x - minPoint.x);
            int y = (int) (maxPoint.y - point.y);
            arr[y][x] = '*';
        }
        
        String[] result = new String[arr.length];
        for (int i = 0 ; i < result.length; i++) {
            result[i] = new String(arr[i]);
        }
        
        return result;
        
    }
}
