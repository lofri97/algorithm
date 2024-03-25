package practice;

import java.util.HashSet;

/**
 * 코딩테스트 연습 > 완전탐색 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42839">소수찾기</a>
 *
 */
public class S42839 {
    public static void main(String[] args) {
        Solution sol1 = new Solution();
        Solution sol2 = new Solution();
        System.out.println(sol1.solution("17") == 3);
        System.out.println(sol2.solution("011") == 2);
    }

    static class Solution {
        HashSet<Integer> set = new HashSet<>();

        public int solution(String numbers) {
            int answer = 0;
            boolean[] visited = new boolean[numbers.length()];
            int[] pieces = new int[numbers.length()];

            for (int i = 0 ; i < numbers.length(); i++) {
                pieces[i] = Character.getNumericValue(numbers.charAt(i));
            }

            dfs(0, pieces, visited, 0);

            for (Integer number : set) {
                if (isPrime(number))
                    answer++;
            }

            return answer;
        }

        void dfs(int number, int[] pieces, boolean[] visited, int depth) {
            if (pieces.length == depth) {
                return;
            }

            for (int i = 0 ; i < pieces.length; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    int tmp = number * 10 + pieces[i];
                    set.add(tmp);
                    dfs(tmp, pieces, visited, depth + 1);
                    visited[i] = false;
                }
            }
        }

        boolean isPrime(int number) {
            if (number < 2) {
                return false;
            }
            for (int i = 2; i <= (int)Math.sqrt(number); i+=2) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

