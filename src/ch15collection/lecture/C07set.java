package ch15collection.lecture;

import java.util.HashSet;
import java.util.Set;

public class C07set {
    public static void main(String[] args) {
        // Set : 객체 ( item, element , 원소 , 요소)를 담고 있는 객체   <---> list랑 반대 개념
        // 특징 : 중복된 element를 저장하지 않는다.
        //         순서를 유지 하지 않고 저장된다. --> 시간이 흐룬 후에 순서가 바뀔수 있다

//        Set set1 = new Set(); // 오류 발생
        Set<String> set1 = new HashSet<>();

        // 원소 추가
        set1.add("java");
        set1.add("spring");
        set1.add("react");
        set1.add("java"); // set은 중복 저장이 안된다

        // size : 원소의 갯수
        System.out.println(set1.size()); // 4 가 아닌 3이다

        // contains : 있는 지 확인
        System.out.println(set1.contains("java"));
        System.out.println(set1.contains("html"));

        // remove : 삭제
        boolean remove = set1.remove("java");
        boolean remove2 = set1.remove("html");

        System.out.println("remove = " + remove);
        System.out.println("remove2 = " + remove2);

        System.out.println(set1.size());

        // of : 새로운  "수정불가" set 객체를 만든다

        Set<String> set2 = Set.of("css", "react", "html");
//        set2.add("java"); // 수정 불가라 추가 삭제가 안된다

        //전체 탐색
        //향상된 for문
        System.out.println("향상된 for문 사용해서 전체탐색");
        for(String str : set2){
            System.out.println(str);
        }

        // forEach
        System.out.println("forEach로 전체탐색");
//        set2.forEach(item -> System.out.println(item));
        set2.forEach(System.out::println);
    }
}
