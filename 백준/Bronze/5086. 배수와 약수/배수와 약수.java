import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            if (a == 0 && b == 0) break;

            if (b % a == 0) System.out.println("factor");
            else if (a % b == 0) System.out.println("multiple");
            else System.out.println("neither");
        }
    }
}