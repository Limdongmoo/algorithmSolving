package findpair;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int solution(String s) {
        LinkedList<Byte>queue = new LinkedList<>();

        for (byte c : s.getBytes()) {
            if (queue.isEmpty()) {
                queue.addFirst(c);
            } else {
                if (queue.element() == c) {
                    queue.removeFirst();
                } else {
                    queue.addFirst(c);
                }
            }

        }
        if (queue.isEmpty()) {
            return 1;
        }
        return 0;
    }
}
