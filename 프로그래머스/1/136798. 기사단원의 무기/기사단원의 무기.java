class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        for (int i = 1; i <= number; i++) {
            answer += calc(i, limit, power);
        }
        return answer;
    }
    
    int calc(int number, int limit, int power) {
        int count = 0;
        
        for (int i = 1; i * i<= number; i++) {
            if (i * i == number) count++;
            else if (number % i == 0) count += 2;
            if (count > limit) return power;
        }
        return count;
    }
}