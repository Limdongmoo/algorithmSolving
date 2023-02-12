import lombok.extern.slf4j.Slf4j;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

@Slf4j
public class Aaaaaa {

    public static void main(String[] args) {
//        String n = "aa a";
//
//        System.out.println("n.length() = " + n.length());
//        List<String> aaa = Arrays.asList("aaa", "Bbb", "ccc");
//        if (aaa.get(0).equals("aaa")) {
//            aaa=aaa.stream().filter(
//                    a -> a.equals("Bbb")
//            ).toList();
//        }
//
//        for(String s : aaa){
//            System.out.println("s = " + s);
//        }

        int year = LocalDate.now().getYear();
        int monthValue = LocalDateTime.now().getMonthValue();
        int dayOfMonth = LocalDate.now().getDayOfMonth();

        System.out.println("year = " + year);
        System.out.println("monthValue = " + monthValue);
        System.out.println("dayOfMonth = " + dayOfMonth);

        int year1 = 2022;
        int month1 = 9;
        int day = 3;
        Calendar calendar = Calendar.getInstance();
        calendar.set(year1, month1, day);
        System.out.println("calendar = " + calendar.getTime());






    }
}
