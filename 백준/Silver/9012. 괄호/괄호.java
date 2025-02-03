import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String str = br.readLine();

            while (str.contains("()")) {
                str = str.replaceAll("\\(\\)", "");
            }

            if (str.length() != 0) {
                sb.append("NO\n");
            } else {
                sb.append("YES\n");
            }
        }
        System.out.println(sb);
    }
}
