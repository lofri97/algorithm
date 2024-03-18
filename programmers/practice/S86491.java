package practice;

/**
 * 코딩테스트 연습 > 완전탐색 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/86491">최소직사각형</a>
 *
 */
public class S86491 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(new int[][] {{60,50},{30,70},{60,30},{80,40}});
    }

    static class Solution {
        public int solution(int[][] sizes) {
            int w=0, h=0;
            for (int i = 0; i < sizes.length; i++) {
                w = Math.max(w, Math.max(sizes[i][0], sizes[i][1]));
                h = Math.max(h, Math.min(sizes[i][0], sizes[i][1]));
            }
            return w * h;
        }
    }
}

