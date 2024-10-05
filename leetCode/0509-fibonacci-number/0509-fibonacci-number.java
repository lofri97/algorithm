class Solution {
    int[] cache = new int[31];

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        else if (cache[n] != 0) {
            return cache[n];
        } else {
            return cache[n] = fib(n - 1) + fib(n - 2);
        }
    }
}