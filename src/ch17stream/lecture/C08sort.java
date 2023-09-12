package ch17stream.lecture;

import java.util.List;

public class C08sort {
    public static void main(String[] args) {
        // sort  : 배열 정렬
//        List<Integer> list = List.of(3,1,1,3,4,5,6,8,9);
        // 뒤에 매개변수 값으로 인해 타입을 알게 되면 var로 줄일수 있다
        var list1 = List.of(3,1,1,3,4,5,6,8,9);
        list1.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
