package ch17stream.lecture;

import java.util.List;

public class C10skip {
    public static void main(String[] args) {
        var list = List.of(10,5,6,7,2);
        list.stream()
                .skip(3)
                .forEach(System.out::println);

        System.out.println("가장 작은값");
        list.stream()
                .sorted()
                .limit(1)   // limit : 숫자만큼 아이템를 남긴다
                .forEach(System.out::println);

        System.out.println("가장 큰 값");
        list.stream()
                .sorted()
                .skip(list.size()-1)  // skip : 숫자만큼 인덱스를 건너뛴다.
                .forEach(System.out::println);

        System.out.println("가장 마지막 원소 출력");
        list.stream()
                .skip(list.size()-1)
                .sorted()
                .forEach(System.out::println);
    }
}
