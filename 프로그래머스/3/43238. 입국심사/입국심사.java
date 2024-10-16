class Solution {
    public long solution(int n, int[] times) {
        long start = 0;
        long end = 1000000000 * 1000000000L;
        
        while (start < end) {
            long mid = (start + end) / 2;
            
            if (check(n, mid, times)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
    
    boolean check(int n, long minute, int[] times) {
        long count = 0;
        
        for (int time : times) {
            count += minute / time;
        }
        return n <= count;
    }
}