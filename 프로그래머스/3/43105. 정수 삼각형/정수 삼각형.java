class Solution {
    public int solution(int[][] triangle) {
        for (int y = 1; y < triangle.length; y++) {
            for (int x = 0; x <= y; x++) {
                if (x == 0) {
                    triangle[y][x] = triangle[y-1][x] + triangle[y][x];
                } else if (x == y) {
                    triangle[y][x] = triangle[y-1][x-1] + triangle[y][x];
                } else {
                    triangle[y][x] = Math.max(triangle[y-1][x-1], triangle[y-1][x]) + triangle[y][x];
                }
            }
        }
        int max = Integer.MIN_VALUE;
        for (int val : triangle[triangle.length-1]) {
            max = Math.max(max, val);
        }
        return max;
    }
}