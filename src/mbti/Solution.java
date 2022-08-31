package mbti;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Byte,Integer> result = new HashMap();
        result.put((byte) 'R', 0);
        result.put((byte) 'T', 0);
        result.put((byte) 'C', 0);
        result.put((byte) 'F', 0);
        result.put((byte) 'J', 0);
        result.put((byte) 'M', 0);
        result.put((byte) 'A', 0);
        result.put((byte) 'N', 0);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 4) {
                continue;
            }
            if (choices[i] < 4) {
                result.replace(survey[i].getBytes()[0],result.get(survey[i].getBytes()[0]) + (4 - choices[i]));
            } else {
                result.replace(survey[i].getBytes()[1], result.get(survey[i].getBytes()[1]) + (choices[i]) - 4);
            }
        }

        answer = result.get((byte) 'R') >= result.get((byte) 'T') ? answer + "R" : answer + "T";
        answer = result.get((byte) 'C') >= result.get((byte) 'F') ? answer + "C" : answer + "F";
        answer = result.get((byte) 'J') >= result.get((byte) 'M') ? answer + "J" : answer + "M";
        answer = result.get((byte) 'A') >= result.get((byte) 'N') ? answer + "A" : answer + "N";


        return answer;
    }
}