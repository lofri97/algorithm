import java.util.*;

class Solution {
    public int solution(int distance, int[] rocks, int n) {
        Arrays.sort(rocks);
        rocks = Arrays.copyOf(rocks, rocks.length + 1);
        rocks[rocks.length - 1] = distance;

        int s = 1;
        int e = distance + 1;
        
        while (e - s > 1) {
            int d = (s + e) / 2;
            
            if (check(d, n, rocks)) {
                s = d;
            } else {
                e = d;
            }
        }
        return s;
    }
    
    boolean check(int d, int n, int[] rocks) {
        int c = 0;
        int last = 0;
        
        for (int rock : rocks) {
            if (rock - last < d) {
                c++;
                continue;
            }
            last = rock;
        }
        return c <= n;
    }   
}