import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) + 1);
        }
        
        if (checkContains(want, number, map)) {
            answer++;
        }
        
        for (int i = 1; i < discount.length - 10 + 1; i++) {
            map.put(discount[i - 1], map.getOrDefault(discount[i - 1], 1) - 1);
            map.put(discount[i + 9], map.getOrDefault(discount[i + 9], 0) + 1);
            if (checkContains(want,number,map)) {
                answer++;
            }
        }
        
        return answer;
    }
    
    boolean checkContains(String[] want, int[] number, Map<String, Integer> map) {
        for (int i = 0; i < want.length; i++) {
            int count = map.getOrDefault(want[i], -1);
            if (count != number[i]) {
                return false;
            }
        }
        return true;
    }
}

/**
슬라이딩 윈도우를 이용하자.
먼저 number 까지의 숫자를 돌면서 이를 Map<String, Integer> 에 저장한다.
윈도우 값이 설정되었을 경우 체크.
하루씩 넘어가면서 체크.

**/