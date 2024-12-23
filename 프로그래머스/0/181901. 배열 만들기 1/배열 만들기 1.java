import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = k; i <= n; i+=k) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(v->v).toArray();
    }
}