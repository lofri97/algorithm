class Solution {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        
        while (n > 0) {
            int num = n % 3;
            
            if (num == 0) {
                sb.insert(0, 4);
                n = n/3-1;
            } else {
                sb.insert(0, num);
                n /= 3;
            }
        }
        return sb.toString();
    }
}