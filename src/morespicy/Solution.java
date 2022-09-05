package morespicy;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 효율성 테스트 불합격 코드
 */
class SolutionX {
    public static int solution(int[] scoville, int K) {
        int answer = 0;

        LinkedList<Integer> collect = new LinkedList<>();
        for (int i : scoville) {
            collect.add(i);
        }

        while (true) {
            Collections.sort(collect);
            if (collect.getFirst() >= K) {
                break;
            }

            answer++;

            int a = collect.getFirst();
            collect.removeFirst();
            int b = collect.getFirst();
            collect.removeFirst();

            if (collect.size() == 0 && a + b < K) {
                return -1;
            } else {
                collect.add(a + 2*b);
            }
        }

        return answer;
    }
}