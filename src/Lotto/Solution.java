package Lotto;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        int result = 7;
        int num_zero= 0;

        for(int n : win_nums){
            for(int a : lottos){
                if (a != 0) {
                    if(n==a){
                        result--;
                    }
                }
            }
        }

        for(int n : lottos){
            if (n == 0) {
                num_zero++;
            }
        }
        if (result == 6 || result ==7) {
            result = 6;
        }
        int correct = result-num_zero ;
        if(correct==0){
            correct =1;
        }

        int[] answer = {correct, result};
        return answer;
    }
}
