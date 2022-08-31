package pull;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(int[][] board, int[] moves) {

        int answer = 0;
        List<Integer> result = new ArrayList<>();
        for (int e : moves) {
            for (int i = 0; i < board.length; i++) {
                int now = board[i][e - 1];
                if (now == 0) {
                    continue;
                }
                result.add(now);
                board[i][e - 1] = 0;

                break;
            }
            if (result.size() > 1){
                if(result.get(result.size()-1).equals(result.get(result.size()-2))) {
                    int size = result.size();
                    result.remove(size-1);
                    result.remove(size-2);
                    answer+=2;
                }
            }
        }

        return answer;
    }
}