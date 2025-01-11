class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        for (int i = pat.length(); i <= myString.length(); i++) {
            if (pat.equals(myString.substring(i-pat.length(), i))) answer++;
        }
        return answer;
    }
}