package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C19modifiableList {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d");
    
        // 수정 불가 리스트를 수정 하고 싶을땐
        // 새로운 리스트를 만든 후 상속 시키면 된다
        List<String> list2 = new ArrayList<>(list);
        list2.add("c");

        System.out.println("실행");
        System.out.println("list.size() = " + list.size());
        System.out.println("list2.size() = " + list2.size());
    }
}
