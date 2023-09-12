package ch17stream.lecture;

import java.util.List;
import java.util.stream.Stream;

public class C03stream {
    public static void main(String[] args) {
        List<String> list = List.of("java","css","spring");
        Stream<String> stream = list.stream();

        stream.count();
//        stream.count(); // 오류, 이미 최종 연산이 진행되었기 때문에

        //최종 연산이 끝난 stream은 재사용할수 없기 때문에 새로 만들어서 사용
        Stream<String> stream1 = list.stream();
        stream1.count();
        System.out.println("실행");
    }
}
