class Solution {
    public String[] solution(String my_string) {
        my_string = my_string.trim().replaceAll(" {2,}", " ");
        return my_string.split(" ");
    }
}