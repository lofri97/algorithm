class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int yl = 0, yr = matrix.length - 1;
        int ym = 0;

        while (yl <= yr) {
            ym = yl + (yr - yl) / 2;
            if (matrix[ym][0] <= target && matrix[ym][matrix[0].length - 1] >= target) {
                break;
            } else if (matrix[ym][0] < target) {
                yl = ym + 1;
            } else {
                yr = ym - 1;
            }
        }

        int xl = 0, xr = matrix[0].length - 1;
        while (xl <= xr) {
            int xm = xl + (xr - xl) / 2;

            if (matrix[ym][xm] == target) {
                return true;
            } else if (matrix[ym][xm] < target) {
                xl = xm + 1;
            } else {
                xr = xm - 1;
            }
        }
        return false;
    }
}