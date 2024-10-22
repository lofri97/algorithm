class Solution {
    public int[] solution(String s) {
        int answer = 0;
        
        int i = 0;
        while (!s.equals("1")) {
            i++;
            int length = s.length();
            s = s.replaceAll("0", "");
            answer += length - s.length();
            s = Integer.toString(s.length(), 2);
        }
        
        return new int[] {i, answer};
    }
}