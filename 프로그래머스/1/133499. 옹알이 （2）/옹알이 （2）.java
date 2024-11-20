class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for (String b : babbling) {
            b = b.replaceAll("ayaaya|yeye|woowoo|mama","1");
            b = b.replaceAll("aya|ye|woo|ma"," ");
            b = b.replaceAll(" ","");
            if(b.equals("")) answer++;
        }
        return answer;
    }
}