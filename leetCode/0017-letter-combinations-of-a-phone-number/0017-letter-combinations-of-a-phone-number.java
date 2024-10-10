class Solution {


    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        if (digits.equals("")) {
            return result;
        }

        backtrace(digits, new ArrayList<>(), 0, result, map);
        return result;
    }

    private void backtrace(String digits, List<Integer> temp, int start, List<String> result, Map<Character, String> map) {
        if (temp.size() == digits.length()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digits.length(); i++) {
                sb.append(map.get(digits.charAt(i)).charAt(temp.get(i)));
            }
            result.add(sb.toString());
            return;
        }

        for (int i = 0; i < map.get(digits.charAt(start)).length(); i++) {
            temp.add(i);
            backtrace(digits, temp, start + 1, result, map);
            temp.remove(temp.size() - 1);
        }
    }
}