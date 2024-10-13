import java.util.*;

class Solution {
    public int solution(String begin, String target, String[] words) {
        int[] visited = new int[words.length];
        Queue<Integer> queue = new LinkedList<>();
        
        for (int i = 0; i < words.length; i++) {
            if (isOnlyOneDiff(begin, words[i])) {
                visited[i] = 1;
                queue.add(i);
            }
        }
        
        while (!queue.isEmpty()) {
            int currentIdx = queue.poll();
            String currentStr = words[currentIdx];
            
            if (currentStr.equals(target)) {
                return visited[currentIdx];
            }
            
            for (int i = 0; i < words.length; i++) {
                if (visited[i] == 0 && isOnlyOneDiff(currentStr, words[i])) {
                    queue.add(i);
                    visited[i] = visited[currentIdx] + 1;
                }
            }
        }
        return 0;
    }
    
    boolean isOnlyOneDiff(String str1, String str2) {
        int diff = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diff++;
            }
        }
        return diff == 1;
    }
}