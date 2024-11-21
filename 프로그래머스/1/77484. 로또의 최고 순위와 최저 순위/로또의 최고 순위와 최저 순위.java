import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Set<Integer> prize = new HashSet<>();
        int count = 0;
        int correct = 0;
        
        for (int win_num : win_nums) {
            prize.add(win_num);
        }
        
        for (int lotto : lottos) {
            if (lotto == 0) {
                count++;
            } else if (prize.contains(lotto)) {
                correct++;
            }
        }
        
        return new int[] {getRank(correct + count), getRank(correct)};
    }
    
    public int getRank(int win){
       return switch(win){
            case 6 -> 1;
            case 5 -> 2;
            case 4 -> 3;
            case 3 -> 4;
            case 2 -> 5;
            default -> 6;
        };
            
    }
}