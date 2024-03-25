package practice;

/**
 * 코딩테스트 연습 > 탐욕법(Greedy) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42860">조이스틱</a>
 *
 */
public class S42860 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution("JEROEN") == 56);
        System.out.println(sol.solution("JAN") == 23);
    }

    static class Solution {
        public int solution(String name) {
            int answer = 0;
            int move = name.length() - 1;
            for (int i = 0 ; i < name.length() ; i++) {
                answer += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);

                int next = i + 1;
                while (next < name.length() && name.charAt(next) == 'A') {
                    next++;
                }
                move = Math.min(move, i*2 + name.length() - next);
                move = Math.min(move, (name.length() - next) * 2 + i);
            }
            return answer + move;
        }
    }
}

