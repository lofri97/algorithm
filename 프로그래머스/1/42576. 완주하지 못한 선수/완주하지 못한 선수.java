import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();
        
        for (String name : completion) {
            map.put(name, map.getOrDefault(name, 0) + 1);
        }
        
        for (String name: participant) {
            if (!map.containsKey(name)) return name;
            int count = map.get(name);
            if (count == 0) return name;
            map.put(name, count - 1);
        }
        return "";
    }
}