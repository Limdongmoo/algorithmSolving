package bulb;

import java.util.List;

public class bulb {
    public int solution(int[] r) {
        int result = 0;
        for (int i = 0; i < r.length; i++) {
            int n=0;
            int[] arr = new int[i + 1];
            for (int j = 0; j < arr.length; j++) {
                arr[n++] = r[i];
            }


        }
        return result;
    }
}
