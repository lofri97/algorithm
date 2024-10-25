import java.util.*;

class Solution {

    public int[] solution(String[] info, String[] query) {
        Map<String, List<Integer>> cache = new HashMap<>();
        int[] answer = new int[query.length];

        int idx = 0;
        for (String qq : query) {
            String[] qArr = qq.replace("and ", "").split(" ");
            String cacheKey = qArr[0] + qArr[1] + qArr[2] + qArr[3];
            List<Integer> scores;
            if (cache.containsKey(cacheKey)) {
                scores = cache.get(cacheKey);
            } else {
                scores = new ArrayList<>();

                for (String ii : info) {
                    String[] iArr = ii.split(" ");

                    boolean flag = true;
                    for (int i = 0; i < 4; i++) {
                        if (qArr[i].equals("-")) continue;
                        if (!qArr[i].equals(iArr[i])) {
                            flag = false;
                            break;
                        }
                    }
                    if (flag) {
                        scores.add(Integer.valueOf(iArr[4]));
                    }
                }
                Collections.sort(scores);
                cache.put(cacheKey, scores);
            }

            answer[idx++] = scores.size() - binarySearch(Integer.parseInt(qArr[4]), scores);

        }

        return answer;
    }

    int binarySearch(int score, List<Integer> scores) {
        int s = 0;
        int e = scores.size() - 1;

        while (e > s) {
            int mid = (s + e) / 2;

            if (scores.get(mid) >= score) {
                e = mid;
            } else {
                s = mid + 1;
            }
        }

        if (scores.get(s) < score) {
            return scores.size();
        }
        return s;
    }
}