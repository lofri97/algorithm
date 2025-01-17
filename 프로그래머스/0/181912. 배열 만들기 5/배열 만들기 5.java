import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        
        for (String str : intStrs) {
            int val = Integer.parseInt(str.substring(s, s + l));
            
            if (val > k) {
                list.add(val);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}