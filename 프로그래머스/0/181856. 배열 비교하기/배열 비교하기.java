class Solution {
    public int solution(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            int t = arr1.length - arr2.length;
            
            if (t < 0) return -1;
            if (t > 0) return 1;
            return 0;
        }
        
        int count = 0;
        
        for (int i = 0; i < arr1.length; i++) {
            count += arr1[i];
            count -= arr2[i];
        }
        
        if (count < 0) {
            return -1;
        } else if (count > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}