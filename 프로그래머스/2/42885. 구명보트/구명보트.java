import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int i = 0;
        int j = people.length - 1;
        
        Arrays.sort(people);
        
        for (; j > i; j--) {
            if (people[i] + people[j] <= limit) {
                answer++;
                i++;
            } else {
                answer++;
            }
        }
        if (i == j) {
            answer++;
        }
        return answer;
    }
}