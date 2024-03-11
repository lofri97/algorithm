package practice;

import java.util.PriorityQueue;

/**
 * 코딩테스트 연습 > 힙(Heap) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42626">더 맵게</a>
 *
 * <P>시간 복잡도 : O(n)
 * <P>공간 복잡도 : O(n)
 */
public class S42626 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                (solution.solution(new int[] {1, 2, 3, 9, 10, 12}, 7) == 2) + " " +
                (solution.solution(new int[] {12, 10, 9, 3, 2, 1}, 7) == 2) + " " +
                (solution.solution(new int[] {1, 2}, 10) == -1)
        );
    }

    static class Solution {
        public int solution(int[] scoville, int K) {
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            int answer = 0;
            for (int v : scoville) {
                pq.offer(v);
            }
            while (pq.peek() < K) {
                if  (pq.size() < 2) {
                    return -1;
                }
                Integer v1 = pq.poll();
                Integer v2 = pq.poll();
                pq.offer(v1 + v2 * 2);
                answer++;
            }
            return answer;
        }
    }
}