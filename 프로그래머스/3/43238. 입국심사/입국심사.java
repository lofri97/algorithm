class Solution {
    public long solution(int n, int[] times) {
        long s = 0;
        long e = 1000000000 * 1000000000L;
        
        while (s < e) {
            long m = (s + e) / 2;
            
            if (isLoe(n, m, times)) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }
    
    boolean isLoe(int n, long m, int[] times) {
        long count = 0;
        
        for (int time : times) {
            count += m / time;   
        }
        return n <= count;
    }
}