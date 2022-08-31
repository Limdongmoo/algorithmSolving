package naejuk;

public class Solution {
    public int solution(int[] a, int[] b) {
        int sum =0;

        for (int i = 0; i < a.length; i++) {
            sum+=multiply(a[i],b[i]);
        }

        return sum;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}