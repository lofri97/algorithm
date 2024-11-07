class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        char[] arr = t.toCharArray();
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < p.length(); i++) {
            sb.append(arr[i]);
        }
        
        if (Long.parseLong(sb.toString()) <= Long.parseLong(p)) {
            answer++;
        }
        
        for (int i = p.length(); i < t.length(); i++) {
            sb.deleteCharAt(0);
            sb.append(arr[i]);
            if (Long.parseLong(sb.toString()) <= Long.parseLong(p)) {
                answer++;
            }
        }
        
        return answer;
    }
}