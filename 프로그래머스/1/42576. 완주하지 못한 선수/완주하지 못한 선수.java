import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String name : completion) {
            Integer count = map.getOrDefault(name, 0);
            map.put(name, ++count);
        }
        
        for (String name : participant) {
            if (!map.containsKey(name)) {
                return name;
            }
            if (map.get(name) == 1) {
                map.remove(name);
                continue;
            }
            map.put(name, map.get(name) - 1);
            
        }
        return "error";
    }
}