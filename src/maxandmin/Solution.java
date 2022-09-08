package maxandmin;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int max = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .max()
                .getAsInt();
        int min = Arrays.stream(s.split(" "))
                .mapToInt(Integer::parseInt)
                .min()
                .getAsInt();

        sb.append(min);
        sb.append(" ");
        sb.append(max);
        return sb.toString();
    }
}