class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        sb.reverse();
        int[] answer = new int[sb.length()];
        
        int idx = 0;
        for (char c : sb.toString().toCharArray()) {
            answer[idx++] = c - '0';
        }
        return answer;
    }
}