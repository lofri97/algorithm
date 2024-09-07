class Solution {
    public boolean isSubsequence(String s, String t) {
        int is = s.length() - 1;
        int it = t.length() - 1;

        while (is >= 0 && it >= 0) {
            if (t.charAt(it) == s.charAt(is)) {
                is--;
            }
            it--;
        }

        return is == -1;
    }
}