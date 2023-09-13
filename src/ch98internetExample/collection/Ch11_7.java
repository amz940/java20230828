package ch98internetExample.collection;

import java.util.ArrayList;
import java.util.List;

public class Ch11_7 {
    public static void main(String[] args) {
        // 기본 길이(capacity)가 10인 ArrayList 생성
        ArrayList list1 = new ArrayList(10);
        // ArrayList에는 객체만 저장 가능
        // autoBoxing에 의해 기본형이 참조형으로
        // unautoBoxing에 의해 참조형이 기본형으로 자동 변환
//        list1.add(new Integer(5));
        // 하지만 곧 사라질 사용법이기 때문에 기억할 필요가 없다

        list1.add(5);
        List<String> list2 = List.of();
        ArrayList list3 = new ArrayList(list1.subList(1,4));
    }
}
