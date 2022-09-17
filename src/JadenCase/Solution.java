package JadenCase;

class Solution {
    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean t = true;

        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                sb.append(" ");
                t = true;
            } else {
                if (t) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                t = false;
            }
        }
        return sb.toString();
    }
}
