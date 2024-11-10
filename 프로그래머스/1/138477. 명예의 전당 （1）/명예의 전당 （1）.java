import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> scores = new ArrayList<>();
        for (int s : score) {
            insert(scores, s, k);
            answer.add(getLast(scores));
        }
        return answer.stream().mapToInt(v->v).toArray();
    }
    
    void insert(List<Integer> scores, int score, int k) {
        if (scores.size() < k) {
            scores.add(score);
        } else if (scores.get(k - 1) < score) {
            scores.remove(k-1);
            scores.add(score);
        }
        Collections.sort(scores, (v1, v2) -> v2 - v1);
    }
    
    Integer getLast(List<Integer> scores) {
        return scores.get(scores.size() - 1);
    }
}