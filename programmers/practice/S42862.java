package practice;

import java.util.Arrays;

/**
 * 코딩테스트 연습 > 탐욕법(Greedy) >
 * <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42862">체육복</a>
 *
 */
public class S42862 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(5, new int[] {2,4}, new int[] {1,3,5}) == 5);
        System.out.println(sol.solution(5, new int[] {2,4}, new int[] {3}) == 4);
        System.out.println(sol.solution(3, new int[] {3}, new int[] {1}) == 2);
    }

    static class Solution {
        public int solution(int n, int[] lost, int[] reserve) {
            int answer = n - lost.length;
            Arrays.sort(lost);
            Arrays.sort(reserve);
            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if(lost[i] == reserve[j]){
                        lost[i] = -1;
                        reserve[j] = -1;
                        answer++;
                        break;
                    }
                }
            }
            for(int i=0; i<lost.length; i++){
                for(int j=0; j<reserve.length; j++){
                    if((lost[i]-1 == reserve[j]) || (lost[i]+1 == reserve[j])){
                        reserve[j] = -1;
                        answer++;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}

