package normalsquare;

class Solution {
    public long solution(int w, int h) {
        long answer = (long) w * h;

        int min = Math.min(w, h);
        int commonDivisor = 1;

        for (int i = 2; i <= min; i++) {
            if (w % i == 0 && h % i == 0) {
                commonDivisor = i;
            }
        }

        answer = answer - commonDivisor * (w / commonDivisor + h / commonDivisor - 1);

        return answer;
    }
}