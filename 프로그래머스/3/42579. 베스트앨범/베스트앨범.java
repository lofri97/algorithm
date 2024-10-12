import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        Map<String, Integer> cntMap = new HashMap<>();
        Map<String, Map<Integer, Integer>> map = new HashMap<>();
        
        for (int i = 0; i < genres.length; i++) {
            Map<Integer, Integer> songs = map.getOrDefault(genres[i], new HashMap<>());
            songs.put(i, plays[i]);
    
            if (songs.size() == 3) {
                int minVal = plays[i];
                int minIdx = i;
                for (Map.Entry<Integer, Integer> entry : songs.entrySet()) {
                    if (entry.getValue() < minVal) {
                        minVal = entry.getValue();
                        minIdx = entry.getKey();
                    }
                }
                songs.remove(minIdx);
            }
            map.put(genres[i], songs);
            cntMap.put(genres[i], cntMap.getOrDefault(genres[i], 0) + plays[i]);
        }
        
        List<Integer> answer = new ArrayList<>();
        List<String> keySet = new ArrayList(cntMap.keySet());
        Collections.sort(keySet, (s1, s2) -> cntMap.get(s2) - (cntMap.get(s1)));
 
        for(String key : keySet) {
            Map<Integer, Integer> tmp = map.get(key);
            List<Integer> genre_key = new ArrayList(tmp.keySet());
 
            Collections.sort(genre_key, (s1, s2) -> tmp.get(s2) - (tmp.get(s1)));
 
            answer.add(genre_key.get(0));
            if(genre_key.size() > 1)
                answer.add(genre_key.get(1));
        }
 
        return answer.stream().mapToInt(i -> i).toArray();
    }
}