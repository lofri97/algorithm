import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = Arrays.stream(indices)
                          .boxed()
                          .collect(Collectors.toList());
        
        for (int i = 0; i < my_string.length(); i++) {
            if (list.contains(i)) continue;
            sb.append(String.valueOf(my_string.charAt(i)));
        }
        return sb.toString();
    }
}