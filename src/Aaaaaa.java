import lombok.extern.slf4j.Slf4j;

import java.sql.Time;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Slf4j
public class Aaaaaa {

    public static void main(String[] args) {
        String n = "aa a";

        System.out.println("n.length() = " + n.length());
        List<String> aaa = Arrays.asList("aaa", "Bbb", "ccc");
        if (aaa.get(0).equals("aaa")) {
            aaa=aaa.stream().filter(
                    a -> a.equals("Bbb")
            ).toList();
        }

        for(String s : aaa){
            System.out.println("s = " + s);
        }




    }
}
