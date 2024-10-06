class Solution {
    public int rob(int[] nums) {
        int rob = 0, notRob = 0;

        for (int i = 0; i < nums.length; i++) {
            int newRob = notRob + nums[i];
            int newNotRob = Math.max(notRob, rob);
            rob = newRob;
            notRob = newNotRob;
        }
        return Math.max(rob, notRob);
    }
}