import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int index = 1;
        String result = "Nice";
        String[] sArr = br.readLine().split(" ");
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++){
            int cur = Integer.parseInt(sArr[i]);
            if (index != cur){
                if(!st.isEmpty() && index == st.peek()){
                    index++;
                    i--;
                    st.pop();
                } else {
                    st.push(cur);
                }
            } else {
                index++;
            }
        }

        // 대기줄에 있는 사람 처리
        while (!st.isEmpty()){
            int pop = st.pop();
            if(pop == index){
                index++;
            } else {
                result = "Sad";
                break;
            }
        }
        System.out.println(result);
    }
}
