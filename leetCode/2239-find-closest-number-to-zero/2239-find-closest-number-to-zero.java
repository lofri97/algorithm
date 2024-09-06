class Solution {
    public int findClosestNumber(int[] nums) {
        int result = Integer.MAX_VALUE;
        int i = nums.length - 1;
        while (result != 0 && i >= 0) {
            if (Math.abs(nums[i]) < Math.abs(result) || nums[i] == Math.abs(result)) {
                result = nums[i];
            }
            i--;
        }
        return result;
    }
}