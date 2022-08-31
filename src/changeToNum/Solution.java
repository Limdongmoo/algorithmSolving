package changeToNum;

import java.util.*;

class Solution {
    public int solution(String s) {

        s = s.replaceAll("one", String.valueOf(1));
        s = s.replaceAll("two", String.valueOf(2));
        s = s.replaceAll("three", String.valueOf(3));
        s = s.replaceAll("four", String.valueOf(4));
        s = s.replaceAll("five", String.valueOf(5));
        s = s.replaceAll("six", String.valueOf(6));
        s = s.replaceAll("seven", String.valueOf(7));
        s = s.replaceAll("eight", String.valueOf(8));
        s = s.replaceAll("nine", String.valueOf(9));
        s = s.replaceAll("zero", String.valueOf(0));

        int answer = Integer.parseInt(s);
        return answer;
    }

}