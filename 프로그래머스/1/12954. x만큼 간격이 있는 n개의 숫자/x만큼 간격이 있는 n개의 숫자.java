import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        List<Long> answer = new ArrayList<>();
        
        long tmp = x;
        while (n != 0) {
            answer.add(tmp);
            tmp += x;
            n--;
        }
        return answer.stream().mapToLong(v->v).toArray();
    }
}