package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        // for (String string : strings) {
        //     System.out.println(string);
        // }

        strings.stream().forEach(x -> {
            // Do something else
            System.out.println(x);
        });
        strings.stream().forEach(x -> System.out.println(x));

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        //     ints.add(Integer.parseInt(string));
        // }
        // System.out.println(ints);
        List<Integer> numbers = strings2.stream().map(x -> {
            // Do something else here
            return Integer.parseInt(x);
        }).collect(Collectors.toList());
        numbers.stream().forEach(x -> System.out.println(x));
        numbers.forEach(x -> System.out.println(x));

        strings2.stream().map(x -> {
            // Do something else here
            Integer i = Integer.parseInt(x);
            System.out.println(i);
            return i;
        }).collect(Collectors.toList());
    }

}