import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        Set<Integer> set = new HashSet<>();

        for (int del : delete_list) {
            set.add(del);
        }

        return IntStream.of(arr).filter(v -> !set.contains(v)).toArray();
    }
}