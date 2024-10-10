class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrace(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    private void backtrace(List<List<Integer>> result, List<Integer> temp, int start, int n, int k) {
        if (temp.size() == k) {
            result.add(new ArrayList<>(temp));
        } else {
            for (int i = start; i <= n; i++) {
                temp.add(i);
                backtrace(result, temp, i + 1, n, k);
                temp.remove(temp.size() - 1);
            }
        }
    }
}