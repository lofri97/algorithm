import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        
        list.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                list.add(n);
            } else {
                n *= 3;
                n++;
                list.add(n);
            }
        }
        return list.stream().mapToInt(v->v).toArray();
    }
}