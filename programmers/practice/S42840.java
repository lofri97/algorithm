package practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 코딩테스트 연습 > 완전탐색 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42840">모의고사</a>
 *
 */
public class S42840 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(new int[]{1,2,3,4,5});
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[] a0 = new int[]{1, 2, 3, 4, 5};
            int[] a1 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
            int[] a2 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

            int[] scores = new int[3];
            for (int i = 0; i < answers.length; i++) {
                scores[0] += answers[i] == a0[i % a0.length] ? 1 : 0;
                scores[1] += answers[i] == a1[i % a1.length] ? 1 : 0;
                scores[2] += answers[i] == a2[i % a2.length] ? 1 : 0;
            }
            int max = Arrays.stream(scores).max().orElseThrow();
            ArrayList<Integer> answer = new ArrayList();

            for (int i = 0; i < 3; i++) {
                if (scores[i] == max) {
                    answer.add(i + 1);
                }
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}

