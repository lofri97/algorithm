package practice;

import java.util.*;

/**
 * 코딩테스트 연습 > 스택/큐 >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42583">다리를 지나는 트럭</a>
 *
 * <P>시간 복잡도 : O(n)
 * <P>공간 복잡도 : O(n)
 */
public class S42583 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(
                solution.solution(2, 10, new int[]{7,4,5,6}) + "," +
                solution.solution(100, 100, new int[]{10}) + "," +
                solution.solution(100, 100, new int[]{10,10,10,10,10,10,10,10,10,10})
        );
    }

    static class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            Queue<Truck> queue = new LinkedList<>();
            Bridge bridge = new Bridge(weight, bridge_length);

            int result = 0;


            for (int truckWeight : truck_weights) {
                queue.offer(new Truck(truckWeight));
            }

            while (!queue.isEmpty()) {
                result++;
                bridge.doProgress();
                if (bridge.add(queue.peek())) {
                    queue.poll();
                }
            }

            while (bridge.isTruck()) {
                bridge.doProgress();
                result++;
            }
            return result;
        }

        static class Bridge {
            int maxWeight;
            int currentWeight = 0;
            int length;
            List<Truck> trucks = new ArrayList<>();

            Bridge(int maxWeight, int length) {
                this.maxWeight = maxWeight;
                this.length = length;
            }

            void doProgress() {
                trucks.forEach(v->v.progress++);
                if (!trucks.isEmpty() && trucks.get(0).progress > this.length) {
                    Truck removed = trucks.remove(0);
                    currentWeight-= removed.weight;
                }
            }

            boolean add(Truck truck) {
                if (maxWeight >= currentWeight + truck.weight) {
                    trucks.add(truck);
                    currentWeight += truck.weight;
                    truck.progress++;
                    return true;
                }
                else {
                    return false;
                }
            }

            boolean isTruck() {
                return !trucks.isEmpty();
            }
        }

        static class Truck {
            int weight;
            int progress = 0;

            Truck(int weight) {
                this.weight = weight;
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Truck truck = (Truck) o;
                return weight == truck.weight && progress == truck.progress;
            }

            @Override
            public int hashCode() {
                return Objects.hash(weight, progress);
            }
        }
    }
}