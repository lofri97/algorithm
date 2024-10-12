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
            Integer count = map.get(name);
            if (--count == 0) {
                map.remove(name);
                continue;
            }
            map.put(name, count);
            
        }
        return "error";
    }
}