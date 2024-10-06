class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] arr = new int[cost.length];
        arr[0] = cost[0];
        arr[1] = cost[1];

        for (int i = 2; i < cost.length; i++) {
            if (arr[i - 1] < arr[i - 2]) {
                arr[i] = arr[i - 1] + cost[i];
            } else {
                arr[i] = arr[i - 2] + cost[i];
            }
        }
        if (arr[cost.length - 1] < arr[cost.length-2]) {
            return arr[cost.length - 1];
        } 
        return arr[cost.length -2];
    }
}