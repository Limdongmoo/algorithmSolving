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

    public static void main(String[] args) {
        solution(10000);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportMap = new HashMap<>();
        List<String> idList = new ArrayList<>();

        for (String s : id_list) {
            reportMap.put(s, new HashSet<>());
            idList.add(s);
        }
        int[] answer = new int[idList.size()];
        for (String rArr : report) {
            String[] s = rArr.split(" ");
            reportMap.get(s[1]).add(s[0]);
        }

        reportMap.values().stream()
                .filter(a -> a.size() >= k)
                .forEach(a->
                {
                    for (String s : a) {
                        answer[idList.indexOf(s)] +=1;
                    }
                });
        return answer;
    }

    public static int solution(String s)
    {
        LinkedList<Character> queue = new LinkedList<>();

        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (queue.isEmpty()) {
                queue.addFirst(c);
            } else{
                if (queue.element() == c) {
                    System.out.println("queue.element() = " + queue.element());
                    queue.poll();
                } else {
                    queue.addFirst(c);
                }
            }
        }

        return queue.isEmpty() ? 1 : 0;
    }

    public static int solution(int n) {

        LinkedList<BigInteger> queue = new LinkedList<>();

        queue.add(BigInteger.valueOf(1));
        queue.addFirst(BigInteger.valueOf(0));

        for (int i = 2; i < n; i++) {
            BigInteger poll = queue.poll();
            queue.add(queue.element().add(poll));
            System.out.println("queue.getLast() = " + queue.getLast());
        }
        return (queue.getFirst().add(queue.getLast())).remainder(BigInteger.valueOf(1234567)).intValue();
    }
}