import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (v1, v2) -> {
            return map.get(v1) == map.get(v2) ? v1 - v2 : map.get(v2) - map.get(v1);
        });

        System.out.printf("%d\n", Math.round((float) sum / arr.length));
        System.out.println(arr[arr.length / 2]);

        if (list.size() >= 2) {
            if (map.get(list.get(0)) == map.get(list.get(1))) {
                System.out.println(list.get(1));
            } else {
                System.out.println(list.get(0));
            }
        } else {
            System.out.println(list.get(0));
        }

        System.out.println(Math.abs(arr[0] - arr[arr.length - 1]));
    }
}