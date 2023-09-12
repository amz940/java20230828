package ch17stream.lecture;

import java.util.List;

public class C07distinct {
    // distinct : 중복 제거
    public static void main(String[] args) {
        List<Integer> list = List.of(3,1,6,3,2,6,8,9);
        long count = list.stream()
                .distinct() // 중복 제거
                .count();

        System.out.println("count = " + count);
    }
}
