import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = IntStream.range(1, Integer.parseInt(br.readLine()) + 1).boxed().collect(Collectors.toList());
        Queue<Integer> queue = new LinkedList<>(list);

        while (queue.size() != 1) {
            queue.remove();
            queue.add(queue.remove());
        }
        System.out.println(queue.remove());
    }
}
