package ch17stream.lecture;

import java.util.List;

public class C06forEach {
    public static void main(String[] args) {
        // forEach : 인덱스를 각각 출력
        List<Integer> list = List.of(3,1,10,9,2);
        list.stream()
                .forEach(System.out::println);
    }
}
