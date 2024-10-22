class Solution {
    
    boolean solution(String s) {
        s = s.toLowerCase();
        int length = s.length();
        s = s.replaceAll("p", "");
        int pCount = length - s.length();
        
        length = s.length();
        s = s.replaceAll("y", "");
        int yCount = length - s.length();
        return pCount == yCount;
    }
}