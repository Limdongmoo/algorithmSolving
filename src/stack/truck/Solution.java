package stack.truck;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> result = new ArrayList<>();
        for (int e : arr) {
            if (result.size() == 0) {
                result.add(e);
            }else {
                if (result.get(result.size() - 1) == e) {
                    continue;
                }
                result.add(e);
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}