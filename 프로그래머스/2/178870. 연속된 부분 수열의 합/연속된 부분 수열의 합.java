class Solution {
    public int[] solution(int[] sequence, int k) {
        int[] answer = new int[2];
        int s = 0;
        int e = 0;
        int sum = 0;
        int len = Integer.MAX_VALUE;
        while (true) {
            if (sum >= k) {
                if (sum == k && e - s < len) {
                    len = e - s;
                    answer[0] = s;
                    answer[1] = e - 1;
                }
                sum -= sequence[s++];
            } else {
                if (e == sequence.length) break;
                sum += sequence[e++];
            }
        }
        return answer;
    }
}