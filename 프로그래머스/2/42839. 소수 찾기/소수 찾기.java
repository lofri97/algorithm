import java.util.*;

class Solution {
    public int solution(String numbers) {
        Set<Integer> set = new HashSet<>();
        
        char[] arr = numbers.toCharArray();
        boolean[] visited = new boolean[arr.length];
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            visited[i] = true;
            sb.append(arr[i]);
            getNumber(sb, arr, visited, set);
            sb.deleteCharAt(sb.length()-1);
            visited[i] = false;
        }
        
        return set.size();
    }
    
    void getNumber(StringBuilder sb, char[] numbers, boolean[] visited, Set<Integer> set) {
        Integer val = Integer.valueOf(sb.toString());
        
        if (isPrime(val)) set.add(val);
        if (sb.length() == numbers.length) return;
        
        for (int i = 0; i < numbers.length; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            sb.append(numbers[i]);
            getNumber(sb, numbers, visited, set);
            sb.deleteCharAt(sb.length()-1);
            visited[i] = false;
        }
    }
    
    boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        
        for (int i = 3; i <= (int) Math.sqrt(number); i+=2) {
            if (number%i == 0) return false;
        }
        return true;
    }
}