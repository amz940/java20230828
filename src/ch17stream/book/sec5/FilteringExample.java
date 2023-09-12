package ch17stream.book.sec5;

import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("김도현");
//        list.add("홍석천");
//        list.add("이재석");
//        list.add("김도현");
//        list.add("김도형");
        var list = List.of("김도현","홍석천","이재석","김도현","김도형");

        //중복 요소 제거
        System.out.println("중복 제거");
        list.stream()
                .distinct()
//                .forEach( x -> System.out.println(x))
                .forEach(System.out::println);

        // 조건을 건다
        System.out.println("김으로 시작하는 이름만");
        list.stream()
                .filter( e -> e.startsWith("김"))
//                .forEach(e -> System.out.println(e));
                .forEach(System.out::println);

        System.out.println("중복 제거 후 김으로 시작");
        list.stream()
                .distinct()
                .filter( e -> e.startsWith("김"))
                .forEach(System.out::println);

    }
}
