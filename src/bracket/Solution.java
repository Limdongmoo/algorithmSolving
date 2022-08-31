package bracket;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int[] ints = s.chars().toArray();
        int sum = 0;
        for (int e : ints) {
            if (e == '(') {
                sum += 1;
            } else {
                sum -= 1;
            }
            if (sum < 0) {
                answer = false;
            }
        }

        if (sum != 0) {
            answer = false;
        }

        return answer;
    }
}