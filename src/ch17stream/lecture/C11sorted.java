package ch17stream.lecture;

import java.util.List;

public class C11sorted {
    public static void main(String[] args) {
        var list = List.of(10,35,20,1,5,6);

        System.out.println("가장 큰 값 출력");
        list.stream()
                // 높은 수부터 정렬
                .sorted((x,y) -> y - x)
                .limit(1)
                .forEach(System.out::println);

        System.out.println("가장 작은 값 출력");
        list.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::println);
    }
}
