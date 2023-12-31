package ch17stream.lecture;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class C25grouping {
    public static void main(String[] args) {
        List<String> list = List.of(
                "java",
                "spring",
                "html",
                "react",
                "css",
                "vue",
                "jquery",
                "jsp");

        Map<Integer, Long> map = list.stream()
                .collect(groupingBy(String::length, counting()));
        map.entrySet()
                .forEach(s -> System.out.println(s.getKey() + ":" + s.getValue() + "개"));
    }
}
