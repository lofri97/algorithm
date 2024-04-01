package practice;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 코딩테스트 연습 > 힙(Heap) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42628">이중우선순위큐</a>
 *
 */
public class S42628 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));
        System.out.println(Arrays.toString(sol.solution(new String[]{"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));
    }

    static class Solution {
        public int[] solution(String[] operations) {
            SortedLinkedList sll = new SortedLinkedList();

            for (String operation : operations) {
                char c = operation.charAt(0);

                if (c == 'I') {
                    Integer num = Integer.valueOf(operation.substring(2));
                    sll.add(num);
                } else {
                    if (sll.size() == 0) {
                        continue;
                    }
                    if (operation.charAt(2) == '-') {
                        sll.removeFirst();
                    } else {
                        sll.removeLast();
                    }
                }
            }
            if (sll.isEmpty()) {
                return new int[] {0,0};
            } else {
                return new int[] {sll.getLast(), sll.getFirst()};
            }
        }
    }

    static class SortedLinkedList extends LinkedList<Integer> {

        @Override
        public boolean add(Integer input) {
            int idx = 0;
            for (Integer n : this) {
                if (input - n > 0) {
                    idx++;
                }
            }
            super.add(idx, input);
            return true;
        }
    }
}

