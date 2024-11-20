import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] counts = new int[N+2];
        int[] sums = new int[N+2];
        
        for (int stage : stages) {
            counts[stage]++;
        }
        
        sums[N+1] = counts[N+1];
        for (int i = N; i >= 1; i--) {
            sums[i] = counts[i] + sums[i+1];
        }
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            answer.add(i);
        }
        
        Collections.sort(answer, (v1, v2) -> {
            double f1 = counts[v1] / (double) sums[v1];
            double f2 = counts[v2] / (double) sums[v2];
                         
            if (f1 == f2) {
                return (int) (v1 - v2);
            } else if (f2 < f1) {
                return -1;
            } else if (f2 > f1) {
                return 1;
            } else
                return 0;
        });
        
        return answer.stream().mapToInt(v->v).toArray();
    }
}