class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Map<Character, Boolean>> sbCache = new HashMap<>();
        Map<Integer, Map<Character, Boolean>> rCache = new HashMap<>();
        Map<Integer, Map<Character, Boolean>> cCache = new HashMap<>();

        
        for (int y = 0; y < board.length; y++) {
            for (int x = 0; x < board[y].length; x++) {
                int sbIdx = (y / 3) * 3 + x / 3;
                char val = board[y][x];
                
                if (val == '.') {
                    continue;
                }

                if (isExist(sbCache, sbIdx, val) ||
                    isExist(rCache, y, val) ||
                    isExist(cCache, x, val)
                ) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isExist(Map<Integer, Map<Character, Boolean>> map, int idx, char val) {
        Map<Character, Boolean> innerMap = map.getOrDefault(idx, new HashMap<>());

        if (innerMap.containsKey(val)) {
            return true;
        } else {
            innerMap.put(val, true);
            map.put(idx, innerMap);
        }
        return false;
    }
}