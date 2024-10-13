class Solution {
    boolean solution(String s) {
        int flag = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                flag++;
            } else {
                flag--;
            }
            if (flag < 0) {
                return false;
            }
        }
        return flag == 0;
    }
}