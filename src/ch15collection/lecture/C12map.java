package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;

public class C12map {
    public static void main(String[] args) {
        // Map : key , value로 구성된 entry 를 저장
        // key가 중복된 entry가 있을 수 없다.

        Map<String, String> map = new HashMap<>();
        // 특별히 추가 될 일 없으면
        // list = ArrayList
        // set = HashSet
        // map = HashMap으로 생성자 만들어주면 된다

        // put : entry 추가 메소드
        map.put("student1", "김");
        map.put("student2", "이");
        map.put("student3", "홍");

        // size : entry의 갯수 확인
        System.out.println("map.size() = " + map.size());

        // put : entry 교체 메소드
        map.put("student3", "박");   // 값이 없으면 추가, 있는 값이면 교체 해준다

        // entry 삭제 메소드
        map.remove("student2");

        // get : entry의 value를 얻는 메소드
        String student1 = map.get("student1");
        System.out.println("student1 = " + student1);
        System.out.println("map.get(\"student3\") = " + map.get("student3"));
        System.out.println("map.get(\"student2\") = " + map.get("student2"));
    }
}
