class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] charArr = strs[i].toCharArray();
            Arrays.sort(charArr);
            String value = new String(charArr);
            List<String> set = map.getOrDefault(value, new ArrayList<>());
            set.add(strs[i]);
            map.put(value, set);          
        }

        return new ArrayList<>(map.values());
    }
}