class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] targets = new int[] {'b'-'a', 'a'-'a', 'l'-'a', 'o'-'a', 'n'-'a'};
        int[] count = new int['z' - 'a' + 1];
        int result = Integer.MAX_VALUE;
        
        for (char c : text.toCharArray()) {
            count[c - 'a']++;
        }

        for (int i : targets) {
            int div = 1;
            if (i == 'l'-'a' || i == 'o' - 'a') {
                div = 2;
            }
            if (result > count[i] / div) {
                result = count[i] / div;
            }
        }
        return result;
    }
}