import java.util.*;

class Solution {
    public int[] solution(String myString) {
        String[] strs = myString.split("x", -1);
        return Arrays.stream(strs).mapToInt(v->v.length()).toArray();
    }
}