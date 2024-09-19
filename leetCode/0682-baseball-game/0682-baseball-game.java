class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (String op : operations) {
            if (op.equals("+")) {
                int tmp = stack.pop();
                int val = tmp + stack.peek();
                stack.push(tmp);
                stack.push(val);
            } else if (op.equals("D")) {
                stack.push(stack.peek() * 2);
            } else if (op.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.valueOf(op));
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}