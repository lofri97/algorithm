import java.util.stream.IntStream;

class Solution {
    private int[] RULE1 = new int[] {1,2,3,4,5};
    private int[] RULE2 = new int[] {2,1,2,3,2,4,2,5};
    private int[] RULE3 = new int[] {3,3,1,1,2,2,4,4,5,5};
    
    public int[] solution(int[] answers) {
        int[] count = new int[3];
        
        for (int i = 0; i < answers.length; i++) {
            int val = answers[i];
            
            if (val == RULE1[i%RULE1.length]) count[0] += 1;
            if (val == RULE2[i%RULE2.length]) count[1] += 1;
            if (val == RULE3[i%RULE3.length]) count[2] += 1;
        }
        
        int max = Math.max(count[0], Math.max(count[1],count[2]));
        
        return IntStream.range(0, 3)
            .filter(v -> count[v] == max)
            .map(v -> v + 1)
            .toArray();
    }
}