import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        
        if (numbers.length >= 4) {
            return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length-2]);
        } else {
            return numbers[numbers.length - 1] * numbers[numbers.length-2];
        }
    }
}