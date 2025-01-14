class Solution {
    public String solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        
        while (true) {
            if (sb.toString().endsWith(pat)) {
                return sb.toString();
            }
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}