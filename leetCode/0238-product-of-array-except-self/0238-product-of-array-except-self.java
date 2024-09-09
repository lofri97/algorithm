class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int zeroCount=0;

        for (int i = 0 ; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                product *= nums[i];
            }
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (zeroCount == 0) {
                result[i] = product / nums[i];
            } else if (zeroCount == 1) {
                if (nums[i] == 0) {
                    result[i] = product;
                }
            }
        }
        return result;
    }
}