package report;

import java.util.*;

public class Solution1 {
    public static int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++) {
            resultMap.put(id_list[i], 0);
        }
        List<String> reportss = new ArrayList<>();

        for (String s : report) {
            reportss.add(s);
        }
        /** 중복신고 제거 **/
        Set<String> reports = new HashSet<>(reportss);

        Map<String,List<String>> reportMap = new HashMap<>();

        for (String s : reports) {
            String[] s1 = s.split(" ");
            if(reportMap.containsKey(s1[1])){
                reportMap.get(s1[1]).add(s1[0]);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(s1[0]);
                reportMap.put(s1[1],list);
            }
        }

        for (List<String> l : reportMap.values()) {
            if(l.size()>=k){
                for (String s : l) {
                    resultMap.put(s,resultMap.get(s)+1);
                }
            }
        }
        int[] result = new int[resultMap.size()];
        int n = 0;
        for (int i = 0; i < resultMap.size(); i++) {
            result[n++] = resultMap.get(id_list[i]);
        }
        return  result;
    }
}
