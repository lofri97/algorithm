import java.util.*;

class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        String[] arr = Integer.toString(n, k).replaceAll("0{1,}", " ").split(" ");
        
        for (String s : arr) {
            if (isPrime(Long.parseLong(s))) {
                answer++;
            }
        }
        
        return answer;
    }
    
    boolean isPrime(long num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (long i = 3; i <= Math.sqrt(num); i += 2) {
            if (num%i == 0) {
                return false;
            }
        }
        return true;
    }
}