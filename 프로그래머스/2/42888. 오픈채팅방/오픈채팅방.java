import java.util.*;

class Solution {
    private final int TYPE = 0;
    private final int UID = 1;
    private final int NAME = 2;
    
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        Queue<InOut> queue = new LinkedList<>();
        List<String> answer = new ArrayList<>();
        
        for (String r : record) {
            String[] sr = r.split(" ");
            
            if (sr[TYPE].equals("Enter")) {
                map.put(sr[UID], sr[NAME]);
                queue.add(new InOut(sr[UID], sr[TYPE]));
            } else if (sr[TYPE].equals("Change")) {
                map.put(sr[UID], sr[NAME]);
            } else {
                queue.add(new InOut(sr[UID], sr[TYPE]));
            }
        }
        
        while (!queue.isEmpty()) {
            InOut inOut = queue.poll();
            String name = map.get(inOut.userId);
            String message = inOut.isIn() ? "님이 들어왔습니다." : "님이 나갔습니다.";
            
            answer.add(name+message);
        }
        
        
        return answer.toArray(new String[1]);
    }
    
    class InOut {
        String userId;
        String type;
        
        InOut(String userId, String type) {
            this.userId = userId;
            this.type = type;
        }
        
        boolean isIn() {
            return this.type.equals("Enter");
        }
    }
}

/**
Map 과 Queue 를 사용하자
Map 은 uid 에 아이디 저장
Queue 는 uid enter, out
**/