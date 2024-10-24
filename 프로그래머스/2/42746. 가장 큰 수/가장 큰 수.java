import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf)
            .sorted((s1, s2) -> {
                Integer v1 = Integer.valueOf(s1 + s2);
                Integer v2 = Integer.valueOf(s2 + s1);
                return v2-v1;
            }).toArray(String[]::new);
        
        StringBuilder answer = new StringBuilder();
        for (String s : arr) {
            answer.append(s);
        }
        
        if (answer.toString().startsWith("0")) {
            return "0";
        }
        
        return answer.toString();
    }
}