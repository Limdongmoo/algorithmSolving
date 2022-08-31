package nonexist;

class Solution {
    public int solution(int[] numbers) {
        int answer = 45;
        for (int e : numbers) {
            answer -= e;
        }
        return answer;
    }
}


