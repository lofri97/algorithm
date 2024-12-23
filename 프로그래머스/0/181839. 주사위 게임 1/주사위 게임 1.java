class Solution {
    public int solution(int a, int b) {
        boolean av = a % 2 == 1;
        boolean bv = b % 2 == 1;
        
        if (av && bv) {
            return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        } else if (!av && !bv) {
            return Math.abs(a - b);
        } else {
            return 2 * (a + b);
        }
    }
}