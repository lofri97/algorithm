class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length - 1;
        int start = 0, end = n;
        int[] result = new int[n + 1];

        for (int i = n; i >= 0; i--) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                result[i] = nums[start] * nums[start];
                start++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }
        }
        return result;
    }
}