package practice;

/**
 * 코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/43162">네트워크</a>
 *
 */
public class S43162 {
    public static void main(String[] args) {
        Solution sol1 = new Solution();
        System.out.println(sol1.solution(3, new int[][] {{1, 1, 0},{1,1,0},{0,0,1}}));
        Solution sol2 = new Solution();
        System.out.println(sol2.solution(3, new int[][] {{1, 1, 0},{1,1,1},{0,1,1}}));
    }

    static class Solution {
        boolean[] visited;
        int answer;
        int size;

        public int solution(int n, int[][] computers) {
            visited = new boolean[n];
            size = n;

            for (int i = 0 ; i < size; i++) {
                if (visited[i]) {
                    continue;
                }
                dfs(i, computers);
                answer++;
            }
            return answer;
        }

        void dfs(int idx, int[][] computers) {
            visited[idx] = true;
            for (int i = 0 ; i < size; i++) {
                int linked = computers[idx][i];
                if (linked == 1 && !visited[i]) {
                    dfs(i, computers);
                }
            }
        }
    }
}

