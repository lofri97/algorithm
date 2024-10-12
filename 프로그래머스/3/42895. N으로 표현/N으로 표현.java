import java.util.*;

class Solution {
    public int solution(int N, int number) {
        // 동적 계획법을 위한 Map, i번만에 만들 수 있는 숫자들의 Set을 저장
        Map<Integer, Set<Integer>> dp = new HashMap<>();
        
        // 1 ~ 8까지의 HashSet을 초기화
        for (int i = 1; i < 9; i++) {
            dp.put(i, new HashSet<>());
        }

        // N을 i번 반복한 수를 미리 각 Set에 넣어줌 (예: 5, 55, 555, ...)
        for (int i = 1; i < 9; i++) {
            int repeatedN = Integer.parseInt(String.valueOf(N).repeat(i));
            dp.get(i).add(repeatedN);
        }
        
        // 1번만에 만들 수 있는 수와 동일하면 바로 1 반환
        if (N == number) {
            return 1;
        }

        // 2 ~ 8번까지 숫자 만들기
        for (int i = 2; i < 9; i++) {
            Set<Integer> set = dp.get(i);
            
            // 이전 단계의 연산 결과를 기반으로 새로운 숫자 추가
            for (int j = 1; j < i; j++) {
                for (Integer num1 : dp.get(j)) {
                    for (Integer num2 : dp.get(i-j)) {
                        set.add(num1 + num2);  // 덧셈
                        set.add(num1 - num2);  // 뺄셈
                        set.add(num1 * num2);  // 곱셈
                        if (num2 != 0) {
                            set.add(num1 / num2);  // 나눗셈 (0으로 나누기 방지)
                        }
                    }
                }
            }

            // 결과에 원하는 숫자가 있으면 그때의 i를 반환
            if (set.contains(number)) {
                return i;
            }
        }
        
        // 8번 이하로 표현할 수 없을 때 -1 반환
        return -1;
    }
}
