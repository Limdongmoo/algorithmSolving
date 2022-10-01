package levelone;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public long solution(long n) {
        for (int i = 0; Math.pow(i, 2) <= n; i++) {
            long pow = (long) Math.pow(i, 2);
            if (pow == n) {
                return (long) Math.pow(i + 1, 2);
            }
        }
        return -1;
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int seq =0;

        for (int[] arr : commands) {
            if (arr[1] - arr[0] == 0) {
                answer[seq++] = array[arr[0] - 1];
                continue;
            }
            int[] tempArr = new int[arr[1] - arr[0]+1];
            int tempSeq = 0;
            for (int i = arr[0] - 1; i < arr[1]-1; i++) {
                tempArr[tempSeq++] = array[i];
            }
            int[] ints = Arrays.stream(tempArr).sorted().toArray();
            answer[seq++] = ints[arr[2] - 1];
        }

        return answer;
    }

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            return new int[]{-1};
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return Arrays.stream(answer).sorted().toArray();
    }


}