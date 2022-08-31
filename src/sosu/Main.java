package sosu;

import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        in.nextLine();
        int[] nums = new int[tc];
        int result =0;
        for(int i=0;i<tc;i++){
            nums[i] = in.nextInt();
        }

        for(int i : nums){
            if (i % 2 == 0) {
                if(i==2){
                    result++;
                }
                continue;
            }
            if(i%2!=0){
                for(int j=2;j<i;j++){
                    if (i % j == 0){
                        break;
                    }
                    if(j==i-1){
                        result++;
                    }
                }
            }
        }

        System.out.println(result);
    }
}
