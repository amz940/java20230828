package ch15collection.lecture;

import java.util.ArrayList;
import java.util.List;

public class C02list {
    public static void main(String[] args) {
        // List : 순서를 유지하고 저장한다      <-----> set이랑 반대 개념
        //        중복된 객체(element) 저장 가능
        // API 에서 java.util.List로 검색
        List<String> list = new ArrayList<>();

        //element 추가
        list.add("java");   // 0번 인덱스
        list.add("spring"); // 1번 인덱스
        list.add("css");    // 2번 인덱스
        list.add("react");

        // 해당 인덱스에 element가 뭔지 확인
        String s = list.get(0);
        String s1 = list.get(3);
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);

        //element 몇개 있는 지 확인
        int size = list.size();
        System.out.println("size = " + size);

        list.add("react");  // 중복 저장 가능
        list.add("css");
        System.out.println(list.size());

        // 지우기
        list.remove("react");
        System.out.println(list.size());
        list.remove("java");
        System.out.println(list.size());

        System.out.println(list.get(0));
        System.out.println(list.get(3));

        // element가 list에 들어가 있는지 확인
        boolean contains = list.contains("java");
        boolean contains2 = list.contains("react");
        System.out.println("contains = " + contains);
        System.out.println("contains2 = " + contains2);

        // 전체 원소 탐색 ( for문 )
        System.out.println("for문 탐색");
        for ( int i = 0 ; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("향상된 for문 사용 전체 탐색");
        for ( String item : list){
            System.out.println(item);
        }

        System.out.println("forEach 메소드로 전체 탐색");
//        list.forEach(e -> System.out.println(e));
        list.forEach(System.out::println); //
    }
}

