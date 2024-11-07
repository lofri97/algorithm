class Solution {
    public long solution(int price, int money, int count) {
        long answer = (count * (2 * price + ((long) count - 1) * price)) / 2;

        return money - answer > 0 ? 0 : answer - money;
    }
}