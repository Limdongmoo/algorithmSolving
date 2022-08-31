package square;

public class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] arr : sizes) {
            if (arr[0] < arr[1]) {
                maxHeight = Math.max(maxHeight, arr[0]);
                maxWidth = Math.max(maxWidth, arr[1]);
            } else {
                maxHeight = Math.max(maxHeight, arr[1]);
                maxWidth = Math.max(maxWidth, arr[0]);
            }
        }
        int answer = maxHeight*maxWidth;

        return answer;
    }
}