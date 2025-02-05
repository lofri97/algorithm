import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static int cnt = 0;
    private static int k;
    private static int result = -1;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        mergeSort(arr, 0, arr.length - 1);
        System.out.println(result);
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (cnt > k) return;

        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    static void merge(int[] arr, int l, int m, int r) {
        int p1 = l;
        int p2 = m + 1;
        int idx = 0;

        int[] tmp = new int[r - l + 1];
        while (p1 <= m && p2 <= r) {
            if (arr[p1] < arr[p2]) {
                tmp[idx++] = arr[p1++];
            } else {
                tmp[idx++] = arr[p2++];
            }
        }

        while (p1 <= m) {
            tmp[idx++] = arr[p1++];
        }
        while (p2 <= r) {
            tmp[idx++] = arr[p2++];
        }

        int i = l;
        idx = 0;

        while (i <= r) {
            cnt++;
            if (cnt == k) {
                result = tmp[idx];
                break;
            }
            arr[i++] = tmp[idx++];
        }
    }
}