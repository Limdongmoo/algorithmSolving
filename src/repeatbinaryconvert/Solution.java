package repeatbinaryconvert;

class Solution {
    public static int[] solution(String s) {
        int numOfZero = 0;
        int seq = 0;
        int length;

        while (s.length() > 1) {
            char[] chars = s.toCharArray();
            for (char c : chars) {
                if (c == '0') {
                    numOfZero++;
                }
            }
            s = s.replaceAll("0", "");
            seq++;
            length = s.length();
            int degree=0;
            for (int i = 0; Math.pow(2, i) <= s.length(); i++) {
                degree=i;
            }

            StringBuilder sb = new StringBuilder();
            convertBinary(length, degree, sb);

            s = sb.toString();
        }

        int[] answer = new int[]{seq, numOfZero};

        return answer;
    }

    private static void convertBinary(int length, int degree, StringBuilder sb) {
        for (int i = degree; i >= 0; i--) {
            int pow = (int) Math.pow(2, i);
            if (pow<= length) {
                sb.append("1");
                length -= pow;
            } else{
                sb.append("0");
            }
        }
    }
}