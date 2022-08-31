package supoja;

import java.util.*;

import static java.util.Arrays.asList;

class Solution {
    public static int[] solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        Map<Integer, Integer> list = new HashMap<>();
        list.put(1, 0);
        list.put(2, 0);
        list.put(3, 0);

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % 5]) {
                list.replace(1, list.get(1) + 1);
            }
            if (answers[i] == b[i % 8]) {
                list.replace(2, list.get(2) + 1);
            }
            if (answers[i] == c[i % 10]) {
                list.replace(3, list.get(3) + 1);
            }
        }
        Integer max = list.values().stream()
                .max(Comparator.comparing(x -> x)).get();

        for (int e : list.keySet()) {
            if (Objects.equals(list.get(e), max)) {
                answer.add(e);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}