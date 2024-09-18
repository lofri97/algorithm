class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            while (!Character.isAlphabetic(s.charAt(l)) && !Character.isDigit(s.charAt(l)) && l < r) {
                l++;
            }
            while (!Character.isAlphabetic(s.charAt(r)) && !Character.isDigit(s.charAt(r)) && l < r) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))) {
                return false;
            }
            System.out.println("l:" + s.charAt(l) + " r:" + s.charAt(r));
            l++;
            r--;
        }
        return true;
    }
}