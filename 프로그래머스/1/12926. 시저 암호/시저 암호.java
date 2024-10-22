class Solution {
    public String solution(String s, int n) {
        char[] arr = s.toCharArray();
        
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == ' ') continue;
            if (Character.isLowerCase(arr[i])) {
                arr[i] = (char) ((arr[i] + n - 'a') % 26 + 'a');
            } else {
                arr[i] = (char) ((arr[i] + n - 'A') % 26 + 'A');
            }
        }
        
        return new String(arr);
    }
}