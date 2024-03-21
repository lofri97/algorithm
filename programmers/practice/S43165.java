package practice;

/**
 * 코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/43165">타겟 넘버</a>
 *
 */
public class S43165 {
    public static void main(String[] args) {
        Solution sol1 = new Solution();
        System.out.println(sol1.solution(new int[] {1,1,1,1,1}, 3) == 5);
        Solution sol2 = new Solution();
        System.out.println(sol2.solution(new int[] {4,1,2,1}, 4) == 2);
    }

    static class Solution {
        int answer = 0;
        public int solution(int[] numbers, int target) {
            dfs(numbers, target, 0, 0);
            return answer;
        }

        void dfs(int[] numbers, int target, int i, int sum) {
            if (i==numbers.length) {
                if (target == sum) answer++;
            } else {
                dfs(numbers, target, i+1, sum + numbers[i]);
                dfs(numbers, target, i+1, sum - numbers[i]);
            }
        }
    }
}

