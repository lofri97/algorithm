import java.util.*;

class Solution {
    private final String[][] operators = {
        "+-*".split(""),
        "+*-".split(""),
        "*+-".split(""),
        "*-+".split(""),
        "-+*".split(""),
        "-*+".split("")
    };
    
    public long solution(String expression) {
        long answer = 0;
        
        StringTokenizer tokenizer = new StringTokenizer(expression, "+-*", true);
        List<String> tokens = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            tokens.add(tokenizer.nextToken());
        }
        
        long max = Long.MIN_VALUE;
        
        for (String[] operator : operators) {
            long value = calc(new LinkedList<>(tokens), operator);
            max = Math.max(max, Math.abs(value));
        }
        
        return max;
    }
    
    long calc(List<String> tokens, String[] operator) {
        for (String op : operator) {
            for (int i = 0; i < tokens.size() - 1;) {
                if (tokens.get(i).equals(op)) {
                    long val = doCalc(tokens.get(i-1), tokens.get(i+1), op);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.remove(i - 1);
                    tokens.add(i-1, String.valueOf(val));
                }  else {
                    i++;
                }
            }
        }
        return Long.parseLong(tokens.get(0));
    }
    
    long doCalc(String v1, String v2, String op) {
        long result = 0;
        if (op.equals("*")) {
            result = Long.parseLong(v1) * Long.parseLong(v2);
        } else if (op.equals("-")) {
            result = Long.parseLong(v1) - Long.parseLong(v2);
        } else if (op.equals("+")) {
            result = Long.parseLong(v1) + Long.parseLong(v2);
        }
        return result;
    }
}