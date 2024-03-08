package practice;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 코딩테스트 연습 > 스택/큐 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42587">프로세스</a>
 * <p>시간 복잡도 : O(n)
 * <p>공간 복잡도 : O(n)
 */
public class S42587 {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {1, 2, 3, 4, 5}, 3);

    }

    static class Solution {
        public int solution(int[] priorities, int location) {
            PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
            Queue<Process> q = new LinkedList<>();

            for (int i = 0 ; i < priorities.length; i++) {
                pq.offer(priorities[i]);
                q.offer(new Process(i, priorities[i]));
            }

            int count = 0;
            while (!q.isEmpty()) {
                Process process = q.poll();

                if (process.priority == pq.peek()) {
                    count++;
                    pq.poll();
                    if (process.idx == location)
                        return count;
                } else {
                    q.offer(process);
                }
            }
            return -1;
        }

        static class Process implements Comparable<Process>{
            int idx;
            int priority;

            Process(int idx, int priority) {
                this.idx = idx;
                this.priority = priority;
            }

            @Override
            public int compareTo(Process o) {
                return o.priority - priority;
            }
        }
    }
}
