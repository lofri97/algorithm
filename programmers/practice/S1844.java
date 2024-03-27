package practice;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 코딩테스트 연습 > 깊이/너비 우선 탐색(DFS/BFS) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/1844">게임 맵 최단거리</a>
 * <p>
 * BFS 사용<br>
 *
 */
public class S1844 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.bfs(new int[][] {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}})==11);
        System.out.println(sol.bfs(new int[][] {{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}})==-1);
        System.out.println(sol.bfs(new int[][] {{1, 1, 0, 1, 1, 1, 1}, {0, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 0, 1}, {1, 0, 1, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 0, 1}})==14);
    }

    static class Solution {
        private final int[] dy = new int[] {0, 1, 0, -1};
        private final int[] dx = new int[] {1, 0, -1, 0};

        static class Point {
            private int y, x, count;
            Point(int y, int x, int count) {
                this.y = y;
                this.x = x;
                this.count = count;
            }
        }

        public int solution(int[][] maps) {
            return bfs(maps);
        }

        int bfs(int[][] maps) {
            boolean[][] visited = new boolean[maps.length][maps[0].length];
            Queue<Point> q = new LinkedList<>();
            q.offer(new Point(0,0,1));
            visited[0][0] = true;

            while (!q.isEmpty()) {
                Point p = q.poll();

                if (p.y == visited.length - 1 && p.x == visited[0].length - 1) {
                    return p.count;
                }

                for (int i = 0; i < 4; i++) {
                    int ny = p.y + dy[i];
                    int nx = p.x + dx[i];

                    if (ny < 0 || ny >= visited.length || nx < 0 || nx >= visited[0].length) {
                        continue;
                    }
                    if (maps[ny][nx] == 0) {
                        continue;
                    }
                    if (visited[ny][nx]) {
                        continue;
                    }
                    q.offer(new Point(ny, nx, p.count + 1));
                    visited[ny][nx] = true;
                }
            }
            return -1;
        }
    }
}

