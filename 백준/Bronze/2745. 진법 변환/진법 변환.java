import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        String[] input = br.readLine().split(" ");

        String n = input[0];
        int b = Integer.parseInt(input[1]);

        int index = -1;
        for (int i = n.length() - 1; i >= 0; i--) {
            index++;
            char num = n.charAt(i);
            answer += getNumber(num) * (int) Math.pow(b, index);
        }

        System.out.println(answer);
    }

    static int getNumber(char c) {
        if (Character.isDigit(c)) {
            return c - '0';
        }
        return c - 'A' + 10;
    }
}