package findpair;

import java.util.ArrayList;
import java.util.List;

class SolutionX {
    public int solution(String s) {
        int answer = 0;
        boolean accessed = false;
        List<Character> charList = new ArrayList<>();

        for (byte b : s.getBytes()) {
            charList.add((char) b);
        }

        /**
         * String 이 홀수인 경우 -1 return
         */
        if (charList.size() % 2 == 1) {
            return 0;
        }

        while (charList.size()>=2) {
            if (charList.size() == 2 && charList.get(0) == charList.get(1)) {
                return 1;
            }

            for (int i = 0; i < charList.size()-1; i++) {
                if (charList.get(i) == charList.get(i+1)) {
                    charList.remove(i);
                    charList.remove(i);
                    accessed = true;
                }
            }
            if (!accessed) {
                return 0;
            } else {
                accessed = false;
            }
        }
        return answer;
    }
}