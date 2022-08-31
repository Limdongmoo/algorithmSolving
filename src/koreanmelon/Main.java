package koreanmelon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String... args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(bf.readLine());
        int num = Integer.parseInt(st.nextToken());

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(bf.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if (!map.containsKey(n)) {
                map.put(n, m);
            }
            if (map.containsKey(n)) {
                map.put(5, m);
                map.put(6, m);
            }


        }
        int result = (map.get(4) * map.get(2) - (map.get(0) - map.get(3)) * map.get(3));
        System.out.println("result*num = " + result * num);


    }
}
