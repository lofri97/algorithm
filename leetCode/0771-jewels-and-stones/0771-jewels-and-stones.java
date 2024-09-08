class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Boolean> jMap = new HashMap<>();
        int result = 0;

        for (char jewel : jewels.toCharArray()) {
            jMap.put(jewel, true);
        }

        for (char stone : stones.toCharArray()) {
            if (jMap.containsKey(stone)) {
                result++;
            }
        }
        return result;
    }
}