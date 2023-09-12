package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C20modifiableSet {
    public static void main(String[] args) {
        // set 불변 컬렉션을 추가 가능한 컬렉션으로 만들기
        Set<String> set = Set.of("a","b","c","d");
//        set.add("e");
        
        Set<String> set2 = new HashSet<>(set);
        set2.add("e");
        System.out.println("실행");
        System.out.println("set.size() = " + set.size());
        System.out.println("set2.size() = " + set2.size());

    }
}
