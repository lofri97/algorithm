import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        
        int n = numbers.length - 1;
        int[] dp = new int[n+1];
        
        dp[n] = numbers[n];
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = Math.max(numbers[i], dp[i+1]);
        }
        
        for (int i = 0; i < n + 1; i++) {
            if (dp[i] > numbers[i]) {
                list.add(dp[i]);
            } else {
                list.add(-1);
            }
        }
        return list.stream().mapToInt(v->v).toArray();
    }
}

/** 
dp 를 이용해서 풀자.
뒤에서부터 가장 큰 수를 넣어서 앞으로 올 때마다 비교한다면 된다..!
**/