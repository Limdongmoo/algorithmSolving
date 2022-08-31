package makingPrimeNumber;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int[] nums) {
        int result = 0;
        boolean a = true;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length-2; i++) {
            for (int j = i + 1; j < nums.length-1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    list.add(nums[i] + nums[j] + nums[k]);
                }
            }
        }

        for (int e : list) {
            if (e == 1) {
                continue;
            }
            for (int i = 2; i < e; i++) {
                if (e % i == 0) {
                    a=false;
                    break;
                }
            }
            if (a) {
                result++;
            }
            a=true;

        }
        return result;
    }
}
