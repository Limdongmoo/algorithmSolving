import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class aaa {
    public static void main(String[] args) {
        Map<String, List<String>> aaa = new HashMap<>();

        try {
            Integer.parseInt("aaa");
        } catch (NumberFormatException e) {
        }

        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");

        aaa.put("aaa", list);

        aaa.get("aaa").add("ccc");

        List<String> aaa1 = aaa.get("aaa");
        for (String s : aaa1) {
            System.out.println("s = " + s);

        }


    }

    List<String> winners = new ArrayList<>();




}

