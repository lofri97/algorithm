import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        for (int t = 0; t < k; t++) {
            int val = Integer.parseInt(br.readLine());

            if (val == 0) {
                st.pop();
            } else {
                st.push(val);
            }
        }

        int answer = 0;
        while (!st.isEmpty()) {
            answer += st.pop();
        }

        System.out.println(answer);
    }
}
