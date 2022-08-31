package queueSum;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public long solution(int[] queue1, int[] queue2) {
        int answer = 0;
        LinkedList<Long> q1 = new LinkedList<>();
        LinkedList<Long> q2 = new LinkedList<>();
        long q1max=0;
        long q2max=0;

        long q1sum =0;
        long q2sum =0;
        for (long e : queue1) {
            q1.add(e);
            q1sum += e;
            q1max = Math.max(q1max, e);
        }
        for (long e : queue2) {
            q2.add(e);
            q2sum += e;
            q2max = Math.max(q2max, e);
        }
        long total = q1sum + q2sum;

        if (total % 2 == 1 || q1max > total/2 || q2max > total/2) {
            return -1;
        }

        while (answer<=(queue1.length+queue2.length)* 2) {

            if (q1sum == q2sum) {
                return answer;

            } else if (q1sum > q2sum) {
                q2.add(q1.get(0));
                q1sum -= q1.get(0);
                q2sum += q1.get(0);
                q1.remove(0);

                answer +=1;
            } else{
                q1.add(q2.get(0));
                q2sum -= q2.get(0);
                q1sum += q2.get(0);
                q2.remove(0);

                answer +=1;
            }

        }
        return -1;
    }

}