import java.util.*;

class Solution {

    public int[] solution(String msg) {
        List<Integer> answer = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        int max = 1;
        int output = 1;
        int start = 0;
        for (char i = 'A'; i <= 'Z'; i++) {
            map.put(String.valueOf(i), output++);
        }

        while (start < msg.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(msg.charAt(start));
            while (start + 1 < msg.length() && map.containsKey(sb.toString() + msg.charAt(start+1))) {
                start++;
                sb.append(msg.charAt(start));
            }
            answer.add(map.get(sb.toString()));
            
            if (start + 1 < msg.length()) {
                sb.append(msg.charAt(start + 1));
                map.put(sb.toString(), output++);
            }
            start++;
        }

        return answer.stream().mapToInt(v->v).toArray();
    }
}