class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (Character letter : magazine.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (Character letter : ransomNote.toCharArray()) {
            if (!map.containsKey(letter) || map.get(letter) == 0) {
                return false;
            }
            map.replace(letter, map.get(letter) - 1);
        }
        return true;
    }
}