class Solution {
    int answer = 0;
    
    public int solution(int[] nums) {

        dfs(0, 0, 0, nums);
        
        return answer;
    }
    
    void dfs(int start, int sum, int count, int[] nums) {
        if (count == 3) {
            if (isPrime(sum)) {
                answer++;
            }
            return;
        }
        
        for (int i = start; i < nums.length; i++) {
            dfs(i + 1, sum + nums[i], count + 1, nums);
        }
    }
    
    boolean isPrime(int n) {
        if (n==1) return false;
        if (n==2) return true;
        if (n%2 == 0) return false;
        
        for (int i = 3; i <= Math.sqrt(n); i+=2) {
            if (n%i==0) return false;
        }
        return true;
    }
}