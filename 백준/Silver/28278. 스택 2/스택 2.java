import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            String[] sArr = br.readLine().split(" ");

            switch (sArr[0]) {
                case "1":
                    st.push(Integer.parseInt(sArr[1]));
                    break;
                case "2":
                    if (st.isEmpty()) {
                        sb.append("-1");
                    } else {
                        sb.append(st.pop());
                    }
                    sb.append("\n");
                    break;
                case "3":
                    sb.append(st.size()).append("\n");
                    break;
                case "4":
                    sb.append(st.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "5":
                    if (st.isEmpty()) {
                        sb.append("-1");
                    } else {
                        sb.append(st.peek());
                    }
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
