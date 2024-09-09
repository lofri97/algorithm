class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] letterCounter = new int['z'-'a' + 1];
        for (char c : magazine.toCharArray()) {
            letterCounter[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letterCounter[c - 'a'] == 0) {
                return false;
            }
            letterCounter[c - 'a']--;
        }
        return true;
    }
}