import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> map = new HashMap<>();
        String n = sc.nextLine();

        String cardStr = sc.nextLine();

        for (String card : cardStr.split(" ")) {
            map.put(card, map.getOrDefault(card, 0) + 1);
        }

        String m = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        String targetStr = sc.nextLine();

        for (String card : targetStr.split(" ")) {
            sb.append(map.getOrDefault(card, 0));
            sb.append(" ");
        }
        System.out.println(sb);
    }
}