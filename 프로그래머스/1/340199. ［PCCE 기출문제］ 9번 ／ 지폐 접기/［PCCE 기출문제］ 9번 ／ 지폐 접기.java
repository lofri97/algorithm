class Solution {
    public int solution(int[] wallet, int[] bill) {
        int wMax = Math.max(wallet[0], wallet[1]);
        int wMin = Math.min(wallet[0], wallet[1]);
        
        int bMax = Math.max(bill[0], bill[1]);
        int bMin = Math.min(bill[0], bill[1]);
        
        int count = 0;
        while (bMax > wMax || bMin > wMin) {
            int tmp1 = bMax / 2;
            int tmp2 = bMin;
            
            bMax = Math.max(tmp1, tmp2);
            bMin = Math.min(tmp1, tmp2);
            count++;
        }
        return count;
    }
}