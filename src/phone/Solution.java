package phone;

public class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int[] mapRight = {2, 3};
        int[] mapLeft = {0, 3};
        int[] mapMiddle;

        for (int e : numbers) {
            if (e % 3 == 1) {
                mapLeft = new int[]{0, e / 3};
                answer += "L";
            } else if (e % 3 == 0 && e!=0) {
                mapRight = new int[]{2, (e / 3)-1};
                answer += "R";
            } else{
                if (e == 0) {
                    mapMiddle = new int[]{1, 3};
                } else {
                    mapMiddle = new int[]{1, e / 3};
                }
                int rightWidthDistance = Math.abs(mapRight[0] - mapMiddle[0]);
                int rightHeightDistance = Math.abs(mapRight[1] - mapMiddle[1]);
                int leftWidthDistance = Math.abs(mapLeft[0] - mapMiddle[0]);
                int leftHeightDistance = Math.abs(mapLeft[1] - mapMiddle[1]);

                int rightDistance = rightHeightDistance + rightWidthDistance;
                int leftDistance = leftHeightDistance + leftWidthDistance;

                if (rightDistance > leftDistance) {
                    mapLeft = mapMiddle;
                    answer += "L";
                } else if (rightDistance < leftDistance) {
                    mapRight = mapMiddle;
                    answer += "R";
                } else{
                    if (hand.getBytes()[0] == (byte) 'l') {
                        mapLeft = mapMiddle;
                        answer += "L";
                    } else {
                        mapRight = mapMiddle;
                        answer += "R";
                    }
                }
            }
        }
        return answer;
    }
}