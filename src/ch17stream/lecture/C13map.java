package ch17stream.lecture;

import java.util.List;

public class C13map {
    public static void main(String[] args) {
        // map : 원래 원소를 받아서 새로운 원소로 변경하고 싶을때
        var list = List.of(3,1,2,3,5,7,8);

        list.stream()
                .map( x -> 10)
                .forEach(System.out::println);

        System.out.println("음수로 바꿔서 출력");
        list.stream()
                .map( x -> -x)
                .forEach(System.out::println);

        System.out.println("2배한 값 출력");
        list.stream()
                .map( x -> x*2)
                .forEach(System.out::println);

        System.out.println("제곱 값 출력");
        list.stream()
                .map( x -> x * x)
                .forEach(System.out::println);

        System.out.println("중복 제거후 2배값 출력");
        list.stream()
                .distinct()
                .sorted()
                .map( x -> x *2)
                .forEach(System.out::println);
    }
}
