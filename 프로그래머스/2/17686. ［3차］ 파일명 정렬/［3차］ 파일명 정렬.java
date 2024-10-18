import java.util.*;

class Solution {

    public String[] solution(String[] files) {
        List<File> answer = new ArrayList<>();

        for (String file : files) {
            answer.add(new File(file));
        }

        System.out.println(answer);

        Collections.sort(answer, (v1, v2) -> {
            if (v1.head.toLowerCase().compareTo(v2.head.toLowerCase()) ==  0) {
                return Integer.parseInt(v1.number) - Integer.parseInt(v2.number);
            }
            return v1.head.toLowerCase().compareTo(v2.head.toLowerCase());
        });

        return answer.stream().map(File::toString).toArray(String[]::new);
    }

    class File {
        String head;
        String number;
        String tail;

        File(String file) {

            for (int i = 1; i < file.length(); i++) {
                if (head != null && number != null) {
                    break;
                }

                if (Character.isDigit(file.charAt(i)) &&
                        !Character.isDigit(file.charAt(i-1))) {
                    head = file.substring(0, i);
                }
                if (i == file.length() - 1 ||
                        Character.isDigit(file.charAt(i)) && !Character.isDigit(file.charAt(i+1))) {
                    number = file.substring(head.length(), i + 1);
                    tail = file.substring(i+1);
                }
            }
        }

        @Override
        public String toString() {
            return head+number+tail;
        }
    }
}