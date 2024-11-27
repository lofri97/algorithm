import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        while (n > 0) {
            sb.append(getNum(n % b));
            n /= b;
        }

        System.out.println(sb.reverse());
    }

    static char getNum(int num) {
        if (num < 10) {
            return (char) (num + '0');
        }
        return (char) (num + 'A' - 10);
    }
}