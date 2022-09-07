package targetnumber;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

class Solution {
    public static int solution(int[] numbers, int target) {
        int answer = 0;

        List<LinkedList<Integer>> queueList = new ArrayList<>();

        int temp = numbers[0];
        long pow = (long) Math.pow(2, numbers.length);
        for (int i = 0; i < pow; i++) {
            LinkedList<Integer> queue = new LinkedList<>();
            queue.add(temp);
            if(i+1==pow/2){
                temp = -temp;
            }
            queueList.add(queue);
        }

        pow /= 2;

        for (int i = 1; i < numbers.length; i++) {
            int tempNum = numbers[i];
            pow /= 2;
            for (int j = 0; j < Math.pow(2, numbers.length); j++) {
                queueList.get(j).add(tempNum);
                if((j+1)%(pow)==0) {
                    tempNum = -tempNum;

                }
            }
        }

        for (LinkedList<Integer> integers : queueList) {
            Optional<Integer> reduce = integers.stream().reduce(Integer::sum);
            if (reduce.get().equals(target)) {
                answer++;
            }
        }

        return answer;
    }
}
