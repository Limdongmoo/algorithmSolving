package leveltwoTest;

import java.math.BigInteger;
import java.util.*;

public class Solution {
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
