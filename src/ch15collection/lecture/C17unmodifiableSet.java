package ch15collection.lecture;

import java.util.Set;

public class C17unmodifiableSet {
    public static void main(String[] args) {
        // 수정 불가 set
        Set<String>set = Set.of("spring","java","html");
        System.out.println("set = " + set);

        set.add("que");

        System.out.println("실행");
    }
}
