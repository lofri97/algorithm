package practice;

import java.util.PriorityQueue;

/**
 * 코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/1844">게임 맵 최단거리</a>
 * <p>
 * DFS 사용으로 인한 효율성 테스트 실패<br>
 *
 */
public class S1844F {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(new int[][] {{60,50},{30,70},{60,30},{80,40}});
    }

    static class Solution {
        final int[] dy = new int[] {0, 1, 0, -1};
        final int[] dx = new int[] {1, 0, -1, 0};
        public int solution(int[][] maps) {
            boolean[][] visited = new boolean[maps.length][maps[0].length];
            return dfs(0, 0, maps, visited, 1);
        }

        int dfs(int y, int x, int[][] maps, boolean[][] visited, int count) {
            if (y == visited.length-1 && x == visited[0].length-1) {
                return count;
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0 ; i < 4; i++) {
                int my = y + dy[i];
                int mx = x + dx[i];

                if (my < 0 || my >= visited.length || mx < 0 || mx >= visited[0].length) {
                    continue;
                }
                if (visited[my][mx]) {
                    continue;
                }

                if (maps[my][mx] == 0) {
                    continue;
                }
                visited[y][x] = true;
                pq.add(dfs(my, mx, maps, visited, count + 1));
                visited[y][x] = false;
            }
            while (!pq.isEmpty() && pq.peek() == -1) {
                pq.poll();
            }

            if (pq.isEmpty()) {
                return -1;
            }
            return pq.poll();
        }
    }
}

