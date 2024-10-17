import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer, Integer> rMap = new HashMap<>();
        Map<Integer, Integer> lMap = new HashMap<>();
        
        for (int i = 0; i < topping.length; i++) {
            rMap.put(topping[i], rMap.getOrDefault(topping[i], 0) + 1);
        }
        
        for (int i = 0; i < topping.length; i++) {
            int t = topping[i];
            lMap.put(t, lMap.getOrDefault(t, 0) + 1);
            
            if (rMap.containsKey(t)) {
                int count = rMap.get(t);
                if (--count == 0) {
                    rMap.remove(t);
                } else {
                    rMap.put(t, count);
                }
            }
            
            if (lMap.size() == rMap.size()) {
                answer++;
            }
        }
        
        return answer;
    }
}