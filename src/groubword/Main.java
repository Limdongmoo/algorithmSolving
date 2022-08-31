package groubword;

import java.util.Scanner;

public class Main {

    public static void main(String...args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int result =0;
        in.nextLine();
        String[] words = new String[num];

        for (int i=0;i<num;i++) {
            words[i] = in.nextLine();
        }

        for(String s : words){
            if(s.length()==1){
                result++;
                continue;
            }
            outerLoop:
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)==s.charAt(i+1)){
                    if(i==s.length()-2){
                        result++;
                        break outerLoop;
                    }
                    continue;
                }
                for(int j=i+1;j<s.length();j++){
                    if(i==s.length()-2){
                        result++;
                        break outerLoop;
                    }
                    if(s.charAt(i)==s.charAt(j)){
                        break outerLoop;
                    }
                }

            }
        }
        System.out.println(result);

    }
}
