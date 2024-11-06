import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> answer = new ArrayList<>();
        
        int count = 0;
        for (String name : names) {
            if (count == 0) answer.add(name);
            count++;
            count %= 5;
        }
        return answer.stream().toArray(String[]::new);
    }
}