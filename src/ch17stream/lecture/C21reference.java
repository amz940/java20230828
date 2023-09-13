package ch17stream.lecture;

import java.util.List;

public class C21reference {
    public static void main(String[] args) {
        List<String> list1 = List.of("java","spring","css");
        Integer length = list1.stream()
                .map(String::length)
                .reduce(Integer::sum)
                .get();
        // get() 이 optional을 안 붙이고 값을 꺼낼때 쓰이는거 같은데?

        System.out.println("length = " + length);

        // 참조타입 stream -> 기본타입 stream
        // 데이터 타입에 맞는 .mapTo타입 을 쓰면 변경 가능
        Double sum = list1.stream()
                .mapToDouble(String::length)
                .sum();
        System.out.println("sum = " + sum);
    }
}
