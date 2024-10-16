import java.util.*;

class Solution {
    public int[] solution(String s) {
        List<int[]> list = new ArrayList<>();
        
        StringBuilder sb = new StringBuilder();
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            if (Character.isDigit(target)) {
                sb.append(target);
            } 
            else if (target == ',' && Character.isDigit(s.charAt(i-1))) {
                temp.add(Integer.valueOf(sb.toString()));
                sb.delete(0, sb.length());
            } 
            else if (target == '}' && Character.isDigit(s.charAt(i-1))) {
                temp.add(Integer.valueOf(sb.toString()));
                list.add(temp.stream().mapToInt(v -> v).toArray());
                sb.delete(0, sb.length());
                temp.clear();
            }
        }
        Collections.sort(list, (v1, v2) -> v1.length - v2.length);
        int[] answer = new int[list.size()];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < list.size(); i++) {
            for (int val : list.get(i)) {
                if (set.add(val)) {
                    answer[i] = val;
                }
            }
        }
        return answer;
    }
}