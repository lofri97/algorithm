import java.util.*;

class Solution {
    
    
    public int solution(String dirs) {
        int answer = 0;
        
        int curY = 0;
        int curX = 0;
        
        Map<Character, int[]> map = new HashMap<>();
        map.put('U', new int[] {1, 0});
        map.put('D', new int[] {-1, 0});
        map.put('L', new int[] {0, -1});
        map.put('R', new int[] {0, 1});
        
        
        Set<Path> set = new HashSet<>();
        
        for (char c : dirs.toCharArray()) {
            int newY = curY + map.get(c)[0];
            int newX = curX + map.get(c)[1];
            
            if (-5 <= newY && newY <= 5 &&
                -5 <= newX && newX <= 5) {
                set.add(new Path(curY, curX, newY, newX));
                curY = newY;
                curX = newX;
            }
        }
        return set.size();
    }
    
    class Path {
        int y1;
        int x1;
        int y2;
        int x2;
        
        Path(int y1, int x1, int y2, int x2) {
            this.y1 = y1 < y2 ? y1 : y2;
            this.x1 = x1 < x2 ? x1 : x2;
            this.y2 = y2 > y1 ? y2 : y1;
            this.x2 = x2 > x1 ? x2 : x1;
        }
        
        @Override
        public boolean equals(Object obj) {
            Path t = (Path) obj;
            
            if (x1 == t.x1 &&
                x2 == t.x2 &&
                y1 == t.y1 &&
                y2 == t.y2) {
                return true;
            } else if (x1 ==t.x2 &&
                      x2 == t.x1 &&
                      y1 == t.y2 &&
                      y2 == t.y1) {
                return true;
            }
            return false;
        }
        
        @Override
        public int hashCode() {
            return 1000 * y1 + 100 * x1 + 10 * y2 + x2;
        }
    }
}