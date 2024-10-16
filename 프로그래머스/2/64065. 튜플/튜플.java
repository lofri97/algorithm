import java.util.*;

class Solution {
    public int[] solution(String s) {
        Set<String> set = new HashSet<>();
        
        String[] arr = s.replaceAll("\\{", " ").replaceAll("\\}", " ").trim().split(" , ");
        Arrays.sort(arr, (v1, v2) -> v1.length() - v2.length());
        
        int[] answer = new int[arr.length];
        int i = 0;
        for (String v1 : arr) {
            for (String v2 : v1.split(",")) {
                if (set.add(v2)) {
                    answer[i++] = Integer.parseInt(v2);
                }
            }
        }
        return answer;
    }
}