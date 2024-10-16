import java.util.*;

class Solution {
    private final int HIT = 1;
    private final int MISS = 5;
    
    public int solution(int cacheSize, String[] cities) {
        if (cacheSize == 0) {
            return cities.length * MISS;
        }
        
        int answer = 0;
        Map<String, Integer> cache = new HashMap<>();
    
        for (int i = 0; i < cities.length; i++) {
            String city = cities[i].toLowerCase();
            
            // 캐시에 city 가 있는 경우
            if (cache.containsKey(city)) {
                cache.put(city, i);
                answer += HIT;
            } else { // 캐시에 city 가 없는 경우 
                if (cache.size() < cacheSize) { // 캐시가 full 이 아닌 경우 
                    cache.put(city, i);
                } else {
                    int least = Integer.MAX_VALUE;
                    for (String key : cache.keySet()) {
                        least = Math.min(cache.get(key), least);
                    }
                    
                    cache.remove(cities[least].toLowerCase());
                    cache.put(city, i);
                }
                answer += MISS;
            }
        }
        return answer;
    }
}