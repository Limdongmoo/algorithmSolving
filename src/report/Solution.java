package report;

import java.util.*;

public class Solution {
    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            resultMap.put(id_list[i], 0);
        }
        List<String> reporter = new ArrayList<>();
        List<String> reported = new ArrayList<>();
        List<String> reportss = new ArrayList<>();

        for (String s : report) {
            reportss.add(s);
        }
        /** 중복신고 제거 **/
        Set<String> reports = new HashSet<>(reportss);

        for (String s : reports) {
            String[] s1 = s.split(" ");
            reporter.add(s1[0]);
            reported.add(s1[1]);
        }

        Object[][] objects = new Object[reports.size()][2];

        for (int i = 0; i < reports.size(); i++) {
            objects[i][0] = reported.get(i);
            objects[i][1] = false;

        }

        for (String s : reported) {
            int count = 0;
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < reported.size(); i++) {
                if (objects[i][0].equals(s) && objects[i][1].equals(false)) {
                    objects[i][1] = true;
                    count++;
                    list.add(i);
                }
            }
            if (count >= k) {
                for (int e : list) {
                    for (String s1 : resultMap.keySet())
                        if (reporter.get(e).equals(s1)) {
                            int a = resultMap.get(s1) + 1;
                            resultMap.replace(s1, a);
                        }
                }
            }
        }
        int[] result = new int[resultMap.size()];
        int n = 0;
        for (int i = 0; i < resultMap.size(); i++) {
            result[n++] = resultMap.get(id_list[i]);
        }
        return result;
    }
}
