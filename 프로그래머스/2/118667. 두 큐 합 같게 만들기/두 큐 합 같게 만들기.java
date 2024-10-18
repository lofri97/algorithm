class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;
        int len = queue1.length;
        
        long sum1 = 0;
        long sum2 = 0;
        
        int[] queue = new int[len * 2];
        for (int i = 0; i < len; i++) {
            sum1 += queue1[i];
            sum2 += queue2[i];
            queue[i] = queue1[i];
            queue[len+i] = queue2[i];
        }
        
        long target = sum1 + sum2;
        
        if (target % 2 != 0) {
            return -1;
        }
        target /= 2;
        
        int i1 = 0;
        int i2 = len;
        
        while (i1 < i2) {
            if (sum1 == target) {
                break;
            }
            
            if (sum1 < target && i2 == len * 2 - 1) {
                break;
            }
            
            if (sum1 > target) {
                sum1 -= queue[i1++];
            } else if (sum1 < target) {
                sum1 += queue[i2++];
            }
            answer++;
        }
        
        if (sum1 != target) {
            answer = -1;
        }
        
        return answer;
    }
}