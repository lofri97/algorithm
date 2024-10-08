class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrace(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrace(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        result.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrace(nums, i + 1, path, result);
            path.remove(path.size() - 1);
        }
    }
}