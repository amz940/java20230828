package ch17stream.lecture;

import java.util.List;
import java.util.function.Predicate;

public class C12filter {
    public static void main(String[] args) {
        // filter : 배열에서 조건에 맞춰서 걸러낸다.
        var list = List.of(1,5,8,20,50,25,51);
        list.stream()
                .filter( e -> e%2 == 0)
                .forEach(System.out::println);

        System.out.println("짝수 중 가장 작은 값 출력");
        list.stream()
                .filter(e -> e%2 == 0)
                .sorted()
                .limit(1)
                .forEach(System.out::println);

        System.out.println("홀수 중 가장 큰 값 출력");
        list.stream()
                .filter(e -> e%2 == 1)
                .sorted( (x,y) -> y - x)
                .limit(1)
                .forEach(System.out::println);
    }
}
