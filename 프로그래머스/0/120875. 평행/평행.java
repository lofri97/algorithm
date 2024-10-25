import java.util.*;

class Solution {
    private static final int Y = 1;
    private static final int X = 0;
    
    public int solution(int[][] dots) {
        
        if (doCalc(dots[0], dots[1]) == doCalc(dots[2], dots[3])) return 1;
        if (doCalc(dots[0], dots[2]) == doCalc(dots[1], dots[3])) return 1;
        if (doCalc(dots[0], dots[3]) == doCalc(dots[1], dots[2])) return 1;
        
        return 0;
    }
    
    double doCalc(int[] d1, int[] d2) {
        return (double) (d2[Y] - d1[Y]) / (d2[X] - d1[X]);
    }
}

/**
0, 1 / 2, 3
0, 2 / 1, 3
0, 3 / 1, 2
**/