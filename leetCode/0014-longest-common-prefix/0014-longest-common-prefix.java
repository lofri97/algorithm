class Solution {
    public String longestCommonPrefix(String[] strs) {
        int size = strs.length;
        int idx = 0;
        StringBuilder sb = new StringBuilder();

        while (true) {
            if (strs[0].length() <= idx) {
                break;
            }
            char target = strs[0].charAt(idx);
            boolean flag = false;
            for (int i = 1; i < size; i++) {
                if (strs[i].length() <= idx) {
                    flag = true;
                    break;
                }

                if (strs[i].charAt(idx) != target) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                break;
            }
            sb.append(target);
            idx++;
        }

        return sb.toString();
    }
}