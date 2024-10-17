class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        for (char c : skill.toCharArray()) {
            sb.append(c);
            if (sb.length() != skill.length() * 2 - 1) {
                sb.append('|');
            }
        }
        
        for (int i = 0; i < skill_trees.length; i++) {
            String str = skill_trees[i].replaceAll("[^" + sb.toString() +"]", "");
            
            if (skill.startsWith(str)) {
                answer++;
            }
        }
        
        return answer;
    }
}