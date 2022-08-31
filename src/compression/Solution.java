package compression;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(String s) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int n=0;
        list.add(s.length());

        int length = s.length();

        for (int i = 1; i <= length/2; i++) {
            for (int j = 0; j<(length/i)-1 ; j++) {
                String substring = s.substring(i * j, i * (j + 1));
                if (substring.equals(s.substring(i * (j + 1), i * (j + 2)))) {
                    n ++;
                    if (j == length / i - 2) {
                        answer += i * n - ((int)( Math.log10(n+1)+1 ));
                        n=0;
                    }
                } else {
                    if (n >= 1) {
                        answer += i * n - ((int)( Math.log10(n+1)+1 ));
                    }
                    n=0;
                }
            }
            list.add(s.length() - answer);
            answer =0;
        }
        return list.stream().mapToInt(x -> x).min().getAsInt();
    }
}