package ch17stream.lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class c24grouping {
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

        Map<Integer, List<String>> collect = list.stream()
                .collect(Collectors.groupingBy(String::length));

        collect.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));


    }
}
