package practice;

import java.util.PriorityQueue;

/**
 * 코딩테스트 연습 > 스택/큐 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42627">디스크 컨트롤러</a>
 *
 * 시간 복잡도 : O(n)
 * 공간 복잡도 : O(n)
 */
public class S42627 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                (solution.solution(new int[][] {{0,3}, {1,9}, {2,6}}) == 9) + "\n" +
                (solution.solution(new int[][] {{0,3}, {5,1}, {6,2}}) == 2)
        );
    }

    static class Solution {
        public int solution(int[][] jobs) {
            int size = jobs.length;
            int answer = 0;

            PriorityQueue<Job> requestQueue = new PriorityQueue<>((o1, o2) -> {
                if (o1.requestMs == o2.requestMs) {
                    return o1.progressMs - o2.progressMs;
                } return o1.requestMs - o2.requestMs;
            });
            PriorityQueue<Job> waitQueue = new PriorityQueue<>((o1, o2) -> o1.progressMs - o2.progressMs);

            for (int i = 0; i < size; i++) {
                requestQueue.offer(new Job(jobs[i][0], jobs[i][1]));
            }

            int count = 0;
            int t = 0;
            while (count < size) {
                while (!requestQueue.isEmpty() && requestQueue.peek().requestMs <= t) {
                    waitQueue.offer(requestQueue.poll());
                }

                if (waitQueue.isEmpty()) {
                    Job job = requestQueue.peek();
                    t = job.requestMs;
                } else {
                    Job job = waitQueue.poll();
                    t += job.progressMs;
                    answer += t - job.requestMs;
                    count++;
                }
            }
            return answer / size;
        }

        static class Job {
            int requestMs;
            int progressMs;

            Job(int requestMs, int progressMs) {
                this.requestMs = requestMs;
                this.progressMs = progressMs;
            }
        }
    }
}