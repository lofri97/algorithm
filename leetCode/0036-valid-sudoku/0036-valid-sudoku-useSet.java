class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> seen = new HashSet<>();
        int skip = '.' - '0';

        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                int val = board[y][x] - '0';
                if (val == skip) {
                    continue;
                }
                if (
                    !seen.add(1000 + 100 * val + y) ||
                    !seen.add(2000 + 100 * val + x) ||
                    !seen.add(3000 + 100 * val + (y/3)*3+x/3)
                ) {
                    return false;
                }
            }
        }
        return true;
    }
}