import java.util.*;

class Solution {
    private final Character[] CHARACTERS = { 'A', 'E', 'I', 'O', 'U' };
    
    public int solution(String word) {
        List<String> list = new ArrayList<>();
        dfs("", list);
        return list.indexOf(word);
    }
    
    void dfs(String word, List<String> list) {
        list.add(word);
        if (word.length() == 5) {
            return;
        }
        
        for (int i = 0; i < 5; i++) {
            dfs(word+CHARACTERS[i], list);   
        }
    }
}