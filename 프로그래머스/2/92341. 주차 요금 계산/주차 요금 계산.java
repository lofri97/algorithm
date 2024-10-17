import java.util.*;

class Solution {
    private static final String IN = "IN";
    
    private static final int DEFAULT_TIME = 0;
    private static final int DEFAULT_FEE = 1;
    private static final int UNIT_TIME = 2;
    private static final int UNIT_FEE = 3;
    
    public int[] solution(int[] fees, String[] records) {
        List<Integer> answer = new ArrayList<>();
        Map<String, List<int[]>> map = new HashMap<>();
        
        for (String record : records) {
            String[] sRecord = record.split(" ");
            String time = sRecord[0];
            String num = sRecord[1];
            String type = sRecord[2];
            
            if (IN.equals(type)) {
                List<int[]> list = map.getOrDefault(num, new ArrayList<>());
                list.add(new int[] {getMinute(time), 0});
                map.put(num, list);
            } else {
                List<int[]> list = map.get(num);
                list.get(list.size()-1)[1] = getMinute(time);
            }
        }
        
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        for (String key : keys) {
            int period = 0;
            for (int[] value : map.get(key)) {
                if (value[1] == 0) {
                    value[1] = getMinute("23:59");
                }
                period += value[1] - value[0];
            }
            answer.add(getFee(fees, period));
        }
        
        return answer.stream().mapToInt(v->v).toArray();
    }
    
    int getMinute(String time) {
        String[] sTime = time.split(":");
        return Integer.valueOf(sTime[0]) * 60 + Integer.valueOf(sTime[1]);
    }
    
    int getFee(int[] fees, int period) {
        if (period <= fees[DEFAULT_TIME]) {
            return fees[DEFAULT_FEE];
        }
        period -= fees[DEFAULT_TIME];
        int fee = period / fees[UNIT_TIME] * fees[UNIT_FEE];
        fee += period % fees[UNIT_TIME] == 0 ? 0 : fees[UNIT_FEE];
        return fees[DEFAULT_FEE] + fee;
        
    }
}

/**
Map<String, Integer[]> 에 저장한다, T1: 차량번호, T2 는 [입차시간, 사용시간]

만약 Map.get(차량번호) 가 비어있을 경우, Map 에 입차 시간을 넣는다.
만약 Map.get(차량번호) 가 있을 경우, 
**/