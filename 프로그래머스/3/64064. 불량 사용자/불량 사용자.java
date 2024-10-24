import java.util.*;

class Solution {
    public int solution(String[] user_id, String[] banned_id) {
        Map<String, Set<String>> map = new HashMap<>();
        
        for (String bId : banned_id) {
            for (String uId : user_id) {
                if (isAvail(uId, bId)) {
                    Set<String> set = map.getOrDefault(bId, new HashSet<>());
                    set.add(uId);
                    map.put(bId, set);
                }
            }
        }
        
        Set<String> visited = new HashSet<>();
        Set<Set<String>> answer = new HashSet<>();
        dfs(map, banned_id, 0, visited, answer);
        
        return answer.size();
    }
    
    void dfs(Map<String, Set<String>> map, String[] bIds, int idx, Set<String> set, Set<Set<String>> banSet) {
        if (idx == bIds.length) { 
            banSet.add(new HashSet(set));
            return;
        }
        
        for (String uId : map.get(bIds[idx])) {
            if (set.contains(uId)) continue;
            set.add(uId);
            dfs(map, bIds, idx+1, set, banSet);
            set.remove(uId);
        }
    }
    
    boolean isAvail(String uId, String bId) {
        if (uId.length() != bId.length()) return false;
        
        for (int i = 0; i < bId.length(); i++) {
            char c = bId.charAt(i);
            
            if (c == '*') continue;
            if (c != uId.charAt(i)) return false;
        }        
        return true;
    }
}