package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C08set {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("java");
        set.add("css");

        set.forEach((System.out::println));

        System.out.println("시간이 흐룬 후");
        set.forEach(System.out::println);   //위에 순서랑 밑에 순서가 같을거라는 보장이 없다
                                            // 순서를 유지하지 않고 저장
    }
}
