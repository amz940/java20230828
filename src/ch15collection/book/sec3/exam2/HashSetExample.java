package ch15collection.book.sec3.exam2;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet 컬렉션 생성
        Set<Member> set = new HashSet<>();
        // Member 객체 저장
        set.add(new Member("홍길동", 30));
        // tostring으로 재정의 해서 다른 인스턴스 지만 같은 객체로 인식
        set.add(new Member("홍길동", 30));
        // 저장된 객체 수 출력
        System.out.println("set.size() = " + set.size());
    }
}
