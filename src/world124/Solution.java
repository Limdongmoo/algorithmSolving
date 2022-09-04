package world124;

class Solution {
    public static String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int a = 1;
        int sum = 0;
        /**
         * 자리수 구하기
         */
        while (true) {
            sum += (long) Math.pow(3, a);
            if (n<=sum) {
                break;
            }
            a++;
        }
        for (int i = a - 1; i >= 0; i--) {
            long b = (long) Math.pow(3, i);
            sum =0;
            for (int j = 0; j <i ; j++) {
                sum += (long) Math.pow(3, j);
            }
            if (i == 0) {
                if ((b * 3) <= n) {
                    n -= (3 * b);
                    answer.append("4");
                } else if ((b * 2) <= n) {
                    n -= (2 * b);
                    answer.append("2");
                } else {
                    n -= b;
                    answer.append("1");
                }
            }
            else{
                if ((b * 3) < n && (n - (b*3))>=sum ) {
                    n -= (3 * b);
                    answer.append("4");
                } else if ((b * 2) < n && (n - (b*2))>=sum ) {
                    n -= (2 * b);
                    answer.append("2");
                } else {
                    n -= b;
                    answer.append("1");
                }
            }
        }
        return answer.toString();
    }
}