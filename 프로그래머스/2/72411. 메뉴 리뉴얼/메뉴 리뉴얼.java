import java.util.*;
import java.util.stream.*;

class Solution {

    public String[] solution(String[] orders, int[] course) {

        List<Set<Character>> orderList = getOrderList(orders);
        List<Integer> courseList = getCourseList(course);

        Map<Integer, Map<String, Integer>> map = new HashMap<>();
        checkCombination('A', new HashSet<>(), orderList, courseList, map);

        List<String> answer = new ArrayList<>();

        for (Integer key : map.keySet()) {
            Map<String, Integer> sMap = map.get(key);

            for (String sKey : sMap.keySet()) {
                answer.add(sKey);
            }
        }
        Collections.sort(answer);
        return answer.toArray(String[]::new);
    }

    void checkCombination(char start, Set<Character> selected, List<Set<Character>> orderList, List<Integer> courseList, Map<Integer, Map<String, Integer>> map) {
        if (selected.size() > courseList.get(courseList.size() - 1)) return;
        if (courseList.contains(selected.size())) {

            int count = 0;
            for (Set<Character> order : orderList) {
                if (!order.containsAll(selected)) continue;
                count++;
            }

            if (count >= 2) {
                Map<String, Integer> sMap = map.getOrDefault(selected.size(), new HashMap<>());
                String value = selected.stream().map(String::valueOf).sorted().collect(Collectors.joining(""));

                if (sMap.isEmpty()) {
                    sMap.put(value, count);
                } else {
                    int inputCount = sMap.get(sMap.keySet().stream().findFirst().get());
                    if (inputCount == count) {
                        sMap.put(value, count);
                    } else if (inputCount < count) {
                        sMap.clear();
                        sMap.put(value, count);
                    }
                }
                map.put(selected.size(), sMap);
            }
        }

        for (char i = start; i <= 'Z'; i++) {
            selected.add(i);
            checkCombination((char) (i+1), selected, orderList, courseList, map);
            selected.remove(i);
        }
    }

    List<Set<Character>> getOrderList(String[] orders) {
        List<Set<Character>> orderList = new ArrayList<>();
        for (String order : orders) {
            Set<Character> orderSet = new HashSet<>();

            for (char c : order.toCharArray()) {
                orderSet.add(c);
            }
            orderList.add(orderSet);
        }
        return orderList;
    }

    List<Integer> getCourseList(int[] course) {
        List<Integer> courseList = new ArrayList<>();
        for (int c : course) {
            courseList.add(c);
        }
        return courseList;
    }
}