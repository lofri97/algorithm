import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();

        while (true) {
            String str = br.readLine();
            if (str.equals(".")) break;

            boolean flag = true;
            for (char c : str.toCharArray()) {
                if (c == '(' || c == '[') {
                    st.push(c);
                } else if (c == ')' || c == ']') {
                    if (st.isEmpty()) {
                        flag = false;
                        break;
                    }
                    if (c == ')' && st.peek() != '(') {
                        flag = false;
                        break;
                    }
                    if (c == ']' && st.peek() != '[')  {
                        flag = false;
                        break;
                    }
                    st.pop();
                }
            }
            sb.append(!flag ? "no" : st.size() != 0 ? "no" : "yes").append("\n");
            st.clear();
        }
        System.out.println(sb);
    }
}
