class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int f = nums[i];

            while (i + 1 < nums.length && nums[i] + 1 == nums[i+1]) {
                i++;
            }

            if (f != nums[i]) {
                result.add(String.format("%d->%d", f, nums[i]));
            } else {
                result.add(String.valueOf(f));
            }
        }
        return result;
    }
}