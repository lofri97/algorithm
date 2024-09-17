class Solution {
    public char[] reverseString(char[] s) {
        char tmp;
        int n = s.length - 1;

        for (int i = 0; i < s.length / 2; i++) {
            tmp = s[n - i];
            s[n - i] = s[i];
            s[i] = tmp;
        }
        return s;
    }
}