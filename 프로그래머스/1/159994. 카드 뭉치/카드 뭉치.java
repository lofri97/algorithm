class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        
        int s1 = 0;
        int s2 = 0;
        
        for (String g : goal) {
            if (s1 < cards1.length && cards1[s1].equals(g)) {
                s1++;
                continue;
            }
            if (s2 < cards2.length && cards2[s2].equals(g)) {
                s2++;
                continue;
            }
            
            return "No";
        }
        
        return "Yes";
    }
}