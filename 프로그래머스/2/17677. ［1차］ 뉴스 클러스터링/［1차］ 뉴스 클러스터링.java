import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        float answer = 0;
        
        Map<String, Integer> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        
        int i = 0, j = 0;
        for (; i < str1.length() - 1|| j < str2.length() - 1; i++, j++) {
            if (i < str1.length() - 1) {
                String s1 = str1.substring(i, i + 2).toLowerCase();
                if (isAlpha(s1)) {
                    map1.put(s1, map1.getOrDefault(s1, 0) + 1);
                }
            }
            
            if (j < str2.length() - 1) {
                String s2 = str2.substring(i, i+2).toLowerCase();
                if (isAlpha(s2)) {
                    map2.put(s2, map2.getOrDefault(s2, 0) + 1);
                }
            }
        }
        
        int intersect = getIntersect(map1, map2);
        int union = getUnion(map1, map2);
        
        answer = union != 0 ? intersect / (float) union : 1;
        
        return  (int) (answer * 65536);
    }
    
    int getIntersect(Map<String, Integer> m1, Map<String, Integer> m2) {
        int answer = 0;
        for (String key : m1.keySet()) {
            if (m2.containsKey(key)) {
                answer += Math.min(m1.get(key), m2.get(key));
            }
        }
        return answer;
    }
    
    int getUnion(Map<String, Integer> m1, Map<String, Integer> m2) {
        int answer = 0;
        for (String key : m1.keySet()) {
            if (m2.containsKey(key)) {
                answer += Math.max(m1.get(key), m2.get(key));
                m2.remove(key);
            } else {
                answer += m1.get(key);
            }
        }
        
        for (Integer value : m2.values()) {
            answer += value;
        }
        return answer;
    }
    
    boolean isAlpha(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                return false;
            }
        }
        return true;
    }
}

/** 
자카드 유사도: 교집합 / 합집합
모두 공집합일 경우 1

2글자씩 끊어서 다중집합의 원소.
영문자만 유효. 영문자가 두개가 들어갔을 경우
소문자로만 변환하자.

**/