package bulb;

import java.util.Arrays;

public class solution1 {
    public static int solution11(int[] arr) {
        int result =0;

        for (int i = 0; i < arr.length; i++) {
            int[] ints = Arrays.copyOfRange(arr, 0, i);
            int length = ints.length;
            int sum = Arrays.stream(ints).parallel().reduce(0, (a, b) -> a + b);
            int sum1 = 0;
            for (int j = 0; j < length; j++) {
                sum1 += j;
            }
            if (sum == length + sum1) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("solution11(new int[]{2, 1, 3, 5, 4}) = " + solution11(new int[]{2, 1, 3, 5, 4}));
        System.out.println("solution11(new int[]{2,3,4,1,5}) = " + solution11(new int[]{2, 3, 4, 1, 5}));
        System.out.println("solution11(new int[]{1,3,4,2,5}) = " + solution11(new int[]{1, 3, 4, 2, 5}));
        System.out.println("solution11(new int[]{1}) = " + solution11(new int[]{1}));
        System.out.println("solution11(new int[]{5,1,3,2,4,6}) = " + solution11(new int[]{5, 1, 3, 2, 4, 6}));
        System.out.println("solution11(new int[]{1,3,2,4,6,5}) = " + solution11(new int[]{1, 3, 2, 4, 6, 5}));
    }
}
