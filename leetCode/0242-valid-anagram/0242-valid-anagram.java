class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] alphaCount = new int[26];

        for (char c : s.toCharArray()) {
            alphaCount[c - 'a']++;
        }

        for (char c : t.toCharArray()) {
            if (alphaCount[c - 'a'] == 0) {
                return false;
            }
            alphaCount[c-'a']--;
        }
        return true;
    }
}