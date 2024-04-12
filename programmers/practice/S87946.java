package practice;

/**
 * 코딩테스트 연습 > 완전탐색 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/87946">피로도</a>
 *
 */
public class S87946 {
    public static void main(String[] args) {
        Solution sol = new Solution();
    }

    static class Solution {
        boolean[] visited;
        int count = 0;

        public int solution(int k, int[][] dungeons) {
            visited = new boolean[dungeons.length];
            dfs(0, k, dungeons);
            return count;
        }

        void dfs(int depth, int n, int[][] dungeons) {

            for (int i = 0; i < dungeons.length; i++) {
                if (visited[i] || dungeons[i][0] > n) {
                    continue;
                }
                visited[i] = true;
                dfs(depth + 1, n - dungeons[i][1], dungeons);
                visited[i] = false;
            }
            count = Math.max(count, depth);
        }
    }
}

