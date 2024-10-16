import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        // 귤의 크기에 따른 저장을 위한 HashMap 생성
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int t : tangerine) {
            int count = map.getOrDefault(t, 0);
            
            if (count + 1 == k) {
                return 1;
            }
            map.put(t, count + 1);
        }
        
        // 가장 큰 개수를 가진 대로 정렬
        List<Integer> list = new ArrayList<>(map.values());
        Collections.sort(list, Comparator.reverseOrder()); 
        
        int answer = 0;
        while (k > 0) {
            k -= list.get(answer++);
        }
        return answer;
    }
}