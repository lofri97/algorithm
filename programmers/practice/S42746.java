package practice;

import java.util.Arrays;

/**
 * 코딩테스트 연습 > 정렬 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42746">가장 큰 수</a>
 *
 */
public class S42746 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[] {0,0,0}));
    }
}

class Solution {
    public String solution(int[] numbers) {
        String[] strings = new String[numbers.length];

        for (int i = 0 ; i < numbers.length; i++) {
            strings[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strings, (o1, o2) -> (o2+o1).compareTo(o1+o2));
        String result = String.join("", strings);
        if (result.matches("^0*$"))
            return "0";
        return result;
    }
}