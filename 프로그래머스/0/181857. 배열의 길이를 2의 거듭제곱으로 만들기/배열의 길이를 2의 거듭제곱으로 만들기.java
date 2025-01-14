class Solution {
    public int[] solution(int[] arr) {
        int length = arr.length;
        int n = 1;
        while (length > n) {
            n = n * 2;
        }
        
        int[] answer = new int[n];
        
        for (int i = 0; i < length; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}