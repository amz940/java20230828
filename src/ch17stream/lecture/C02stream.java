package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C02stream {
    public static void main(String[] args) {
        List<String> list = List.of("ab","bc","cd");
//        Stream<String> stream = list.stream(); // 올바르지 못한 stream 작성방법
//        Stream<String> stream1 = stream.map(e -> e + e);
//        long count = stream1.count();

        list.stream()
                .map(e -> e+e) // 중간연산
                .filter(e -> e.length() > 1) // 중간연산
                .count(); // 최종연산

    }
}
