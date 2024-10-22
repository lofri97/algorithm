class Solution {
    public String solution(String id) {
        
        // step 1
        id = id.toLowerCase();
        
        // step 2
        id = id.replaceAll("[^a-z0-9-_\\.]", "");
        
        // step 3
        id = id.replaceAll("\\.{2,}", ".");
        
        // step 4
        id = id.replaceAll("^\\.|\\.$", "");
        
        // step 5
        id = id.isEmpty() ? "a" : id;
        
        // step 6
        id = id.length() > 15 ? id.substring(0, 15) : id;
        id = id.replaceAll("^\\.|\\.$", "");
        
        // step 7
        if (id.length() <= 2) {
            StringBuilder sb = new StringBuilder(id);
            
            while (sb.length() != 3) {
                sb.append(sb.charAt(sb.length()-1));
            }
            id = sb.toString();
        }
        
        return id;
    }
}