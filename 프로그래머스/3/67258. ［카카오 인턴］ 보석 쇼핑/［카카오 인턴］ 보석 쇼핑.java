import java.util.*;

class Solution {
    public int[] solution(String[] gems) {
        int[] answer = new int[2];
        Set<String> set = new HashSet<>();
        
        for (String gem : gems) set.add(gem);
        
        int l = 0;
        int len = Integer.MAX_VALUE;
        Map<String, Integer> map = new HashMap<>();
        
        for (int r = 0; r < gems.length; r++) {
            map.put(gems[r], map.getOrDefault(gems[r], 0) + 1);
            
            while (map.get(gems[l]) > 1) {
                map.put(gems[l], map.get(gems[l]) - 1);
                l++;
            }
            
            if (map.size() == set.size() && len > r - l) {
                len = r - l;
                answer[0] = l + 1;
                answer[1] = r + 1;
            }
        }
        return answer;
    }
}