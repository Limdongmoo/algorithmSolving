package repeatbinaryconvert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[] solution(String s) {
        List<Character> list = new ArrayList<>();
        int numOfZero = 0;
        int seq = 0;
        int length;

        char[] chars = s.toCharArray();
        while (s.length() > 1) {
            for (char c : chars) {
                if (c == '0') {
                    numOfZero++;
                }
            }
            s = s.replaceAll("0", "");
            seq++;
            length = s.length();
            int degree=0;
            for (int i = 0; Math.pow(2, i) < s.length(); i++) {
                degree=i;
            }
            System.out.println("s = " + s);

            /**
             * 2진 변환
             */
            StringBuilder sb = new StringBuilder();
            for (int i = degree; i >= 0; i--) {
                int pow = (int) Math.pow(2, i);
                if (length == 0) {
                    sb.append("0");
                    System.out.println("00 = " + 00);
                } else if (pow <= length) {
                    sb.append("1");
                    length -= pow;
                } else {
                    sb.append("0");
                }
            }
            System.out.println("sb.toString() = " + sb.toString());

            s = sb.toString();

        }

        int[] answer = new int[]{seq, numOfZero};
        System.out.println("answer[1] + \" \" + answer[1] = " + answer[0] + " " + answer[1]);

        return answer;
    }

    public static void main(String[] args) {
        solution("01110");
    }
}