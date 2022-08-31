package bag;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int max = in.nextInt();
        List<Integer> result = new ArrayList<>();
        int currentWeight=0;
        in.nextLine();
        int[][] products = new int[n][2];
        for (int i = 0; i < n; i++) {
            products[i][0] = in.nextInt();
            products[i][1] = in.nextInt();
        }

        Arrays.sort(products,Comparator.comparingDouble((int[] arr) -> arr[0]));
        int maxIndex=0;
        int maxAddableIndex=0;
        int c=0;

        for (int i = 0; i < n; i++) {
            if (products[i][0] > max) {
                maxIndex = i-1;

            } else if (i == n - 1) {
                maxIndex = i;
            }
        }

        for (int i = 1; i <= maxIndex; i++) {
            if (products[0][0] + products[i][0] > max) {
                maxAddableIndex = i-1;
                break;
            } else if (i == maxIndex) {
                maxAddableIndex = i;
            }
        }

        for (int i = maxAddableIndex; i <= maxIndex; i++) {
            result.add(products[i][1]);
        }

        for (int i = 0; i <= maxIndex; i++) {
            int sum=0;
            currentWeight = 0;
            for (int j = 0; j <= maxIndex; j++) {
                if (currentWeight + products[j][0] > max) {
                    result.add(sum);
                    break;
                }
                currentWeight += products[j][0];
                sum += products[j][1];

            }
        }


    }
}
