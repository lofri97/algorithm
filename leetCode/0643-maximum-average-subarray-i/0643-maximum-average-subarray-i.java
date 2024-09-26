class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        int val;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        
        val = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i-k];
            if (sum > val) {
                val = sum;
            }
        }
        return (double) val / k;
    }
}