package practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 코딩테스트 연습 > 스택/큐 > 기능개발
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42586">기능개발</a>
 *
 * 시간 복잡도 : O(n)
 * 공간 복잡도 : O(n)
 */
public class S42586 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5});
    }

    static class Solution {
        public int[] solution(int[] progresses, int[] speeds) {
            ArrayList<Integer> result = new ArrayList<>();
            Queue<Integer> queue = new LinkedList<>();

            for (int i = 0 ; i < progresses.length; i++) {
                int requiredDay = (100 - progresses[i]) / speeds[i];

                if ((100 - progresses[i]) % speeds[i] != 0) {
                    requiredDay++;
                }

                queue.offer(requiredDay);
            }


            while (!queue.isEmpty()) {
                int num = 1;
                Integer requiredDay = queue.poll();

                while (!queue.isEmpty() && requiredDay >= queue.peek()) {
                    queue.poll();
                    num++;
                }
                result.add(num);
            }
            return result.stream().mapToInt(v->v).toArray();
        }
    }
}