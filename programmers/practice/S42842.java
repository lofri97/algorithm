package practice;

/**
 * 코딩테스트 연습 > 완전탐색 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42842">카펫</a>
 *
 */
public class S42842 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(24, 24);
    }

    static class Solution {
        public int[] solution(int brown, int yellow) {
            for (int i = yellow; i > 0; i--) {
                if (yellow%i==0) {
                    if (2* i + 2 * (yellow/i) + 4 == brown) {
                        return new int[] {i+2, yellow/i + 2};
                    }
                }
            }
            return new int[] {-1, -1};
        }
    }
}

