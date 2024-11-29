import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, Integer> xMap = new HashMap<>();
        Map<Integer, Integer> yMap = new HashMap<>();

        for (int t = 0; t < 3; t++) {
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            xMap.put(x, xMap.getOrDefault(x, 0) + 1);
            yMap.put(y, yMap.getOrDefault(y, 0) + 1);
        }

        int y = -1;
        int x = -1;

        for (Integer key : xMap.keySet()) {
            if (xMap.get(key) == 1) {
                x = key;
            }
        }

        for (Integer key : yMap.keySet()) {
            if (yMap.get(key) == 1) {
                y = key;
            }
        }

        System.out.printf("%d %d\n", x, y);
    }
}