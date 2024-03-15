package practice;

import java.util.Arrays;

/**
 * 코딩테스트 연습 > 정렬 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42748">K번째 수</a>
 *
 */
public class S42748 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {1, 5, 2, 6, 3, 7, 4}, new int[][] {{2,5,3}, {4,4,1}, {1,7,3}});
    }

    static class Solution {

        public int[] solution(int[] array, int[][] commands) {
            int[] answer = new int[commands.length];

            for (int i = 0; i < answer.length; i++) {
                int[] tmp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
                Arrays.sort(tmp);
                answer[i] = tmp[commands[i][2] - 1];
            }
            return answer;
        }
    }
}