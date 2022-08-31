package openChat;

import java.util.*;

class Solution {
    public static String[] solution(String[] record) {
        Map<String, String> changeUserMap = new HashMap<>();
        List<String> tempResultList = new ArrayList<>();
        List<String> resultList = new ArrayList<>();

        for (String e : record) {
            String[] split = e.split(" ");
            if (split[0].equals("Enter")) {
                deduplication(changeUserMap, split[1], split[2]);
                tempResultList.add(split[1] + " 님이 들어왔습니다.");
            } else if (split[0].equals("Leave")) {
                tempResultList.add(split[1] + " 님이 나갔습니다.");
            } else {
                deduplication(changeUserMap,split[1],split[2]);
            }

        }

        for (String s : tempResultList) {
            String[] temp = s.split(" ");
            if (changeUserMap.containsKey(temp[0])) {
                resultList.add(changeUserMap.get(temp[0]) + temp[1] + " " + temp[2]);
            }
        }
        return resultList.toArray(new String[tempResultList.size()]);
    }

    private static void deduplication(Map<String, String> sm, String Id, String nickName) {
        if (sm.containsKey(Id)) {
            sm.replace(Id, nickName);
            return;
        }
        sm.put(Id, nickName);
    }

}