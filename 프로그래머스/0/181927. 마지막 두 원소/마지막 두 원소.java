class Solution {
    public int[] solution(int[] nl) {
        int[] answer = new int[nl.length + 1];
        
        for (int i = 0; i < nl.length; i++) {
            answer[i] = nl[i];
        }
        
        answer[nl.length] = 
            nl[nl.length - 1] > nl[nl.length - 2] ? nl[nl.length - 1] - nl[nl.length - 2] : nl[nl.length - 1] * 2;
        return answer;
    }
}