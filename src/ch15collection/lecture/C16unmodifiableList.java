package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C16unmodifiableList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("spring");
        list.add("html");

        list.remove(1);

        // 수정 불가 list 만들기
        // 한번 쓰고 버릴려고
        // 읽기 전용 ,
        List<String> list2 = List.of("java", "react", "css");
        list2.add("vue");
        list2.remove(0);

        System.out.println(list2);

    }
}
