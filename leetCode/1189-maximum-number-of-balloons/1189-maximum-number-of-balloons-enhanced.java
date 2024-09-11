class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] counts = new int[5];
        int result = Integer.MAX_VALUE;
        
        for (char c : text.toCharArray()) {
            switch(c) {
                case 'b' : counts[0]++; break;
                case 'a' : counts[1]++; break;
                case 'l' : counts[2]++; break;
                case 'o' : counts[3]++; break;
                case 'n' : counts[4]++; break;
            }
        }
        counts[2] /= 2;
        counts[3] /= 2;

        for (int i = 0; i < 5; i++) {
            if (result > counts[i]) {
                result = counts[i];
            }
        }
        return result;
    }
}