package practice;

/**
 * 코딩테스트 연습 > 탐욕법(Greedy) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42883">큰 수 만들기</a>
 *
 */
public class S42883 {
    public static void main(String[] args) {
        Solution sol = new Solution();
    }

    static class Solution {
        public String solution(String number, int k) {
            StringBuilder sb = new StringBuilder();

            int idx = 0;
            char[] n = number.toCharArray();
            for (int i = 0 ; i < number.length() - k; i++) {
                char max = '0';
                for (int j = idx; j <= i + k; j++) {
                    if (n[j] > max) {
                        max = n[j];
                        idx = j + 1;
                    }
                }
                sb.append(max);
            }
            return sb.toString();
        }
    }
}

