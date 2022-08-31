package Fibonacci;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static int solution(int n) {
        List<Integer> fibo = new ArrayList<>();

        fibo.add(0,1);
        fibo.add(1, 1);

        for (int i = 2; i < n; i++) {
            fibo.add(i, fibo.get(i - 1) + fibo.get(i - 2));
        }

        return fibo.get(n-1);
    }

    public static void main(String[] args) {
        System.out.println("solution(3) = " + solution(3));
        System.out.println("solution(4) = " + solution(4));
        System.out.println("solution(5) = " + solution(5));

    }
}
