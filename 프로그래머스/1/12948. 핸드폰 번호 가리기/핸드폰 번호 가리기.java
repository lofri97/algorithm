class Solution {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }
        
        char[] c = phone_number.toCharArray();
        for (int i = phone_number.length() - 4; i < phone_number.length(); i++) {
            sb.append(String.valueOf(c[i]));
        }
        return sb.toString();
    }
}