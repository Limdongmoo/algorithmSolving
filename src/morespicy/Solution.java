package morespicy;

import java.util.*;

class Solution {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        Arrays.sort(scoville);
        PriorityQueue<Integer> priorityQueueLowest = new PriorityQueue<>();
        for (int i : scoville) {
            priorityQueueLowest.add(i);
        }

        while (priorityQueueLowest.size()>1) {
            if (priorityQueueLowest.element() >= K) {
                break;
            }

            answer++;

            int a = priorityQueueLowest.poll();
            int b = priorityQueueLowest.poll() * 2;
            int i = a + b;

            if (priorityQueueLowest.size() == 0 && i < K) {
                return -1;
            }
            priorityQueueLowest.add(i);
        }

        return answer;
    }
}