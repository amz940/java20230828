package ch17stream.lecture;

import java.util.List;

public class C09limit {
    public static void main(String[] args) {
        // limit 몇개 들고 갈지 제한을 둔다.
        var list = List.of(3,1,4,6,7,8,5,6,2);
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("가장 작은 값 3개 출력");
        list.stream()
                .sorted()
                .limit(3)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("앞에 있는 3개를 정렬해서 출력");
        list.stream()
                .limit(3)
                .sorted()
                .forEach(System.out::println);
    }
}
